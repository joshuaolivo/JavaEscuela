package mx.com.upiicsa.escuela.escuela;

import java.util.ArrayList;

public class Academia {
    private ArrayList<Profesor> profesores;
    private ArrayList<Materia> materias;
    private Profesor jefe;
    private String nombre;
    private int id;
    
    public void setProfesores(ArrayList<Profesor> profesores){
        this.profesores = profesores;
    }
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    public void setMaterias(ArrayList<Materia> materias){
        this.materias = materias;
    }
    public ArrayList<Materia> getMaterias(){
        return this.materias;
    }
    public void setJefe(Profesor jefe){
        this.jefe = jefe;
    }
    public Profesor getJefe(){
        return this.jefe;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

}
