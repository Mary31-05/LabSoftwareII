package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioConferencia;
import co.edu.unicauca.mvc.infraestructura.Subject;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;

/**
 * Clase que representa el servicio de almacenamiento de conferencias.
 * Esta clase se encarga de gestionar el almacenamiento y listado de conferencias.
 * Extiende la clase {@link Subject} para notificar a los observadores sobre los cambios.
 */
public class ServicioAlmacenamientoConferencias extends Subject {
    
    private InterfaceRepositorioConferencia referenciaRepositorioConferencias;
    
    /**
     * Constructor que inicializa el servicio de almacenamiento de conferencias
     * con una referencia al repositorio de conferencias.
     *
     * @param referenciaRepositorioConferencias referencia al repositorio de conferencias
     */
    public ServicioAlmacenamientoConferencias(InterfaceRepositorioConferencia referenciaRepositorioConferencias) {
        this.referenciaRepositorioConferencias = referenciaRepositorioConferencias;
    }
    
    /**
     * Almacena una conferencia en el repositorio.
     *
     * @param objConfererencia objeto conferencia a almacenar
     * @return true si la conferencia se almacena correctamente, false en caso contrario
     */
    public boolean almacenarConferencia(Conferencia objConfererencia) {
        boolean bandera = this.referenciaRepositorioConferencias.almacenarConferencia(objConfererencia);
        this.notifyAllObserves();
        return bandera;
    }

    /**
     * Lista todas las conferencias almacenadas en el repositorio.
     *
     * @return una lista de conferencias almacenadas
     */
    public List<Conferencia> listarConferencias() {
        return this.referenciaRepositorioConferencias.listarConferencias();
    }
}
