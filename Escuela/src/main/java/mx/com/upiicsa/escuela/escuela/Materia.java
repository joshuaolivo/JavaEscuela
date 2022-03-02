package mx.com.upiicsa.escuela.escuela;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private String clave;
    private String creditos;
    private String salon;
    ArrayList<Profesor> profesores;
    ArrayList<Alumno> alumnos;
    ArrayList<HoraClase> horario;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getClave() {
        return this.clave;
    }
    public void setSalon(String salon) {
        this.salon = salon;
    }
    public String getSalon() {
        return this.salon;
    }
    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    public String getCreditos() {
        return this.creditos;
    }
    public ArrayList<HoraClase> getHorario(){
        return this.horario;
    }
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    public String asignarProfesor(Profesor profesor) {
        this.profesores.add(profesor);
        return "Profesor asignado";
    }
    public String asignarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        return "Alumno asignado";
    }
    public String asignarHora(HoraClase hora) {
        this.horario.add(hora);
        return "Hora asignada";
    }    
}
