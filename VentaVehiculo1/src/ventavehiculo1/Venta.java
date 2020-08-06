/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Venta {
    private String nombreComprador;
    private long nombreCuenta;
    private String formaPago;
    private float precioVenta;
    private String fechaEntrega;
    private String fechaFactura;
   

    public Venta(String nombreComprador, long nombreCuenta, String formaPago, float precioVenta, String fechaEntrega, String fechaFactura) {
        this.nombreComprador = nombreComprador;
        this.nombreCuenta = nombreCuenta;
        this.formaPago = formaPago;
        this.precioVenta = precioVenta;
        this.fechaEntrega = fechaEntrega;
        this.fechaFactura = fechaFactura;
    }

    Venta() {
        
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public long getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(long nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
    public void registrarVenta(){
 Date fechaEntrega=new Date("2020/08/01");
 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    String fechaFormateada=sdf.format(fechaEntrega);
    
    this.nombreComprador ="jose jimenez";
        this.nombreCuenta =265489465;
        this.formaPago = "efectivo";
        this.precioVenta = 300;
        this.fechaEntrega =fechaFormateada;
        this.fechaFactura = fechaFormateada;
        System.out.println(toString());
    }
    public void registrarFormulario()
    {
    Formulario form=new Formulario("os Chillos", "asdas@gmail.com",99856,"PAQUETE KIA PER");
    
    System.out.println(form.toString());
    }

    @Override
    public String toString() {
        return "Venta{" + "nombreComprador=" + nombreComprador + ", nombreCuenta=" + nombreCuenta + ", formaPago=" + formaPago + ", precioVenta=" + precioVenta + ", fechaEntrega=" + fechaEntrega + ", fechaFactura=" + fechaFactura + '}';
    }
}
