/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author carlos-pc
 */
public class ConsultarOpciones extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarOpciones
     */
    public ConsultarOpciones() {
        initComponents();
        this.setTitle("Opciones de búsqueda");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panContenedorConsultarOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panConsultar = new javax.swing.JPanel();
        btnPrestamos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panContenedorConsultarOpciones.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(6, 169, 6));
        jLabel1.setFont(new java.awt.Font("Gautami", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Selecciona el objeto de búsqueda ");
        jLabel1.setOpaque(true);

        panConsultar.setBackground(new java.awt.Color(255, 255, 255));
        panConsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true), "Consultar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panConsultar.setAutoscrolls(true);
        panConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panConsultar.setMaximumSize(new java.awt.Dimension(360, 195));
        panConsultar.setMinimumSize(new java.awt.Dimension(360, 195));

        btnPrestamos.setBackground(new java.awt.Color(0, 103, 36));
        btnPrestamos.setFont(btnPrestamos.getFont().deriveFont((btnPrestamos.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));
        btnPrestamos.setForeground(new java.awt.Color(239, 253, 219));
        btnPrestamos.setText("Prestamos");
        btnPrestamos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrestamos.setBorderPainted(false);
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(0, 103, 36));
        btnUsuarios.setFont(btnUsuarios.getFont().deriveFont((btnUsuarios.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));
        btnUsuarios.setForeground(new java.awt.Color(239, 253, 219));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnLibros.setBackground(new java.awt.Color(0, 103, 36));
        btnLibros.setFont(btnLibros.getFont().deriveFont((btnLibros.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));
        btnLibros.setForeground(new java.awt.Color(239, 253, 219));
        btnLibros.setText("Libros");
        btnLibros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLibros.setBorderPainted(false);
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(167, 167, 206));
        btnRegresar.setFont(btnRegresar.getFont().deriveFont((btnRegresar.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panConsultarLayout = new javax.swing.GroupLayout(panConsultar);
        panConsultar.setLayout(panConsultarLayout);
        panConsultarLayout.setHorizontalGroup(
            panConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsultarLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panConsultarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panConsultarLayout.setVerticalGroup(
            panConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsultarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panContenedorConsultarOpcionesLayout = new javax.swing.GroupLayout(panContenedorConsultarOpciones);
        panContenedorConsultarOpciones.setLayout(panContenedorConsultarOpcionesLayout);
        panContenedorConsultarOpcionesLayout.setHorizontalGroup(
            panContenedorConsultarOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContenedorConsultarOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panContenedorConsultarOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panContenedorConsultarOpcionesLayout.setVerticalGroup(
            panContenedorConsultarOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContenedorConsultarOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContenedorConsultarOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContenedorConsultarOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        ResulBusquedaPrestamos consultar=new ResulBusquedaPrestamos();
        consultar.setVisible(true);
        consultar.setLocationRelativeTo(null);
        hide();
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        ConsultarUsuario consultar=new ConsultarUsuario();
        consultar.setVisible(true);
        consultar.setLocationRelativeTo(null);
        hide();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        ConsultarLibro consultar=new ConsultarLibro();
        consultar.setVisible(true);
        consultar.setLocationRelativeTo(null);
        hide();
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuAdministrador regresar=new MenuAdministrador();
        hide();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarOpciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panConsultar;
    private javax.swing.JPanel panContenedorConsultarOpciones;
    // End of variables declaration//GEN-END:variables
}
