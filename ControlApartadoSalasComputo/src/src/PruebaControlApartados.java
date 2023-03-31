/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Scanner;

/**
 *
 * @author Geraf
 */
public class PruebaControlApartados {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc;
        
        ControlApartados ca = new ControlApartados(100, 20, 300);
        
        do{
         System.out.println("UNIVERSIDAD ZAPOTLATENA\n");
         System.out.println("[1] Cátalogo Maestros");
         System.out.println("[2] Cátalogo Salas");
         System.out.println("[3] Control de Apartados de salas");
         System.out.println("[4] Finalizar Programa");
         System.out.print("¿Opcion deseada [1-4]: ");
         opc = leer.nextInt();
         switch(opc){
             case 1:
                 menuMaestro(ca);
                 break;
             case 2:
                 break;
             case 3:
                 break;
             case 4: break;
             default:
                 System.out.print("Opcion no valida... Presione ENTER para continuar");
                 limpiarPausar();
         }
        } while(opc != 4);
    }
    private static void limpiarPausar(){
      leer.nextLine();//Limpa el Enter de la linea de entrada
      leer.nextLine();//Espera el Enter del usuario
    }
    
    //    menus
    private static void menuMaestro(ControlApartados ca){
        int opcM;
        do{
            System.out.println("UNIVERSIDAD ZAPOTLATENA – CATÁLOGO DE MAESTROS\n");
            System.out.println("[1] Alta de un maestro");
            System.out.println("[2] Consula de un maestro");
            System.out.println("[3] Consulta todos los maestros");
            System.out.println("[4] Regresar al menú principal");
            System.out.print("¿Opcion deseada [1-4]: ");
            opcM = leer.nextInt();
            switch(opcM){
                case 1:
                    realizarAltaMaestro(ca, 100);
                    break;
                case 2:
                    realizarConsultaIndividualMaestro(ca); 
                    break;
                case 3:
                    realizarConsultaGeneralM(ca); 
                    break;
                case 4: break;
                default:
                    System.out.print("Opcion no valida... Presione ENTER para continuar");
                    limpiarPausar();
            }       
        }while(opcM != 4);
    }
    
    private static void menuSalas(ControlApartados ca){
        int opcS;
        do{
            System.out.println("UNIVERSIDAD ZAPOTLATENA – CATÁLOGO DE SALAS\n");
            System.out.println("[1] Alta de una sala");
            System.out.println("[2] Consula de una sala");
            System.out.println("[3] Consulta todas las salas");
            System.out.println("[4] Regresar al menú principal");
            System.out.print("¿Opcion deseada [1-4]: ");
            opcS = leer.nextInt();
            switch(opcS){
                case 1: 
                    realizarAltaSala(ca, 20);
                    break;
                case 2: 
                    realizarConsultaIndividualSala(ca);
                    break;
                case 3: 
                    realizarConsultaGeneralS(ca);
                    break;
                case 4: break;
                default:
                    System.out.print("Opcion no valida... Presione ENTER para continuar");
                    limpiarPausar();
            }
        }while(opcS != 4);
    }
    private static void menuApartado(ControlApartados ca){
        int opcA;
        do{
            System.out.println("UNIVERSIDAD ZAPOTLATENA – CONTROL DE APARTADO DE SALAS\n");
            System.out.println("[1] Registrar apartado");
            System.out.println("[2] Consultar apartado");
            System.out.println("[3] Reporte de salas apartadas por maestro");
            System.out.println("[4] Reporte de salas apartadas por fecha");
            System.out.println("[5] Regresar al menu principal");
            System.out.print("¿Opcion deseada [1-5]: ");
            opcA = leer.nextInt();
            switch(opcA){
                case 1: 
                        
                    break;
                case 2: 
                        
                    break;
                case 3: 
                           
                    break;
                case 4: break;
                default:
                    System.out.print("Opcion no valida... Presione ENTER para continuar");
                    limpiarPausar();
            }
        }while(opcA != 5);
    }
    
