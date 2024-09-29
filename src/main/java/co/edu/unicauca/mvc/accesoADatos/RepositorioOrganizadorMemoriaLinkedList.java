package co.edu.unicauca.mvc.accesoADatos;

import java.util.LinkedList;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Organizador;

/**
 * Clase que implementa un repositorio en memoria utilizando una lista enlazada
 * para almacenar objetos de tipo {@link Organizador}.
 * 
 * Esta clase implementa la interfaz {@link InterfaceRepositorioOrganizador}.
 * 
 * @author Usuario
 */
public class RepositorioOrganizadorMemoriaLinkedList implements InterfaceRepositorioOrganizador {

    private LinkedList<Organizador> listaOrganizadores;

    /**
     * Constructor que inicializa la lista enlazada donde se almacenarán
     * los organizadores.
     */
    public RepositorioOrganizadorMemoriaLinkedList() {
        this.listaOrganizadores = new LinkedList<>();
    }

    /**
     * Almacena un organizador en la lista.
     * 
     * @param objOrganizador El organizador a almacenar.
     * @return true si el organizador se almacena correctamente, false en caso contrario.
     */
    @Override
    public boolean almacenarOrganizador(Organizador objOrganizador) {
        boolean bandera = this.listaOrganizadores.add(objOrganizador);
        return bandera;
    }

    /**
     * Lista todos los organizadores almacenados en el repositorio.
     * 
     * @return Una lista de objetos {@link Organizador} almacenados.
     */
    public List<Organizador> listarOrganizadores() {
        return this.listaOrganizadores;
    }
}
