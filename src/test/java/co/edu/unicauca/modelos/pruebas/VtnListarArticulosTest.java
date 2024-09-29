package co.edu.unicauca.modelos.pruebas;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.vistas.articulos.VtnListarArticulos;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Clase de prueba para la vista VtnListarArticulos.
 * Esta clase se encarga de verificar el correcto funcionamiento
 * del método llenarTabla() que se utiliza para poblar la tabla
 * de artículos en la interfaz gráfica.
 */
public class VtnListarArticulosTest {

    private ServicioAlmacenamientoArticulos servicioArticulosMock;
    private VtnListarArticulos ventanaListarArticulos;

    /**
     * Configuración inicial antes de cada prueba.
     * Se crea un mock del servicio de almacenamiento de artículos
     * y se instancia la ventana de listar artículos.
     */
    @Before
    public void setUp() {
        servicioArticulosMock = Mockito.mock(ServicioAlmacenamientoArticulos.class);
        ventanaListarArticulos = new VtnListarArticulos(servicioArticulosMock, null);
    }

    /**
     * Prueba para verificar que la tabla se llene correctamente
     * con los artículos proporcionados por el servicio.
     * Se simula la respuesta del servicio y se valida que
     * la tabla tenga el número correcto de filas y que los
     * títulos de los artículos sean los esperados.
     */
    @Test
    public void testLlenarTabla() {
        List<Articulo> articulos = new ArrayList<>();
        articulos.add(new Articulo(1, "Título 1", "Autor 1"));
        articulos.add(new Articulo(2, "Título 2", "Autor 2"));

        when(servicioArticulosMock.listarArticulos()).thenReturn(articulos);

        ventanaListarArticulos.llenarTabla();

        // Verifica que la tabla se haya llenado correctamente con dos artículos
        assertEquals(2, ventanaListarArticulos.getJTableListarArticulos().getRowCount());
        assertEquals("Título 1", ventanaListarArticulos.getJTableListarArticulos().getValueAt(0, 1));
        assertEquals("Título 2", ventanaListarArticulos.getJTableListarArticulos().getValueAt(1, 1));
    }
}
