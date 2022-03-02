package mx.com.upiicsa.escuela.escuela;

public class SituacionAcademica {
    private String semestre;
    private float promediogeneral;
    private String status;
    private String carrera;
    private float creditos;
    public String getSemester(){
        return this.semestre;
    }
    public void setSemester(String semester){
        this.semestre = semester;
    }
    public float getPromediogeneral(){
        return this.promediogeneral;
    }
    public void setPromediogeneral(float promediogeneral){
        this.promediogeneral = promediogeneral;
    }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getCarrera(){
        return this.carrera;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public float getCreditos(){
        return this.creditos;
    }
    public void setCreditos(float creditos){
        this.creditos = creditos;
    }
}
