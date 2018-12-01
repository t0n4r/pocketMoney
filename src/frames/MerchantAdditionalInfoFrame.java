/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.awt.Color;
/**
 *
 * @author Zahid
 */
public class MerchantAdditionalInfoFrame extends javax.swing.JFrame {

    /**
     * Creates new form MerchantAdditionalInfoFrame
     */
    public MerchantAdditionalInfoFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();
        businessInstitutionLabel = new javax.swing.JLabel();
        businessnInstitutionText = new javax.swing.JTextField();
        businessTypeLabel = new javax.swing.JLabel();
        terminalIdText = new javax.swing.JTextField();
        terminalIdLabel = new javax.swing.JLabel();
        BusinessTypeComboBox = new javax.swing.JComboBox<>();
        completeSignupLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Complete Signup - PocketMoney");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(250, 250, 250));

        backLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("D:\\PocketMoney\\src\\images\\if_Rewind_2001873.png")); // NOI18N
        backLabel.setText("Back");
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
        });

        businessInstitutionLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        businessInstitutionLabel.setText("Enter Business Institution name: ");

        businessTypeLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        businessTypeLabel.setText("Select Business Institution type:");

        terminalIdLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        terminalIdLabel.setText("Enter terminal ID: ");

        BusinessTypeComboBox.setBackground(new java.awt.Color(250, 250, 250));
        BusinessTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grocery Store", "Fast Food or Restaurant", "Hardware Store", "Computer Parts Retailer", "Shopping Mall" }));
        BusinessTypeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        completeSignupLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        completeSignupLabel.setIcon(new javax.swing.ImageIcon("D:\\PocketMoney\\src\\images\\if_free-29_618316.png")); // NOI18N
        completeSignupLabel.setText("Complete Sign Up");
        completeSignupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        completeSignupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                completeSignupLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                completeSignupLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabel))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(completeSignupLabel)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(terminalIdLabel)
                                .addComponent(businessInstitutionLabel)
                                .addComponent(businessnInstitutionText)
                                .addComponent(businessTypeLabel)
                                .addComponent(terminalIdText)
                                .addComponent(BusinessTypeComboBox, 0, 275, Short.MAX_VALUE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel)
                .addGap(40, 40, 40)
                .addComponent(businessInstitutionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(businessnInstitutionText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(businessTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BusinessTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminalIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminalIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(completeSignupLabel)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        this.dispose();
        SignUp s = new SignUp();
        s.setVisible(true);
    }//GEN-LAST:event_backLabelMouseClicked

    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseEntered
        backLabel.setForeground(Color.blue);
    }//GEN-LAST:event_backLabelMouseEntered

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        backLabel.setForeground(Color.black);
    }//GEN-LAST:event_backLabelMouseExited

    private void completeSignupLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeSignupLabelMouseEntered
        completeSignupLabel.setForeground(Color.blue);
    }//GEN-LAST:event_completeSignupLabelMouseEntered

    private void completeSignupLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeSignupLabelMouseExited
        completeSignupLabel.setForeground(Color.black);
    }//GEN-LAST:event_completeSignupLabelMouseExited

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
            java.util.logging.Logger.getLogger(MerchantAdditionalInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MerchantAdditionalInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MerchantAdditionalInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MerchantAdditionalInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MerchantAdditionalInfoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BusinessTypeComboBox;
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel businessInstitutionLabel;
    private javax.swing.JLabel businessTypeLabel;
    private javax.swing.JTextField businessnInstitutionText;
    private javax.swing.JLabel completeSignupLabel;
    private javax.swing.JLabel terminalIdLabel;
    private javax.swing.JTextField terminalIdText;
    // End of variables declaration//GEN-END:variables
}
