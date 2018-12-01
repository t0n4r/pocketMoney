/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalframes;

/**
 *
 * @author Zahid
 */
public class MoneyDistribution extends javax.swing.JInternalFrame {

    /**
     * Creates new form DistributeMoney
     */
    public MoneyDistribution() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        amountLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        agentListTextArea = new javax.swing.JTextArea();
        amountText2 = new javax.swing.JTextField();
        distributeButton2 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        selectMenu = new javax.swing.JMenu();
        agentArrayListMenuItem = new javax.swing.JMenuItem();
        agentFileMenuItem = new javax.swing.JMenuItem();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Distribute Money - PocketMoney");

        amountLabel2.setText("Enter Amount: ");

        agentListTextArea.setEditable(false);
        agentListTextArea.setColumns(20);
        agentListTextArea.setRows(5);
        jScrollPane1.setViewportView(agentListTextArea);

        distributeButton2.setText("Distribute");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addComponent(amountLabel2)
                        .addComponent(amountText2))
                    .addComponent(distributeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(amountLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountText2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(distributeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        selectMenu.setText("Select");

        agentArrayListMenuItem.setText("Select Agents from ArrayList");
        agentArrayListMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentArrayListMenuItemActionPerformed(evt);
            }
        });
        selectMenu.add(agentArrayListMenuItem);

        agentFileMenuItem.setText("Select Agents from File");
        selectMenu.add(agentFileMenuItem);

        menuBar.add(selectMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agentArrayListMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentArrayListMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agentArrayListMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agentArrayListMenuItem;
    private javax.swing.JMenuItem agentFileMenuItem;
    private javax.swing.JTextArea agentListTextArea;
    private javax.swing.JLabel amountLabel2;
    private javax.swing.JTextField amountText2;
    private javax.swing.JButton distributeButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel panel2;
    private javax.swing.JMenu selectMenu;
    // End of variables declaration//GEN-END:variables
}
