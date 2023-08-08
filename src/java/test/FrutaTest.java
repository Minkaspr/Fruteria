package test;

import dao.FrutaDAO;
import dao.impl.FrutaDAOImpl;
import dto.FrutaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinKaspr
 *
 * Tipos de Frutas: ácidas, semiácidas, neutras y dulces.
 */
public class FrutaTest {

    public static void main(String[] args) {
        // Crear el objeto FrutaDAO para realizar las pruebas
        FrutaDAO frutaDAO = new FrutaDAOImpl();

        // Ejecutar los métodos de prueba
        probarAgregar(frutaDAO);
        probarObtenerTodasLasFrutas(frutaDAO);
        probarObtenerFrutaPorId(frutaDAO);
        probarActualizarFruta(frutaDAO);
    }

    private static void probarAgregar(FrutaDAO frutaDAO) {
        // Crear un objeto FrutaDTO para agregar a la base de datos simulada
        FrutaDTO fruta1 = new FrutaDTO();
        fruta1.setNombre("Manzana");
        fruta1.setDescripcion("Deliciosa fruta");
        fruta1.setCantidadKilogramos(50.0);
        fruta1.setPrecioPorKilogramo(2.5);
        fruta1.setTipo("Ácidas");

        // Llamar al método agregarFruta del DAO
        String mensaje = frutaDAO.agregarFruta(fruta1);

        // Imprimir el mensaje de resultado
        System.out.println(mensaje);

        FrutaDTO fruta2 = new FrutaDTO();
        fruta2.setNombre("Naranja");
        fruta2.setDescripcion("Fruta semiácida");
        fruta2.setCantidadKilogramos(30.0);
        fruta2.setPrecioPorKilogramo(3.0);
        fruta2.setTipo("Semiácidas");
        frutaDAO.agregarFruta(fruta2);

        FrutaDTO fruta3 = new FrutaDTO("Pera", "Fruta neutra", 40.0, 2.0, "Neutras");
        frutaDAO.agregarFruta(fruta3);

        FrutaDTO fruta4 = new FrutaDTO("Fresa", "Fruta dulce", 20.0, 4.0, "Dulces");
        frutaDAO.agregarFruta(fruta4);
    }

    private static void probarObtenerTodasLasFrutas(FrutaDAO frutaDAO) {
        // Obtener todas las frutas desde el DAO
        List<FrutaDTO> frutas = frutaDAO.obtenerTodasLasFrutas();

        // Imprimir las frutas obtenidas
        System.out.println("Frutas registradas:");
        for (FrutaDTO fruta : frutas) {
            System.out.println(fruta.getNombre() + " - " + fruta.getDescripcion());
        }
    }

    private static void probarObtenerFrutaPorId(FrutaDAO frutaDAO) {
        int idBuscado = 1; // ID de la fruta a buscar

        // Obtener la fruta por su id
        FrutaDTO frutaEncontrada = frutaDAO.obtenerFrutaPorId(idBuscado);

        // Verificar si se encontró la fruta o no
        if (frutaEncontrada != null) {
            // Se encontró la fruta con el idBuscado
            System.out.println("Fruta encontrada:");
            System.out.println("ID: " + frutaEncontrada.getIdFruta());
            System.out.println("Nombre: " + frutaEncontrada.getNombre());
            System.out.println("Descripción: " + frutaEncontrada.getDescripcion());
            System.out.println("Cantidad en kilogramos: " + frutaEncontrada.getCantidadKilogramos());
            System.out.println("Precio por kilogramo: " + frutaEncontrada.getPrecioPorKilogramo());
            System.out.println("Tipo: " + frutaEncontrada.getTipo());
        } else {
            // No se encontró la fruta con el idBuscado
            System.out.println("No se encontró la fruta con ID " + idBuscado);
        }
    }

    private static void probarActualizarFruta(FrutaDAO frutaDAO) {
        // Obtener el id de la fruta existente para usarlo en la actualización
        int idFrutaExistente = 1;

        // Crear un objeto FrutaDTO con los nuevos datos para actualizar
        FrutaDTO nuevosDatos = new FrutaDTO();
        nuevosDatos.setNombre("Manzana Granny Smith");
        nuevosDatos.setDescripcion("Deliciosa fruta verde");
        nuevosDatos.setCantidadKilogramos(40.0);
        nuevosDatos.setPrecioPorKilogramo(3.0);
        nuevosDatos.setTipo("Ácidas");

        // Llamar al método actualizarFruta del DAO
        String mensaje = frutaDAO.actualizarFruta(idFrutaExistente, nuevosDatos);

        // Imprimir el mensaje de resultado
        System.out.println(mensaje);

        // Mostrar todas las frutas después de la actualización
        probarObtenerTodasLasFrutas(frutaDAO);
    }
}
