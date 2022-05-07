package Restaurant.src.my;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

//package my;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JWindow;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Connor
 */
public class mainUI extends javax.swing.JFrame {

    //holds employee pin from valid login 
    public static String emp_pin;

    /**
     * Creates new form mainUI
     */
    public mainUI(String _emp_pin) {
        this.emp_pin = _emp_pin;
        initComponents();
        labelOrderNo1.setText(String.valueOf(orderNo));
    }
    
    private void updatePane(String temp) throws BadLocationException{
        StyledDocument doc = paneOrder.getStyledDocument();
        SimpleAttributeSet left = new SimpleAttributeSet();
        StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
        doc.setParagraphAttributes(0, doc.getLength(), left, false);
        doc.insertString(doc.getLength(), temp+'\n', null);
            }
            
    private void updatePane1(String temp) throws BadLocationException{
        StyledDocument doc = paneOrder1.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), right, false);
        doc.insertString(doc.getLength(), temp+'\n', null);
            }            
            
        
     
    
    double total = 0;
    String output = null;
    private void updateTotal(double num) throws BadLocationException{
        StyledDocument doc = paneTotal.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        doc.setParagraphAttributes(0, doc.getLength(), right, false);
        
        
        total = total + num;
        Formatter formatter = new Formatter();
        formatter.format("%.2f", total);
        output = String.valueOf("$"+formatter);
        paneTotal.setText(null);
        doc.insertString(doc.getLength(), output, null);
        
    }
    
    private void custRewards(){
    String name = custRePane.showInputDialog( "Provide rewards number:" );
    custRePane.showMessageDialog(null, "Entered rewards number successfully.");
    ///REPLACE WITH CHECKING IF PHONE NUMBER IS VALID IN DATABASE
    System.out.println(name);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainBtn1 = new javax.swing.JButton();
        mainBtn2 = new javax.swing.JButton();
        mainBtn3 = new javax.swing.JButton();
        mainBtn4 = new javax.swing.JButton();
        mainBtn5 = new javax.swing.JButton();
        mainBtn6 = new javax.swing.JButton();
        mainBtn7 = new javax.swing.JButton();
        mainBtn8 = new javax.swing.JButton();
        mainBtn9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paneOrder = new javax.swing.JTextPane();
        labelCashier = new javax.swing.JLabel();
        labelOrderNo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paneTotal = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        paneOrder1 = new javax.swing.JTextPane();
        resetBtn = new javax.swing.JButton();
        finishBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        completeBtn1 = new javax.swing.JButton();
        labelOrderNo1 = new javax.swing.JLabel();
        custRePane = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        mainBtn1.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn1.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn1.setText("Burger");
        mainBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn1ActionPerformed(evt);
            }
        });

        mainBtn2.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn2.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn2.setText("Fries");
        mainBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn2ActionPerformed(evt);
            }
        });

        mainBtn3.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn3.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn3.setText("Coke");
        mainBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn3ActionPerformed(evt);
            }
        });

        mainBtn4.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn4.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn4.setText("Item 4");
        mainBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn4ActionPerformed(evt);
            }
        });

        mainBtn5.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn5.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn5.setText("Item 5");
        mainBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn5ActionPerformed(evt);
            }
        });

        mainBtn6.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn6.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn6.setText("Item 6");
        mainBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn6ActionPerformed(evt);
            }
        });

        mainBtn7.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn7.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn7.setText("Item 7");
        mainBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn7ActionPerformed(evt);
            }
        });

        mainBtn8.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn8.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn8.setText("Item 8");
        mainBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn8ActionPerformed(evt);
            }
        });

        mainBtn9.setBackground(new java.awt.Color(20, 20, 255));
        mainBtn9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mainBtn9.setForeground(new java.awt.Color(255, 255, 255));
        mainBtn9.setText("Item 9");
        mainBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtn9ActionPerformed(evt);
            }
        });

        paneOrder.setEditable(false);
        jScrollPane1.setViewportView(paneOrder);
        DatabaseUtility dbu = new DatabaseUtility();

        labelCashier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCashier.setText("Cashier: " + dbu.getEmployeeName(emp_pin));
        labelCashier.setAlignmentX(0.5F);
        

        labelOrderNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelOrderNo.setText("Order Number:");
        labelOrderNo.setAlignmentX(0.5F);

        paneTotal.setEditable(false);
        jScrollPane2.setViewportView(paneTotal);

        paneOrder1.setEditable(false);
        paneOrder1.setAutoscrolls(false);
        paneOrder1.setMinimumSize(new java.awt.Dimension(70, 400));
        paneOrder1.setPreferredSize(new java.awt.Dimension(50, 70));
        jScrollPane3.setViewportView(paneOrder1);

        resetBtn.setBackground(new java.awt.Color(255, 20, 20));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset Order");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        finishBtn.setBackground(new java.awt.Color(255, 20, 20));
        finishBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        finishBtn.setForeground(new java.awt.Color(255, 255, 255));
        finishBtn.setText("Finish Order");
        finishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        completeBtn1.setBackground(new java.awt.Color(255, 20, 20));
        completeBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        completeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        completeBtn1.setText("Rewards");
        completeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtn1ActionPerformed(evt);
            }
        });

        labelOrderNo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(mainBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(mainBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(mainBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(mainBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(mainBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(mainBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(completeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(finishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(custRePane, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelOrderNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(550, 550, 550)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCashier, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOrderNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(completeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custRePane, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void mainBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn1ActionPerformed
        try {
            updatePane("Burger");
            updatePane1("$14.99");
            updateTotal(14.99);
        } catch (BadLocationException ex) {
            Logger.getLogger(mainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mainBtn1ActionPerformed

    private void mainBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn2ActionPerformed
        try {
            updatePane("Fries");
            updatePane1("$4.99");
            updateTotal(4.99);
        } catch (BadLocationException ex) {
            Logger.getLogger(mainUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mainBtn2ActionPerformed

    private void mainBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn3ActionPerformed
        try {
            updatePane("Coke");
            updatePane1("$2.99");
            updateTotal(2.99);
        } catch (BadLocationException ex) {
            Logger.getLogger(mainUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mainBtn3ActionPerformed

    private void mainBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainBtn4ActionPerformed

    private void mainBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainBtn5ActionPerformed

    private void mainBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainBtn6ActionPerformed

    private void mainBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainBtn7ActionPerformed

    private void mainBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainBtn8ActionPerformed

    private void mainBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainBtn9ActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        paneTotal.setText(null);
        paneOrder.setText(null);
        paneOrder1.setText(null);
    }//GEN-LAST:event_resetBtnActionPerformed
    
    int orderNo = 1;
    private void finishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBtnActionPerformed
        orderNo += 1;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        try {
           
            String[] arryItems = (paneOrder.getText(0, paneOrder.getStyledDocument().getLength())).split("\n");
            String[] arryPrice = (paneOrder1.getText(0, paneOrder.getStyledDocument().getLength())).split("\n");
            for (int i = 0; i < arryPrice.length; i++){
               arryPrice[i] = arryPrice[i].replace("$", ""); 
            }
            
            ////////////////CUSTOMER RECEIPT ITEMS
            System.out.println(Arrays.toString(arryPrice)); 
            System.out.println(Arrays.toString(arryItems));
            System.out.println(formatter.format(date));
            System.out.println(orderNo);
            paneTotal.setText(null);
            paneOrder.setText(null);
            paneOrder1.setText(null);
            labelOrderNo1.setText(String.valueOf(orderNo));
            
            ////////////////KITCHEN RECEIPT ITEMS
            System.out.println(orderNo);
            System.out.println(Arrays.toString(arryItems));
            
             
        } catch (BadLocationException ex) {
            Logger.getLogger(mainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_finishBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        super.dispose();
        loginUI Info = new loginUI();
        Info.setTitle("Login");
        Info.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void completeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtn1ActionPerformed
        custRewards();
    }//GEN-LAST:event_completeBtn1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainUI(emp_pin).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeBtn1;
    private javax.swing.JOptionPane custRePane;
    private javax.swing.JButton finishBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCashier;
    private javax.swing.JLabel labelOrderNo;
    private javax.swing.JLabel labelOrderNo1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton mainBtn1;
    private javax.swing.JButton mainBtn2;
    private javax.swing.JButton mainBtn3;
    private javax.swing.JButton mainBtn4;
    private javax.swing.JButton mainBtn5;
    private javax.swing.JButton mainBtn6;
    private javax.swing.JButton mainBtn7;
    private javax.swing.JButton mainBtn8;
    private javax.swing.JButton mainBtn9;
    private javax.swing.JTextPane paneOrder;
    private javax.swing.JTextPane paneOrder1;
    private javax.swing.JTextPane paneTotal;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}
