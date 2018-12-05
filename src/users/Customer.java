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
    
    
    public Customer(String id, String type, String pin, float balance, float limit) {
       super(id, type, pin, balance, limit);     
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
        this.balance = balance;
    }
    
    @Override
    public void setLimit(float limit){
        this.limit = limit;
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
    
    @Override
    public float getLimit(){
        return limit;
    }
    
    public boolean isValidQrCode(String qr) {
        return true;
    }
    
    public boolean isValidAgentId(String agentId) {
        return true;
    }
    
    public void debit(float balance) {
        this.balance = this.balance - balance;
    }
    
    public void sendMoney(String recipientId, float balance) {
        try {
            Customer c = null;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("customerInfo.bin"));
            while( (c=(Customer)in.readObject()) != null ) {
                if(recipientId.equals(c.getId())){
                    c.debit(balance);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Recipient doesn't exist");
                }
            }
        } catch(Exception ex) {}
    }
    
    public void cashOut(Customer customer, Agent agent, float balance) {
       //String id = (String)agent.getId();
        try {
            Agent a = null;
            Customer c = null;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("agentInfo.bin"));
            ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("customerInfo.bin"));
            while( (a=(Agent)in.readObject()) != null ) {
                if(agent.getId()==a.getId()){
                    while((c=(Customer)in2.readObject())!=null){
                        if(c.getId()==customer.getId()){
                            customer.setBalance(-1*balance);
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Recipient doesn't exist");
                }
            }
        } catch(Exception ex) {}
    } 
    
    public void mobileRecharge(Customer customer, String recipientId, float balance) {
        try {
            Customer c = null;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("customerInfo.bin"));
            while( (c=(Customer)in.readObject()) != null ) {
                if(customer.getId()==c.getId()){
                    customer.debit(balance);
                }
                else {
                    return;
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
