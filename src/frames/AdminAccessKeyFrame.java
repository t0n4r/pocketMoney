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
public class AdminAccessKeyFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminAccessKeyFrame
     */
    public AdminAccessKeyFrame() {
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
        completeSignupLabel = new javax.swing.JLabel();
        accessKeyLabel = new javax.swing.JLabel();
        accessKeyPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Complete Signup - PocketMoney");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(250, 250, 250));

        backLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_Rewind_2001873.png"))); // NOI18N
        backLabel.setText("Back");
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

        completeSignupLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        completeSignupLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_free-29_618316.png"))); // NOI18N
        completeSignupLabel.setText("Complete Signup");
        completeSignupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                completeSignupLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                completeSignupLabelMouseExited(evt);
            }
        });

        accessKeyLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        accessKeyLabel.setText("Enter Access Key: ");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accessKeyPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backLabel))
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(completeSignupLabel)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addComponent(accessKeyLabel)
                                    .addGap(160, 160, 160))))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel)
                .addGap(39, 39, 39)
                .addComponent(accessKeyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accessKeyPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completeSignupLabel)
                .addContainerGap(60, Short.MAX_VALUE))
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

    private void completeSignupLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeSignupLabelMouseEntered
        completeSignupLabel.setForeground(Color.blue);
    }//GEN-LAST:event_completeSignupLabelMouseEntered

    private void completeSignupLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeSignupLabelMouseExited
        completeSignupLabel.setForeground(Color.black);
    }//GEN-LAST:event_completeSignupLabelMouseExited

    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseEntered
        backLabel.setForeground(Color.blue);
    }//GEN-LAST:event_backLabelMouseEntered

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        backLabel.setForeground(Color.black);
    }//GEN-LAST:event_backLabelMouseExited

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        this.dispose();
        SignUp s = new SignUp();
        s.setVisible(true);
    }//GEN-LAST:event_backLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accessKeyLabel;
    private javax.swing.JPasswordField accessKeyPasswordField;
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel completeSignupLabel;
    // End of variables declaration//GEN-END:variables
}
