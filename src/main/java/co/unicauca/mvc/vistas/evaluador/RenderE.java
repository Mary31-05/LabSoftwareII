package co.unicauca.mvc.vistas.evaluador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Clase RenderE que extiende DefaultTableCellRenderer para personalizar la
 * representación de las celdas en una tabla.
 * 
 * Esta clase se utiliza para renderizar componentes JButton dentro de una
 * JTable, ajustando su apariencia dependiendo del estado de selección.
 * 
 * @author Usuario
 */
public class RenderE extends DefaultTableCellRenderer {

    /**
     * Constructor de la clase RenderE.
     * 
     * Se invoca el constructor de la clase base DefaultTableCellRenderer.
     */
    public RenderE() {
    }

    /**
     * Devuelve el componente que se va a usar para renderizar la celda de la tabla.
     * 
     * @param table La JTable que contiene la celda.
     * @param value El valor de la celda, que puede ser un JButton.
     * @param isSelected Un booleano que indica si la celda está seleccionada.
     * @param hasFocus Un booleano que indica si la celda tiene el foco.
     * @param row El índice de la fila de la celda.
     * @param column El índice de la columna de la celda.
     * @return El componente a renderizar, que puede ser un JButton o un
     *         componente predeterminado.
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            if(isSelected){
                btn.setForeground(table.getSelectionForeground());
                btn.setBackground(table.getSelectionBackground());
            } else {
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.WHITE);
            }            
            return btn;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, 
                hasFocus, row, column); // Para cambiar el cuerpo de los métodos generados, elige Herramientas | Plantillas.
    }
}
