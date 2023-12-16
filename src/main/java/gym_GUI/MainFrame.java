/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gym_GUI;

import Members.Coach;
import Members.Participant;
import Members.Profile;
import Members.User;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class MainFrame extends javax.swing.JFrame {
    static MainFrame frame;
    public static ArrayList<User> users=new ArrayList<>();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        users=loadUsersFromFile();

        setTitle("GymWorkoutPlannerAndTracker");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(177, 158, 186));
        try {
        BufferedImage bufferImg = ImageIO.read(new File("Cover.png"));

        Image target_img1 = bufferImg.getScaledInstance(coverLabel.getWidth(), coverLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(target_img1);
        coverLabel.setIcon(imageIcon);        
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading image");            
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }            
        });
 
    }
    private void formWindowClosing(WindowEvent evt) {  
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to save all changes on File?","save and Exit",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            saveUsersToFile();
            JOptionPane.showMessageDialog(this,"Thank you for use our SYSTEM, ALL CHANGES IS SAVED","Message",JOptionPane.INFORMATION_MESSAGE); 
        }
        else{
            JOptionPane.showMessageDialog(this,"Thank you for use our SYSTEM, ALL CHANGES NOT SAVED","Message",JOptionPane.INFORMATION_MESSAGE); 
        }
        
    }
    public static void saveUsersToFile() {
        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("users.ser")));
            ObjectOutputStream oos = new ObjectOutputStream(dos);
            oos.writeObject(users); //save it to file
            dos.flush();
            dos.close();

        } catch (FileNotFoundException fe) {
            System.out.println(fe.getStackTrace());
        } catch (IOException ioe) {
            System.out.println(ioe.getStackTrace());
        }
    }

    private static ArrayList<User> loadUsersFromFile() {
        try {
            File file = new File("users.ser");
            if (!file.exists()) {
                ArrayList<User> list = new ArrayList<>(); //create list
                //create dummy objects to test the program
                Participant p1=new Participant("Ahmed Alghamdi", "ahmed", "12345", new Profile("Height: 170 cm, Weight:120 KG, no Disease, Over Weight, SMOKING ", "", 0));
                Participant p2=new Participant("Khaled Alnaser", "khaled", "12345", new Profile("Height: 180 cm, Weight:90 KG, has diabetes, Normal, (NOT) SMOKING", "", 0));
                List<Participant> parts=new ArrayList<>();
                parts.add(p1);
                parts.add(p2);
                list.add(p1);
                list.add(p2);
                Coach c=new Coach("Big Rami", "rami", "12345", new Profile("Buidy Building", "Mester Olombya", 0), 10, parts);
                p1.selectCoach(c);
                p2.selectCoach(c);
                list.add(c);
                //crate  orders and save it to File 
                DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("users.ser")));
                ObjectOutputStream oos = new ObjectOutputStream(dos);
                oos.writeObject(list); //save it to file
                dos.flush();
                dos.close();
                return list;
            } else {
                BufferedInputStream buffInputS = new BufferedInputStream(new FileInputStream("users.ser"));
                ObjectInputStream in = new ObjectInputStream(buffInputS);
                ArrayList<User> list = (ArrayList<User>) in.readObject();
                in.close();
                buffInputS.close();
                return list;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coverLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coverLabel.setBackground(new java.awt.Color(102, 255, 153));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jButton1.setForeground(java.awt.Color.lightGray);
        jButton1.setActionCommand("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setLabel("Sign Up");
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jButton2.setForeground(java.awt.Color.lightGray);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setLabel("Sign In");
        jButton2.setName(""); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SingupFrame frame =new SingupFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame log=new LoginFrame();
        log.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               frame= new MainFrame();
               frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coverLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
