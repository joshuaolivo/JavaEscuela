package mx.com.upiicsa.escuela.escuela;

import java.util.ArrayList;

public class Secuencia {
    ArrayList<Materia> materias; 
    public ArrayList<Materia> getMaterias() {
        return this.materias;
    }
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    public String agregarMateria(Materia materia){
        this.materias.add(materia);
        return "Materia agregada";
    }
}
