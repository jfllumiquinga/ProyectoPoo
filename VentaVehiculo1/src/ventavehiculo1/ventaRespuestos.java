/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventavehiculo1;

/**
 *
 * @author Administrador
 */
public class ventaRespuestos {
     private String nombreComprador;
    private long nombreCuenta;
    private String formaPago;
    private String fechaEntrega;
    private String fechaFactura;
    private double PrecioTotal;

    public ventaRespuestos(String nombreComprador, long nombreCuenta, String formaPago,  String fechaEntrega, String fechaFactura, double PrecioTotal) {
        this.nombreComprador = nombreComprador;
        this.nombreCuenta = nombreCuenta;
        this.formaPago = formaPago;
 
        this.fechaEntrega = fechaEntrega;
        this.fechaFactura = fechaFactura;
        this.PrecioTotal = PrecioTotal;
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

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
    
    public void ventaRespuestos(){
    this.nombreComprador = "jose";
        this.nombreCuenta = 25454;
        this.formaPago = "efectivo";

       
    
    
    }
    @Override
    public String toString() {
        return "ventaRespuestos{" + "nombreComprador=" + nombreComprador + ", nombreCuenta=" + nombreCuenta + ", formaPago=" + formaPago + ", fechaEntrega=" + fechaEntrega + ", fechaFactura=" + fechaFactura + ", PrecioTotal=" + PrecioTotal + '}';
    }
    
}
