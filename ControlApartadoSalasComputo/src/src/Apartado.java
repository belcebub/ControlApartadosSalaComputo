/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Geraf
 */
public class Apartado {
    private int numApartado;
    private int idMaestro;
    private int idSala;
    private String fecha;
    private String hora;

    public Apartado(int idMaestro, int idSala, String fecha, String hora) {
        this.idMaestro = idMaestro;
        this.idSala = idSala;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getNumApartado() {
        return numApartado;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public int getIdSala() {
        return idSala;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    
}
