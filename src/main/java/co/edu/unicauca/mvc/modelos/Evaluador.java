package co.edu.unicauca.mvc.modelos;

/**
 *
 * @author Usuario
 */
public class Evaluador {
    private int idEvaluador;
    private String nombreEvaluador;
    private String apellidoEvaluador;
    private String temasExperto;
    
   private Articulo objArticulo;

   public Evaluador()
   {
       
   }
    
    public Evaluador(int idEvaluador,String nombreEvaluador,String apellidoEvaluador, String temasExperto) {
        this.idEvaluador = idEvaluador;
        this.nombreEvaluador = nombreEvaluador;
        this.apellidoEvaluador = apellidoEvaluador;      
        this.temasExperto = temasExperto;
    }

    public int getId(){
    return idEvaluador;
    }
    
    public void setId(int idEvaluador) {
    this.idEvaluador = idEvaluador;
    }
    
    public String getNombre() {
        return nombreEvaluador;
    }

    public void setNombre(String nombreEvaluador) {
        this.nombreEvaluador = nombreEvaluador;
    }

    public String getApellido() {
        return apellidoEvaluador;
    }
    
    public void setApellido(String apellidoEvaluador) {
    this.apellidoEvaluador=apellidoEvaluador;
    }
    
    public String getTemas()
    {
        return temasExperto;
    }
    
    public void setTemasExperto(String temasExperto) {
        this.temasExperto=temasExperto;
    }
    public Articulo getObjArticulo() {
        return objArticulo;
    }

    public void setObjArticulo(Articulo objArticulo) {
        this.objArticulo = objArticulo;
    }
}
    

