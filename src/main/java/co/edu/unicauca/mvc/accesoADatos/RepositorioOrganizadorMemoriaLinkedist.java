package co.edu.unicauca.mvc.accesoADatos;

import java.util.LinkedList;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Organizador;
/**
 *
 * @author Usuario
 */

//prueba
public class RepositorioOrganizadorMemoriaLinkedist implements InterfaceRepositorioOrganizador
{
    private LinkedList<Organizador> listaOrganizadores;
    
    public RepositorioOrganizadorMemoriaLinkedist()
    {
        this.listaOrganizadores= new LinkedList();
    }
@Override
    public boolean almacenarOrganizador(Organizador objOrganizador) {
        boolean bandera=this.listaOrganizadores.add(objOrganizador);
        return bandera;
    }

    public List<Organizador> listarOrganizadores() {
        return this.listaOrganizadores;
    }
}