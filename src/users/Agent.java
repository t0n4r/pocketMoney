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
public class Agent extends User implements Serializable {
    private String agentName;
    
    public Agent(String id, String type, String pin, float balance, float limit) {
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
    
    public void createCustomerAccount() {
        
    }
    
    public void cashIn() {
        
    }
    
    public void getStatement() {
        
    }
 
}
