/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Geraf
 */
public class Sala {
    private int idSala;
    private boolean proyector;
    private int capacidad;

    public Sala(int idSala, boolean proyector, int capacidad) {
        this.idSala = idSala;
        this.proyector = proyector;
        this.capacidad = capacidad;
    }

    public int getIdSala() {
        return idSala;
    }

    public boolean isProyector() {
        return proyector;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Datos de la sala:\n" +
            "ID sala--: " + idSala + "\n" +
            "Proyector: " + proyector + "\n" +
            "Capacidad: " + capacidad;
    }
    
}
