
package co.edu.unicauca.mvc.modelos;


public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String rol;
    private String password;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String rol, String password) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    

    // Validar la contraseña comparando el hash almacenado con la contraseña proporcionada
    public boolean validarPassword(String password) {
        if(this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
