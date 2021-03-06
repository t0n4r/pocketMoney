/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalframes;

import frames.CashOutFrame;
import frames.MobileRechargeFrame;
import frames.PaymentFrame;
import frames.SendMoneyFrame;
import java.awt.Color;
import javax.swing.JOptionPane;
import users.Customer;

/**
 *
 * @author Zahid
 */
public class CustomerHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form customerHome
     */
    public CustomerHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendMoneyLabel = new javax.swing.JLabel();
        cashOutLabel = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
        checkBalanceLabel = new javax.swing.JLabel();
        mobileRechargeLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Customer Home Page - PocketMoney");

        sendMoneyLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        sendMoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sendMoneyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_017-money-4_3925444.png"))); // NOI18N
        sendMoneyLabel.setText("   Send Money");
        sendMoneyLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendMoneyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMoneyLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendMoneyLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendMoneyLabelMouseExited(evt);
            }
        });

        cashOutLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        cashOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cashOutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_024-purse_3925437.png"))); // NOI18N
        cashOutLabel.setText("   Cash Out");
        cashOutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cashOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashOutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cashOutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cashOutLabelMouseExited(evt);
            }
        });

        paymentLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        paymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paymentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_008-cashier_3925428.png"))); // NOI18N
        paymentLabel.setText("   Payment");
        paymentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentLabelMouseExited(evt);
            }
        });

        checkBalanceLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        checkBalanceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_013-budget_3925433.png"))); // NOI18N
        checkBalanceLabel.setText("   Check Balance");
        checkBalanceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBalanceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBalanceLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkBalanceLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkBalanceLabelMouseExited(evt);
            }
        });

        mobileRechargeLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        mobileRechargeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_014-smartphone_3925434.png"))); // NOI18N
        mobileRechargeLabel.setText("   Mobile Recharge");
        mobileRechargeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mobileRechargeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileRechargeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobileRechargeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobileRechargeLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobileRechargeLabel)
                    .addComponent(checkBalanceLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sendMoneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addComponent(cashOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paymentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(sendMoneyLabel)
                .addGap(18, 18, 18)
                .addComponent(cashOutLabel)
                .addGap(18, 18, 18)
                .addComponent(mobileRechargeLabel)
                .addGap(18, 18, 18)
                .addComponent(paymentLabel)
                .addGap(18, 18, 18)
                .addComponent(checkBalanceLabel)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setCustomer(Customer c) {
        curCustomer = c;
    }
    
    public Customer getCustomer() {
        return curCustomer;
    }
    
    private void sendMoneyLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMoneyLabelMouseEntered
        sendMoneyLabel.setForeground(Color.red);
    }//GEN-LAST:event_sendMoneyLabelMouseEntered

    private void sendMoneyLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMoneyLabelMouseExited
        sendMoneyLabel.setForeground(Color.black);
    }//GEN-LAST:event_sendMoneyLabelMouseExited

    private void sendMoneyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMoneyLabelMouseClicked
        SendMoneyFrame sm = new SendMoneyFrame();
        sm.setVisible(true);
    }//GEN-LAST:event_sendMoneyLabelMouseClicked

    private void cashOutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashOutLabelMouseEntered
        cashOutLabel.setForeground(Color.red);
    }//GEN-LAST:event_cashOutLabelMouseEntered

    private void cashOutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashOutLabelMouseExited
        cashOutLabel.setForeground(Color.black);
    }//GEN-LAST:event_cashOutLabelMouseExited

    private void cashOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashOutLabelMouseClicked
        CashOutFrame co = new CashOutFrame();
        co.setVisible(true);
        co.setCustomer(getCustomer());
    }//GEN-LAST:event_cashOutLabelMouseClicked

    private void mobileRechargeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeLabelMouseEntered
        mobileRechargeLabel.setForeground(Color.red);
    }//GEN-LAST:event_mobileRechargeLabelMouseEntered

    private void mobileRechargeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeLabelMouseExited
        mobileRechargeLabel.setForeground(Color.black);
    }//GEN-LAST:event_mobileRechargeLabelMouseExited

    private void mobileRechargeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeLabelMouseClicked
        MobileRechargeFrame mr = new MobileRechargeFrame();
        mr.setVisible(true);
        mr.setCustomer(getCustomer());
    }//GEN-LAST:event_mobileRechargeLabelMouseClicked

    private void paymentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseEntered
        paymentLabel.setForeground(Color.red);
    }//GEN-LAST:event_paymentLabelMouseEntered

    private void paymentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseExited
        paymentLabel.setForeground(Color.black);
    }//GEN-LAST:event_paymentLabelMouseExited

    private void paymentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseClicked
        PaymentFrame p = new PaymentFrame();
        p.setVisible(true);
    }//GEN-LAST:event_paymentLabelMouseClicked

    private void checkBalanceLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBalanceLabelMouseEntered
        checkBalanceLabel.setForeground(Color.red);
    }//GEN-LAST:event_checkBalanceLabelMouseEntered

    private void checkBalanceLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBalanceLabelMouseExited
        checkBalanceLabel.setForeground(Color.black);
    }//GEN-LAST:event_checkBalanceLabelMouseExited

    private void checkBalanceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBalanceLabelMouseClicked
       JOptionPane.showMessageDialog(null, "Current balance is Tk. " + getCustomer().getBalance());
    }//GEN-LAST:event_checkBalanceLabelMouseClicked

    private Customer curCustomer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cashOutLabel;
    private javax.swing.JLabel checkBalanceLabel;
    private javax.swing.JLabel mobileRechargeLabel;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JLabel sendMoneyLabel;
    // End of variables declaration//GEN-END:variables
}
