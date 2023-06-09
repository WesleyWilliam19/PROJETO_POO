package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

/**
 *
 * @author Casa
 */
public class frmLoginVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmLoginVIEW
     */
    public frmLoginVIEW() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SYSLOANS - SISTEMA DE EMPRÉSTIMOS");
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        txtNomeUsuario.setBackground(new java.awt.Color(250, 248, 248));
        txtNomeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 192, 0)));
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 160, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        btnEntrar.setBackground(new java.awt.Color(0, 66, 66));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 80, 30));

        txtSenhaUsuario.setBackground(new java.awt.Color(249, 247, 247));
        txtSenhaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 192, 0)));
        txtSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Imagens/Sample_User_Icon30x30.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 30, 30));

        jLabel4.setBackground(new java.awt.Color(51, 204, 0));
        jLabel4.setForeground(new java.awt.Color(153, 255, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Imagens/Sem-Título--2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 360));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 153));
        jLabel6.setText("LOGIN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Imagens/fundoWhite.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 230, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Logar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    private void Logar() {
        try {
            String nome_usuario, senha_usuario;

            nome_usuario = txtNomeUsuario.getText();
            senha_usuario = txtSenhaUsuario.getText();

            //Instanciar a classe DTO
            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setNome_usuario(nome_usuario);
            objusuariodto.setSenha_usuario(senha_usuario);

            //Instanciar a classe DAO
            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);

            if (rsusuariodao.next()) {
                //chamar tela que eu quero abrir
                frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();
                objfrmprincipalview.setVisible(true);

                dispose();
            } else {
                //enviar mensagem dizendo incorreto
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
                // JOptionPane.showConfirmDialog(null, "Usuário ou senha inválidos");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FRMLOGINVIEW" + erro);
        }

        /* Forma alternativa
        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setNome_usuario(txtNomeUsuario.getText());
        objusuariodto.setSenha_usuario(txtSenhaUsuario.getText());
         */
    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/VIEW/Imagens/logo.png")));
    }
}
