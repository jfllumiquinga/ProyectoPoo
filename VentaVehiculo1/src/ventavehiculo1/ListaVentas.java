/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class ListaVentas {
     List <Venta>listaVenta;

    public ListaVentas() {
         listaVenta=new ArrayList <Venta>();
         
    }
    
     public void addicionarVenta(Venta venta)
    {
    listaVenta.add(venta);
    
    }
    public int definirTamañoLista(){
    
    
    return listaVenta.size();
    
    }
    
    public void mostrarLista(){
    
    Venta aux = new Venta();
    for (Object obj: listaVenta){
    
    aux=(Venta) obj;
    System.out.println(aux.toString());
    
    }
    }
    
}
