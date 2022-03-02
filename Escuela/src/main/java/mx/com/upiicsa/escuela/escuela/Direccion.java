package mx.com.upiicsa.escuela.escuela;

public class Direccion {
    private String delegacion;
    private String colonia;
    private String calle;
    private String numero;
    private String codigoPostal;
    private String estado;
    public String getDelegacion(){
        return this.delegacion;
    }
    public void setDelegacion(String delegacion){
        this.delegacion = delegacion;
    }
    public String getColonia(){
        return this.colonia;
    }
    public void setColonia(String colonia){
        this.colonia = colonia;
    }
    public String getCalle(){
        return this.calle;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getCodigoPostal(){
        return this.codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}
