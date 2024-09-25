
package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioUsuario;
import co.edu.unicauca.mvc.modelos.Usuario;
import java.util.List;

public class ServicioAlmacenamientoUsuarios {
    private InterfaceRepositorioUsuario referenciaRepositorioUsuario;
    
    public ServicioAlmacenamientoUsuarios(InterfaceRepositorioUsuario referenciaRepositorioUsuario)
    {
        this.referenciaRepositorioUsuario=referenciaRepositorioUsuario;
        // Añadir usuarios de prueba
        Usuario objUsuario = new Usuario();
        objUsuario.setNombreUsuario("User1");
        objUsuario.setRol("Organizador");
        objUsuario.setPassword("123");
        referenciaRepositorioUsuario.registrarUsuario(objUsuario);
    }
    
    public boolean registrarUsuario(Usuario objUsuario)
    {
        return this.referenciaRepositorioUsuario.registrarUsuario(objUsuario);
    }
      
    public List<Usuario> listarUsuarios()
    {
        return this.referenciaRepositorioUsuario.listarUsuarios();
    }
    
    public boolean eliminarUsuario(int idUsuario)
    {
        return this.referenciaRepositorioUsuario.eliminarUsuario(idUsuario);
    }
    
    public Usuario consultarUsuario(String nombreUsuario)
    {
        return this.referenciaRepositorioUsuario.consultarUsuario(nombreUsuario);
    }
    
    public boolean actualizarUsuario(Usuario objUsuario)
    {
        return this.referenciaRepositorioUsuario.actualizarUsuario(objUsuario);
    }
    
    public boolean validarIngreso(String nombreUsuario, String password){
        return this.referenciaRepositorioUsuario.validarIngreso(nombreUsuario, password);
    }
    
    public String extraerRol(String nombre){
        return this.referenciaRepositorioUsuario.extraerRol(nombre);
    }
}
