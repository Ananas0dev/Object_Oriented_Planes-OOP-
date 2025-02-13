package Frames;

import java.awt.*;
import javax.swing.*;
import classes.*;
import java.sql.ResultSet;

/**
 *
 * @author anasg
 */
public class Traveler_boarding extends JFrame {
    
    Flight f = Flight.getInstance();
    Seats seat= Seats.getInstance();
    DB_manager db = new DB_manager();
    private static final float DEFAULT_TRANSPARENCY = 0.5f;
    /**
     * Creates new form Traveler_boarding
     */
    //programer instences
    
    

    
    
    public Traveler_boarding() {
        setIcon("/images/ico_oop.png");
        BG("/images/marcin-nowak-iXqTqC-f6jI-unsplash.jpeg");
        System.out.println("seat:"+ seat.toString()+"\n flight: "+ f.toString());
        
        System.out.println("methode: "+printBoarding());
        
        initComponents();
        jLabel1.setText(Person.getInstance().getFirstName()+" "+Person.getInstance().getFamilyName());
        jTextArea1.setText(printBoarding());
    }
     
   // public Traveler_boarding(Frame_home home,Traveler_chose_fligth TravelerReg,Traveler_info Traveleronfo) {//second constructor  calling it so when i we do dipose the rest objects must be deleted as will automatically (thsi my philosify not sure if this is how it actually work)
      //  setIcon();
      //  initComponents();

        
        
   //}
    
    
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

   
    public void setIcon(String imagePath){
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        setIconImage(icon.getImage());
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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boarding");

        jLabel2.setText("Boarding for Traveler : ");

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("New reservation");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       //just place a note later on that u can make an ccount to save informations of travelers or just continue as quet
        
       Traveler_chose_fligth nextframe = new Traveler_chose_fligth();
       nextframe.setVisible(true);
       nextframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       nextframe.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Traveler_boarding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traveler_boarding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traveler_boarding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traveler_boarding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traveler_boarding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
public String printBoarding(){
    String txt= "faild to retrive information.";
    String seat_identifier = seat.getSeatIdentifier();
    String flight_id = f.getIdFlights(), 
            Ticketid = " " , TravelDate = "", Arrival_time= "", origin= "", Destination="", luggage_id= "";
    double total_cost = 0;

    
            
    try{
        System.out.println("IN try");
        ResultSet rs = db.executeQuery("SELECT Departure_time,Arrival_time,origin,Destination,luggage_id,total_cost,Ticket_id FROM boardings where seat_identifier = '"+seat_identifier+"';");
        
        if(rs.next()){
            Ticketid =rs.getString(7) ;      // hard coded
            TravelDate = rs.getString(1) ;
            Arrival_time = rs.getString(2) ;
            origin = rs.getString(3) ;
            Destination = rs.getString(4) ;
            luggage_id = rs.getString(5) ;
            total_cost = rs.getDouble(6) ;
        }
    
    txt= "-Ticket: "+  Ticketid +"\n-Flight: " + flight_id +"\n-Departure"+ TravelDate +"\tLanding time: "+Arrival_time + 
         "-Orgin: "+ origin +"\tDestination: "+ Destination+"\n-Luggage: "+luggage_id+"\n-total amount: "+total_cost ;
        System.out.println(txt);
    }
    
    catch(Exception e){
        System.out.println(e);
        JOptionPane.showMessageDialog(null, e);
    }
    
    return txt;
}




}



/* db.executeQuery("SELECT Ticket_id FROM boardings where seat_identifier = '"+seat_identifier+"';").
db.executeQuery("select departure_time from flights where idFlights = '"+flight_id+"';")
db.executeQuery("select Arrival_time from flights where idFlights = '"+flight_id+"';")
db.executeQuery("select origin from flights where idFlights = '"+flight_id+"';")
db.executeQuery("select Destination from flights where idFlights = '"+flight_id+"';")
db.executeQuery("select luggage_id from flights where idFlights = '"+flight_id+"';")
db.executeQuery("select total_Cost from flights where idFlights = '"+flight_id+"';")

*/
