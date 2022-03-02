package mx.com.upiicsa.escuela.escuela;
import java.util.Date;

public class Persona {
    private String nombre; 
    private String primerApellido; 
    private String segudoApellido; 
    private Date fechaNacimiento;
    private String genero;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getPrimerApellido(){
        return this.primerApellido;
    }
    public void setPrimerApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }
    public String getSegudoApellido(){
        return this.segudoApellido;
    }
    public void setSegudoApellido(String segudoApellido){
        this.segudoApellido = segudoApellido;
    }
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}
