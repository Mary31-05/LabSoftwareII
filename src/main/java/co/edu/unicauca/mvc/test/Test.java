package co.edu.unicauca.mvc.test;

import co.edu.unicauca.mvc.accesoADatos.RepositorioArticuloMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioConferenciaMemoriaLinkedist;
import co.edu.unicauca.mvc.accesoADatos.RepositorioEvaluadorMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioOrganizadorMemoriaLinkedist;
import co.edu.unicauca.mvc.accesoADatos.RepositorioUsuarioMemoriaArrayList;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoEvaluadores;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoOrganizadores;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoUsuarios;
import co.edu.unicauca.mvc.vistas.adminConferencia.VtnPrincipalAdmin;
import co.edu.unicauca.mvc.vistas.asistente.VtnPrincipalAsistente;
import co.edu.unicauca.mvc.vistas.autorPublicacion.VtnPrincipalAutor;
import javax.swing.UIManager;

public class Test {

    public static void main(String[] args) {
        /*// Crear un nuevo usuario con una contraseña
        Usuario usuario = new Usuario(1,"John", "1234", "Admin");
        
        // Validar la contraseña ingresada
        boolean esValida = usuario.validarPassword("12345");
        System.out.println("Contraseña válida: " + esValida);  // Esto debería imprimir true

        boolean esValidaIncorrecta = usuario.validarPassword("contraseña_incorrecta");
        System.out.println("Contraseña válida: " + esValidaIncorrecta);  // Esto debería imprimir false*/
        // Usuarios quemados,con contrasenia
        /*Usuario user1 = new Usuario(1,"User1", "1234", "Rol1");
        //Usuario user1 = new Usuario(1,"User1", "1234", "Rol1");
        Usuario user2 = new Usuario(1,"User2", "1234", "Rol2");
        Usuario user3 = new Usuario(1,"User3", "1234", "Rol3");*/

        //objRepoUser.registrarUsuario(user1);
        //objRepoUser.registrarUsuario(user2);
        //objRepoUser.registrarUsuario(user3);

        
        seleccionarLookAndField();
                
        RepositorioConferenciaMemoriaLinkedist objRepositorio1=
                new RepositorioConferenciaMemoriaLinkedist();
        
        ServicioAlmacenamientoConferencias objServicio1
                = new   ServicioAlmacenamientoConferencias(objRepositorio1);  
        
        
        RepositorioArticuloMemoriaArrayList objRepositorio2=
                new RepositorioArticuloMemoriaArrayList();
        
        ServicioAlmacenamientoArticulos objServicio2
                = new ServicioAlmacenamientoArticulos(objRepositorio2);
        
        RepositorioOrganizadorMemoriaLinkedist objRepositorio3=
                new RepositorioOrganizadorMemoriaLinkedist();
        
        ServicioAlmacenamientoOrganizadores objServicio3
                = new ServicioAlmacenamientoOrganizadores(objRepositorio3);
        
        RepositorioUsuarioMemoriaArrayList objRepositorio5= 
                new RepositorioUsuarioMemoriaArrayList();
        
        ServicioAlmacenamientoUsuarios objServicio5 = 
                new ServicioAlmacenamientoUsuarios(objRepositorio5);
        
        RepositorioEvaluadorMemoriaArrayList objRepositorio4=
                new RepositorioEvaluadorMemoriaArrayList();
        
        ServicioAlmacenamientoEvaluadores objServicio4
                = new   ServicioAlmacenamientoEvaluadores(objRepositorio4); 
        
        
        VtnPrincipalAsistente objVtnAsistente=new VtnPrincipalAsistente();
        VtnPrincipalAutor objVtnAutor= new VtnPrincipalAutor();
        
        objServicio1.addObserver(objVtnAsistente);
        objServicio1.addObserver(objVtnAutor);
        
        
        VtnPrincipalAdmin objVtnPrincipal= new VtnPrincipalAdmin();    
        objVtnPrincipal.asociarServios(objServicio1, objServicio2, objServicio3, objServicio4, objServicio5);
             
        
        objVtnPrincipal.setVisible(true);
        objVtnAsistente.setVisible(true);
        objVtnAutor.setVisible(true);
    }
    
    private static void seleccionarLookAndField() {
        for(UIManager.LookAndFeelInfo laf: UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                    UIManager.setLookAndFeel(laf.getClassName());
                } catch (Exception ex) {
                    // Manejo de excepción
                }
        }
    }
}


