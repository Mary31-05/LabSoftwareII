package co.edu.unicauca.mvc.modelos;

public class Organizador {
    private String nombreOrganizador;
    private String apellidoOrganizador;
    private String universidad;
    
    public Organizador(String nombreOrganizador,String apellidoOrganizador, String universidad) {
        this.nombreOrganizador = nombreOrganizador;
        this.apellidoOrganizador = apellidoOrganizador;      
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombreOrganizador;
    }

    public void setNombre(String nombreOrganizador) {
        this.nombreOrganizador = nombreOrganizador;
    }

    public String getApellido() {
        return apellidoOrganizador;
    }

    public void setApellido(String apellidoOrganizador) {
        this.apellidoOrganizador=apellidoOrganizador;
    }
    
     public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad=universidad;
    }
}
