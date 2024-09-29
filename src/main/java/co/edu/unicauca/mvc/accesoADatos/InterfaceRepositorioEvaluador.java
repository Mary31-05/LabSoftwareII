package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.List;

/**
 * Interface que define los métodos para gestionar evaluadores en el sistema.
 * Proporciona las operaciones CRUD básicas para la entidad Evaluador.
 * 
 * @author Usuario
 */
public interface InterfaceRepositorioEvaluador {

    /**
     * Almacena un evaluador en el sistema.
     * 
     * @param objEvaluador El objeto de tipo Evaluador a almacenar.
     * @return true si el evaluador se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarEvaluador(Evaluador objEvaluador);

    /**
     * Lista todos los evaluadores almacenados en el sistema.
     * 
     * @return Una lista de evaluadores.
     */
    public List<Evaluador> listarEvaluadores();

    /**
     * Elimina un evaluador dado su identificador.
     * 
     * @param idEvaluador El identificador único del evaluador a eliminar.
     * @return true si se elimina correctamente, false en caso contrario.
     */
    public boolean eliminarEvaluador(int idEvaluador);

    /**
     * Consulta los detalles de un evaluador dado su identificador.
     * 
     * @param idEvaluador El identificador único del evaluador a consultar.
     * @return El objeto de tipo Evaluador correspondiente al identificador, o null si no se encuentra.
     */
    public Evaluador consultarEvaluador(int idEvaluador);

    /**
     * Actualiza la información de un evaluador en el sistema.
     * 
     * @param objEvaluador El objeto de tipo Evaluador con los datos actualizados.
     * @return true si la actualización es exitosa, false en caso contrario.
     */
    public boolean actualizarEvaluador(Evaluador objEvaluador);
}
