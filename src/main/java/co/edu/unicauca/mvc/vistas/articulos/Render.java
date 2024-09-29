package co.edu.unicauca.mvc.vistas.articulos;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Clase Render que extiende DefaultTableCellRenderer.
 * Se utiliza para renderizar las celdas de una tabla (JTable) que contienen botones (JButton).
 * Cambia los colores del botón dependiendo de si está seleccionado o no.
 */
public class Render extends DefaultTableCellRenderer {

    /**
     * Constructor de la clase Render.
     */
    public Render() {
    }

    /**
     * Sobreescribe el método getTableCellRendererComponent para personalizar la representación de las celdas.
     *
     * @param table La JTable que está siendo renderizada.
     * @param value El valor de la celda que se va a renderizar.
     * @param isSelected Booleano que indica si la celda está seleccionada.
     * @param hasFocus Booleano que indica si la celda tiene el foco.
     * @param row El número de fila de la celda.
     * @param column El número de columna de la celda.
     * @return Un componente que representa la celda renderizada, que puede ser un JButton si el valor de la celda lo es.
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Si el valor de la celda es un JButton, personaliza su representación.
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            if(isSelected){
                // Si la celda está seleccionada, cambia los colores del botón para que coincidan con la selección de la tabla.
                btn.setForeground(table.getSelectionForeground());
                btn.setBackground(table.getSelectionBackground());
            }else{
                // Si la celda no está seleccionada, pone los colores del botón en blanco.
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.WHITE);
            }            
            return btn;
        }
        
        // Si no es un botón, llama al método de la superclase para la representación por defecto.
        return super.getTableCellRendererComponent(table, value, isSelected, 
                hasFocus, row, column);
    }
}
