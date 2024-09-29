package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un repositorio en memoria para almacenar y gestionar 
 * objetos de tipo Evaluador utilizando un ArrayList.
 * Implementa la interfaz InterfaceRepositorioEvaluador.
 * 
 * @author Usuario
 */
public class RepositorioEvaluadorMemoriaArrayList implements InterfaceRepositorioEvaluador {

    private ArrayList<Evaluador> listaDeEvaluadores;

    /**
     * Constructor de la clase RepositorioEvaluadorMemoriaArrayList. 
     * Inicializa la lista de evaluadores como un ArrayList vacío.
     */
    public RepositorioEvaluadorMemoriaArrayList() {
        this.listaDeEvaluadores = new ArrayList<>();
    }

    /**
     * Almacena un evaluador en la lista.
     * 
     * @param objEvaluador El objeto Evaluador a almacenar.
     * @return true si el evaluador fue almacenado correctamente, false en caso contrario.
     */
    @Override
    public boolean almacenarEvaluador(Evaluador objEvaluador) {
        objEvaluador.setId(getCantidadEvaluadores());
        return this.listaDeEvaluadores.add(objEvaluador);
    }

    /**
     * Lista todos los evaluadores almacenados.
     * 
     * @return Una lista de todos los evaluadores.
     */
    @Override
    public List<Evaluador> listarEvaluadores() {
        return this.listaDeEvaluadores;
    }

    /**
     * Obtiene la cantidad actual de evaluadores almacenados.
     * 
     * @return La cantidad de evaluadores en la lista.
     */
    private int getCantidadEvaluadores() {
        return this.listaDeEvaluadores.size() + 1;
    }

    /**
     * Elimina un evaluador de la lista por su ID.
     * 
     * @param idEvaluador El ID del evaluador a eliminar.
     * @return true si el evaluador fue eliminado correctamente, false si no se encontró.
     */
    public boolean eliminarEvaluador(int idEvaluador) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeEvaluadores.size(); i++) {
            if (this.listaDeEvaluadores.get(i).getId() == idEvaluador) {
                this.listaDeEvaluadores.remove(i);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Consulta un evaluador por su ID.
     * 
     * @param idEvaluador El ID del evaluador a consultar.
     * @return El objeto Evaluador correspondiente, o null si no se encontró.
     */
    public Evaluador consultarEvaluador(int idEvaluador) {
        Evaluador objEvaluador = null;
        for (int i = 0; i < this.listaDeEvaluadores.size(); i++) {
            if (this.listaDeEvaluadores.get(i).getId() == idEvaluador) {
                objEvaluador = this.listaDeEvaluadores.get(i);
                break;
            }
        }
        return objEvaluador;
    }

    /**
     * Actualiza un evaluador existente en la lista.
     * 
     * @param objEvaluador El objeto Evaluador con los datos actualizados.
     * @return true si el evaluador fue actualizado correctamente, false si no se encontró.
     */
    public boolean actualizarEvaluador(Evaluador objEvaluador) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeEvaluadores.size(); i++) {
            if (this.listaDeEvaluadores.get(i).getId() == objEvaluador.getId()) {
                this.listaDeEvaluadores.set(i, objEvaluador);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

}
