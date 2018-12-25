package nerdgame;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aggeliki
 */
public class LoginGUI extends javax.swing.JFrame {

  public static String un=new String(); //username
  
  //initialize connections with database
  Connection con = null;
  ResultSet rs = null;
  PreparedStatement pst = null;
    public LoginGUI() {
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
        jLabel3 = new javax.swing.JLabel();
        UsernameFieldUser = new javax.swing.JTextField();
        PasswordFieldUser = new javax.swing.JPasswordField();
        ConnectButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(350, 500));
        setPreferredSize(new java.awt.Dimension(350, 500));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 240, 70, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 320, 80, 30);

        UsernameFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldUserActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameFieldUser);
        UsernameFieldUser.setBounds(190, 250, 100, 20);

        PasswordFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldUserActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordFieldUser);
        PasswordFieldUser.setBounds(190, 330, 100, 20);

        ConnectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/Connect_Button_Default.png"))); // NOI18N
        ConnectButton.setBorderPainted(false);
        ConnectButton.setContentAreaFilled(false);
        ConnectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConnectButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConnectButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConnectButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ConnectButtonMouseReleased(evt);
            }
        });
        ConnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConnectButton);
        ConnectButton.setBounds(190, 420, 90, 30);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login/Back_Default.png"))); // NOI18N
        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackButtonMouseReleased(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(30, 420, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TestLogo2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, -20, 310, 200);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mathematics-wallpaper.png"))); // NOI18N
        Background.setMinimumSize(new java.awt.Dimension(350, 500));
        Background.setPreferredSize(new java.awt.Dimension(350, 500));
        getContentPane().add(Background);
        Background.setBounds(-6, -6, 410, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //get text from user's interaction
    private void PasswordFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldUserActionPerformed
        String password = PasswordFieldUser.getText();
    }//GEN-LAST:event_PasswordFieldUserActionPerformed

    private void UsernameFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldUserActionPerformed
        String username = UsernameFieldUser.getText();
    }//GEN-LAST:event_UsernameFieldUserActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        //back button
        dispose();
        GUI gui = new GUI();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        
        gui.setSize(350, 500);
        
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectButtonActionPerformed
        // Connect Button
        
        //Waiting results from user's interface
        
        String username = UsernameFieldUser.getText();
        String password = PasswordFieldUser.getText();
        
        un = username; // un = global 
        
        //check for empty textfields
        if( username.isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Username error");
        }
        else if(password.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Password error");
        }
        else{
        //setVisible(false);
        
        String sql = "Select * from user where Username=? and Password=?";
        
            try
            {
            
                //Check for results in the database

                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull","root","8520");
                pst = con.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2,password);
                rs = pst.executeQuery();
                if(rs.next())
                    {
                    dispose();
                    ModeGUI modegui = new ModeGUI();
                    modegui.setVisible(true);

                    modegui.setSize(400, 500);
                    modegui.setLocationRelativeTo(null);

                    modegui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                else//check if the specifies exist in the database
                    {
                    JOptionPane.showMessageDialog(null, "Username and password not matched");
                    }
            }
            catch(Exception e)
                {
                JOptionPane.showMessageDialog(null,"error "+e);
                }
            }
    }//GEN-LAST:event_ConnectButtonActionPerformed

    
    
    //IMAGES
    private void ConnectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectButtonMouseEntered
        ImageIcon cn = new ImageIcon(getClass().getResource("/Images/Login/Connect_Button_Hover.png"));
        ConnectButton.setIcon(cn);
    }//GEN-LAST:event_ConnectButtonMouseEntered

    private void ConnectButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectButtonMouseExited
        ImageIcon cn = new ImageIcon(getClass().getResource("/Images/Login/Connect_Button_Default.png"));
        ConnectButton.setIcon(cn);
    }//GEN-LAST:event_ConnectButtonMouseExited

    private void ConnectButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectButtonMousePressed
        ImageIcon cn = new ImageIcon(getClass().getResource("/Images/Login/Connect_Button_Pressed.png"));
        ConnectButton.setIcon(cn);
    }//GEN-LAST:event_ConnectButtonMousePressed

    private void ConnectButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectButtonMouseReleased
        ImageIcon cn = new ImageIcon(getClass().getResource("/Images/Login/Connect_Button_Hover.png"));
        ConnectButton.setIcon(cn);
    }//GEN-LAST:event_ConnectButtonMouseReleased

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        ImageIcon cn = new ImageIcon(getClass().getResource("/Images/Login/Back_hover.png"));
        BackButton.setIcon(cn);
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        ImageIcon cn = new ImageIcon(getClass().getResource("/Images/Login/Back_Default.png"));
        BackButton.setIcon(cn);
    }//GEN-LAST:event_BackButtonMouseExited

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        ImageIcon cn = new ImageIcon(getClass().getResource("/Images/Login/Back_Pressed.png"));
        BackButton.setIcon(cn);
    }//GEN-LAST:event_BackButtonMousePressed

    private void BackButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseReleased
        ImageIcon cn = new ImageIcon(getClass().getResource("/Images/Login/Back_hover.png"));
        BackButton.setIcon(cn);
    }//GEN-LAST:event_BackButtonMouseReleased

    
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton ConnectButton;
    private javax.swing.JPasswordField PasswordFieldUser;
    private javax.swing.JTextField UsernameFieldUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
