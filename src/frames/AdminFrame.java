/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import internalframes.CustomerDetails;
import internalframes.UserList;
import internalframes.DailyLog;
import internalframes.MoneyDistribution;
import internalframes.Report;
import internalframes.Reward;
import internalframes.TopUsers;
import java.awt.Color;
import users.Admin;

/**
 *
 * @author Zahid
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        seperator1 = new javax.swing.JPanel();
        adminLabel = new javax.swing.JLabel();
        customerDetailsLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        reportLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        logoutLabel = new javax.swing.JLabel();
        userListLabel = new javax.swing.JLabel();
        topUsersLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        distributeLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        giveRewardLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signed in as Admin - PocketMoney");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        seperator1.setBackground(new java.awt.Color(250, 250, 250));

        adminLabel.setBackground(new java.awt.Color(0, 153, 255));
        adminLabel.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_profle_1055000.png"))); // NOI18N
        adminLabel.setText(" Admin");
        adminLabel.setOpaque(true);

        customerDetailsLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        customerDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerDetailsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_icon-53-notebook-list_314893.png"))); // NOI18N
        customerDetailsLabel.setText("Customer Details");
        customerDetailsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerDetailsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerDetailsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerDetailsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerDetailsLabelMouseExited(evt);
            }
        });

        reportLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        reportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_icon-62-document-table_314903.png"))); // NOI18N
        reportLabel.setText("Report");
        reportLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportLabelMouseExited(evt);
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

        userListLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        userListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userListLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_misc-_user_1276843.png"))); // NOI18N
        userListLabel.setText(" User list");
        userListLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userListLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userListLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userListLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userListLabelMouseExited(evt);
            }
        });

        topUsersLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        topUsersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topUsersLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_icon-67-document-graph_314908.png"))); // NOI18N
        topUsersLabel.setText("Top users");
        topUsersLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topUsersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topUsersLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                topUsersLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                topUsersLabelMouseExited(evt);
            }
        });

        distributeLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        distributeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distributeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_025-economy_3925402.png"))); // NOI18N
        distributeLabel.setText(" Distribute Money");
        distributeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        distributeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                distributeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                distributeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                distributeLabelMouseExited(evt);
            }
        });

        giveRewardLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        giveRewardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        giveRewardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconfinder_Badge_Reward_Medal_Favorite_Star_1654355.png"))); // NOI18N
        giveRewardLabel.setText("Give Reward");
        giveRewardLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        giveRewardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giveRewardLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                giveRewardLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                giveRewardLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout seperator1Layout = new javax.swing.GroupLayout(seperator1);
        seperator1.setLayout(seperator1Layout);
        seperator1Layout.setHorizontalGroup(
            seperator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seperator1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel)
                .addGap(46, 46, 46))
            .addGroup(seperator1Layout.createSequentialGroup()
                .addComponent(distributeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(seperator1Layout.createSequentialGroup()
                .addGroup(seperator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topUsersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giveRewardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator6)
            .addGroup(seperator1Layout.createSequentialGroup()
                .addComponent(customerDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        seperator1Layout.setVerticalGroup(
            seperator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seperator1Layout.createSequentialGroup()
                .addComponent(adminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userListLabel)
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerDetailsLabel)
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topUsersLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(distributeLabel)
                .addGap(16, 16, 16)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giveRewardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(logoutLabel)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addComponent(seperator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setAdmin(Admin admin) {
        curAdmin = admin;
    }
    
    public Admin getAdmin() {
        return curAdmin;
    }
    
    private void userListLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListLabelMouseEntered
        userListLabel.setForeground(Color.blue);
    }//GEN-LAST:event_userListLabelMouseEntered

    private void userListLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListLabelMouseExited
        userListLabel.setForeground(Color.black);
    }//GEN-LAST:event_userListLabelMouseExited

    private void customerDetailsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsLabelMouseEntered
        customerDetailsLabel.setForeground(Color.blue);
    }//GEN-LAST:event_customerDetailsLabelMouseEntered

    private void customerDetailsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsLabelMouseExited
        customerDetailsLabel.setForeground(Color.black);
    }//GEN-LAST:event_customerDetailsLabelMouseExited

    private void reportLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseEntered
        reportLabel.setForeground(Color.blue);
    }//GEN-LAST:event_reportLabelMouseEntered

    private void reportLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseExited
        reportLabel.setForeground(Color.black);
    }//GEN-LAST:event_reportLabelMouseExited

    private void topUsersLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topUsersLabelMouseEntered
        topUsersLabel.setForeground(Color.blue);
    }//GEN-LAST:event_topUsersLabelMouseEntered

    private void topUsersLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topUsersLabelMouseExited
        topUsersLabel.setForeground(Color.black);
    }//GEN-LAST:event_topUsersLabelMouseExited

    private void distributeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distributeLabelMouseEntered
        distributeLabel.setForeground(Color.blue);
    }//GEN-LAST:event_distributeLabelMouseEntered

    private void distributeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distributeLabelMouseExited
        distributeLabel.setForeground(Color.black);
    }//GEN-LAST:event_distributeLabelMouseExited

    private void giveRewardLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giveRewardLabelMouseEntered
        giveRewardLabel.setForeground(Color.blue);
    }//GEN-LAST:event_giveRewardLabelMouseEntered

    private void giveRewardLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giveRewardLabelMouseExited
        giveRewardLabel.setForeground(Color.black);
    }//GEN-LAST:event_giveRewardLabelMouseExited

    private void logoutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseEntered
        logoutLabel.setForeground(Color.red);
    }//GEN-LAST:event_logoutLabelMouseEntered

    private void logoutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseExited
        logoutLabel.setForeground(Color.black);
    }//GEN-LAST:event_logoutLabelMouseExited

    private void userListLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(ul);
        ul.setVisible(true);
    }//GEN-LAST:event_userListLabelMouseClicked

    private void customerDetailsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(cd);
        cd.setVisible(true);
    }//GEN-LAST:event_customerDetailsLabelMouseClicked

    private void topUsersLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topUsersLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(tu);
        tu.setVisible(true);
    }//GEN-LAST:event_topUsersLabelMouseClicked

    private void distributeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distributeLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(dbm);
        dbm.setVisible(true);
    }//GEN-LAST:event_distributeLabelMouseClicked

    private void giveRewardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giveRewardLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(r);
        r.setVisible(true);
    }//GEN-LAST:event_giveRewardLabelMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void reportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseClicked
        desktopPane.removeAll();
        desktopPane.add(rp);
        rp.setVisible(true);
    }//GEN-LAST:event_reportLabelMouseClicked

    public void setId(String id) {
        adminLabel.setText(id);
    }
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }
    
    private Admin curAdmin;
    private Login lg = new Login();
    private UserList ul = new UserList();
    private CustomerDetails cd = new CustomerDetails();
    private DailyLog dl = new DailyLog();
    private MoneyDistribution dbm = new MoneyDistribution();
    private TopUsers tu = new TopUsers();
    private Reward r = new Reward();
    private Report rp = new Report();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel customerDetailsLabel;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel distributeLabel;
    private javax.swing.JLabel giveRewardLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel seperator1;
    private javax.swing.JLabel topUsersLabel;
    private javax.swing.JLabel userListLabel;
    // End of variables declaration//GEN-END:variables
}
