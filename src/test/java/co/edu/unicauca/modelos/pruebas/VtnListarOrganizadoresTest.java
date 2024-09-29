package co.edu.unicauca.modelos.pruebas;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoOrganizadores;
import co.edu.unicauca.mvc.modelos.Organizador;
import co.edu.unicauca.mvc.vistas.adminConferencia.VtnListarOrganizadores;
import org.junit.Before;
import org.junit.Test;

import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * Clase de prueba para la ventana de listar organizadores.
 * 
 * Esta clase utiliza JUnit y Mockito para verificar que la funcionalidad
 * de llenar la tabla con organizadores se comporte correctamente.
 */
public class VtnListarOrganizadoresTest {

    private ServicioAlmacenamientoOrganizadores servicioMock;
    private VtnListarOrganizadores ventana;

    /**
     * Método que se ejecuta antes de cada prueba.
     * Se utiliza para inicializar los objetos necesarios y configurar los mocks.
     */
    @Before
    public void setUp() {
        // Mock del servicio
        servicioMock = mock(ServicioAlmacenamientoOrganizadores.class);
        
        // Datos simulados
        Organizador organizador1 = new Organizador("Juan", "Pérez", "Universidad A");
        Organizador organizador2 = new Organizador("Ana", "Gómez", "Universidad B");
        LinkedList<Organizador> organizadores = new LinkedList<>(Arrays.asList(organizador1, organizador2));
        
        // Comportamiento simulado del método listarOrganizador
        when(servicioMock.listarOrganizador()).thenReturn(organizadores);

        // Inicializar la ventana
        ventana = new VtnListarOrganizadores(servicioMock);
        ventana.llenarTabla(); // Llenar la tabla con datos simulados
    }

    /**
     * Prueba para verificar que la tabla se llena correctamente
     * con los datos de organizadores simulados.
     */
    @Test
    public void testLlenarTabla() {
        DefaultTableModel model = (DefaultTableModel) ventana.getListadoOrganizadoresTable().getModel();

        // Verificar que la tabla se haya llenado con los datos simulados
        assertThat(model.getRowCount()).isEqualTo(2);
        assertThat(model.getValueAt(0, 0)).isEqualTo("Juan");
        assertThat(model.getValueAt(0, 1)).isEqualTo("Pérez");
        assertThat(model.getValueAt(0, 2)).isEqualTo("Universidad A");
        assertThat(model.getValueAt(1, 0)).isEqualTo("Ana");
        assertThat(model.getValueAt(1, 1)).isEqualTo("Gómez");
        assertThat(model.getValueAt(1, 2)).isEqualTo("Universidad B");
    }
}
