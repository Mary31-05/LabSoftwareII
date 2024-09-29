package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.List;

/**
 * Interface para definir el repositorio de organizadores.
 * Provee los métodos para almacenar y listar organizadores en el sistema.
 * <p>
 * Implementa métodos para realizar operaciones básicas como:
 * <ul>
 *   <li>Almacenamiento de un organizador en la base de datos.</li>
 *   <li>Listado de todos los organizadores almacenados.</li>
 * </ul>
 * </p>
 * @version 1.0
 * @since 2024
 */
public interface InterfaceRepositorioOrganizador {

    /**
     * Almacena un organizador en el sistema.
     * 
     * @param objOrganizador El objeto Organizador que será almacenado.
     * @return true si el organizador fue almacenado exitosamente, false en caso contrario.
     */
    public boolean almacenarOrganizador(Organizador objOrganizador);

    /**
     * Lista todos los organizadores almacenados en el sistema.
     * 
     * @return Una lista de objetos Organizador.
     */
    public List<Organizador> listarOrganizadores();
}

