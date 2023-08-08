
package dto;

/**
 *
 * @author MinKaspr
 */
public class FrutaDTO {
    private Integer idFruta;
    private String nombre;
    private String descripcion;
    private double cantidadKilogramos;
    private double precioPorKilogramo;
    private String tipo;

    public FrutaDTO() {
    }
    
    // Constructor sin el parámetro idFruta
    public FrutaDTO(String nombre, String descripcion, double cantidadKilogramos, double precioPorKilogramo, String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadKilogramos = cantidadKilogramos;
        this.precioPorKilogramo = precioPorKilogramo;
        this.tipo = tipo;
    }
    
    public Integer getIdFruta() {
        return idFruta;
    }

    public void setIdFruta(Integer idFruta) {
        this.idFruta = idFruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidadKilogramos() {
        return cantidadKilogramos;
    }

    public void setCantidadKilogramos(double cantidadKilogramos) {
        this.cantidadKilogramos = cantidadKilogramos;
    }

    public double getPrecioPorKilogramo() {
        return precioPorKilogramo;
    }

    public void setPrecioPorKilogramo(double precioPorKilogramo) {
        this.precioPorKilogramo = precioPorKilogramo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
