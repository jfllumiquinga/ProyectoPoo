/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo;

import java.util.Scanner;
import java.io.Console;
/**
 *
 * @author Administrador
 */
public class GestorServicioT {
    public static void main(String[] args) {
         Console c = System.console();
        
        Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
            
           System.out.println("1. Mostrar Talleres");
           System.out.println("2. Agendar Cita");
           System.out.println("3. localizar Vehiculo");
           System.out.println("4. Pedir Servicio Tecnico");
           System.out.println("5. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
             ServicioTecnico st=new ServicioTecnico();
           switch(opcion){
               
               case 1:
                   System.out.println("Mostrar Talleres");
                  
                   st.mostrarTalleres();
                   System.out.println("Presione una tecla para continuar . . . ");
                    sn.nextLine();
                     sn.nextLine();
                   break;
               case 2:
                   System.out.println("Agendar Cita");
                   st.agendarCita();
                   System.out.println("Presione una tecla para continuar . . . ");
                    sn.nextLine();
                     sn.nextLine();
                   break;
                case 3:
                   System.out.println("localizar Vehiculo ");
                   break;
                case 4:
                   System.out.println("Pedir Servicio Tecnico");
                   break;
                case 5:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 5");
           }
        
    }
    }
}