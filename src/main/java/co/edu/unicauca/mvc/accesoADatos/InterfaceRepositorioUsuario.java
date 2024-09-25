
package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Usuario;
import java.util.List;

public interface InterfaceRepositorioUsuario {
    public boolean registrarUsuario(Usuario objUsuario);
    public List<Usuario> listarUsuarios();
    public boolean eliminarUsuario(int idUsuario);
    public Usuario consultarUsuario(String nombreUsuario);
    public boolean actualizarUsuario(Usuario objUsuario);
    public boolean validarIngreso(String nombre, String password);
    public String extraerRol(String nombre);
}
