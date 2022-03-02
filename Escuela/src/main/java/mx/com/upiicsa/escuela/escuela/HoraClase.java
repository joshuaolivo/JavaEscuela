package mx.com.upiicsa.escuela.escuela;

import java.sql.Time;

public class HoraClase {
    private Time horaInico;
    private Time horaFin;
    private String dia;

    public Time getHoraInico() {
        return this.horaInico;
    }
    public void setHoraInico(Time horaInico) {
        this.horaInico = horaInico;
    }
    public Time getHoraFin() {
        return this.horaFin;
    }
    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
    public String getDia() {
        return this.dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
}
