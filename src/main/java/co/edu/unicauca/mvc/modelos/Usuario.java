
package co.edu.unicauca.mvc.modelos;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String rol;
    private String hashedPassword;

    public Usuario() {
    }

    
    public Usuario(int idUsuario, String nombreUsuario, String rol, String password) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
        this.hashedPassword = hashPassword(password);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

     // Hash de la contraseña utilizando BCrypt
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Validar la contraseña comparando el hash almacenado con la contraseña proporcionada
    public boolean validarPassword(String password) {
        return BCrypt.checkpw(password, this.hashedPassword);
    }
}
