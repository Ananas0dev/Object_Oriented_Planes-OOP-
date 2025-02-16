package Frames;

import java.awt.*;
import javax.swing.*;
import classes.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anasg
 */
public class Traveler_info extends javax.swing.JFrame {
    
    DB_manager db = new DB_manager();
    private static final float DEFAULT_TRANSPARENCY = 0.5f;
    Book_seat seat_window; //jframe
    Passenger passenger =null ;
    Person person = null;
    
    
    private String ssn, F_name , M_name, L_name, gender, phone, email , address,idPassport; 
    private LocalDate dob;
    private String dob_S;
    /**
     * Creates new form Traveler_info
     */
    
    //programer instences
    
   // Traveler_chose_fligth TravelerReg ;
   // Frame_home home_frame;
    
    
    public Traveler_info( ) {
        setIcon();
        BG("/images/michael-parulava-L4jrg4c7928-unsplash.jpeg");
        initComponents();
        Flight f = Flight.getInstance();
        jLabel6.setText(jLabel6.getText() +" "+f.getIdFlights());
        
    }
//    public Traveler_info(int num) {
//        this.passenges_num = num;
//        setIcon();
//        BG("/images/michael-parulava-L4jrg4c7928-unsplash.jpeg");
//        initComponents();
//        
//    }
   
