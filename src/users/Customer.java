/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Zahid
 */
public class Customer extends User implements Serializable{
    private String customerName;
    
    public Customer(){}
    
    public Customer(String id, String type, String pin, float balance) {
       super(id, type, pin, balance);     
    }
    
    @Override
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public void setPin(String pin) {
        this.pin = pin;
    }
    
    @Override
    public void setBalance(float balance) {
        this.balance += balance;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public String getPin() {
        return pin;
    }
    
    @Override
    public float getBalance() {
        return balance;
    }
    
    public boolean isValidQrCode(String qr) {
        return true;
    }
    
    public boolean isValidAgentId(String agentId) {
        return true;
    }
    
    public void sendMoney(String recipientId, float balance) {
        try {
            Customer c = null;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("customerInfo.bin"));
            while( (c=(Customer)in.readObject()) != null ) {
                if(recipientId.equals(c.getId())){
                    c.setBalance(balance);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Recipient doesn't exist");
                }
            }
        } catch(Exception ex) {}
    }
    
    public void cashOut(Agent agent, float balance) {
       String id = (String)agent.getId();
        try {
            Agent a = agent;
            Customer c = null;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("agentInfo.bin"));
            while( (a=(Agent)in.readObject()) != null ) {
                if(id==a.getId()){
                    c.setBalance(balance);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Recipient doesn't exist");
                }
            }
        } catch(Exception ex) {}
    } 
    
    public void mobileRecharge(String recipientId, float balance) {
        try {
            Customer c = null;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("customerInfo.bin"));
            while( (c=(Customer)in.readObject()) != null ) {
                if(recipientId==c.getId()){
                    c.setBalance(balance);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Recipient doesn't exist");
                }
            }
        } catch(Exception ex) {}
    }
    
    public void makePayment(Merchant merchant, float balance) {
        String id = (String)merchant.getId();
        try {
            Merchant m = null;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("merchantInfo.bin"));
            while( (m=(Merchant)in.readObject()) != null ) {
                if(id==m.getId()){
                    m.setBalance(balance);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Merchant doesn't exist");
                }
            }
        } catch(Exception ex) {}
    }
    
    public void getStatement() {
        
    }
    
}
