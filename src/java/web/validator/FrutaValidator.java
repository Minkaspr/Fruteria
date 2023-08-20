package web.validator;

import dao.FrutaDAO;
import dao.impl.FrutaDAOImpl;
import dto.FrutaDTO;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import util.DeString;

/**
 *
 * @author ruben
 */
public class FrutaValidator {
    private final HttpServletRequest request;
    private final FrutaDAO frutaDAO;

    public FrutaValidator(HttpServletRequest request) {
        this.request = request;
        this.frutaDAO = new FrutaDAOImpl();
    } 
    
    public String obtenerTodasLasFrutas(){
        String result = null;
        List<FrutaDTO> list = frutaDAO.obtenerTodasLasFrutas();
        if (list != null) {
            request.setAttribute("list",list);
        } else {
            result = "ERROR";
        }   
        return result;
    }
    
    public String obtenerFrutaPorId(){
        String result = null;
        Integer idFruta = DeString.aInteger(request.getParameter("idFruta"));
        FrutaDTO frutaDTO = frutaDAO.obtenerFrutaPorId(idFruta);
        if (frutaDTO != null) {
            request.setAttribute("frutaDTO", frutaDTO);
        } else {
            result = "ERROR";
        }
        return result;
    }
    
    public String agregarActualizarFruta(boolean agreActu){
        StringBuilder result = new StringBuilder("<ul>");
        Integer idFruta = DeString.aInteger(request.getParameter("idFruta"));
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        double cantidadKilogramos = DeString.aDouble(request.getParameter("cantidadKilogramos"));
        double precioPorKilogramo = DeString.aDouble(request.getParameter("precioPorKilogramo"));
        String tipo = request.getParameter("tipo");
        
        if (agreActu && idFruta == null) {
            result.append("<li>ID requerido</li>");
        }
        
        if (nombre == null || nombre.trim().length() == 0){
            result.append("<li>Nombre Requerido</li>");
        } else if (nombre.trim().length() <3 || nombre.trim().length() > 30){
            result.append("<li>La dimension del nombre debe estar")
                    .append(" entre 3 a 30 caracteres</li>");
        }
        
        if (descripcion == null || descripcion.trim().length() == 0){
            result.append("<li>Descripcion Requerido</li>");
        } else if (descripcion.trim().length() <3 || descripcion.trim().length() > 50){
            result.append("<li>La dimension de la descripcion debe estar")
                    .append(" entre 3 a 50 caracteres</li>");
        }
        
        if (cantidadKilogramos == 0 ) {
            result.append("<li>Ingresa la cantidad de kilogramos</li>");
        } else if (cantidadKilogramos < 0){
            result.append("Ingrese valores positivos");
        }
        
        if (precioPorKilogramo == 0 ) {
            result.append("<li>Ingresa el precio por kilogramos</li>");
        } else if (precioPorKilogramo < 0){
            result.append("Ingrese valores positivos");
        }
        
        if (tipo == null || tipo.trim().length() == 0){
            result.append("<li>Tipo Requerido</li>");
        }
        
        FrutaDTO frutaDTO = new FrutaDTO();
        frutaDTO.setIdFruta(idFruta);
        frutaDTO.setNombre(nombre);
        frutaDTO.setDescripcion(descripcion);
        frutaDTO.setCantidadKilogramos(cantidadKilogramos);
        frutaDTO.setPrecioPorKilogramo(precioPorKilogramo);
        frutaDTO.setTipo(tipo);
        
        // El valor 4 ↓ hace referente a la cantidad de caracteres de la etiqueta '<ul>'
        if (result.length() == 4) {
            String msg = agreActu
                    ? frutaDAO.actualizarFruta(frutaDTO)
                    : frutaDAO.agregarFruta(frutaDTO);
            if (msg != null) {
                result.append("<li>").append(msg).append("<li>");
            }
        }
        
        if (result.length() > 4) {
            request.setAttribute("frutaDTOs", frutaDTO);
        }
        
        return result.length() == 4 ? null : result.append("</ul>").toString();
    }
    
    public String eliminarFruta(){
        List<Integer> ids = DeString.ids(request.getParameter("ids"));
        String result = (ids != null)
                ? frutaDAO.eliminarFruta(ids)
                : "IDS incorrectos";
        return result;
    }
    
    
}
