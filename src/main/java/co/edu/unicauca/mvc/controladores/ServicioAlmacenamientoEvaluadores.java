package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioEvaluador;
import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ServicioAlmacenamientoEvaluadores {
    private InterfaceRepositorioEvaluador referenciaRepositorioEvaluador;
    
    public ServicioAlmacenamientoEvaluadores(InterfaceRepositorioEvaluador referenciaRepositorioEvaluador)
    {
        this.referenciaRepositorioEvaluador=referenciaRepositorioEvaluador;
    }
    
    public boolean almacenarEvaluador(Evaluador objEvaluador)
    {
        return this.referenciaRepositorioEvaluador.almacenarEvaluador(objEvaluador);
    }
      
    public List<Evaluador> listarEvaluadores()
    {
        return this.referenciaRepositorioEvaluador.listarEvaluadores();
    }
    
    public boolean eliminarEvaluador(int idArticulo)
    {
        return this.referenciaRepositorioEvaluador.eliminarEvaluador(idArticulo);
    }
    
    public Evaluador consultarEvaluador(int idEvaluador)
    {
        return this.referenciaRepositorioEvaluador.consultarEvaluador(idEvaluador);
    }
    
    public boolean actualizarEvaluador(Evaluador objEvaluador)
    {
        return this.referenciaRepositorioEvaluador.actualizarEvaluador(objEvaluador);
    }
}

