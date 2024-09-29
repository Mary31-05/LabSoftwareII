package co.edu.unicauca.mvc.accesoADatos;

import java.util.ArrayList;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;

/**
 * RepositorioConferenciaMemoriaLinkedist es una clase que implementa
 * la interfaz InterfaceRepositorioConferencia. Esta clase utiliza
 * una lista de conferencias almacenadas en memoria (ArrayList) para
 * gestionar las conferencias.
 */
public class RepositorioConferenciaMemoriaLinkedist implements InterfaceRepositorioConferencia {

    private ArrayList<Conferencia> listaConferencias;

    /**
     * Constructor que inicializa la lista de conferencias.
     */
    public RepositorioConferenciaMemoriaLinkedist() {
        this.listaConferencias = new ArrayList<>();
    }

    /**
     * Almacena una conferencia en el repositorio.
     * 
     * @param objConfererencia La conferencia a almacenar.
     * @return true si la conferencia se almacena correctamente; false en caso contrario.
     */
    @Override
    public boolean almacenarConferencia(Conferencia objConfererencia) {
        objConfererencia.setIdConferencia(this.getCantidadConferencias());
        boolean bandera = this.listaConferencias.add(objConfererencia);
        return bandera;
    }

    /**
     * Lista todas las conferencias almacenadas en el repositorio.
     * 
     * @return Una lista de objetos Conferencia.
     */
    @Override
    public List<Conferencia> listarConferencias() {
        return this.listaConferencias;
    }

    /**
     * Obtiene la cantidad actual de conferencias almacenadas.
     * 
     * @return La cantidad de conferencias en el repositorio.
     */
    private int getCantidadConferencias() {
        return this.listaConferencias.size() + 1;
    }
}
