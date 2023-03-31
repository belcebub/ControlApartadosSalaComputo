/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Geraf
 */
public class Maestro extends Persona{
    private int idMaestro;
    private String academia;

    public Maestro(String nombre, int idMaestro, String academia) {
        super(nombre);
        this.idMaestro = idMaestro;
        this.academia = academia;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public String getAcademia() {
        return academia;
    }

    @Override
    public String toString() {
        return "Datos del Maestro\n" +
        "ID------: "+ idMaestro +"\n" +
        "Nombre--: " + getNombre() + "\n" + 
        "Academia: " + academia;
    }
    
    
}
