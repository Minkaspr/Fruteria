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
    public String actualizarFruta(int idFruta, FrutaDTO nuevosDatos) {
        for (FrutaDTO frutaExistente : frutas) {
            if (frutaExistente.getIdFruta() == idFruta) {
                // Se encontró la fruta a actualizar, actualizamos los datos
                frutaExistente.setNombre(nuevosDatos.getNombre());
                frutaExistente.setDescripcion(nuevosDatos.getDescripcion());
                frutaExistente.setCantidadKilogramos(nuevosDatos.getCantidadKilogramos());
                frutaExistente.setPrecioPorKilogramo(nuevosDatos.getPrecioPorKilogramo());
                frutaExistente.setTipo(nuevosDatos.getTipo());
                return "Fruta actualizada exitosamente.";
            }
        }

        // Si no se encontró la fruta con el idFruta proporcionado
        return "No se encontró la fruta con ID " + idFruta;
    }

    @Override
    public String eliminarFruta(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> obtenerTiposDeFruta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
