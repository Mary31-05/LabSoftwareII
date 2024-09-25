package co.edu.unicauca.mvc.accesoADatos;

/**
 *
 * @author Usuario
 */
import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.List;

public interface InterfaceRepositorioOrganizador {
    public boolean almacenarOrganizador(Organizador objOrganizador);
    public List<Organizador> listarOrganizadores();
}

