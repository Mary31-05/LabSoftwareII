package co.edu.unicauca.modelos.pruebas;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Evaluador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la funcionalidad de listar evaluadores.
 * Esta clase contiene pruebas unitarias para la clase Evaluador,
 * asegurando que sus constructores y métodos funcionen correctamente.
 */
class VtnListarEvaluadoresTest {

    /**
     * Prueba del constructor de Evaluador con parámetros.
     * Se verifica que el objeto Evaluador se inicializa correctamente
     * con los parámetros proporcionados y que el objeto Articulo
     * asociado también es correcto.
     */
    @Test
    void testConstructorConParametros() {
        Articulo articulo = new Articulo(1, "Título del Artículo", "Autor1");
        Evaluador evaluador = new Evaluador(1, "Juan", "Pérez", "Matemáticas");
        evaluador.setObjArticulo(articulo);

        assertEquals(1, evaluador.getId());
        assertEquals("Juan", evaluador.getNombre());
        assertEquals("Pérez", evaluador.getApellido());
        assertEquals("Matemáticas", evaluador.getTemas());
        assertNotNull(evaluador.getObjArticulo());
        assertEquals("Título del Artículo", evaluador.getObjArticulo().getTitulo());
    }

    /**
     * Prueba del constructor predeterminado de Evaluador.
     * Se crea un evaluador utilizando el constructor sin parámetros
     * y se establecen sus atributos mediante los métodos setters.
     * Se verifica que los valores se hayan establecido correctamente.
     */
    @Test
    void testConstructorPredeterminado() {
        Evaluador evaluador = new Evaluador();
        evaluador.setId(2);
        evaluador.setNombre("Ana");
        evaluador.setApellido("García");
        evaluador.setTemasExperto("Ciencias");
        Articulo articulo = new Articulo(2, "Otro Título", "Autor2");
        evaluador.setObjArticulo(articulo);

        assertEquals(2, evaluador.getId());
        assertEquals("Ana", evaluador.getNombre());
        assertEquals("García", evaluador.getApellido());
        assertEquals("Ciencias", evaluador.getTemas());
        assertNotNull(evaluador.getObjArticulo());
        assertEquals("Otro Título", evaluador.getObjArticulo().getTitulo());
    }

    /**
     * Prueba de los métodos setters y getters de Evaluador.
     * Se verifica que los métodos de acceso funcionen correctamente
     * y que los valores establecidos se recuperen como se espera.
     */
    @Test
    void testSettersAndGetters() {
        Evaluador evaluador = new Evaluador();
        evaluador.setId(3);
        evaluador.setNombre("Luis");
        evaluador.setApellido("Martínez");
        evaluador.setTemasExperto("Historia");
        Articulo articulo = new Articulo(3, "Título de Prueba", "Autor3");
        evaluador.setObjArticulo(articulo);

        assertEquals(3, evaluador.getId());
        assertEquals("Luis", evaluador.getNombre());
        assertEquals("Martínez", evaluador.getApellido());
        assertEquals("Historia", evaluador.getTemas());
        assertNotNull(evaluador.getObjArticulo());
        assertEquals("Título de Prueba", evaluador.getObjArticulo().getTitulo());
    }
}
