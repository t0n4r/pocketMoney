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
public abstract class User implements Serializable {    
    protected String id;
    protected String type;
    protected String pin;
    protected float balance;
    
    public User(String id, String type, String pin, float balance) {
        this.id = id;
        this.type = type;
        this.pin = pin;
        this.balance = balance;
    }
    
    public boolean isValidId(String id) {
        if(id.length()==11) {
            
        }
        return false;
    }
    
    public abstract void setId(String id);
    public abstract void setType(String type);
    public abstract void setPin(String pin);
    public abstract void setBalance(float balance);
    public abstract String getId();
    public abstract String getType();
    public abstract String getPin();
    public abstract float getBalance();
}
