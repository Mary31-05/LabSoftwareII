package co.edu.unicauca.mvc.infraestructura;

/**
 * Esta interfaz define el contrato para los observadores en el patrón 
 * de diseño Observador. Los objetos que implementan esta interfaz 
 * serán notificados de los cambios en el sujeto observado.
 * 
 * @author Usuario
 * @version 1.0
 */
public interface Observer {

    /**
     * Actualiza el estado del observador con el objeto notificado.
     *
     * @param o el objeto que contiene la información actualizada.
     */
    public void update(Object o);
}
