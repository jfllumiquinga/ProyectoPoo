
package ventavehiculo1;

import java.io.Console;
import java.util.Scanner;


public class GestorVentaVehiculo1 {

    
    public static void main(String[] args) {
        Console c = System.console();
        
        Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
        
       while(!salir){
            
           System.out.println("1. Registrar Venta");
           System.out.println("2. Registrar Formulario");
           System.out.println("3. acordar Terminos");
           System.out.println("4. Registrar venta Respuestos");
           System.out.println("5. Gestionar Cita");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
             Venta v=new Venta();
           switch(opcion){
               
               case 1:
                   System.out.println(" Registrar Venta");
                  
                   v.registrarVenta();
                   System.out.println("Presione una tecla para continuar . . . ");
                    sn.nextLine();
                     sn.nextLine();
                   break;
               case 2:
                   System.out.println("Registrar Formulario");
                   v.registrarFormulario();
                   System.out.println("Presione una tecla para continuar . . . ");
                    sn.nextLine();
                     sn.nextLine();
                   break;
                case 3:
                   System.out.println("Registrar venta Respuestos ");
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
    

