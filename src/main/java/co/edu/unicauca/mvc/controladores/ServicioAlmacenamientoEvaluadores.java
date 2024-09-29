package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioEvaluador;
import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.List;

/**
 * Clase que se encarga del almacenamiento de evaluadores.
 * Esta clase utiliza un repositorio para realizar operaciones
 * relacionadas con la persistencia de los evaluadores.
 * 
 * @author Usuario
 */
public class ServicioAlmacenamientoEvaluadores {
    private InterfaceRepositorioEvaluador referenciaRepositorioEvaluador;
    
    /**
     * Constructor de la clase ServicioAlmacenamientoEvaluadores.
     * 
     * @param referenciaRepositorioEvaluador La referencia al repositorio de evaluadores
     */
    public ServicioAlmacenamientoEvaluadores(InterfaceRepositorioEvaluador referenciaRepositorioEvaluador) {
        this.referenciaRepositorioEvaluador = referenciaRepositorioEvaluador;
    }
    
    /**
     * Almacena un evaluador en el repositorio.
     * 
     * @param objEvaluador El evaluador a almacenar
     * @return true si el almacenamiento fue exitoso, false en caso contrario
     */
    public boolean almacenarEvaluador(Evaluador objEvaluador) {
        return this.referenciaRepositorioEvaluador.almacenarEvaluador(objEvaluador);
    }
      
    /**
     * Lista todos los evaluadores almacenados en el repositorio.
     * 
     * @return Una lista de evaluadores
     */
    public List<Evaluador> listarEvaluadores() {
        return this.referenciaRepositorioEvaluador.listarEvaluadores();
    }
    
    /**
     * Elimina un evaluador del repositorio utilizando su ID.
     * 
     * @param idArticulo El ID del evaluador a eliminar
     * @return true si la eliminación fue exitosa, false en caso contrario
     */
    public boolean eliminarEvaluador(int idArticulo) {
        return this.referenciaRepositorioEvaluador.eliminarEvaluador(idArticulo);
    }
    
    /**
     * Consulta un evaluador en el repositorio utilizando su ID.
     * 
     * @param idEvaluador El ID del evaluador a consultar
     * @return El evaluador correspondiente al ID, o null si no se encuentra
     */
    public Evaluador consultarEvaluador(int idEvaluador) {
        return this.referenciaRepositorioEvaluador.consultarEvaluador(idEvaluador);
    }
    
    /**
     * Actualiza un evaluador en el repositorio.
     * 
     * @param objEvaluador El evaluador con los datos actualizados
     * @return true si la actualización fue exitosa, false en caso contrario
     */
    public boolean actualizarEvaluador(Evaluador objEvaluador) {
        return this.referenciaRepositorioEvaluador.actualizarEvaluador(objEvaluador);
    }
}
