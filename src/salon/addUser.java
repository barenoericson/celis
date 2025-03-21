/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

import config.connectDB;
import config.passwordHasher;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class addUser extends javax.swing.JFrame {

   
      public addUser() {
        initComponents();
        
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        usertype = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("YouYuan", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD USER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 60));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 50, 80, 50);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Back");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 10, 40, 22);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, 400, 140, 40);

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add.add(jLabel6);
        jLabel6.setBounds(50, 10, 31, 22);

        jPanel2.add(add);
        add.setBounds(30, 120, 140, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 20, 80, 80);

        update.setBackground(new java.awt.Color(51, 51, 51));
        update.setEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Update");
        update.add(jLabel7);
        jLabel7.setBounds(40, 10, 70, 22);

        jPanel2.add(update);
        update.setBounds(30, 180, 140, 40);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Delete");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(40, 10, 60, 22);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(30, 240, 140, 40);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cancel");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(40, 10, 70, 22);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(30, 300, 140, 40);

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("ID");
        jPanel2.add(id);
        id.setBounds(150, 10, 19, 22);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Refresh");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(40, 10, 59, 22);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(30, 350, 140, 40);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 490));

        jPanel8.setForeground(new java.awt.Color(150,150,150));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel11.setText("ADD USER ");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel8.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 180, 30));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel8.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Lastname:");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Password:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("User ID:");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, 30));

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel8.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Firstname:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 30));

        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Receptionist" }));
        jPanel8.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 180, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("User Type:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel8.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel8.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 180, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Username:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Email:");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 30));

        userid.setEnabled(false);
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        jPanel8.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 180, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel8.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 180, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Status:");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 30));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 520, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      String First_name = firstname.getText().trim();
String Last_name = lastname.getText().trim();
String Email = email.getText().trim().toLowerCase();
String User_type = usertype.getSelectedItem().toString().trim();
String user_name = username.getText().trim();
String Password = password.getText().trim();

connectDB connect = new connectDB();

if (First_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your First Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Last_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your Last Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Email.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter an Email!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (!Email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
    JOptionPane.showMessageDialog(null, "Please enter a valid Email Address!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (User_type.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please select a User Type!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (user_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Username!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Password!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Error", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        if (connect.fieldExists("users", "username", user_name)) {
            JOptionPane.showMessageDialog(null, "Username already taken!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (connect.fieldExists("users", "email", Email)) {
            JOptionPane.showMessageDialog(null, "Email already used!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String hashedPassword = passwordHasher.hashPassword(password.getText());

            String sql = "INSERT INTO users (firstname, lastname, username, email, usertype, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            int rowsInserted = connect.insertData(sql, First_name, Last_name, user_name, Email, User_type, hashedPassword, "Pending");

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Registered Successfully!");

                new login().setVisible(true);

                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(username);
                if (frame != null) {
                    frame.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
   
    }//GEN-LAST:event_addMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         String First_name = firstname.getText().trim();
String Last_name = lastname.getText().trim();
String Email = email.getText().trim().toLowerCase();
String User_type = usertype.getSelectedItem().toString().trim();
String user_name = username.getText().trim();
String Password = password.getText().trim();

connectDB connect = new connectDB();

if (First_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your First Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Last_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your Last Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Email.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter an Email!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (!Email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
    JOptionPane.showMessageDialog(null, "Please enter a valid Email Address!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (User_type.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please select a User Type!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (user_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Username!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Password!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Error", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        if (connect.fieldExists("users", "username", user_name)) {
            JOptionPane.showMessageDialog(null, "Username already taken!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (connect.fieldExists("users", "email", Email)) {
            JOptionPane.showMessageDialog(null, "Email already used!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String hashedPassword = passwordHasher.hashPassword(password.getText());

            String sql = "INSERT INTO users (firstname, lastname, username, email, usertype, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            int rowsInserted = connect.insertData(sql, First_name, Last_name, user_name, Email, User_type, hashedPassword, "Pending");

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Registered Successfully!");

                new login().setVisible(true);

                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(username);
                if (frame != null) {
                    frame.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
   
    }//GEN-LAST:event_jLabel6MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
                 if (firstname.getText().isEmpty() || lastname.getText().isEmpty() || username.getText().isEmpty() || 
    email.getText().isEmpty() || usertype.getSelectedItem() == null || password.getText().isEmpty() || 
    status.getSelectedItem() == null || id.getText().isEmpty()) {
    
    JOptionPane.showMessageDialog(null, "All Fields Are Required!");

} else if (password.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
    password.setText("");
    
} else {
    connectDB cdb = new connectDB();
    try {
        try {
            Integer.parseInt(userid.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid User ID!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        boolean usernameExists = cdb.duplicateCheckExcludingCurrent("users", "username", username.getText(), "id", id.getText());
        boolean emailExists = cdb.duplicateCheckExcludingCurrent("users", "email", email.getText(), "id", id.getText());

        if (usernameExists || emailExists) {
            JOptionPane.showMessageDialog(null, "Username or Email already exists for another user!", "Validation Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int rowsUpdated = cdb.updateData(
                "UPDATE users SET firstname = ?, lastname = ?, username = ?, email = ?, usertype = ?, password = ?, status = ? WHERE id = ?",
                firstname.getText(),
                lastname.getText(),
                username.getText(),
                email.getText(),
                usertype.getSelectedItem().toString(),
                password.getText(),
                status.getSelectedItem().toString(),
                userid.getText(),
                id.getText()
            );

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Account updated successfully!");
                
                this.dispose();  
                login loginForm = new login(); 
                loginForm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Update failed! User ID not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        cdb.closeConnection();
    }
}

    }//GEN-LAST:event_updateMouseClicked

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
      users s = new users();
      s.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       users u = new users();
       u.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel add;
    public javax.swing.JTextField email;
    public javax.swing.JTextField firstname;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JTextField lastname;
    public javax.swing.JPasswordField password;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JPanel update;
    public javax.swing.JTextField userid;
    public javax.swing.JTextField username;
    public javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables
}
