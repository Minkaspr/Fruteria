package dao.impl;

import dao.FrutaDAO;
import dto.FrutaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinKaspr
 */
public class FrutaDAOImpl implements FrutaDAO {

    private List<FrutaDTO> frutas;
    private int ultimoId;

    public FrutaDAOImpl() {
        frutas = new ArrayList<>();
        ultimoId = 0;
    }

    @Override
    public List<FrutaDTO> obtenerTodasLasFrutas() {
        return frutas;
    }

    @Override
    public FrutaDTO obtenerFrutaPorId(int id) {
        for (FrutaDTO fruta : frutas) {
            if (fruta.getIdFruta() == id) {
                return fruta; // Se encontró la fruta con el idFruta deseado.
            }
        }
        return null; // No se encontró ninguna fruta con el idFruta deseado.
    }

    @Override
    public String agregarFruta(FrutaDTO fruta) {
        // Verificar si la fruta ya existe (según el nombre)
        for (FrutaDTO f : frutas) {
            if (f.getNombre().equalsIgnoreCase(fruta.getNombre())) {
                return "Error: La fruta ya está registrada.";
            }
        }
        // Asignar un nuevo idFruta (si lo utilizas)
        fruta.setIdFruta(++ultimoId);

        // Agregar la fruta al ArrayList
        frutas.add(fruta);

        return "Fruta agregada exitosamente.";
    }

    @Override
    public String actualizarFruta(FrutaDTO fruta) {
        // Busca la fruta en el array `frutas`.
        for (FrutaDTO frutaExistente : frutas) {
            if (frutaExistente.getIdFruta() == fruta.getIdFruta()) {
                // Se encontró la fruta a actualizar, actualizamos los datos.
                frutaExistente.setNombre(fruta.getNombre());
                frutaExistente.setDescripcion(fruta.getDescripcion());
                frutaExistente.setCantidadKilogramos(fruta.getCantidadKilogramos());
                frutaExistente.setPrecioPorKilogramo(fruta.getPrecioPorKilogramo());
                frutaExistente.setTipo(fruta.getTipo());
                return "Fruta actualizada exitosamente.";
            }
        }

        // Si no se encontró la fruta con el idFruta proporcionado
        return "No se encontró la fruta con ID " + fruta.getIdFruta();
    }

    @Override
    public String eliminarFruta(List<Integer> ids) {
        // Verifica que la lista de IDs no esté vacía.
        if (ids.isEmpty()) {
            return "No se ha especificado ninguna ID de fruta para eliminar.";
        }

        // Recorre la lista de IDs y elimina las frutas correspondientes del array.
        for (int id : ids) {
            int index = -1;
            for (int i = 0; i < frutas.size(); i++) {
                if (frutas.get(i).getIdFruta() == id) {
                    index = i;
                    break;
                }
            }

            // Si no se encontró la fruta con el ID especificado, se genera un mensaje de error.
            if (index == -1) {
                return "No se encontró la fruta con ID " + id;
            }

            // Elimina la fruta del array.
            frutas.remove(index);
        }

        // Devuelve un mensaje de éxito.
        return "Se eliminaron las frutas con IDs " + ids;
    }

    @Override
    public List<String> obtenerTiposDeFruta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
