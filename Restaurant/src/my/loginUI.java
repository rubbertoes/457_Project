/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurant.src.my;

import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent; 

/**
 *
 * @author Connor
 */
public class loginUI extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantUI
     */
    public loginUI() {
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

        jPanel1 = new javax.swing.JPanel();
        pinBtn1 = new javax.swing.JButton();
        pinBtn2 = new javax.swing.JButton();
        pinBtn3 = new javax.swing.JButton();
        pinBtn4 = new javax.swing.JButton();
        pinBtn5 = new javax.swing.JButton();
        pinBtn6 = new javax.swing.JButton();
        pinBtn7 = new javax.swing.JButton();
        pinBtn8 = new javax.swing.JButton();
        pinBtn9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        paneLogin = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(80, 200, 255));
        setResizable(false);

        pinBtn1.setText("1");
        pinBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn1ActionPerformed(evt);
            }
        });

        pinBtn2.setText("2");
        pinBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn2ActionPerformed(evt);
            }
        });

        pinBtn3.setText("3");
        pinBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn3ActionPerformed(evt);
            }
        });

        pinBtn4.setText("4");
        pinBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn4ActionPerformed(evt);
            }
        });

        pinBtn5.setText("5");
        pinBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn5ActionPerformed(evt);
            }
        });

        pinBtn6.setText("6");
        pinBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn6ActionPerformed(evt);
            }
        });

        pinBtn7.setText("7");
        pinBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn7ActionPerformed(evt);
            }
        });

        pinBtn8.setText("8");
        pinBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn8ActionPerformed(evt);
            }
        });

        pinBtn9.setText("9");
        pinBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtn9ActionPerformed(evt);
            }
        });

        paneLogin.setEditable(false);
        paneLogin.setBackground(new java.awt.Color(255, 255, 255));
        paneLogin.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        paneLogin.setAutoscrolls(false);
        jScrollPane2.setViewportView(paneLogin);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pinBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(246, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(pinBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pinBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(pinBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(pinBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(pinBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(pinBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pinBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(pinBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pinBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(pinBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pinBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pinBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pinBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pinBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pinBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pinBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pinBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(142, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
	
	
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    
	
	
	
	
	
	
	
	
    private void update(String temp){
       
        StyledDocument doc = paneLogin.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        try {
            if (paneLogin.getStyledDocument().getText(0, doc.getLength()).length() < 3 ){
                //jTextPane1.getDocument().insertString(0, temp);
                
                try {
                    doc.insertString(doc.getLength(), temp, null);
                    
                    
                } catch (BadLocationException ex) {
                    Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                ////////////You can use the variable "text" to see what passcode was typed in///////////////////////////////////
                doc.insertString(doc.getLength(), temp, null);
                validator(paneLogin.getText());
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(loginUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void validator(String temp){       

        DatabaseUtility dbu = new DatabaseUtility();

        if(dbu.checkValidManager(temp)){                //if manager pin is entered open managerUI
            super.dispose();
            managerUI Info = new managerUI(temp);
            //Info.setTitle("Order");
            Info.setVisible(true);
        }

        else if (dbu.checkValidEmployee(temp)){         //else if cashier pin is entered, then open cashier UI
 
            super.dispose();
            mainUI Info = new mainUI(temp);
            Info.setTitle("Order");
            Info.setVisible(true);
            
            //loginPane.setText("Correct!");
			
        }
        
/* 
    Replace the below lines with 
    mysql database query for pin validation.
*/        
        else{  //FAILED PIN, no entry 
            paneLogin.setText(null);
        }
    }
    
    
    private void pinBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn1ActionPerformed
        // TODO add your handling code here:
        update("1");
    }//GEN-LAST:event_pinBtn1ActionPerformed
	
	private void pinBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn2ActionPerformed
        // TODO add your handling code here:
        update("2");
    }//GEN-LAST:event_pinBtn2ActionPerformed
	
    private void pinBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn3ActionPerformed
        // TODO add your handling code here:
        update("3");
    }//GEN-LAST:event_pinBtn3ActionPerformed

    private void pinBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn4ActionPerformed
        // TODO add your handling code here:
        update("4");
    }//GEN-LAST:event_pinBtn4ActionPerformed

    private void pinBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn5ActionPerformed
        // TODO add your handling code here:
        update("5");
    }//GEN-LAST:event_pinBtn5ActionPerformed

    private void pinBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn6ActionPerformed
        // TODO add your handling code here:
        update("6");
    }//GEN-LAST:event_pinBtn6ActionPerformed

    private void pinBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn7ActionPerformed
        // TODO add your handling code here:
        update("7");
    }//GEN-LAST:event_pinBtn7ActionPerformed

    private void pinBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn8ActionPerformed
        // TODO add your handling code here:
        update("8");
    }//GEN-LAST:event_pinBtn8ActionPerformed

    private void pinBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtn9ActionPerformed
        // TODO add your handling code here:
        update("9");
    }//GEN-LAST:event_pinBtn9ActionPerformed


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
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginUI window = new loginUI();
                window.setTitle("Login");
                window.setVisible(true);
                
                
                

                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane paneLogin;
    private javax.swing.JButton pinBtn1;
    private javax.swing.JButton pinBtn2;
    private javax.swing.JButton pinBtn3;
    private javax.swing.JButton pinBtn4;
    private javax.swing.JButton pinBtn5;
    private javax.swing.JButton pinBtn6;
    private javax.swing.JButton pinBtn7;
    private javax.swing.JButton pinBtn8;
    private javax.swing.JButton pinBtn9;
    // End of variables declaration//GEN-END:variables

}
