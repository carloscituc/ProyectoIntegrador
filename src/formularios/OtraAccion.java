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
public class OtraAccion extends javax.swing.JFrame {

    /**
     * Creates new form OtraAccion
     */
    public OtraAccion() {
        initComponents();
        this.setTitle("Comprobar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panContenedorOtraAccion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panElige = new javax.swing.JPanel();
        btnSi = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panContenedorOtraAccion.setBackground(new java.awt.Color(204, 204, 255));
        panContenedorOtraAccion.setAutoscrolls(true);

        jLabel1.setBackground(new java.awt.Color(6, 169, 6));
        jLabel1.setFont(new java.awt.Font("Gautami", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      Realizarás otra acción?");
        jLabel1.setOpaque(true);

        panElige.setBackground(new java.awt.Color(255, 255, 255));
        panElige.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true), "Elige", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panElige.setAutoscrolls(true);
        panElige.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panElige.setMaximumSize(new java.awt.Dimension(347, 170));
        panElige.setMinimumSize(new java.awt.Dimension(347, 170));

        btnSi.setBackground(new java.awt.Color(0, 103, 36));
        btnSi.setFont(btnSi.getFont().deriveFont((btnSi.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));
        btnSi.setForeground(new java.awt.Color(239, 253, 219));
        btnSi.setText("Sí");
        btnSi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSi.setBorderPainted(false);
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });

        btnNo.setBackground(new java.awt.Color(0, 103, 36));
        btnNo.setFont(btnNo.getFont().deriveFont((btnNo.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));
        btnNo.setForeground(new java.awt.Color(239, 253, 219));
        btnNo.setText("No");
        btnNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNo.setBorderPainted(false);
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEligeLayout = new javax.swing.GroupLayout(panElige);
        panElige.setLayout(panEligeLayout);
        panEligeLayout.setHorizontalGroup(
            panEligeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEligeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panEligeLayout.setVerticalGroup(
            panEligeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEligeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panEligeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panContenedorOtraAccionLayout = new javax.swing.GroupLayout(panContenedorOtraAccion);
        panContenedorOtraAccion.setLayout(panContenedorOtraAccionLayout);
        panContenedorOtraAccionLayout.setHorizontalGroup(
            panContenedorOtraAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContenedorOtraAccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panContenedorOtraAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(panElige, javax.swing.GroupLayout.PREFERRED_SIZE, 219, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panContenedorOtraAccionLayout.setVerticalGroup(
            panContenedorOtraAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContenedorOtraAccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(panElige, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContenedorOtraAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContenedorOtraAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        Acciones acciones=new Acciones();
        acciones.setVisible(true);
        acciones.setLocationRelativeTo(null);
        hide();
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        Login login=new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        hide();
    }//GEN-LAST:event_btnNoActionPerformed

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
            java.util.logging.Logger.getLogger(OtraAccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtraAccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtraAccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtraAccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtraAccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panContenedorOtraAccion;
    private javax.swing.JPanel panElige;
    // End of variables declaration//GEN-END:variables
}