     public void BG(String imagePath){
            JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, DEFAULT_TRANSPARENCY));

                // Load image (error handling can be added)
                ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
                Image image = imageIcon.getImage();

                int imageWidth = image.getWidth(null);
                int imageHeight = image.getHeight(null);

                // Tile or scale the image to fit the panel (optional customization)
                int panelWidth = getWidth();
                int panelHeight = getHeight();
                for (int y = 0; y < panelHeight; y += imageHeight) {
                    for (int x = 0; x < panelWidth; x += imageWidth) {
                        g2d.drawImage(image, x, y, this);
                    }
                }
            }
            

            }; 
            
            backgroundPanel.setOpaque(false); // Make panel transparent

        // Add your other components to the background panel here

        setContentPane(backgroundPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // Adjust frame size if needed
        setLocationRelativeTo(null); // Center the frame on screen
        setVisible(true);
    }

   
    public void setIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/ico_oop.png"));
        setIconImage(icon.getImage());
        BackgroundPanel backgroundPanel = new BackgroundPanel("/images/ico_oop.png");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        f_name_txt = new javax.swing.JTextField();
        id_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dob_txt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        s_name_txt = new javax.swing.JTextField();
        l_name_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ssn_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        phone_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        assress_txt = new javax.swing.JTextField();
        B_update_info = new javax.swing.JButton();
        CheckBox = new javax.swing.JCheckBox();
        Button_to_boarding = new javax.swing.JButton();
        Button_to_frame_traveler_reg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        B_to_seat_frame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travelers regestration");

        jLabel2.setText("First Name:");

        jLabel3.setText("Passport ID: ");

        id_txt.setText(" ");
        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });

        jLabel7.setText("Birth date: ");

        dob_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_txtActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel8.setText("Gender:");

        jLabel9.setText("Second name:");

        jLabel10.setText("Last name");

        jLabel11.setText("SSN:");

        ssn_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssn_txtActionPerformed(evt);
            }
        });

        jLabel12.setText("phone:");

        jLabel13.setText("email: ");

        jLabel14.setText("Address:");

        B_update_info.setText("Confirm");
        B_update_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_update_infoActionPerformed(evt);
            }
        });

        CheckBox.setText("Not your fist time?");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(B_update_info)
                        .addGap(0, 374, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(assress_txt)
                            .addComponent(dob_txt)
                            .addComponent(ssn_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(f_name_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(s_name_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(id_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(phone_txt))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l_name_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(email_txt)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(f_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(s_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8))
                            .addComponent(ssn_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(dob_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(assress_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_update_info)
                    .addComponent(CheckBox))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Button_to_boarding.setText("Continue to payment");
        Button_to_boarding.setEnabled(false);
        Button_to_boarding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_to_boardingActionPerformed(evt);
            }
        });

        Button_to_frame_traveler_reg.setText("cancel");
        Button_to_frame_traveler_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_to_frame_traveler_regActionPerformed(evt);
            }
        });

        jLabel6.setText("current flight number:");

        B_to_seat_frame.setText("book seats");
        B_to_seat_frame.setEnabled(false);
        B_to_seat_frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_to_seat_frameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_to_seat_frame)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Button_to_frame_traveler_reg)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button_to_boarding))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_to_seat_frame)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_to_frame_traveler_reg)
                    .addComponent(Button_to_boarding))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_to_frame_traveler_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_to_frame_traveler_regActionPerformed
        Traveler_chose_fligth TravelerReg= new Traveler_chose_fligth();
        TravelerReg.setVisible(true);
        TravelerReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TravelerReg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Button_to_frame_traveler_regActionPerformed

    private void Button_to_boardingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_to_boardingActionPerformed
            

      
    
        pay Travelerpayment = new pay();   // home_frame,TravelerReg,this)@anas i am making a chain to save the frames     
        Travelerpayment.setVisible(true);
        Travelerpayment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Travelerpayment.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_Button_to_boardingActionPerformed

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void B_to_seat_frameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_to_seat_frameActionPerformed
       this.setEnabled(false);
       seat_window = new Book_seat(this,Button_to_boarding);
       
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       int x = (screenSize.width - seat_window.getWidth()) / 2;
       int y = (screenSize.height - seat_window.getHeight()) / 2;

       seat_window.setLocation(x, y);
       seat_window.setVisible(true);
       seat_window.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
       
       
    }//GEN-LAST:event_B_to_seat_frameActionPerformed

    private void dob_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob_txtActionPerformed

    private void ssn_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssn_txtActionPerformed
       if(CheckBox.isSelected()){
           String t_ssn = ssn_txt.getText();
           try{
               readPerson(t_ssn);
               passenger = Passenger.getInstance();
               person = Person.getInstance();
                   
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
               System.out.println(e);
           }
             
           f_name_txt.setText(person.getFirstName()); s_name_txt.setText(person.getMiddleName()); l_name_txt.setText(person.getFamilyName());
           ssn_txt.setText(person.getSsn()); dob_txt.setText(person.getDateOfBirth()); phone_txt.setText(person.getPhone());
           email_txt.setText(person.getEmail()); assress_txt.setText(person.getAddress()); id_txt.setText(passenger.getIdPassport());
           
           if(person.getGender() == "Male" |person.getGender() ==  "male"|passenger.getGender() == "M" ){
               jComboBox1.setSelectedIndex(0);
           }
           else{
               jComboBox1.setSelectedIndex(1);
           }
       }
       
    }//GEN-LAST:event_ssn_txtActionPerformed

    private void B_update_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_update_infoActionPerformed
         boolean succes = true;
         
         if(CheckBox.isSelected()){
             
          
                 Passenger p = new Passenger(id_txt.getText(),ssn_txt.getText(), f_name_txt.getText(), s_name_txt.getText(), l_name_txt.getText(),
                         dob_txt.getText(),  jComboBox1.getSelectedItem().toString(), phone_txt.getText(), email_txt.getText(), assress_txt.getText());
                 
                 p.createIstance(id_txt.getText(),ssn_txt.getText(), f_name_txt.getText(), s_name_txt.getText(), l_name_txt.getText(),
                         dob_txt.getText(),  jComboBox1.getSelectedItem().toString(), phone_txt.getText(), email_txt.getText(), assress_txt.getText());
                 
                 
                 B_to_seat_frame.setEnabled(true);
             
             
         }
         else{         
            try{
                if(
                        !(f_name_txt.getText() == null | f_name_txt.getText().isEmpty() )
                      & (!(id_txt.getText() == null | id_txt.getText().isEmpty() ))    & validatePassport(id_txt.getText())
                      & (!(s_name_txt.getText() == null | s_name_txt.getText().isEmpty() ))       
                      & (!(dob_txt.getText() == null | dob_txt.getText().isEmpty() ))       
                      & (!(l_name_txt.getText() == null | l_name_txt.getText().isEmpty() ))
                      & (!(ssn_txt.getText() == null | ssn_txt.getText().isEmpty() )) & validateSSN(ssn_txt.getText())
                      & (!(phone_txt.getText() == null | phone_txt.getText().isEmpty() ))  & validatePhone(phone_txt.getText())
                      & (!(email_txt.getText() == null | email_txt.getText().isEmpty() ))    & isValidEmail(email_txt.getText())
                      & (!(assress_txt.getText() == null | assress_txt.getText().isEmpty() ))
                            ){///inside if

                        Passenger p = new Passenger(id_txt.getText(),ssn_txt.getText(), f_name_txt.getText(), s_name_txt.getText(), l_name_txt.getText(), 
                             dob_txt.getText(),  jComboBox1.getSelectedItem().toString(), phone_txt.getText(), email_txt.getText(), assress_txt.getText());

                        p.createIstance(id_txt.getText(),ssn_txt.getText(), f_name_txt.getText(), s_name_txt.getText(), l_name_txt.getText(), 
                             dob_txt.getText(),  jComboBox1.getSelectedItem().toString(), phone_txt.getText(), email_txt.getText(), assress_txt.getText());


                            if(succes){
                JOptionPane.showMessageDialog(null, "chose a seat and hit apply.");
            }
                        insertPassenger(p);
                        B_to_seat_frame.setEnabled(true);
                }//end if
                else if(!validateSSN(ssn_txt.getText())){
                JOptionPane.showMessageDialog(null, "Please enter correct SSN in XXX-XX-XXXX format ex:123-12-1234");
                succes = false;
            }
                else if(!isValidEmail(email_txt.getText())){
                    JOptionPane.showMessageDialog(null, "Please enter a valid E-mail");
                    succes = false;
                }
                else if (!validatePhone(phone_txt.getText())){
                    JOptionPane.showMessageDialog(null, "Please enter a valid Phone number.");
                    succes = false;
                }
                else if (!validatePassport(id_txt.getText())){
                    JOptionPane.showMessageDialog(null, "Please enter a valid ID_passport. it should be should be exactly 9  digits");
                    succes = false;
                }
                else
                JOptionPane.showMessageDialog(null, "Please fill all fields");
                succes = false;
            }

            catch (Exception e){
                succes = false;
                JOptionPane.showMessageDialog(null, "Error:" + e);
                e.printStackTrace();
            }
         }
        
    }//GEN-LAST:event_B_update_infoActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        if(CheckBox.isSelected()){
             f_name_txt.setEditable(false); id_txt.setEditable(false); s_name_txt.setEditable(false);dob_txt.setEditable(false);
             l_name_txt.setEditable(false); phone_txt.setEditable(false); email_txt.setEditable(false); assress_txt.setEditable(false);
             jComboBox1.setEnabled(false);
             
         }
        else{
        f_name_txt.setEditable(true); id_txt.setEditable(true); s_name_txt.setEditable(true);dob_txt.setEditable(true);
             l_name_txt.setEditable(true); phone_txt.setEditable(true); email_txt.setEditable(true); assress_txt.setEditable(true);
             jComboBox1.setEnabled(true);
    }
    }//GEN-LAST:event_CheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Traveler_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traveler_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traveler_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traveler_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traveler_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_to_seat_frame;
    private javax.swing.JButton B_update_info;
    private javax.swing.JButton Button_to_boarding;
    private javax.swing.JButton Button_to_frame_traveler_reg;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JTextField assress_txt;
    private javax.swing.JTextField dob_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField f_name_txt;
    private javax.swing.JTextField id_txt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField l_name_txt;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JTextField s_name_txt;
    private javax.swing.JTextField ssn_txt;
    // End of variables declaration//GEN-END:variables


