
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
    String actualizarFruta(int id, FrutaDTO fruta);
    String eliminarFruta(int id);
    List<String> obtenerTiposDeFruta();
}
