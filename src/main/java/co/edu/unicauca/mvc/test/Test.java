/**
 * Clase Test
 * 
 * Esta clase es utilizada para realizar pruebas de los servicios de almacenamiento
 * de diferentes entidades (artículos, conferencias, organizadores, evaluadores y usuarios),
 * además de interactuar con las interfaces gráficas del sistema.
 *
 * @package co.edu.unicauca.mvc.test
 */
package co.edu.unicauca.mvc.test;

import co.edu.unicauca.mvc.accesoADatos.RepositorioArticuloMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioConferenciaMemoriaLinkedist;
import co.edu.unicauca.mvc.accesoADatos.RepositorioEvaluadorMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioOrganizadorMemoriaLinkedList;
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

/**
 * Clase principal para ejecutar la aplicación de pruebas.
 * Inicializa los diferentes repositorios y servicios, asocia las vistas 
 * con los observadores y muestra las interfaces gráficas.
 * 
 * @author Desarrollador
 * @version 1.0
 */
public class Test {

    /**
     * Método principal que inicializa los servicios, repositorios y vistas,
     * y ejecuta la aplicación.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        
        seleccionarLookAndField();
        
        // Inicialización de repositorios y servicios.
        RepositorioConferenciaMemoriaLinkedist objRepositorio1 = new RepositorioConferenciaMemoriaLinkedist();
        ServicioAlmacenamientoConferencias objServicio1 = new ServicioAlmacenamientoConferencias(objRepositorio1);  
        
        RepositorioArticuloMemoriaArrayList objRepositorio2 = new RepositorioArticuloMemoriaArrayList();
        ServicioAlmacenamientoArticulos objServicio2 = new ServicioAlmacenamientoArticulos(objRepositorio2);
        
        RepositorioOrganizadorMemoriaLinkedList objRepositorio3 = new RepositorioOrganizadorMemoriaLinkedList();
        ServicioAlmacenamientoOrganizadores objServicio3 = new ServicioAlmacenamientoOrganizadores(objRepositorio3);
        
        RepositorioUsuarioMemoriaArrayList objRepositorio5 = new RepositorioUsuarioMemoriaArrayList();
        ServicioAlmacenamientoUsuarios objServicio5 = new ServicioAlmacenamientoUsuarios(objRepositorio5);
        
        RepositorioEvaluadorMemoriaArrayList objRepositorio4 = new RepositorioEvaluadorMemoriaArrayList();
        ServicioAlmacenamientoEvaluadores objServicio4 = new ServicioAlmacenamientoEvaluadores(objRepositorio4); 
        
        // Inicialización de vistas.
        VtnPrincipalAsistente objVtnAsistente = new VtnPrincipalAsistente();
        VtnPrincipalAutor objVtnAutor = new VtnPrincipalAutor();
        
        // Asignación de observadores a los servicios.
        objServicio1.addObserver(objVtnAsistente);
        objServicio1.addObserver(objVtnAutor);
        
        // Inicialización de la ventana principal del administrador.
        VtnPrincipalAdmin objVtnPrincipal = new VtnPrincipalAdmin();    
        objVtnPrincipal.asociarServios(objServicio1, objServicio2, objServicio3, objServicio4, objServicio5);
        
        // Hacer visibles las ventanas.
        objVtnPrincipal.setVisible(true);
        objVtnAsistente.setVisible(true);
        objVtnAutor.setVisible(true);
    }
    
    /**
     * Método para seleccionar el estilo visual (Look and Feel) de la aplicación.
     * Se selecciona el estilo "Nimbus" si está disponible.
     */
    private static void seleccionarLookAndField() {
        for(UIManager.LookAndFeelInfo laf: UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                    UIManager.setLookAndFeel(laf.getClassName());
                } catch (Exception ex) {
                    // Manejo de excepción en caso de error al cambiar el estilo.
                }
        }
    }
}


