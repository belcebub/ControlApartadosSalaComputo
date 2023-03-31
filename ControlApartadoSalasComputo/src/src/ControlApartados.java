/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Geraf
 */
public class ControlApartados {
   private Maestro maestros[];
   private Sala salas[];
   private Apartado apartados[];
   private int contM;
   private int contS;
   private int contA;

    public ControlApartados(int cantidadM, int cantidadS, int cantidadA) {
        maestros = new Maestro[cantidadM];
        contM = 0;
        salas = new Sala[cantidadM];
        contS = 0;
        apartados = new Apartado[cantidadS];
        contA = 0;
    }

    public int getContM() {
        return contM;
    }

    public int getContS() {
        return contS;
    }

    public int getContA() {
        return contA;
    }
//   Metodos Maestro
   public int busquedaM(int idMaestro){
      for(int x=0;x<contM;x++){
         if(maestros[x].getIdMaestro() == idMaestro) {
            return x;
         }
      }
      return -1;
   }
   
   public void agregarM(Maestro m){
      maestros[contM] = m; 
      contM++;
   }

   public Maestro getMaestro(int celda){
      return maestros[celda];
   }

// Metodos sala   
   public int busquedaS(int idSala){
      for(int x=0;x<contS;x++){
         if(salas[x].getIdSala() == idSala) {
            return x;
         }
      }
      return -1;
   }
   public void agregarS(Sala s){
      salas[contS] = s; 
      contS++;
   }
   
   public Sala getSala(int celda){
      return salas[celda];
   }   
}
