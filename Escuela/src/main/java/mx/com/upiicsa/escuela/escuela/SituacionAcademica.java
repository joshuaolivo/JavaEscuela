package mx.com.upiicsa.escuela.escuela;

public class SituacionAcademica {
    private String semestre;
    private float promedioGeneral;
    private String status;
    private String carrera;
    private float creditos;
    public String getSemestre(){
        return this.semestre;
    }
    public void setSemestre(String semestre){
        this.semestre = semestre;
    }
    public float getPromedioGeneral(){
        return this.promedioGeneral;
    }
    public void setPromediogeneral(float promedioGeneral){
        this.promedioGeneral = promedioGeneral;
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