// MAESTRO  
   private static void realizarAltaMaestro(ControlApartados ca, int cantidadMaestro){
      int idMaestro,celda;
      String nombre, academia;
      Maestro m;
      
      if(ca.getContM() < cantidadMaestro) {
        System.out.println("\nALTA DE MAESTRO");
        System.out.print("Ingrese el ID---: ");
        idMaestro = leer.nextInt();
        celda = ca.busquedaM(idMaestro);
        if (celda == -1){
            leer.nextLine();
            System.out.print("Nombre----------: ");
            nombre = leer.nextLine();
            System.out.print("Academia--------: ");
            academia = leer.nextLine();
            m = new Maestro(nombre, idMaestro, academia);
            ca.agregarM(m);
            System.out.print("Alta exitosa... Presione ENTER para continuar");
            leer.nextLine();
        } else {
            System.out.print("Ya existe un Maestro con ese ID... Presione Enter para continuar");
            limpiarPausar();
        }
      } else {
         System.out.print("El catalogo ya esta lleno... Presione ENTER para continuar");
         limpiarPausar();
      }
   } 
   
   private static void realizarConsultaIndividualMaestro(ControlApartados ca){
      int idMaestro, celda;
      
      if (ca.getContM() > 0){
         System.out.println("\nCONSULTA DE UN MAESTRO");
         System.out.print("Ingrese el id: ");
         idMaestro = leer.nextInt();
         celda = ca.busquedaM(idMaestro);
         if (celda != -1) {
            System.out.println(ca.getMaestro(celda).toString());
            System.out.print("Presione ENTER para continuar");
            limpiarPausar();
         } else {
            System.out.print("No existe un Maestro con ese ID... Presione ENTER para continuar");
            limpiarPausar();
         }
      } else {
         System.out.print("El cátalogo esta vacio... Presione ENTER para continuar");
         limpiarPausar();
      }
   } 
   
   private static void realizarConsultaGeneralM(ControlApartados ca){
      if (ca.getContM() > 0 ) {
         System.out.println("\nCONSULTA DE TODOS LOS MAESTROS");
         for(int x=0; x<ca.getContM();x++){
            System.out.println(ca.getMaestro(x).toString());
            System.out.println("-----------------------------------");
         }
         System.out.print("Fin de la consulta... Presione ENTER para continuar");
         limpiarPausar();
      } else {
         System.out.print("El cátalogo esta vacio... Presione ENTER para continuar");
         limpiarPausar();
      }
   } 
// SALAS
   private static void realizarAltaSala(ControlApartados ca, int cantidadSala){
      int idSala,capacidad, celda;
      boolean proyector;
      Sala s;
      
      if(ca.getContS() < cantidadSala) {
        System.out.println("\nALTA DE SALA");
        System.out.print("Ingrese el ID---: ");
        idSala = leer.nextInt();
        celda = ca.busquedaS(idSala);
        if (celda == -1){
            leer.nextLine();
            System.out.print("Proyector [si:true no:false]: ");
            proyector = leer.nextBoolean();
            System.out.print("Capacidad--------: ");
            capacidad = leer.nextInt();
            s = new Sala(idSala, proyector, capacidad);
            ca.agregarS(s);
            System.out.print("Alta exitosa... Presione ENTER para continuar");
            leer.nextLine();
        } else {
            System.out.print("Ya existe una Sala con ese ID... Presione Enter para continuar");
            limpiarPausar();
        }
      } else {
         System.out.print("El catalogo ya esta lleno... Presione ENTER para continuar");
         limpiarPausar();
      }
   } 
     
   private static void realizarConsultaIndividualSala(ControlApartados ca){
      int idSala, celda;
      
      if (ca.getContS() > 0){
         System.out.println("\nCONSULTA DE UNA SALA");
         System.out.print("Ingrese el id: ");
         idSala = leer.nextInt();
         celda = ca.busquedaS(idSala);
         if (celda != -1) {
            System.out.println(ca.getSala(celda).toString());
            System.out.print("Presione ENTER para continuar");
            limpiarPausar();
         } else {
            System.out.print("No existe un Sala con ese ID... Presione ENTER para continuar");
            limpiarPausar();
         }
      } else {
         System.out.print("El cátalogo esta vacio... Presione ENTER para continuar");
         limpiarPausar();
      }
   }
   
   private static void realizarConsultaGeneralS(ControlApartados ca){
      if (ca.getContS() > 0 ) {
         System.out.println("\nCONSULTA DE TODOS LAS SALAS");
         for(int x=0; x<ca.getContS();x++){
            System.out.println(ca.getSala(x).toString());
            System.out.println("-----------------------------------");
         }
         System.out.print("Fin de la consulta... Presione ENTER para continuar");
         limpiarPausar();
      } else {
         System.out.print("El cátalogo esta vacio... Presione ENTER para continuar");
         limpiarPausar();
      }
   }
//   Apartados
}
