/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo;

/**
 *
 * @author Administrador
 */
public class ServicioTecnico {
    private String Daño;
    private String localizacionVehiculo;
    private float cotizacionDaño;
    private String talleres;
    listaTalleres listaT;

    public ServicioTecnico(String Daño, String localizacionVehiculo, float cotizacionDaño) {
        this.Daño = Daño;
        this.localizacionVehiculo = localizacionVehiculo;
        this.cotizacionDaño = cotizacionDaño;
        
    }

    public ServicioTecnico() {
    }

    public String getDaño() {
        return Daño;
    }

    public void setDaño(String Daño) {
        this.Daño = Daño;
    }

    public String getLocalizacionVehiculo() {
        return localizacionVehiculo;
    }

    public void setLocalizacionVehiculo(String localizacionVehiculo) {
        this.localizacionVehiculo = localizacionVehiculo;
    }

    public float getCotizacionDaño() {
        return cotizacionDaño;
    }

    public void setCotizacionDaño(float cotizacionDaño) {
        this.cotizacionDaño = cotizacionDaño;
    }

    public String getTalleres() {
        return talleres;
    }

    public void setTalleres(String talleres) {
        this.talleres = talleres;
    }
    
    public void mostrarTalleres()
    {
        listaTalleres list=new listaTalleres();
        list.mostrarLista();
    }
    public void agendarCita()
    {
        
        System.out.println("DATOS DEL DAÑO");
     this.Daño = "CHOQUE";
     this.localizacionVehiculo = "CALDERAON";
     this.cotizacionDaño = 200;
     System.out.println(toString());
    System.out.println("CITA AGENDADA....");
    System.out.println("FECHA: 5/07/2020");
    System.out.println("TURNO: ");
    }
    public void pedirSericioTecnico()
    {
    
    
    
    }

    @Override
    public String toString() {
        
        return "ServicioTecnico{" + "Da\u00f1o=" + Daño + ", localizacionVehiculo=" + localizacionVehiculo + ", cotizacionDa\u00f1o=" + cotizacionDaño +  '}';
        
    }
    
}
