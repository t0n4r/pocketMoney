/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import users.Admin;
import users.Agent;
import users.Customer;
import users.Merchant;

/**
 *
 * @author Zahid
 */
class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream o) throws IOException {
        super(o);
    }

    @Override
    protected void writeStreamHeader() throws IOException {}
} 

public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        this.setLocationRelativeTo(null);
        customerInfo = new ArrayList<Customer>();
        agentInfo = new ArrayList<Agent>();
        merchantInfo = new ArrayList<Merchant>();
        adminInfo = new ArrayList<Admin>();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        pinLabel = new javax.swing.JLabel();
        pinText = new javax.swing.JTextField();
        userTypeLabel = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        signupLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up - PocketMoney");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
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
        });

        phoneNumberLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        phoneNumberLabel.setText("Enter phone number: ");

        phoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextActionPerformed(evt);
            }
        });

        pinLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        pinLabel.setText("Enter desired PIN code (must be 6-digits): ");

        userTypeLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        userTypeLabel.setText("Select user type: ");

        userTypeComboBox.setBackground(new java.awt.Color(250, 250, 250));
        userTypeComboBox.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--None--", "Customer", "Agent", "Merchant", "Admin" }));
        userTypeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        signupLabel.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        signupLabel.setText("Sign Up");
        signupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupLabelMouseExited(evt);
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
                            .addComponent(signupLabel)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userTypeLabel)
                                .addComponent(phoneNumberLabel)
                                .addComponent(phoneNumberText)
                                .addComponent(pinLabel)
                                .addComponent(pinText)
                                .addComponent(userTypeComboBox, 0, 275, Short.MAX_VALUE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel)
                .addGap(40, 40, 40)
                .addComponent(phoneNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupLabel)
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
        /*
        * Clicking the 'Back' label will return to the 'Welcome' frame
        */
        
        this.dispose();
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

    private void signupLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseEntered
        signupLabel.setForeground(Color.blue);
    }//GEN-LAST:event_signupLabelMouseEntered

    private void signupLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseExited
        signupLabel.setForeground(Color.black);
    }//GEN-LAST:event_signupLabelMouseExited

    private void signupLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseClicked
        this.dispose();
        if(userTypeComboBox.getSelectedItem()==(String)"Customer") {
            customerInfo.add(
                new Customer(
                    phoneNumberText.getText(),
                    (String)userTypeComboBox.getSelectedItem(),
                    pinText.getText(),
                    0.0f
                )
            );
            boolean append = true;
            try {
                ObjectOutputStream out = null;
                File file = new File("customerInfo.bin");
                if(!file.exists() || !append) {
                    out = new ObjectOutputStream(new FileOutputStream(file));
                }
                else {
                    out = new AppendableObjectOutputStream(new FileOutputStream(file, append));
                }
                for(Customer customer: customerInfo)
                    out.writeObject(customer);
                out.close();
            } catch(Exception e) {}
            JOptionPane.showMessageDialog(null,"Account Created!");
            Welcome w = new Welcome();
            w.setVisible(true);
            showArrayList();
        }
        else if(userTypeComboBox.getSelectedItem()==(String)"Agent") {
            agentInfo.add(
                new Agent(
                    phoneNumberText.getText(),
                    (String)userTypeComboBox.getSelectedItem(),
                    pinText.getText(),
                    0.0f
                )
            );
            boolean append = true;
            try {
                ObjectOutputStream out = null;
                File file = new File("agentInfo.bin");
                if(!file.exists() || !append) {
                    out = new ObjectOutputStream(new FileOutputStream(file));
                }
                else {
                    out = new AppendableObjectOutputStream(new FileOutputStream(file, append));
                }
                for(Agent agent: agentInfo)
                    out.writeObject(agent);
                out.close();
            } catch(Exception e) {}
            JOptionPane.showMessageDialog(null,"Account Created!");
            Welcome w = new Welcome();
            w.setVisible(true);
        }
        else if(userTypeComboBox.getSelectedItem()==(String)"Merchant") {
            merchantInfo.add(
                new Merchant(
                    phoneNumberText.getText(),
                    (String)userTypeComboBox.getSelectedItem(),
                    pinText.getText(),
                    0.0f
                )
            );
            boolean append = true;
            try {
                ObjectOutputStream out = null;
                File file = new File("merchantInfo.bin");
                if(!file.exists() || !append) {
                    out = new ObjectOutputStream(new FileOutputStream(file));
                }
                else {
                    out = new AppendableObjectOutputStream(new FileOutputStream(file, append));
                }
                for(Merchant merchant: merchantInfo)
                    out.writeObject(merchant);
                out.close();
            } catch(Exception e) {}
            JOptionPane.showMessageDialog(null,"Account Created!");
            Welcome w = new Welcome();
            w.setVisible(true);
        }
        else if(userTypeComboBox.getSelectedItem()==(String)"Admin") {
            adminInfo.add(
                new Admin(
                    phoneNumberText.getText(),
                    (String)userTypeComboBox.getSelectedItem(),
                    pinText.getText(),
                    0.0f
                )
            );
            boolean append = true;
            try {
                ObjectOutputStream out = null;
                File file = new File("adminInfo.bin");
                if(!file.exists() || !append) {
                    out = new ObjectOutputStream(new FileOutputStream(file));
                }
                else {
                    out = new AppendableObjectOutputStream(new FileOutputStream(file, append));
                }
                for(Admin admin: adminInfo)
                    out.writeObject(admin);
                out.close();
            } catch(Exception e) {}
            JOptionPane.showMessageDialog(null,"Account Created!");
            Welcome w = new Welcome();
            w.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Error!  Please select a user type.");
            this.setVisible(true);
        }
    }//GEN-LAST:event_signupLabelMouseClicked

    private void phoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextActionPerformed

    private void showArrayList() {
        for(Customer c: customerInfo){
            System.out.println(c.getId());
        }
    }
    /**
     * @param args the command line arguments
     */

    public ArrayList<Customer> customerInfo;
    public ArrayList<Agent> agentInfo;
    public ArrayList<Merchant> merchantInfo;
    public ArrayList<Admin> adminInfo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JLabel pinLabel;
    private javax.swing.JTextField pinText;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables
}
