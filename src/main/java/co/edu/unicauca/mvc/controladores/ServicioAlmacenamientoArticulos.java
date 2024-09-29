package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioArticulo;
import co.edu.unicauca.mvc.modelos.Articulo;
import java.util.List;

/**
 * Clase que proporciona servicios para el almacenamiento y manejo de artículos.
 * Utiliza un repositorio de artículos definido por la interfaz {@link InterfaceRepositorioArticulo}.
 */
public class ServicioAlmacenamientoArticulos {
    
    private InterfaceRepositorioArticulo referenciaRepositorioArticulo;

    /**
     * Constructor que inicializa el servicio de almacenamiento de artículos
     * con el repositorio proporcionado.
     *
     * @param referenciaRepositorioArticulo el repositorio de artículos a utilizar
     */
    public ServicioAlmacenamientoArticulos(InterfaceRepositorioArticulo referenciaRepositorioArticulo) {
        this.referenciaRepositorioArticulo = referenciaRepositorioArticulo;
    }

    /**
     * Almacena un artículo en el repositorio.
     *
     * @param objArticulo el artículo a almacenar
     * @return true si el artículo se almacenó correctamente, false en caso contrario
     */
    public boolean almacenarArticulo(Articulo objArticulo) {
        return this.referenciaRepositorioArticulo.almacenarArticulo(objArticulo);
    }

    /**
     * Lista todos los artículos almacenados en el repositorio.
     *
     * @return una lista de artículos almacenados
     */
    public List<Articulo> listarArticulos() {
        return this.referenciaRepositorioArticulo.listarArticulos();
    }

    /**
     * Elimina un artículo del repositorio por su identificador.
     *
     * @param idArticulo el identificador del artículo a eliminar
     * @return true si el artículo se eliminó correctamente, false en caso contrario
     */
    public boolean eliminarArticulo(int idArticulo) {
        return this.referenciaRepositorioArticulo.eliminarArticulo(idArticulo);
    }

    /**
     * Consulta un artículo del repositorio por su identificador.
     *
     * @param idArticulo el identificador del artículo a consultar
     * @return el artículo correspondiente al identificador, o null si no se encuentra
     */
    public Articulo consultarArticulo(int idArticulo) {
        return this.referenciaRepositorioArticulo.consultarArticulo(idArticulo);
    }

    /**
     * Actualiza un artículo en el repositorio.
     *
     * @param objArticulo el artículo con los datos actualizados
     * @return true si el artículo se actualizó correctamente, false en caso contrario
     */
    public boolean actualizarArticulo(Articulo objArticulo) {
        return this.referenciaRepositorioArticulo.actualizarArticulo(objArticulo);
    }
}
