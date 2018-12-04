/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 *
 * @author Zahid
 */
public class Merchant extends User implements Serializable{
    private String businessInstitutionName;
    private String businessType;
    private String terminalId;
    
    public Merchant(String id, String type, String pin, float balance) {
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
        this.balance = balance;
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
    
    public boolean isValidAgentId() {
        return true;
    }
    
    public void cashOut() {
        
    }
    
    public void getStatement() {
        
    }
    
}
