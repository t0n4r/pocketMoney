/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import static java.awt.Color.blue;
import javax.swing.JOptionPane;
import java.io.*;
import users.*;

/**
 *
 * @author Zahid
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        idLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginLabel = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        userTypeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - PocketMoney");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(250, 250, 250));

        backLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backLabelMousePressed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        idLabel.setText("User ID:");

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        passwordLabel.setText("Password:");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        loginLabel.setText("Log In");
        loginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginLabelMouseExited(evt);
            }
        });

        userTypeComboBox.setBackground(new java.awt.Color(250, 250, 250));
        userTypeComboBox.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--None--", "Customer", "Agent", "Merchant", "Admin" }));
        userTypeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        userTypeLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        userTypeLabel.setText("User Type");

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
                        .addGap(84, 84, 84)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginLabel)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idLabel)
                                .addComponent(idText)
                                .addComponent(passwordLabel)
                                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(userTypeLabel)
                                .addComponent(userTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(idLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginLabel)
                .addContainerGap(58, Short.MAX_VALUE))
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
       /**
        * Clicking the 'Back' label will return the 'Welcome' frame 
        */
        this.setVisible(false);
        Welcome w = new Welcome();
        w.setVisible(true);
    }//GEN-LAST:event_backLabelMouseClicked

   /**
    * Setting mouse-hover action performed using the following code 
    */ 
    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseEntered
        backLabel.setForeground(Color.blue);
    }//GEN-LAST:event_backLabelMouseEntered

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        backLabel.setForeground(Color.black);
    }//GEN-LAST:event_backLabelMouseExited

    private void backLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMousePressed
       // backLabel.Color(blue);
    }//GEN-LAST:event_backLabelMousePressed

    private void loginLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseEntered
        loginLabel.setForeground(Color.blue);
    }//GEN-LAST:event_loginLabelMouseEntered

    private void loginLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseExited
        loginLabel.setForeground(Color.black);
    }//GEN-LAST:event_loginLabelMouseExited

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        this.dispose();
        
        if(userTypeComboBox.getSelectedItem().equals((String)"Customer")){
            try
            {
                Customer customer = null;
                FileInputStream file = new FileInputStream("customerInfo.bin");
                ObjectInputStream obj = new ObjectInputStream(file);                
                String password = new String(passwordField.getPassword());
               
                while((customer = (Customer)obj.readObject()) != null )
                {
                    if (idText.getText() .equals(customer.getId()) && password.equals(customer.getPin()))
                    {
                        CustomerFrame cf = new CustomerFrame();
                        cf.setVisible(true);
                        cf.setId(idText.getText());
                        cf.setCustomer(customer);
                    }
                } 
                obj.close();
            }
            catch(Exception e)
            {
                
            }
        }
        
        else if(userTypeComboBox.getSelectedItem().equals((String)"Agent")){
            try
            {
                Agent agent = null;
                FileInputStream file = new FileInputStream("agentInfo.bin");
                ObjectInputStream obj = new ObjectInputStream(file);
                
                String password = new String(passwordField.getPassword());
                while((agent = (Agent) obj.readObject()) != null )
                {
                    if (idText.getText().equals(agent.getId()) && password.equals(agent.getPin()))
                    {
                        AgentFrame agf = new AgentFrame();
                        agf.setVisible(true);
                        agf.setId(idText.getText());
                        
                    }
                } 
                obj.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

        else if(userTypeComboBox.getSelectedItem().equals((String)"Merchant")){
            try
            {
                Merchant merchant = null;
                FileInputStream file = new FileInputStream("merchantInfo.bin");
                ObjectInputStream obj = new ObjectInputStream(file);
                
                String password = new String(passwordField.getPassword());
                while((merchant = (Merchant) obj.readObject()) != null )
                {
                    if (idText.getText().equals(merchant.getId()) && password.equals(merchant.getPin()))
                    {
                        MerchantFrame mf = new MerchantFrame();
                        mf.setVisible(true);
                        mf.setId(idText.getText());                    }
                } 
                obj.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        else if(userTypeComboBox.getSelectedItem().equals((String)"Admin")){
            try
            {
                Admin admin = null;
                FileInputStream file = new FileInputStream("adminInfo.bin");
                ObjectInputStream obj = new ObjectInputStream(file);
                String password = new String(passwordField.getPassword());
                while((admin = (Admin) obj.readObject()) != null )
                {
                    if (idText.getText().equals(admin.getId()) && password.equals(admin.getPin()))
                    {
                        AdminFrame adf = new AdminFrame();
                        adf.setVisible(true);
                        adf.setId(idText.getText());
                    }
                } 
                obj.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Error!  Please select user type.");
            this.setVisible(true);
        }
    }//GEN-LAST:event_loginLabelMouseClicked

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    /**
     * @param args the command line arguments
     */ 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables
}
