package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa el repositorio de usuarios utilizando una lista en memoria.
 * Esta clase permite registrar, listar, eliminar, consultar y actualizar usuarios
 * en una lista que se mantiene en memoria.
 * 
 * @author Usuario
 */
public class RepositorioUsuarioMemoriaArrayList implements InterfaceRepositorioUsuario {

    private ArrayList<Usuario> listaDeUsuarios;

    /**
     * Constructor de la clase RepositorioUsuarioMemoriaArrayList.
     * Inicializa la lista de usuarios.
     */
    public RepositorioUsuarioMemoriaArrayList() {
        this.listaDeUsuarios = new ArrayList<>();
    }
    
    /**
     * Obtiene la cantidad de usuarios registrados en el repositorio.
     * 
     * @return el número total de usuarios registrados.
     */
    private int getCantidadUsuarios() {
        return this.listaDeUsuarios.size() + 1;
    }

    /**
     * Registra un nuevo usuario en el repositorio.
     * 
     * @param objUsuario el objeto Usuario que se desea registrar.
     * @return true si el usuario fue registrado exitosamente, false en caso contrario.
     */
    @Override
    public boolean registrarUsuario(Usuario objUsuario) {
        objUsuario.setIdUsuario(getCantidadUsuarios());
        return this.listaDeUsuarios.add(objUsuario);
    }

    /**
     * Lista todos los usuarios registrados en el repositorio.
     * 
     * @return una lista de objetos Usuario registrados.
     */
    @Override
    public List<Usuario> listarUsuarios() {
        return this.listaDeUsuarios;
    }

    /**
     * Elimina un usuario del repositorio basado en su ID.
     * 
     * @param idUsuario el ID del usuario que se desea eliminar.
     * @return true si el usuario fue eliminado exitosamente, false en caso contrario.
     */
    @Override
    public boolean eliminarUsuario(int idUsuario) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeUsuarios.size(); i++) {
            if (this.listaDeUsuarios.get(i).getIdUsuario() == idUsuario) {
                this.listaDeUsuarios.remove(i);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Consulta un usuario en el repositorio basado en su nombre de usuario.
     * 
     * @param nombreUsuario el nombre del usuario a consultar.
     * @return el objeto Usuario correspondiente, o null si no se encuentra.
     */
    @Override
    public Usuario consultarUsuario(String nombreUsuario) {
        Usuario objUsuario = null;
        for (int i = 0; i < this.listaDeUsuarios.size(); i++) {
            if (this.listaDeUsuarios.get(i).getNombreUsuario().equals(nombreUsuario)) {
                objUsuario = this.listaDeUsuarios.get(i);
                break;
            }
        }
        return objUsuario;
    }

    /**
     * Actualiza la información de un usuario en el repositorio.
     * 
     * @param objUsuario el objeto Usuario que contiene la información actualizada.
     * @return true si el usuario fue actualizado exitosamente, false en caso contrario.
     */
    @Override
    public boolean actualizarUsuario(Usuario objUsuario) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeUsuarios.size(); i++) {
            if (this.listaDeUsuarios.get(i).getIdUsuario() == objUsuario.getIdUsuario()) {
                this.listaDeUsuarios.set(i, objUsuario);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Valida el ingreso de un usuario mediante su nombre y contraseña.
     * 
     * @param nombre el nombre del usuario a validar.
     * @param password la contraseña del usuario a validar.
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    @Override
    public boolean validarIngreso(String nombre, String password) {
        Usuario usuario = consultarUsuario(nombre);
        if (usuario != null) {
            return usuario.validarPassword(password);
        } else {
            System.out.println("Usuario no encontrado.");
            return false;
        }
    }

    /**
     * Extrae el rol de un usuario basado en su nombre.
     * 
     * @param nombre el nombre del usuario.
     * @return el rol del usuario, o null si el usuario no se encuentra.
     */
    @Override
    public String extraerRol(String nombre) {
        Usuario usuario = consultarUsuario(nombre);
        if (usuario != null) {
            return usuario.getRol();
        } else {
            System.out.println("Usuario no encontrado.");
            return null;
        }
    }
}