//methodes defined by programmer
    
    
    private static LocalDate parseDate(String dateString) {
        DateTimeFormatter[] formatters = {
                DateTimeFormatter.ofPattern("yyyy-MM-dd")};

        for (DateTimeFormatter formatter : formatters) {
            try {
                return LocalDate.parse(dateString, formatter);
            } catch (DateTimeParseException e) {
                // Ignore exception and try the next format
            }
        }
        JOptionPane.showMessageDialog(null,"invalid Date");
        return null; // If none of the formats match
    }


public void insertPassenger(Passenger passenger) throws SQLException {
    String insertPersons = "INSERT INTO persons (ssn, first_Name, Middle_name, Family_name, Date_of_birth, gender, phone, email, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String insertPassengers = "INSERT INTO Passengers (idPassport, ssn) VALUES (? , ?)";
 
    try (PreparedStatement personsStmt = db.getConnection().prepareStatement(insertPersons);
         PreparedStatement passengersStmt = db.getConnection().prepareStatement(insertPassengers)) {

        // Set parameters for persons table (using prepared statement)
        personsStmt.setString(1, passenger.getSsn());
        personsStmt.setString(2, passenger.getFirstName());
        personsStmt.setString(3, passenger.getMiddleName());
        personsStmt.setString(4, passenger.getFamilyName());
        personsStmt.setString(5, passenger.getDateOfBirth());
        personsStmt.setString(6, passenger.getGender());
        personsStmt.setString(7, passenger.getPhone());
        personsStmt.setString(8, passenger.getEmail());
        personsStmt.setString(9, passenger.getAddress());

        // Set parameter for Passengers table
        passengersStmt.setString(1, passenger.getIdPassport());
        passengersStmt.setString(2, passenger.getSsn());

        // Execute the prepared statements for each table insertion
        personsStmt.executeUpdate();
        passengersStmt.executeUpdate();

        System.out.println("Passenger data inserted successfully!");
    }
}


