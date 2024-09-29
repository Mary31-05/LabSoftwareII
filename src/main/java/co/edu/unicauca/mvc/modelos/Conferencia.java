package co.edu.unicauca.mvc.modelos;

import java.util.Date;

/**
 * Clase que representa una conferencia.
 */
public class Conferencia {
    private int idConferencia;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;   
    private float costoInscripcion;

    /**
     * Constructor para la clase Conferencia.
     *
     * @param nombre El nombre de la conferencia.
     * @param fechaInicio La fecha de inicio de la conferencia.
     * @param fechaFin La fecha de finalización de la conferencia.
     * @param costoInscripcion El costo de inscripción para la conferencia.
     */
    public Conferencia(String nombre, Date fechaInicio, Date fechaFin, float costoInscripcion) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;        
        this.costoInscripcion = costoInscripcion;
    }

    /**
     * Obtiene el ID de la conferencia.
     *
     * @return El ID de la conferencia.
     */
    public int getIdConferencia() {
        return idConferencia;
    }

    /**
     * Establece el ID de la conferencia.
     *
     * @param idConferencia El nuevo ID de la conferencia.
     */
    public void setIdConferencia(int idConferencia) {
        this.idConferencia = idConferencia;
    }

    /**
     * Obtiene el nombre de la conferencia.
     *
     * @return El nombre de la conferencia.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la conferencia.
     *
     * @param nombre El nuevo nombre de la conferencia.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de inicio de la conferencia.
     *
     * @return La fecha de inicio de la conferencia.
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio de la conferencia.
     *
     * @param fechaInicio La nueva fecha de inicio de la conferencia.
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la fecha de finalización de la conferencia.
     *
     * @return La fecha de finalización de la conferencia.
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * Establece la fecha de finalización de la conferencia.
     *
     * @param fechaFin La nueva fecha de finalización de la conferencia.
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Obtiene el costo de inscripción de la conferencia.
     *
     * @return El costo de inscripción.
     */
    public float getCostoInscripcion() {
        return costoInscripcion;
    }

    /**
     * Establece el costo de inscripción de la conferencia.
     *
     * @param costoInscripcion El nuevo costo de inscripción.
     */
    public void setCostoInscripcion(float costoInscripcion) {
        this.costoInscripcion = costoInscripcion;
    }
    
    /**
     * Devuelve una representación en forma de cadena del objeto Conferencia.
     *
     * @return El nombre de la conferencia.
     */
    @Override
    public String toString() {
        return this.nombre;
    }
}
