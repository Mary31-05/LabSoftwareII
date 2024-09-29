package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Conferencia;
import java.util.List;

/**
 * Interface para definir el repositorio de conferencias. Proporciona métodos
 * para almacenar y listar conferencias.
 */
public interface InterfaceRepositorioConferencia {

    /**
     * Almacena una conferencia en el repositorio.
     * 
     * @param objConferencia La conferencia que se desea almacenar.
     * @return true si la conferencia fue almacenada con éxito, false en caso
     *         contrario.
     */
    public boolean almacenarConferencia(Conferencia objConferencia);

    /**
     * Lista todas las conferencias almacenadas en el repositorio.
     * 
     * @return Una lista de objetos de tipo Conferencia.
     */
    public List<Conferencia> listarConferencias();
}
