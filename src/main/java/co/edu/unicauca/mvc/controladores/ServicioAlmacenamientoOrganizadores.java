package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioOrganizador;
import co.edu.unicauca.mvc.infraestructura.Subject;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Organizador;

/**
 * Clase ServicioAlmacenamientoOrganizadores que maneja la lógica de almacenamiento
 * de objetos Organizador utilizando un repositorio específico.
 * Esta clase extiende la clase Subject para permitir la notificación a los observadores
 * sobre cambios en los organizadores almacenados.
 * 
 * @author Usuario
 */
public class ServicioAlmacenamientoOrganizadores extends Subject {
    
    /** Referencia al repositorio de organizadores. */
    private InterfaceRepositorioOrganizador referenciaRepositorioOrganizadores;

    /**
     * Constructor de la clase ServicioAlmacenamientoOrganizadores.
     *
     * @param referenciaRepositorioOrganizadores La referencia al repositorio de organizadores.
     */
    public ServicioAlmacenamientoOrganizadores(InterfaceRepositorioOrganizador referenciaRepositorioOrganizadores) {
        this.referenciaRepositorioOrganizadores = referenciaRepositorioOrganizadores;
    }

    /**
     * Almacena un organizador en el repositorio y notifica a los observadores.
     *
     * @param objOrganizador El objeto Organizador a almacenar.
     * @return true si el organizador se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarOrganizador(Organizador objOrganizador) {
        boolean bandera = this.referenciaRepositorioOrganizadores.almacenarOrganizador(objOrganizador);
        this.notifyAllObserves();
        return bandera;
    }

    /**
     * Lista todos los organizadores almacenados en el repositorio.
     *
     * @return Una lista de objetos Organizador.
     */
    public List<Organizador> listarOrganizador() {
        return this.referenciaRepositorioOrganizadores.listarOrganizadores();
    }
}
