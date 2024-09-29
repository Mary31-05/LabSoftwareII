package co.edu.unicauca.modelos.pruebas;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.vistas.adminConferencia.VtnListarConferencias;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Clase de prueba para la vista de listar conferencias.
 * Utiliza Mockito para simular el servicio de almacenamiento de conferencias.
 */
public class VtnListarConferenciasTest {

    private ServicioAlmacenamientoConferencias mockServicio;
    private VtnListarConferencias vtnListarConferencias;

    /**
     * Configuración inicial de la prueba.
     * Se crea un mock del servicio de almacenamiento de conferencias
     * y se inicializa la vista de listar conferencias.
     */
    @Before
    public void setUp() {
        mockServicio = Mockito.mock(ServicioAlmacenamientoConferencias.class);
        vtnListarConferencias = new VtnListarConferencias(mockServicio);
    }

    /**
     * Prueba para verificar que la tabla se llena correctamente
     * con la lista de conferencias.
     */
    @Test
    public void testLlenarTabla() {
        // Arrange
        ArrayList<Conferencia> listaConferencias = new ArrayList<>();
        listaConferencias.add(new Conferencia("Conferencia 1", new Date(), new Date(), 100));
        listaConferencias.add(new Conferencia("Conferencia 2", new Date(), new Date(), 150));

        Mockito.when(mockServicio.listarConferencias()).thenReturn(listaConferencias);

        // Act
        vtnListarConferencias.llenarTabla();

        // Assert
        JTable jTable = vtnListarConferencias.getListadoConferenciasTable();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        assertEquals(2, model.getRowCount());
        assertEquals("Conferencia 1", model.getValueAt(0, 0));
        assertEquals("Conferencia 2", model.getValueAt(1, 0));
    }

    /**
     * Prueba para verificar que la tabla se limpia correctamente.
     */
    @Test
    public void testLimpiarTabla() {
        // Arrange
        vtnListarConferencias.llenarTabla(); // Llenamos la tabla primero

        // Act
        vtnListarConferencias.limpiarTabla();

        // Assert
        JTable jTable = vtnListarConferencias.getListadoConferenciasTable();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        assertEquals(0, model.getRowCount());
    }
}
