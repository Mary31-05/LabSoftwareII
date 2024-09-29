package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Usuario;
import java.util.List;

/**
 * Interface para gestionar las operaciones CRUD (Create, Read, Update, Delete) 
 * y autenticación de usuarios en el sistema.
 * Provee métodos para registrar, listar, eliminar, consultar, actualizar 
 * y validar usuarios, además de extraer su rol.
 * 
 * @version 1.0
 */
public interface InterfaceRepositorioUsuario {

    /**
     * Registra un nuevo usuario en el sistema.
     * 
     * @param objUsuario El objeto Usuario que contiene los datos del usuario a registrar.
     * @return true si el usuario fue registrado exitosamente, false en caso contrario.
     */
    public boolean registrarUsuario(Usuario objUsuario);

    /**
     * Lista todos los usuarios registrados en el sistema.
     * 
     * @return Lista de objetos Usuario.
     */
    public List<Usuario> listarUsuarios();

    /**
     * Elimina un usuario del sistema basado en su ID.
     * 
     * @param idUsuario El ID del usuario que se desea eliminar.
     * @return true si el usuario fue eliminado exitosamente, false en caso contrario.
     */
    public boolean eliminarUsuario(int idUsuario);

    /**
     * Consulta un usuario por su nombre de usuario.
     * 
     * @param nombreUsuario El nombre de usuario a buscar.
     * @return El objeto Usuario si se encuentra, null en caso contrario.
     */
    public Usuario consultarUsuario(String nombreUsuario);

    /**
     * Actualiza la información de un usuario en el sistema.
     * 
     * @param objUsuario El objeto Usuario que contiene los datos actualizados.
     * @return true si el usuario fue actualizado exitosamente, false en caso contrario.
     */
    public boolean actualizarUsuario(Usuario objUsuario);

    /**
     * Valida las credenciales de ingreso de un usuario.
     * 
     * @param nombre El nombre de usuario.
     * @param password La contraseña del usuario.
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    public boolean validarIngreso(String nombre, String password);

    /**
     * Extrae el rol de un usuario en el sistema basado en su nombre de usuario.
     * 
     * @param nombre El nombre de usuario.
     * @return El rol del usuario como un String.
     */
    public String extraerRol(String nombre);
}
