/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo3.server;

import db.Connection;
import db.Parameter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    ResultSet st;
    Connection db;
    String username, password, akses;
   
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        db = new Connection(Parameter.HOST_DB, Parameter.USERNAME_DB,Parameter.PASSWORD_DB, Parameter.IPHOST, Parameter.PORT);
        //Center Jframe
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width-getWidth())/2;
        int y = (dim.height-getHeight())/2;
        setLocation(x, y);
        getJam();
    }
        
    public void getLogin(){
        if (Username.getText().equals("") || Password.getText().equals("")){
         JOptionPane.showMessageDialog(this,"Data login masih kosong !!!");
        }else{
            try {
                st = db.querySelectAll("user", "username='" + Username.getText() + "' and password='" + Password.getText() + "'");
                while (st.next()) {
                username = st.getString("username");
                password = st.getString("password");
                akses = st.getString("akses");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (username == null && password == null) {
            JOptionPane.showMessageDialog(this, "Username dan Password Salah !!!");
            } else {
                if (akses.equals("Admin")) {
                Home h = new Home();
                h.setVisible(true);
                this.dispose();
                } else {
                    Kasir t = new Kasir();
                    t.setVisible(true);
                    this.dispose();
                }
            }
        }
    }
    
     public void getJam() {
        Date skrg = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        lbl_time.setText(jam.format(skrg));
        lbl_date.setText(tgl.format(skrg));
    }
    
    public void getUsername(){
        if (Username.getForeground().equals(Color.LIGHT_GRAY)) {
            Username.setForeground(Color.black);
            Username.setText("");
        }
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
        Message = new usu.widget.Label();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        Password = new javax.swing.JPasswordField();
        labelUsername = new usu.widget.Label();
        labelPassword = new usu.widget.Label();
        Username = new usu.widget.TextBox();
        buttonLogin = new javax.swing.JButton();
        lbl_date = new usu.widget.Label();
        lbl_time = new usu.widget.Label();
        label1 = new usu.widget.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        panelGlass1.setBackground(new java.awt.Color(255, 255, 255));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });

        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setText("Username");
        labelUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password");
        labelPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Username.setForeground(java.awt.Color.lightGray);
        Username.setText("Username");
        Username.setToolTipText("");
        Username.setFont(new java.awt.Font("Ubahn", 0, 14)); // NOI18N
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsernameKeyTyped(evt);
            }
        });

        buttonLogin.setBackground(new java.awt.Color(51, 0, 153));
        buttonLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password)
                            .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_time.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Login Server");
        label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
       
    }//GEN-LAST:event_UsernameMouseClicked

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        buttonLoginActionPerformed(evt);
    }//GEN-LAST:event_UsernameActionPerformed

    private void UsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyTyped
        getUsername();
    }//GEN-LAST:event_UsernameKeyTyped

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        buttonLoginActionPerformed(evt);// TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordKeyTyped

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        getLogin();// TODO add your handling code here:
    }//GEN-LAST:event_buttonLoginActionPerformed

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
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.Label Message;
    private javax.swing.JPasswordField Password;
    private usu.widget.TextBox Username;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JPanel jPanel1;
    private usu.widget.Label label1;
    private usu.widget.Label labelPassword;
    private usu.widget.Label labelUsername;
    private usu.widget.Label lbl_date;
    private usu.widget.Label lbl_time;
    private usu.widget.glass.PanelGlass panelGlass1;
    // End of variables declaration//GEN-END:variables

   
}
