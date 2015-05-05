
package formularios;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import clases.conexionBD;
import java.sql.ResultSet;
public class Login extends javax.swing.JFrame {
    private conexionBD bd = null;
    private ResultSet rs = null;
    public Login() {
        initComponents();
        //this.setTitle("Login");
        errores();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panContenedorLogin = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblErrorUsuario = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        lblErrorContrasenia = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        lblOlvidasteContrasenia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());

        panContenedorLogin.setBackground(new java.awt.Color(204, 204, 255));

        titulo.setBackground(new java.awt.Color(6, 169, 6));
        titulo.setFont(new java.awt.Font("Gautami", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText(" Bienvenido al sistema de la Biblioteca ");
        titulo.setOpaque(true);

        panLogin.setBackground(new java.awt.Color(255, 255, 255));
        panLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true), "Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        panLogin.setAutoscrolls(true);
        panLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panLogin.setMaximumSize(new java.awt.Dimension(360, 195));
        panLogin.setMinimumSize(new java.awt.Dimension(360, 195));

        lblUsuario.setFont(lblUsuario.getFont().deriveFont(lblUsuario.getFont().getStyle() | java.awt.Font.BOLD, lblUsuario.getFont().getSize()+3));
        lblUsuario.setText("Usuario:");

        lblContrasenia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContrasenia.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblErrorUsuario.setFont(lblErrorUsuario.getFont().deriveFont((lblErrorUsuario.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, 14));
        lblErrorUsuario.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorUsuario.setText("*");

        txtContrasenia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblErrorContrasenia.setFont(lblErrorContrasenia.getFont().deriveFont((lblErrorContrasenia.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, 14));
        lblErrorContrasenia.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorContrasenia.setText("*");

        btnAcceder.setBackground(new java.awt.Color(0, 103, 36));
        btnAcceder.setFont(btnAcceder.getFont().deriveFont((btnAcceder.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, 14));
        btnAcceder.setForeground(new java.awt.Color(239, 253, 219));
        btnAcceder.setText("Acceder");
        btnAcceder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAcceder.setBorderPainted(false);
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        lblOlvidasteContrasenia.setBackground(new java.awt.Color(0, 51, 255));
        lblOlvidasteContrasenia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOlvidasteContrasenia.setForeground(new java.awt.Color(0, 51, 204));
        lblOlvidasteContrasenia.setText("Olvidaste tu contraseña?");

        javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
        panLogin.setLayout(panLoginLayout);
        panLoginLayout.setHorizontalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblOlvidasteContrasenia))
            .addGroup(panLoginLayout.createSequentialGroup()
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContrasenia)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContrasenia)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrorUsuario)
                            .addComponent(lblErrorContrasenia, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panLoginLayout.setVerticalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLoginLayout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContrasenia)
                            .addComponent(lblErrorContrasenia)))
                    .addComponent(lblUsuario)
                    .addComponent(lblErrorUsuario))
                .addGap(28, 28, 28)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOlvidasteContrasenia))
        );

        javax.swing.GroupLayout panContenedorLoginLayout = new javax.swing.GroupLayout(panContenedorLogin);
        panContenedorLogin.setLayout(panContenedorLoginLayout);
        panContenedorLoginLayout.setHorizontalGroup(
            panContenedorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContenedorLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panContenedorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addComponent(panLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panContenedorLoginLayout.setVerticalGroup(
            panContenedorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContenedorLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContenedorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panContenedorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/User_group.png"));


        return retValue;
    }
    
    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        //validacionUsuarios();
        boolean respuesta = false;
        bd = new conexionBD();
        String id = txtUsuario.getText();
        String contrasenia = new String(txtContrasenia.getPassword());
    }//GEN-LAST:event_btnAccederActionPerformed

    public void validacionUsuarios(){
        String usuario, contrasenia;
        //Aqui deben de declararse las sentencias que para que se valide
        //en que ventana se irá al presionar el botón
        //dependiendo de los nombres de usuario
        Acciones acciones=new Acciones();
        MenuAdministrador administrador=new MenuAdministrador();
        usuario=txtUsuario.getText();
        contrasenia=txtContrasenia.getText();
        
        if(usuario.equals("c") && contrasenia.equals("c")){
            acciones.setVisible(true);
            acciones.setLocationRelativeTo(null);
            hide();
        }
        else{
            if(usuario.compareTo("c")!=0 || contrasenia.compareTo("c")!=0){
                lblErrorUsuario.setVisible(true);//Mensaje de error en usuario
                lblErrorContrasenia.setVisible(true);//Mensaje de error en contraseña
            }
            if(usuario.equals("c") && contrasenia.compareTo("c")!=0){
                lblErrorUsuario.setVisible(false);
                lblErrorContrasenia.setVisible(true);
            }  
            
        }
        
        if(usuario.equals("a") && contrasenia.equals("a")){
            administrador.setVisible(true);
            administrador.setLocationRelativeTo(null);
            hide();
        }
        else{
            if(usuario.compareTo("a")!=0 || contrasenia.compareTo("a")!=0){
                lblErrorUsuario.setVisible(true);//Mensaje de error en usuario
                lblErrorContrasenia.setVisible(true);//Mensaje de error en contraseña
            }
            if(usuario.equals("a") && contrasenia.compareTo("a")!=0){
                lblErrorUsuario.setVisible(false);
                lblErrorContrasenia.setVisible(true);
            }  
        }
    }
    public void errores(){
        lblErrorUsuario.setVisible(false);
        lblErrorContrasenia.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login probar = new Login();
                probar.setVisible(true);
                probar.setLocationRelativeTo(null);
                probar.setResizable(false);
                //new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblErrorContrasenia;
    private javax.swing.JLabel lblErrorUsuario;
    private javax.swing.JLabel lblOlvidasteContrasenia;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panContenedorLogin;
    private javax.swing.JPanel panLogin;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
