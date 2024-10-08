package co.unicauca.mvc.vistas.evaluador;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoEvaluadores;
import javax.swing.table.DefaultTableModel;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Evaluador;
import co.edu.unicauca.mvc.utilidades.Utilidades;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 * Ventana interna para listar los evaluadores y gestionar sus datos.
 * Permite eliminar y actualizar la información de los evaluadores.
 * 
 * @author Usuario
 */
public class VtnListarEvaluador extends javax.swing.JInternalFrame {
    
    /** Servicio para el almacenamiento de artículos. */
    public ServicioAlmacenamientoArticulos objServicio;
    
    /** Servicio para el almacenamiento de evaluadores. */
    public ServicioAlmacenamientoEvaluadores objServicio4;

    /**
     * Constructor de la clase VtnListarEvaluador.
     * 
     * @param objServicio El servicio de almacenamiento de artículos.
     * @param objServicio4 El servicio de almacenamiento de evaluadores.
     */
    public VtnListarEvaluador(
            ServicioAlmacenamientoArticulos objServicio,
            ServicioAlmacenamientoEvaluadores objServicio4) {
        initComponents();
        this.objServicio = objServicio;
        this.objServicio4 = objServicio4;
        this.jTableListarEvaluadores.setDefaultRenderer(Object.class, new RenderE());
        inicializarTabla();
    }
    
    /**
     * Inicializa la tabla para listar evaluadores con las columnas correspondientes.
     */
    public void inicializarTabla() {
        DefaultTableModel model = new DefaultTableModel();       
        model.addColumn("Id");       
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Articulo");
        model.addColumn("Eliminar");
        model.addColumn("Actualizar");       
        this.jTableListarEvaluadores.setModel(model);
    }
     
    /**
     * Limpia las filas de la tabla de evaluadores.
     */
    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableListarEvaluadores.getModel();
        int filas = this.jTableListarEvaluadores.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }        
    }
     
    /**
     * Llena la tabla con los datos de los evaluadores.
     */
    public void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) this.jTableListarEvaluadores.getModel();
        limpiarTabla();
        LinkedList<Evaluador> listarEvaluadores = (LinkedList<Evaluador>) this.objServicio4.listarEvaluadores();
        
        JButton JButtonEliminarEvaluador = new JButton();
        JButtonEliminarEvaluador.setName("Eliminar");
        JButtonEliminarEvaluador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/remove.png")));

        JButton JButtonActualizarEvaluador = new JButton();
        JButtonActualizarEvaluador.setName("Actualizar");
        JButtonActualizarEvaluador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/aplicar.png")));

        for (int i = 0; i < listarEvaluadores.size(); i++) {
            Object[] fila = { 
                listarEvaluadores.get(i).getId(),
                listarEvaluadores.get(i).getNombre(),
                listarEvaluadores.get(i).getApellido(),
                listarEvaluadores.get(i).getTemas(),
                listarEvaluadores.get(i).getObjArticulo().getTitulo(),
                JButtonEliminarEvaluador,
                JButtonActualizarEvaluador
            };
            model.addRow(fila);
        }
    }

    /**
     * Obtiene la tabla de listados de evaluadores.
     * 
     * @return La tabla que lista los evaluadores.
     */
    public JTable getListadoEvaluadoresTable() {
        return jTableListarEvaluadores;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelGestionarE = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonActualizar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarEvaluadores = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelGestionarE.setText("Gestionar Evaluadores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(jLabelGestionarE)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelGestionarE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jTableListarEvaluadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableListarEvaluadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarEvaluadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarEvaluadores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonActualizar)
                        .addGap(286, 286, 286)
                        .addComponent(jButtonRegistrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        llenarTabla();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        VtnRegistrarEvaluador objVtnRegistrarEvaluador=new VtnRegistrarEvaluador(objServicio, objServicio4);
        objVtnRegistrarEvaluador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objVtnRegistrarEvaluador.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTableListarEvaluadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarEvaluadoresMouseClicked
        int column = this.jTableListarEvaluadores.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTableListarEvaluadores.getRowHeight();
        
        if(row < jTableListarEvaluadores.getRowCount() && row >= 0 && column < jTableListarEvaluadores.getColumnCount() && column >= 0){
            Object value = jTableListarEvaluadores.getValueAt(row, column);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                String idEvaluador = jTableListarEvaluadores.getValueAt(row, 0).toString();
                int idEvaluadorConvertido=Integer.parseInt(idEvaluador);
                if(boton.getName().equals("Eliminar")){
                    try{  
                        if(Utilidades.mensajeConfirmacion("¿ Estás seguro de que quieres eliminar el evaluador con identificador " + idEvaluador + " " 
                            +" ?", "Confirmación") == 0){
                           boolean bandera=this.objServicio4.eliminarEvaluador(idEvaluadorConvertido);
                           if(bandera==true)
                           {
                               Utilidades.mensajeExito("El evaluador con identificador " + idEvaluadorConvertido + " fue eliminado exitosamente", "Evaluador eliminado");
                               llenarTabla();
                           }
                           else
                           {
                               Utilidades.mensajeAdvertencia("El evaluador con identificador " + idEvaluadorConvertido + " no fue eliminado", "Error al eliminar");
                        
                           }
                        }
                    }catch(Exception ex){
                        Utilidades.mensajeError("Error al eliminar usuario. Intentelo de nuevo más tarde", "Error");
                    }  
                }
                else if(boton.getName().equals("Actualizar")){
                    VtnActualizarEvaluador objVtnActualizarEvaluador= 
                            new VtnActualizarEvaluador(objServicio, objServicio4);
                    objVtnActualizarEvaluador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    objVtnActualizarEvaluador.cargarDatos(idEvaluadorConvertido);
                    objVtnActualizarEvaluador.setVisible(true);
                            
                }
            }
        }
    }//GEN-LAST:event_jTableListarEvaluadoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelGestionarE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarEvaluadores;
    // End of variables declaration//GEN-END:variables
}
