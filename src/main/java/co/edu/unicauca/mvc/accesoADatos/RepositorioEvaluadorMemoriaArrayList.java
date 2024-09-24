package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Evaluador;
import java.util.ArrayList;
import java.util.List;

public class RepositorioEvaluadorMemoriaArrayList implements InterfaceRepositorioEvaluador{

    private ArrayList<Evaluador> listaDeEvaluadores;
    
    public RepositorioEvaluadorMemoriaArrayList()
    {
        this.listaDeEvaluadores= new ArrayList();
    }
    @Override
    public boolean almacenarEvaluador(Evaluador objEvaluador) {
        objEvaluador.setId(getCantidadEvaluadores());
       return this.listaDeEvaluadores.add(objEvaluador);
    }

    @Override
    public List<Evaluador> listarEvaluadores() {
        return this.listaDeEvaluadores;
    }
    
    private int getCantidadEvaluadores()
    {
        return this.listaDeEvaluadores.size()+1;
    }

    public boolean eliminarEvaluador(int idEvaluador) {
        boolean bandera=false;
        for (int i = 0; i < this.listaDeEvaluadores.size(); i++) {
            if(this.listaDeEvaluadores.get(i).getId()==idEvaluador)
            {
                this.listaDeEvaluadores.remove(i);
                bandera=true;
                break;
            }
        }
        return bandera;
    }

    public Evaluador consultarEvaluador(int idEvaluador) {
        Evaluador objEvaluador=null;
        for (int i = 0; i < this.listaDeEvaluadores.size(); i++) {
            if(this.listaDeEvaluadores.get(i).getId()==idEvaluador)
            {
                objEvaluador=this.listaDeEvaluadores.get(i);
                break;
            }
        }
        
        return objEvaluador;
    }

    public boolean actualizarEvaluador(Evaluador objEvaluador) {
        boolean bandera=false;
        for (int i = 0; i < this.listaDeEvaluadores.size(); i++) {
            if(this.listaDeEvaluadores.get(i).getId()==objEvaluador.getId())
            {
                this.listaDeEvaluadores.set(i, objEvaluador);
                bandera=true;
                break;
            }
        }
        
        return bandera;
    }

}


