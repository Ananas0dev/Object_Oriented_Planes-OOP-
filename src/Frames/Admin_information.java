/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import classes.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anasg
 */
public class Admin_information extends javax.swing.JFrame {

    
     DB_manager db = new DB_manager();
     private static final float DEFAULT_TRANSPARENCY = 0.5f;
    login al;
    private BufferedImage backgroundImage;
    /**
     * Creates new form Admin_information
     */
    public Admin_information() {
        setIcon();
       // BG();
        initComponents();
        
    }
    
//           public void BG(String imagePath){
//            JPanel backgroundPanel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                Graphics2D g2d = (Graphics2D) g.create();
//                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, DEFAULT_TRANSPARENCY));
//
//                // Load image (error handling can be added)
//                ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
//                Image image = imageIcon.getImage();
//
//                int imageWidth = image.getWidth(null);
//                int imageHeight = image.getHeight(null);
//
//                // Tile or scale the image to fit the panel (optional customization)
//                int panelWidth = getWidth();
//                int panelHeight = getHeight();
//                for (int y = 0; y < panelHeight; y += imageHeight) {
//                    for (int x = 0; x < panelWidth; x += imageWidth) {
//                        g2d.drawImage(image, x, y, this);
//                    }
//                }
//            }
//            
//
//            }; 
//            
//            backgroundPanel.setOpaque(false); // Make panel transparent
//
//        // Add your other components to the background panel here
//
//        setContentPane(backgroundPanel);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack(); // Adjust frame size if needed
//        setLocationRelativeTo(null); // Center the frame on screen
//        setVisible(true);
//    }
    public void setIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/ico_oop.png"));
        setIconImage(icon.getImage());
        BackgroundPanel backgroundPanel = new BackgroundPanel("/images/single_tower.jpeg");
        setContentPane(backgroundPanel);
 
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
        FirstNameLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        RePasswordLabel = new javax.swing.JLabel();
        TextField_Firstname = new javax.swing.JTextField();
        TextField_username = new javax.swing.JTextField();
        TextField_password = new javax.swing.JTextField();
        TextField_Repassword = new javax.swing.JTextField();
        SSNLabel = new javax.swing.JLabel();
        TextField_SSN = new javax.swing.JTextField();
        Phonenumberlabel = new javax.swing.JLabel();
        TextField_Phone = new javax.swing.JTextField();
        BirthDateLabel = new javax.swing.JLabel();
        TextField_BirthDate = new javax.swing.JTextField();
        GenderLabel = new javax.swing.JLabel();
        TextField_Gender = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        TextField_Address = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        TextField_Lastname = new javax.swing.JTextField();
        MiddleNameLabel = new javax.swing.JLabel();
        TextField_MiddleName = new javax.swing.JTextField();
        TextField_Passport = new javax.swing.JTextField();
        PassportLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        TextField_Email = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Updating information");

        FirstNameLabel.setText("First Name:");

        UsernameLabel.setText("Username: ");

        PasswordLabel.setText("Password:");

        RePasswordLabel.setText("Re-enter the password: ");

