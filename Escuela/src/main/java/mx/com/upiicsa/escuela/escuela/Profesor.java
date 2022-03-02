package mx.com.upiicsa.escuela.escuela;
public class Profesor extends Persona{
    private String cedula;
    private Direccion direccion;

    public String getCedula() {
        return this.cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}