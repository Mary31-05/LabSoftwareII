package co.edu.unicauca.mvc.vistas.adminConferencia;

import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoEvaluadores;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoOrganizadores;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoUsuarios;
import co.edu.unicauca.mvc.vistas.articulos.VtnListarArticulos;
import co.edu.unicauca.mvc.vistas.login.VtnLogin;
import co.unicauca.mvc.vistas.evaluador.VtnListarEvaluador;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VtnPrincipalAdmin extends javax.swing.JFrame {

    private VtnVerEstadisticas objVtnVerEstadisticas;
    private VtnListarArticulos objVtnListarArticulos;
    private VtnListarConferencias objVtnListarConferencias;
    private VtnListarEvaluador objVtnListarEvaluador;
    private VtnLogin objVtnLogin;
    private ServicioAlmacenamientoConferencias objServicio1;
    private ServicioAlmacenamientoArticulos objServicio2;
    private ServicioAlmacenamientoOrganizadores objServicio3;
    private ServicioAlmacenamientoEvaluadores objServicio4;
    private ServicioAlmacenamientoUsuarios objServicio5;
    private VtnListarOrganizadores objVtnRegistrarOrganizadores;

    public VtnPrincipalAdmin() {
        initComponents();
        establecerIconoOrganización();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.jPanelMenu.setVisible(true);
        

    }

    public void asociarServios(
            ServicioAlmacenamientoConferencias objServicio1,
            ServicioAlmacenamientoArticulos objServicio2,
            ServicioAlmacenamientoOrganizadores objServicio3,
            ServicioAlmacenamientoEvaluadores objServicio4,
            ServicioAlmacenamientoUsuarios objServicio5) {
        this.objServicio1 = objServicio1;
        this.objServicio2 = objServicio2;
        this.objServicio3 = objServicio3;
        this.objServicio4 = objServicio4;
        this.objServicio5 = objServicio5;
        relacionarInternalFrameConJdesptokPane();
    }

    private void relacionarInternalFrameConJdesptokPane() {
        this.objVtnVerEstadisticas = new VtnVerEstadisticas();
        this.jDesktopPanelPrincipal.add(this.objVtnVerEstadisticas);

        this.objVtnListarArticulos = new VtnListarArticulos(this.objServicio2, this.objServicio1);
        this.jDesktopPanelPrincipal.add(this.objVtnListarArticulos);

        this.objVtnListarConferencias = new VtnListarConferencias(this.objServicio1);
        this.jDesktopPanelPrincipal.add(this.objVtnListarConferencias);

        this.objVtnRegistrarOrganizadores = new VtnListarOrganizadores(this.objServicio3);
        this.jDesktopPanelPrincipal.add(this.objVtnRegistrarOrganizadores);

        this.objVtnListarEvaluador = new VtnListarEvaluador(this.objServicio2, this.objServicio4);
        this.jDesktopPanelPrincipal.add(this.objVtnListarEvaluador);

        this.objVtnLogin = new VtnLogin(this.objServicio5);
        this.jDesktopPanelPrincipal.add(this.objVtnLogin);
        
    }

    // Control roles
    private void controlRoles() {
        
            boolean ingreso = this.objVtnLogin.ingreso;
            System.out.println(ingreso);
        

    }

    private void establecerIconoOrganización() {
        Image img1 = new ImageIcon(getClass().getResource("/recursos/logo.png")).getImage();
        ImageIcon img2 = new ImageIcon(img1.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.jLabelImagenOrganizacion.setIcon(img2);
        this.jLabelImagenOrganizacion.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelImagenOrganizacion = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jButtonGestionarConferencias = new javax.swing.JButton();
        jButtonVerArticulosEnviados = new javax.swing.JButton();
        jButtonVerEstadisticas = new javax.swing.JButton();
        jButtonGestionarE = new javax.swing.JButton();
        jButtonGestionarO = new javax.swing.JButton();
        jPanelInferior = new javax.swing.JPanel();
        jButtonIniciarSesion = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jDesktopPanelPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelImagenOrganizacion.setText("jLabel1");

        jPanelMenu.setBackground(new java.awt.Color(153, 153, 255));

        jButtonGestionarConferencias.setText("Gestionar conferencias");
        jButtonGestionarConferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarConferenciasActionPerformed(evt);
            }
        });

        jButtonVerArticulosEnviados.setText("Ver articulos enviados");
        jButtonVerArticulosEnviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerArticulosEnviadosActionPerformed(evt);
            }
        });

        jButtonVerEstadisticas.setText("Ver estadisticas");
        jButtonVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEstadisticasActionPerformed(evt);
            }
        });

        jButtonGestionarE.setText("Gestionar Evaluadores");
        jButtonGestionarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarEActionPerformed(evt);
            }
        });

        jButtonGestionarO.setText("Gestionar Organizadores");
        jButtonGestionarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGestionarConferencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGestionarO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGestionarE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVerArticulosEnviados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVerEstadisticas)
                .addGap(28, 28, 28))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGestionarConferencias)
                    .addComponent(jButtonVerArticulosEnviados)
                    .addComponent(jButtonVerEstadisticas)
                    .addComponent(jButtonGestionarE)
                    .addComponent(jButtonGestionarO))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabelImagenOrganizacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenOrganizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonIniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonIniciarSesion.setText("Iniciar Sesion");
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jButtonIniciarSesion)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButtonIniciarSesion)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDesktopPanelPrincipalLayout = new javax.swing.GroupLayout(jDesktopPanelPrincipal);
        jDesktopPanelPrincipal.setLayout(jDesktopPanelPrincipalLayout);
        jDesktopPanelPrincipalLayout.setHorizontalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        jDesktopPanelPrincipalLayout.setVerticalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanelPrincipal)
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanelPrincipal)
                .addContainerGap())
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerArticulosEnviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerArticulosEnviadosActionPerformed
        this.objVtnListarArticulos.setVisible(true);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
    }//GEN-LAST:event_jButtonVerArticulosEnviadosActionPerformed

    private void jButtonVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEstadisticasActionPerformed
        this.objVtnVerEstadisticas.setVisible(true);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
    }//GEN-LAST:event_jButtonVerEstadisticasActionPerformed

    private void jButtonGestionarConferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarConferenciasActionPerformed
        this.objVtnListarConferencias.setVisible(true);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarConferenciasActionPerformed

    private void jButtonGestionarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarEActionPerformed
        this.objVtnListarEvaluador.setVisible(true);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarEActionPerformed

    private void jButtonGestionarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarOActionPerformed
        this.objVtnListarEvaluador.setVisible(false);
        this.objVtnListarConferencias.setVisible(false);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnListarArticulos.setVisible(false);
        this.objVtnRegistrarOrganizadores.setVisible(true);
    }//GEN-LAST:event_jButtonGestionarOActionPerformed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        objVtnLogin.setVisible(true);

    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionarConferencias;
    private javax.swing.JButton jButtonGestionarE;
    private javax.swing.JButton jButtonGestionarO;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonVerArticulosEnviados;
    private javax.swing.JButton jButtonVerEstadisticas;
    private javax.swing.JDesktopPane jDesktopPanelPrincipal;
    private javax.swing.JLabel jLabelImagenOrganizacion;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
