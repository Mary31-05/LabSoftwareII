package co.unicauca.modelos.pruebas;

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

public class VtnListarOrganizadoresTest {

    private ServicioAlmacenamientoOrganizadores servicioMock;
    private VtnListarOrganizadores ventana;

    @Before
    public void setUp() {
        // Mock the service
        servicioMock = mock(ServicioAlmacenamientoOrganizadores.class);
        
        // Mock data
        Organizador organizador1 = new Organizador("Juan", "Pérez", "Universidad A");
        Organizador organizador2 = new Organizador("Ana", "Gómez", "Universidad B");
        LinkedList<Organizador> organizadores = new LinkedList<>(Arrays.asList(organizador1, organizador2));
        
        // Mock the behavior of listarOrganizador method
        when(servicioMock.listarOrganizador()).thenReturn(organizadores);

        // Initialize the window
        ventana = new VtnListarOrganizadores(servicioMock);
        ventana.llenarTabla(); // Populate the table with mock data
    }

    @Test
    public void testLlenarTabla() {
        DefaultTableModel model = (DefaultTableModel) ventana.getListadoOrganizadoresTable().getModel();

        // Verify the table has been populated with the mock data
        assertThat(model.getRowCount()).isEqualTo(2);
        assertThat(model.getValueAt(0, 0)).isEqualTo("Juan");
        assertThat(model.getValueAt(0, 1)).isEqualTo("Pérez");
        assertThat(model.getValueAt(0, 2)).isEqualTo("Universidad A");
        assertThat(model.getValueAt(1, 0)).isEqualTo("Ana");
        assertThat(model.getValueAt(1, 1)).isEqualTo("Gómez");
        assertThat(model.getValueAt(1, 2)).isEqualTo("Universidad B");
    }
}

