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
public class Merchant extends User implements Serializable{
    private String businessInstitutionName;
    private String businessType;
    private String terminalId;
    
    public Merchant(String id, String type, String pin, float balance, float limit) {
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
    
    public boolean isValidAgentId() {
        return true;
    }
    
    public void cashOut(Agent agent, float balance) {
        String id = (String)agent.getId();
        try {
            Agent a = agent;
            Merchant m = null;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("agentInfo.bin"));
            while( (a=(Agent)in.readObject()) != null ) {
                if(id==a.getId()){
                    m.setBalance(balance);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Recipient doesn't exist");
                }
            }
        } catch(Exception ex) {}
    }
    
    public void getStatement() {
        
    }
    
}
