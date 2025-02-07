/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cafe_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author chamodiprasadeni
 */
public class Staff_ACC extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Staff_ACC() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        t0 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Staff Account");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COZY CORNER CAFE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 6, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NO. 789,");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 30, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Galle Road,");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 53, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Colombo, Sri Lanka.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 76, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("+94 11 567 3456");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 99, -1, -1));

        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jButton2.setText("Clear All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 119, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Create Your Account");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gmail");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UserName");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 192, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 192, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 192, -1));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 192, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 192, -1));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 192, -1));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 192, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("I have an Account");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jButton3.setText("Log In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 120, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Staff ID");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        getContentPane().add(t0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon("/Users/chamodiprasadeni/Desktop/Java/Images/Eb56cc.jpg")); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        t0.setText("");
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        jPasswordField1.setText("");
        t1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String staffid= t0.getText();
        String firstname= t1.getText();
        String lastname= t2.getText();
        String gmail= t3.getText();
        String contact= t4.getText();
        String address= t5.getText();
        String username= t6.getText();
        String password= String.valueOf(jPasswordField1.getPassword());
        
        if(username.length()<5 || username.length() > 10){
            JOptionPane.showMessageDialog(this, "Username must be between 5 and 10 Characters.","Error",1);
            return;
        }
        if(password.length()<8){
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.","Error",1);
            return;
        }
        
        if(firstname.length()<5){
            JOptionPane.showMessageDialog(this, "Firstname must be at least 5 characters long","Error",1);
        }
        
        if(lastname.length()<8){
            JOptionPane.showMessageDialog(this,"Lastname must be at least 8 characters long","Error",1);
        }
        
        if(!gmail.endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(this, "Gmail address must end with @gmail.com.","Error",1);
        return;
        }
        
        Connection con=null;
        PreparedStatement stmt = null;
        
        try{
            String url="jdbc:derby://localhost:1527/Cafe";
            con = DriverManager.getConnection(url, "admin", "1234");
            String qry = "INSERT INTO APP.SUSER_INFO (Staff_ID,First_Name, Last_Name, Gmail, Contact, Address, Username, Password) VALUES (?,?, ?, ?, ?, ?,?,?)";
            stmt = con.prepareStatement(qry);
            
            
            stmt.setString(1, staffid);
            stmt.setString(2, firstname);
            stmt.setString(3, lastname);
            stmt.setString(4, gmail);
            stmt.setInt(5,Integer.parseInt(contact));
            stmt.setString(6, address);
            stmt.setString(7, username);
            stmt.setString(8, password);
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Account Created Successfully !");
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error");
        }finally {
        // Close resources
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Staff_Login1 Staff_Login1Frame = new Staff_Login1();
        Staff_Login1Frame.setVisible(true);
        Staff_Login1Frame.pack();
        Staff_Login1Frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Staff_ACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_ACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_ACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_ACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_ACC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField t0;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
