/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.awt.Window;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class changePassword extends javax.swing.JFrame {

    public changePassword() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        account = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("YouYuan", 1, 36)); // NOI18N
        jLabel2.setText("CHANGE PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("User");
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Current ID:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("ID");
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        account.setBackground(new java.awt.Color(51, 0, 51));
        account.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        account.setForeground(new java.awt.Color(255, 255, 255));
        account.setText("Change Password");
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });
        jPanel2.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 32));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      // Add null check for Session
        Session sess = Session.getInstance();
        if (sess == null || sess.getId() == 0) {
            JOptionPane.showMessageDialog(null, "Please Log In First!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            id.setText("" + sess.getId());
            username.setText("" + sess.getFirstname());
        }

          
    }//GEN-LAST:event_formWindowActivated

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
  
   try {
    connectDB cdb = new connectDB();
    Session sess = Session.getInstance();

    if (sess.getId() <= 0) { 
        JOptionPane.showMessageDialog(null, "Invalid session. Please log in again.");
        return;
    }

    String query = "SELECT password FROM users WHERE id = ?";
    PreparedStatement stmt = cdb.getConnection().prepareStatement(query);
    stmt.setInt(1, sess.getId()); 

    ResultSet rs = stmt.executeQuery();

    if (rs.next()) {
        String storedHashedPassword = rs.getString("password");

        String oldPassword = JOptionPane.showInputDialog("Enter current password:");
        String newPassword = JOptionPane.showInputDialog("Enter new password:");
        String confirmPassword = JOptionPane.showInputDialog("Confirm new password:");

        if (oldPassword == null || newPassword == null || confirmPassword == null || 
            oldPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password fields cannot be empty!");
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match! Please try again.");
            return;
        }

        if (!passwordHasher.checkPassword(oldPassword, storedHashedPassword)) {
            JOptionPane.showMessageDialog(null, "Incorrect old password!");
            return;
        }

        String hashedNewPassword = passwordHasher.hashPassword(newPassword);

        String updateQuery = "UPDATE users SET password = ? WHERE id = ?";
        PreparedStatement updateStmt = cdb.getConnection().prepareStatement(updateQuery);
        updateStmt.setString(1, hashedNewPassword);
        updateStmt.setInt(2, sess.getId());

        int rowsUpdated = updateStmt.executeUpdate();
        updateStmt.close();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Password changed successfully!");

            login loginForm = new login();
            loginForm.setVisible(true);

            Window currentWindow = SwingUtilities.getWindowAncestor(JOptionPane.getRootFrame());
            if (currentWindow != null) {
                currentWindow.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update password!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "No account found for the given ID.");
    }

    rs.close();
    stmt.close();
    cdb.closeConnection();
} catch (SQLException ex) {
    System.out.println("SQL Error: " + ex.getMessage());
} catch (Exception ex) { 
    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
}

     
    }//GEN-LAST:event_accountActionPerformed

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
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