        TextField_Firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_FirstnameActionPerformed(evt);
            }
        });

        TextField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_passwordActionPerformed(evt);
            }
        });

        TextField_Repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_RepasswordActionPerformed(evt);
            }
        });

        SSNLabel.setText("SSN:");

        Phonenumberlabel.setText("Phone number: ");

        BirthDateLabel.setText("Birth date: ");

        GenderLabel.setText("Gender: ");

        AddressLabel.setText("Address: ");

        LastNameLabel.setText("Last Name:");

        TextField_Lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_LastnameActionPerformed(evt);
            }
        });

        MiddleNameLabel.setText("Middle Name:");

        TextField_MiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_MiddleNameActionPerformed(evt);
            }
        });

        PassportLabel.setText("PassportID:");

        EmailLabel.setText("Email: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(FirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(RePasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(TextField_Repassword, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SSNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Phonenumberlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BirthDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GenderLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PassportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(65, 65, 65)
                                .addComponent(TextField_Passport, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(MiddleNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addGap(46, 46, 46)
                            .addComponent(TextField_MiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextField_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(TextField_Email)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(TextField_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MiddleNameLabel)
                    .addComponent(TextField_MiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextField_SSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_Passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassportLabel)))
                    .addComponent(SSNLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phonenumberlabel)
                    .addComponent(TextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthDateLabel)
                    .addComponent(TextField_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressLabel)
                    .addComponent(TextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameLabel)
                    .addComponent(TextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel)
                    .addComponent(TextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Repassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RePasswordLabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        UpdateButton.setText("Update");
        UpdateButton.setToolTipText("this will take you to login page");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_FirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_FirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_FirstnameActionPerformed

    private void TextField_RepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_RepasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_RepasswordActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        //updating the information on the database then:
  // Update passengers table
    String passengersUpdateQuery = "UPDATE passengers SET Passenger_username = ?, Passenger_password = ?, idPassport = ? WHERE ssn = ?";

    // Update persons table
    String personsUpdateQuery = "UPDATE persons SET first_Name = ?, Middle_naem = ?, Family_name = ?, Date_of_birth = ?, Gender = ?, Phone = ?, Email = ?, Adress = ? WHERE SSN = ?";

    // Retrieve values from text fields
    String username = TextField_username.getText();
    String password = TextField_password.getText();
    String Repassword = TextField_Repassword.getText();
    String idPassport = TextField_Passport.getText();
    String ssn = TextField_SSN.getText();        
    
    
    String firstName = TextField_Firstname.getText();
    String middleName = TextField_MiddleName.getText();
    String lastName = TextField_Lastname.getText();
    String dateOfBirth = TextField_BirthDate.getText();
    String gender = TextField_Gender.getText();
    String phone = TextField_Phone.getText();
    String email = TextField_Email.getText();
    String address = TextField_Address.getText();
   
    
        if(password.equals(Repassword)){
    
         try {
             // ... Retrieve other values from text field
             
             // Update passengers table
             db.executePreparedStatement(passengersUpdateQuery, username, password, idPassport, ssn);
         } catch (SQLException ex) {
             Logger.getLogger(Admin_information.class.getName()).log(Level.SEVERE, null, ex);
         }

         try {
             // Update persons table
             db.executePreparedStatement(personsUpdateQuery, firstName, middleName, lastName, dateOfBirth, gender, phone, email, address, ssn);
             
             // Handle update success
             // ... (show success message, proceed to login)
         } catch (SQLException ex) {
             Logger.getLogger(Admin_information.class.getName()).log(Level.SEVERE, null, ex);
         }
        }         else { // Passwords don't match
    JOptionPane.showMessageDialog(this, "The passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
}
      

        al= new login();
        al.setVisible(true);
        al.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        al.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void TextField_LastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_LastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_LastnameActionPerformed

    private void TextField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_passwordActionPerformed

    private void TextField_MiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_MiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_MiddleNameActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_information().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel BirthDateLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel MiddleNameLabel;
    private javax.swing.JLabel PassportLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel Phonenumberlabel;
    private javax.swing.JLabel RePasswordLabel;
    private javax.swing.JLabel SSNLabel;
    private javax.swing.JTextField TextField_Address;
    private javax.swing.JTextField TextField_BirthDate;
    private javax.swing.JTextField TextField_Email;
    private javax.swing.JTextField TextField_Firstname;
    private javax.swing.JTextField TextField_Gender;
    private javax.swing.JTextField TextField_Lastname;
    private javax.swing.JTextField TextField_MiddleName;
    private javax.swing.JTextField TextField_Passport;
    private javax.swing.JTextField TextField_Phone;
    private javax.swing.JTextField TextField_Repassword;
    private javax.swing.JTextField TextField_SSN;
    private javax.swing.JTextField TextField_password;
    private javax.swing.JTextField TextField_username;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
