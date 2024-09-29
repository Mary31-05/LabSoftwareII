package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import java.util.List;

/**
 * InterfaceRepositorioArticulo define los métodos necesarios para interactuar
 * con los datos de los artículos en el sistema.
 * Proporciona operaciones para almacenar, listar, eliminar, consultar y actualizar artículos.
 * 
 * @version 1.0
 */
public interface InterfaceRepositorioArticulo {

    /**
     * Almacena un artículo en el repositorio.
     * 
     * @param objArticulo El objeto Articulo que se desea almacenar.
     * @return true si el artículo fue almacenado correctamente, false en caso contrario.
     */
    public boolean almacenarArticulo(Articulo objArticulo);

    /**
     * Retorna una lista de todos los artículos almacenados en el repositorio.
     * 
     * @return Lista de objetos Articulo.
     */
    public List<Articulo> listarArticulos();

    /**
     * Elimina un artículo del repositorio según su ID.
     * 
     * @param idArticulo El ID del artículo que se desea eliminar.
     * @return true si el artículo fue eliminado correctamente, false en caso contrario.
     */
    public boolean eliminarArticulo(int idArticulo);

    /**
     * Consulta un artículo específico en el repositorio según su ID.
     * 
     * @param idArticulo El ID del artículo que se desea consultar.
     * @return El objeto Articulo correspondiente al ID, o null si no se encuentra.
     */
    public Articulo consultarArticulo(int idArticulo);

    /**
     * Actualiza la información de un artículo en el repositorio.
     * 
     * @param objArticulo El objeto Articulo que contiene la información actualizada.
     * @return true si el artículo fue actualizado correctamente, false en caso contrario.
     */
    public boolean actualizarArticulo(Articulo objArticulo);
}
