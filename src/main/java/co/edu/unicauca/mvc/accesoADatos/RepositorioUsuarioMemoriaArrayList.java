
package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Usuario;
import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarioMemoriaArrayList implements InterfaceRepositorioUsuario {

    private ArrayList<Usuario> listaDeUsuarios;

    public RepositorioUsuarioMemoriaArrayList() {
        this.listaDeUsuarios = new ArrayList();
    }
    
    private int getCantidadUsuarios()
    {
        return this.listaDeUsuarios.size()+1;
    }

    @Override
    public boolean registrarUsuario(Usuario objUsuario) {
        objUsuario.setIdUsuario(getCantidadUsuarios());
        return this.listaDeUsuarios.add(objUsuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return this.listaDeUsuarios;
    }

    @Override
    public boolean eliminarUsuario(int idUsuario) {
        boolean bandera=false;
        for (int i = 0; i < this.listaDeUsuarios.size(); i++) {
            if(this.listaDeUsuarios.get(i).getIdUsuario()==idUsuario)
            {
                this.listaDeUsuarios.remove(i);
                bandera=true;
                break;
            }
        }
        return bandera;
    }

    @Override
    public Usuario consultarUsuario(String nombreUsuario) {
        Usuario objUsuario=null;
        for (int i = 0; i < this.listaDeUsuarios.size(); i++) {
            if(this.listaDeUsuarios.get(i).getNombreUsuario().equals(nombreUsuario))
            {
                objUsuario=this.listaDeUsuarios.get(i);
                break;
            }
        }
        
        return objUsuario;
    }

    @Override
    public boolean actualizarUsuario(Usuario objUsuario) {
        boolean bandera=false;
        for (int i = 0; i < this.listaDeUsuarios.size(); i++) {
            if(this.listaDeUsuarios.get(i).getIdUsuario()==objUsuario.getIdUsuario())
            {
                this.listaDeUsuarios.set(i, objUsuario);
                bandera=true;
                break;
            }
        }
        
        return bandera;
    }
    
    // Validar el ingreso de un usuario
    public boolean validarIngreso(String nombre, String password) {
        Usuario usuario = consultarUsuario(nombre);
        if (usuario != null) {
            return usuario.validarPassword(password);
        } else {
            System.out.println("Usuario no encontrado.");
            return false;
        }
    }
    
}
