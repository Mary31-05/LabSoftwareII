package co.edu.unicauca.mvc.modelos;

/**
 * La clase Usuario representa un usuario en el sistema con atributos como 
 * id, nombre, rol y contraseña. Proporciona métodos para acceder y modificar 
 * estos atributos, así como para validar la contraseña del usuario.
 */
public class Usuario {
    
    private int idUsuario;
    private String nombreUsuario;
    private String rol;
    private String password;

    /**
     * Constructor por defecto que inicializa un nuevo objeto Usuario.
     */
    public Usuario() {
    }

    /**
     * Constructor que inicializa un nuevo objeto Usuario con los parámetros 
     * especificados.
     * 
     * @param idUsuario el identificador único del usuario
     * @param nombreUsuario el nombre del usuario
     * @param rol el rol del usuario (ejemplo: ADMIN, USER)
     * @param password la contraseña del usuario
     */
    public Usuario(int idUsuario, String nombreUsuario, String rol, String password) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
        this.password = password;
    }

    /**
     * Obtiene el identificador único del usuario.
     * 
     * @return el id del usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el identificador único del usuario.
     * 
     * @param idUsuario el nuevo id del usuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return el nombre del usuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombreUsuario el nuevo nombre del usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene el rol del usuario.
     * 
     * @return el rol del usuario
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el rol del usuario.
     * 
     * @param rol el nuevo rol del usuario
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return la contraseña del usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     * 
     * @param password la nueva contraseña del usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Valida la contraseña comparando el hash almacenado con la contraseña 
     * proporcionada.
     * 
     * @param password la contraseña a validar
     * @return true si la contraseña es válida, false de lo contrario
     */
    public boolean validarPassword(String password) {
        return this.password.equals(password);
    }
}
