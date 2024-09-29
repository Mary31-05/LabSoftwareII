/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import javax.swing.ImageIcon;

/**
 * Clase para cargar imágenes desde una ruta especificada.
 * Esta clase contiene un método que permite cargar una imagen
 * en formato {@link ImageIcon} utilizando la ruta proporcionada.
 *
 * @author LENOVO
 */
public class CargarImagenes {
    /**
     * Carga una imagen desde la ruta especificada.
     *
     * @param ruta La ruta de la imagen que se desea cargar.
     *             Debe ser una ruta relativa dentro del classpath.
     * @return Un objeto {@link ImageIcon} que representa la imagen cargada.
     *         Si la imagen no se encuentra, puede devolver un {@link ImageIcon} vacío.
     */
    public ImageIcon CargarImagen(String ruta)
    {
        ImageIcon imagen= new javax.swing.ImageIcon(getClass().getResource(ruta));  
        return imagen;
    }
}
