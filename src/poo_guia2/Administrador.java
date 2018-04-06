
package poo_guia2;


public class Administrador {
    String nombreAdministrador,telefonoAdministrador;

    public Administrador() {
    }

    public Administrador(String nombreAdministrador, String telefonoAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
        this.telefonoAdministrador = telefonoAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getTelefonoAdministrador() {
        return telefonoAdministrador;
    }

    public void setTelefonoAdministrador(String telefonoAdministrador) {
        this.telefonoAdministrador = telefonoAdministrador;
    }
    
}
