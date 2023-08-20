
package dao;

import dto.FrutaDTO;
import java.util.List;

/**
 *
 * @author MinKaspr
 */
public interface FrutaDAO {
    List<FrutaDTO> obtenerTodasLasFrutas();
    FrutaDTO obtenerFrutaPorId(int id);
    String agregarFruta(FrutaDTO fruta);
    String actualizarFruta(FrutaDTO fruta);
    String eliminarFruta(List <Integer> ids);
    List<String> obtenerTiposDeFruta();
}
