/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalframes;

import frames.CashInFrame;
import frames.CustomerAccountCreateFrame;
import java.awt.Color;
import javax.swing.JOptionPane;
import users.Agent;

/**
 *
 * @author Zahid
 */
public class AgentHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form agentHome
     */
    public AgentHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkBalanceLabel = new javax.swing.JLabel();
        cashInLabel = new javax.swing.JLabel();
        createAccountLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Agent Home - PocketMoney");

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

        cashInLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        cashInLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cashInLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_014-smartphone_3925434.png"))); // NOI18N
        cashInLabel.setText("   Cash In");
        cashInLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cashInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashInLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cashInLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cashInLabelMouseExited(evt);
            }
        });

        createAccountLabel.setFont(new java.awt.Font("Gadugi", 1, 30)); // NOI18N
        createAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        createAccountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_003-id-card_3925423.png"))); // NOI18N
        createAccountLabel.setText("   Create CustomerAcc");
        createAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createAccountLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createAccountLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBalanceLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(createAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cashInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(createAccountLabel)
                .addGap(18, 18, 18)
                .addComponent(cashInLabel)
                .addGap(18, 18, 18)
                .addComponent(checkBalanceLabel)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setAgent(Agent agent){
        curAgent = agent;
    }
    
    public Agent getAgent() {
        return curAgent;
    }
    
    private void createAccountLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountLabelMouseEntered
        createAccountLabel.setForeground(Color.red);
    }//GEN-LAST:event_createAccountLabelMouseEntered

    private void createAccountLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountLabelMouseExited
        createAccountLabel.setForeground(Color.black);
    }//GEN-LAST:event_createAccountLabelMouseExited

    private void cashInLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashInLabelMouseEntered
        cashInLabel.setForeground(Color.red);
    }//GEN-LAST:event_cashInLabelMouseEntered

    private void cashInLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashInLabelMouseExited
        cashInLabel.setForeground(Color.black);
    }//GEN-LAST:event_cashInLabelMouseExited

    private void checkBalanceLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBalanceLabelMouseEntered
        checkBalanceLabel.setForeground(Color.red);
    }//GEN-LAST:event_checkBalanceLabelMouseEntered

    private void checkBalanceLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBalanceLabelMouseExited
        checkBalanceLabel.setForeground(Color.black);
    }//GEN-LAST:event_checkBalanceLabelMouseExited

    private void createAccountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountLabelMouseClicked
        CustomerAccountCreateFrame cAf = new CustomerAccountCreateFrame();
        cAf.setVisible(true);
    }//GEN-LAST:event_createAccountLabelMouseClicked

    private void cashInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashInLabelMouseClicked
        CashInFrame cIn = new CashInFrame();
        cIn.setVisible(true);
    }//GEN-LAST:event_cashInLabelMouseClicked

    private void checkBalanceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBalanceLabelMouseClicked
        JOptionPane.showMessageDialog(null, "Current balance is Tk. " + getAgent().getBalance());
    }//GEN-LAST:event_checkBalanceLabelMouseClicked


    private Agent curAgent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cashInLabel;
    private javax.swing.JLabel checkBalanceLabel;
    private javax.swing.JLabel createAccountLabel;
    // End of variables declaration//GEN-END:variables
}