// better update if ssn exicted
public Passenger readPassenger(String ssn) throws SQLException {
  
  String query = "SELECT * FROM persons p JOIN Passengers pg ON p.ssn = pg.ssn WHERE p.ssn = ?";
  db.connect();
  try (PreparedStatement stmt = db.getConnection().prepareStatement(query)) {
    stmt.setString(1, ssn);

    ResultSet rs = stmt.executeQuery();

    if (rs.next()) {
      // Create Person object with retrieved data
      passenger = new Passenger(
              
          rs.getString("idPassport"),
          rs.getString("ssn"),
          rs.getString("first_Name"),
          rs.getString("Middle_name"),
          rs.getString("Family_name"),
          rs.getString("Date_of_birth"),
          rs.getString("gender"),
          rs.getString("phone"),
          rs.getString("email"),
          rs.getString("address") // Assuming idPassport is from Passengers table
      );
      passenger.createInstance(
          rs.getString("idPassport"),
          rs.getString("ssn"),
          rs.getString("first_Name"),
          rs.getString("Middle_name"),    
          rs.getString("Family_name"),
          rs.getString("Date_of_birth"),
          rs.getString("gender"),
          rs.getString("phone"),
          rs.getString("email"),
          rs.getString("address")
          );
      
        System.out.println(passenger.toString()+"   -->saved in instance");
    } else {
      System.out.println("Passenger with SSN " + ssn + " not found.");
    }

    rs.close(); // Close the result set
    db.closeConnection();
  }

  return passenger;
}



public static boolean validateSSN(String ssn) {
  if (ssn == null || ssn.isEmpty()) {
    return false; // Empty SSN is not valid
  }
  
  // Check for valid format (XXX-XX-XXXX)
  Pattern pattern = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");
  Matcher matcher = pattern.matcher(ssn);
    System.out.println("ssn boolean: " +matcher.matches());
  return matcher.matches();
}

public static boolean isValidEmail(String email) {
  if (email == null || email.isEmpty()) {
    return false; // Empty email is not valid
  }
  
  // Check for "@" and "." characters
  int atIndex = email.indexOf('@');
  int dotIndex = email.lastIndexOf('.');
  System.out.println("E-,ail boolean: " +( atIndex > 0 && dotIndex > atIndex + 1));
  return atIndex > 0 && dotIndex > atIndex + 1;
}

public static boolean validatePhone(String phone) {
  if (phone == null || phone.isEmpty()) {
    return false; // Empty phone number is not valid
  }

  // Check for presence of only digits and "+" symbol
  Pattern pattern = Pattern.compile("^[+]?[0-9]+$");
  Matcher matcher = pattern.matcher(phone);
  return matcher.matches();
}

public static boolean validatePassport(String passport) {
  if (passport == null || passport.isEmpty()) {
    return false; // Empty passport number is not valid
  }
  
  // Check for length (adjust based on specific passport format)
  int passportLength = 9;
  if (passport.length() != passportLength) {
    return false;
  }
  
  // Check for alphanumeric characters
  for (char c : passport.toCharArray()) {
    if (!Character.isLetterOrDigit(c)) {
      return false;
    }
  }
  return true;
}

    private void readPerson(String ssn) {
        try{
        System.out.println("IN try");
        ResultSet rs = db.executeQuery("SELECT * FROM persons where ssn ='"+ssn+"';");
        ResultSet rs2 = db.executeQuery("SELECT idPassport FROM passengers where ssn ='"+ssn+"';");
        if(rs.next()|rs2.next()){
            System.out.println(rs2.getString(1)+ rs.getString(1)+ rs.getString(2)+ rs.getString(3)+
                    rs.getString(4)+ rs.getString(5)+ rs.getString(6)+ rs.getString(7)+ rs.getString(8)+ rs.getString(9));
             Passenger.createIstance(rs2.getString(1), rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
        }
            passenger = Passenger.getInstance();
            person = Person.getInstance();
            System.out.println(person.toString());
    }
    
    catch(Exception e){
        System.out.println(e);
        JOptionPane.showMessageDialog(null, e);
    }
    
        
        
    }
    

}

