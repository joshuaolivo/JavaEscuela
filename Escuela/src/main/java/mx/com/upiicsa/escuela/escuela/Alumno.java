package mx.com.upiicsa.escuela.escuela;

public class Alumno extends Persona{
    private String boleta;
    private SituacionAcademica situacion;
    public String getBoleta(){
        return this.boleta;
    }
    public void setBoleta(String boleta){
        this.boleta = boleta;
    }
    public SituacionAcademica getSituacion(){
        return this.situacion;
    }
    public void setSituacion(SituacionAcademica situacion){
        this.situacion = situacion;
    }    
}
