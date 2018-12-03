/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import internalframes.AgentHome;
import internalframes.AgentLimit;
import internalframes.Statement;
import java.awt.Color;

/**
 *
 * @author Zahid
 */
public class AgentFrame extends javax.swing.JFrame {

    /**
     * Creates new form AgentFrame
     */
    public AgentFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seperator1 = new javax.swing.JPanel();
        agentLabel = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        statementLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        limitsLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        logoutLabel = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signed in as Agent - PocketMoney");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        seperator1.setBackground(new java.awt.Color(250, 250, 250));
        seperator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        agentLabel.setBackground(new java.awt.Color(0, 153, 255));
        agentLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        agentLabel.setForeground(new java.awt.Color(255, 255, 255));
        agentLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        agentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_profle_1055000.png"))); // NOI18N
        agentLabel.setText(" Agent");
        agentLabel.setOpaque(true);

        homeLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_Streamline-18_185038.png"))); // NOI18N
        homeLabel.setText(" Home");
        homeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });

        statementLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        statementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statementLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_icon-62-document-table_314903.png"))); // NOI18N
        statementLabel.setText("Statement");
        statementLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statementLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statementLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statementLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statementLabelMouseExited(evt);
            }
        });

        limitsLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        limitsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limitsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_icon-61-warning_315935.png"))); // NOI18N
        limitsLabel.setText("Limits");
        limitsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limitsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limitsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limitsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limitsLabelMouseExited(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_logout_54231.png"))); // NOI18N
        logoutLabel.setText("Log Out");
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout seperator1Layout = new javax.swing.GroupLayout(seperator1);
        seperator1.setLayout(seperator1Layout);
        seperator1Layout.setHorizontalGroup(
            seperator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seperator1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel)
                .addGap(46, 46, 46))
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(seperator1Layout.createSequentialGroup()
                .addGroup(seperator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limitsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(seperator1Layout.createSequentialGroup()
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        seperator1Layout.setVerticalGroup(
            seperator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seperator1Layout.createSequentialGroup()
                .addComponent(agentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statementLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limitsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(logoutLabel)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seperator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        homeLabel.setForeground(Color.blue);
    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        homeLabel.setForeground(Color.black);
    }//GEN-LAST:event_homeLabelMouseExited

    private void statementLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statementLabelMouseEntered
        statementLabel.setForeground(Color.blue);
    }//GEN-LAST:event_statementLabelMouseEntered

    private void statementLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statementLabelMouseExited
        statementLabel.setForeground(Color.black);
    }//GEN-LAST:event_statementLabelMouseExited

    private void limitsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limitsLabelMouseEntered
        limitsLabel.setForeground(Color.blue);
    }//GEN-LAST:event_limitsLabelMouseEntered

    private void limitsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limitsLabelMouseExited
        limitsLabel.setForeground(Color.black);
    }//GEN-LAST:event_limitsLabelMouseExited

    private void logoutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseEntered
       logoutLabel.setForeground(Color.red);
    }//GEN-LAST:event_logoutLabelMouseEntered

    private void logoutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseExited
       logoutLabel.setForeground(Color.black);
    }//GEN-LAST:event_logoutLabelMouseExited

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(agh);
        agh.setVisible(true);
    }//GEN-LAST:event_homeLabelMouseClicked

    private void statementLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statementLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(st);
        st.setVisible(true);
    }//GEN-LAST:event_statementLabelMouseClicked

    private void limitsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limitsLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(agl);
        agl.setVisible(true);
    }//GEN-LAST:event_limitsLabelMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        this.dispose();
        l.setVisible(true);
    }//GEN-LAST:event_logoutLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    
    private AgentHome agh = new AgentHome();
    private Statement st = new Statement();
    private AgentLimit agl = new AgentLimit();
    private Login l = new Login();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agentLabel;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel limitsLabel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel seperator1;
    private javax.swing.JLabel statementLabel;
    // End of variables declaration//GEN-END:variables
}
