
package ventavehiculo;


public class Talleres {
    private String nombreTaller ;
    private String direccionTaller;
    private long numeroTelefonico;

    public Talleres(String nombreTaller, String direccionTaller, long numeroTelefonico) {
        this.nombreTaller = nombreTaller;
        this.direccionTaller = direccionTaller;
        this.numeroTelefonico = numeroTelefonico;
    }

    Talleres() {
    
    }

    public String getNombreTaller() {
        return nombreTaller;
    }

    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }

    public String getDireccionTaller() {
        return direccionTaller;
    }

    public void setDireccionTaller(String direccionTaller) {
        this.direccionTaller = direccionTaller;
    }

    public long getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(long numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public String toString() {
        return "Talleres{" + "nombreTaller=" + nombreTaller + ", direccionTaller=" + direccionTaller + ", numeroTelefonico=" + numeroTelefonico + '}';
    }
    
}
