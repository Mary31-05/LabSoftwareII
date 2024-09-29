package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioUsuario;
import co.edu.unicauca.mvc.modelos.Usuario;
import java.util.List;

/**
 * Clase que proporciona servicios de almacenamiento para usuarios.
 * Permite registrar, listar, eliminar, consultar y actualizar usuarios,
 * así como validar el ingreso y extraer el rol de un usuario.
 */
public class ServicioAlmacenamientoUsuarios {
    private InterfaceRepositorioUsuario referenciaRepositorioUsuario;
    
    /**
     * Constructor de la clase ServicioAlmacenamientoUsuarios.
     * Inicializa el repositorio de usuarios y añade usuarios de prueba.
     * 
     * @param referenciaRepositorioUsuario referencia a un objeto que implementa
     *                                      InterfaceRepositorioUsuario.
     */
    public ServicioAlmacenamientoUsuarios(InterfaceRepositorioUsuario referenciaRepositorioUsuario) {
        this.referenciaRepositorioUsuario = referenciaRepositorioUsuario;

        // Añadir usuarios de prueba
        Usuario objUsuario = new Usuario();
        objUsuario.setNombreUsuario("User1");
        objUsuario.setRol("Organizador");
        objUsuario.setPassword("123");
        referenciaRepositorioUsuario.registrarUsuario(objUsuario);
        
        Usuario objUsuario1 = new Usuario();
        objUsuario1.setNombreUsuario("User2");
        objUsuario1.setRol("Autor");
        objUsuario1.setPassword("123");
        referenciaRepositorioUsuario.registrarUsuario(objUsuario1);
    }
    
    /**
     * Registra un nuevo usuario en el repositorio.
     * 
     * @param objUsuario el objeto Usuario que se desea registrar.
     * @return true si el usuario fue registrado exitosamente, false en caso contrario.
     */
    public boolean registrarUsuario(Usuario objUsuario) {
        return this.referenciaRepositorioUsuario.registrarUsuario(objUsuario);
    }
      
    /**
     * Lista todos los usuarios registrados.
     * 
     * @return una lista de objetos Usuario.
     */
    public List<Usuario> listarUsuarios() {
        return this.referenciaRepositorioUsuario.listarUsuarios();
    }
    
    /**
     * Elimina un usuario del repositorio por su ID.
     * 
     * @param idUsuario el ID del usuario a eliminar.
     * @return true si el usuario fue eliminado exitosamente, false en caso contrario.
     */
    public boolean eliminarUsuario(int idUsuario) {
        return this.referenciaRepositorioUsuario.eliminarUsuario(idUsuario);
    }
    
    /**
     * Consulta un usuario por su nombre de usuario.
     * 
     * @param nombreUsuario el nombre de usuario a consultar.
     * @return el objeto Usuario correspondiente, o null si no existe.
     */
    public Usuario consultarUsuario(String nombreUsuario) {
        return this.referenciaRepositorioUsuario.consultarUsuario(nombreUsuario);
    }
    
    /**
     * Actualiza los datos de un usuario en el repositorio.
     * 
     * @param objUsuario el objeto Usuario con los nuevos datos.
     * @return true si el usuario fue actualizado exitosamente, false en caso contrario.
     */
    public boolean actualizarUsuario(Usuario objUsuario) {
        return this.referenciaRepositorioUsuario.actualizarUsuario(objUsuario);
    }
    
    /**
     * Valida el ingreso de un usuario verificando su nombre y contraseña.
     * 
     * @param nombreUsuario el nombre de usuario.
     * @param password la contraseña del usuario.
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    public boolean validarIngreso(String nombreUsuario, String password) {
        return this.referenciaRepositorioUsuario.validarIngreso(nombreUsuario, password);
    }
    
    /**
     * Extrae el rol de un usuario dado su nombre de usuario.
     * 
     * @param nombre el nombre del usuario.
     * @return el rol del usuario, o null si no existe.
     */
    public String extraerRol(String nombre) {
        return this.referenciaRepositorioUsuario.extraerRol(nombre);
    }
}
