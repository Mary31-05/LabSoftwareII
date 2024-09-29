package co.edu.unicauca.mvc.modelos;

/**
 * Representa un artículo con un ID, título, autores y conferencia asociada.
 */
public class Articulo {
    
    private int idArticulo;
    private String titulo;
    private String autores;
    private Conferencia objConferencia;

    /**
     * Constructor por defecto.
     */
    public Articulo() {
    }

    /**
     * Constructor parametrizado para crear un artículo con todos los atributos.
     *
     * @param idArticulo el identificador único del artículo
     * @param titulo el título del artículo
     * @param autores los autores del artículo
     */
    public Articulo(int idArticulo, String titulo, String autores) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.autores = autores;
    }

    /**
     * Constructor para crear un artículo con un título.
     *
     * @param titulo el título del artículo
     */
    public Articulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el ID del artículo.
     *
     * @return el ID del artículo
     */
    public int getIdArticulo() {
        return idArticulo;
    }

    /**
     * Establece el ID del artículo.
     *
     * @param idArticulo el nuevo ID para el artículo
     */
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * Obtiene el título del artículo.
     *
     * @return el título del artículo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del artículo.
     *
     * @param titulo el nuevo título para el artículo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene los autores del artículo.
     *
     * @return los autores del artículo
     */
    public String getAutores() {
        return autores;
    }

    /**
     * Establece los autores del artículo.
     *
     * @param autores los nuevos autores para el artículo
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * Obtiene la conferencia asociada al artículo.
     *
     * @return la conferencia asociada
     */
    public Conferencia getObjConferencia() {
        return objConferencia;
    }

    /**
     * Establece la conferencia asociada al artículo.
     *
     * @param objConferencia la nueva conferencia asociada
     */
    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }
}
