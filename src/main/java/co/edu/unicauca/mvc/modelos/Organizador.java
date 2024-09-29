package co.edu.unicauca.mvc.modelos;

/**
 * La clase {@code Organizador} representa a un organizador de eventos,
 * incluyendo su nombre, apellido y la universidad a la que pertenece.
 */
public class Organizador {
    private String nombreOrganizador;
    private String apellidoOrganizador;
    private String universidad;
    
    /**
     * Crea una nueva instancia de {@code Organizador}.
     *
     * @param nombreOrganizador el nombre del organizador
     * @param apellidoOrganizador el apellido del organizador
     * @param universidad la universidad del organizador
     */
    public Organizador(String nombreOrganizador, String apellidoOrganizador, String universidad) {
        this.nombreOrganizador = nombreOrganizador;
        this.apellidoOrganizador = apellidoOrganizador;      
        this.universidad = universidad;
    }

    /**
     * Obtiene el nombre del organizador.
     *
     * @return el nombre del organizador
     */
    public String getNombre() {
        return nombreOrganizador;
    }

    /**
     * Establece el nombre del organizador.
     *
     * @param nombreOrganizador el nuevo nombre del organizador
     */
    public void setNombre(String nombreOrganizador) {
        this.nombreOrganizador = nombreOrganizador;
    }

    /**
     * Obtiene el apellido del organizador.
     *
     * @return el apellido del organizador
     */
    public String getApellido() {
        return apellidoOrganizador;
    }

    /**
     * Establece el apellido del organizador.
     *
     * @param apellidoOrganizador el nuevo apellido del organizador
     */
    public void setApellido(String apellidoOrganizador) {
        this.apellidoOrganizador = apellidoOrganizador;
    }
    
    /**
     * Obtiene la universidad del organizador.
     *
     * @return la universidad del organizador
     */
    public String getUniversidad() {
        return universidad;
    }

    /**
     * Establece la universidad del organizador.
     *
     * @param universidad la nueva universidad del organizador
     */
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
