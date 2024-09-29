package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase RepositorioArticuloMemoriaArrayList
 * Implementa la interfaz InterfaceRepositorioArticulo y permite gestionar artículos
 * en memoria utilizando un ArrayList como estructura de datos.
 * 
 * @author Usuario
 */
public class RepositorioArticuloMemoriaArrayList implements InterfaceRepositorioArticulo {

    /**
     * Lista que almacena los artículos en memoria.
     */
    private ArrayList<Articulo> listaDeArticulos;
    
    /**
     * Constructor de la clase RepositorioArticuloMemoriaArrayList.
     * Inicializa la lista de artículos.
     */
    public RepositorioArticuloMemoriaArrayList() {
        this.listaDeArticulos = new ArrayList<>();
    }
    
    /**
     * Almacena un nuevo artículo en la lista.
     * Se asigna automáticamente un ID al artículo basado en la cantidad actual de artículos.
     * 
     * @param objArticulo El artículo a almacenar.
     * @return true si el artículo se agregó correctamente, false en caso contrario.
     */
    @Override
    public boolean almacenarArticulo(Articulo objArticulo) {
        objArticulo.setIdArticulo(getCantidadArticulos());
        return this.listaDeArticulos.add(objArticulo);
    }

    /**
     * Retorna una lista con todos los artículos almacenados.
     * 
     * @return Lista de artículos.
     */
    @Override
    public List<Articulo> listarArticulos() {
        return this.listaDeArticulos;
    }
    
    /**
     * Obtiene la cantidad actual de artículos en la lista.
     * Se utiliza para asignar un ID único a cada artículo.
     * 
     * @return Cantidad de artículos + 1 (para asignar ID).
     */
    private int getCantidadArticulos() {
        return this.listaDeArticulos.size() + 1;
    }

    /**
     * Elimina un artículo de la lista según su ID.
     * 
     * @param idArticulo ID del artículo a eliminar.
     * @return true si el artículo se eliminó correctamente, false en caso contrario.
     */
    @Override
    public boolean eliminarArticulo(int idArticulo) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == idArticulo) {
                this.listaDeArticulos.remove(i);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Consulta un artículo según su ID.
     * 
     * @param idArticulo ID del artículo a consultar.
     * @return El artículo encontrado, o null si no existe.
     */
    @Override
    public Articulo consultarArticulo(int idArticulo) {
        Articulo objArticulo = null;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == idArticulo) {
                objArticulo = this.listaDeArticulos.get(i);
                break;
            }
        }
        return objArticulo;
    }

    /**
     * Actualiza un artículo existente en la lista.
     * 
     * @param objArticulo El artículo con la información actualizada.
     * @return true si el artículo se actualizó correctamente, false en caso contrario.
     */
    @Override
    public boolean actualizarArticulo(Articulo objArticulo) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == objArticulo.getIdArticulo()) {
                this.listaDeArticulos.set(i, objArticulo);
                bandera = true;
                break;
            }
        }
        return bandera;
    }
}
