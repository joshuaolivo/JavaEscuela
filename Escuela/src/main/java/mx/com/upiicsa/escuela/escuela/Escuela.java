package mx.com.upiicsa.escuela.escuela;
import java.util.ArrayList;

public class Escuela {
    private Direccion direccion;
    private ArrayList<Secuencia> secuencias;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;
    private ArrayList<Materia> materias;
    private ArrayList<Academia> academias;

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    public void setSecuencias(ArrayList<Secuencia> secuencias) {
        this.secuencias = secuencias;
    }
    public ArrayList<Secuencia> getSecuencias() {
        return this.secuencias;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public ArrayList<Alumno> getAlumnos() {
        return this.alumnos;
    }
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    public ArrayList<Profesor> getProfesores() {
        return this.profesores;
    }
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    public ArrayList<Materia> getMaterias() {
        return this.materias;
    }
    public void setAcademias(ArrayList<Academia> academias) {
        this.academias = academias;
    }
    public ArrayList<Academia> getAcademias() {
        return this.academias;
    }
    public String agregarMateria(Materia materia){
        this.materias.add(materia);
        return "Materia agregada";
    }
    public String agregarSecuencia(Secuencia secuencia){
        this.secuencias.add(secuencia);
        return "Secuencia agregada";
    }
    public String agregarProfesor(Profesor profesor){
        this.profesores.add(profesor);
        return "Profesor agregado";
    }
    public String agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        return "Alumno agregado";
    }
    public String agregarAcademia(Academia academia){
        this.academias.add(academia);
        return "Academia agregada";
    }
}
