/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Administrador
 */
public class listaTalleres {
    List <Talleres>listaTalleres;
   

    public listaTalleres() {
         listaTalleres=new ArrayList <Talleres>();
          Talleres ta1=new Talleres("AAAA","DIRECCION AAA",235648);
          listaTalleres.add(ta1);
          Talleres ta2=new Talleres("BBBB","DIRECCION BBB",235648);
          listaTalleres.add(ta2);
          Talleres ta3=new Talleres("Cccc","DIRECCION cccc",235648);
          listaTalleres.add(ta3);
         
    }
    
     public void addicionarTalleres(Talleres taller)
    {
    listaTalleres.add(taller);
   
    }
    public int definirTamañoLista(){
    
    
    return listaTalleres.size();
    
    }
    
    public void mostrarLista(){
    
   Talleres aux = new Talleres();
    for (Object obj: listaTalleres){
    
    aux=(Talleres) obj;
    System.out.println(aux.toString());
    
    }
    } 
}
