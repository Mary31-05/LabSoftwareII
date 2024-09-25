package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface InterfaceRepositorioEvaluador {
    public boolean almacenarEvaluador(Evaluador objEvaluador);
    public List<Evaluador> listarEvaluadores();
    public boolean eliminarEvaluador(int idEvaluador);
    public Evaluador consultarEvaluador(int idEvaluador);
    public boolean actualizarEvaluador(Evaluador objEvaluador);
}
