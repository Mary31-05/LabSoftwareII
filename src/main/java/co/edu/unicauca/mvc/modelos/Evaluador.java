package co.edu.unicauca.mvc.modelos;

/**
 * La clase {@code Evaluador} representa a un evaluador con su información personal 
 * y su tema de experticia. Incluye métodos para acceder y modificar los atributos 
 * del evaluador.
 * 
 * @author Usuario
 */
public class Evaluador {
    
    private int idEvaluador;
    private String nombreEvaluador;
    private String apellidoEvaluador;
    private String temasExperto;
    private Articulo objArticulo;

    /**
     * Constructor por defecto de la clase {@code Evaluador}.
     */
    public Evaluador() {
    }
    
    /**
     * Constructor de la clase {@code Evaluador} con parámetros.
     * 
     * @param idEvaluador El ID del evaluador.
     * @param nombreEvaluador El nombre del evaluador.
     * @param apellidoEvaluador El apellido del evaluador.
     * @param temasExperto Los temas en los que el evaluador es experto.
     */
    public Evaluador(int idEvaluador, String nombreEvaluador, String apellidoEvaluador, String temasExperto) {
        this.idEvaluador = idEvaluador;
        this.nombreEvaluador = nombreEvaluador;
        this.apellidoEvaluador = apellidoEvaluador;
        this.temasExperto = temasExperto;
    }

    /**
     * Obtiene el ID del evaluador.
     * 
     * @return El ID del evaluador.
     */
    public int getId() {
        return idEvaluador;
    }
    
    /**
     * Establece el ID del evaluador.
     * 
     * @param idEvaluador El nuevo ID del evaluador.
     */
    public void setId(int idEvaluador) {
        this.idEvaluador = idEvaluador;
    }
    
    /**
     * Obtiene el nombre del evaluador.
     * 
     * @return El nombre del evaluador.
     */
    public String getNombre() {
        return nombreEvaluador;
    }

    /**
     * Establece el nombre del evaluador.
     * 
     * @param nombreEvaluador El nuevo nombre del evaluador.
     */
    public void setNombre(String nombreEvaluador) {
        this.nombreEvaluador = nombreEvaluador;
    }

    /**
     * Obtiene el apellido del evaluador.
     * 
     * @return El apellido del evaluador.
     */
    public String getApellido() {
        return apellidoEvaluador;
    }
    
    /**
     * Establece el apellido del evaluador.
     * 
     * @param apellidoEvaluador El nuevo apellido del evaluador.
     */
    public void setApellido(String apellidoEvaluador) {
        this.apellidoEvaluador = apellidoEvaluador;
    }
    
    /**
     * Obtiene los temas de experticia del evaluador.
     * 
     * @return Los temas de experticia del evaluador.
     */
    public String getTemas() {
        return temasExperto;
    }
    
    /**
     * Establece los temas de experticia del evaluador.
     * 
     * @param temasExperto Los nuevos temas de experticia del evaluador.
     */
    public void setTemasExperto(String temasExperto) {
        this.temasExperto = temasExperto;
    }

    /**
     * Obtiene el objeto Artículo asociado al evaluador.
     * 
     * @return El objeto Artículo asociado.
     */
    public Articulo getObjArticulo() {
        return objArticulo;
    }

    /**
     * Establece el objeto Artículo asociado al evaluador.
     * 
     * @param objArticulo El nuevo objeto Artículo a asociar.
     */
    public void setObjArticulo(Articulo objArticulo) {
        this.objArticulo = objArticulo;
    }
}
