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
public abstract class User {    
    protected String id;
    protected String type;
    protected String pin;
    protected float balance = 0.0f;
    
    public User(String id, String type, String pin, float balance) {
        this.id = id;
        this.type = type;
        this.pin = pin;
        this.balance = balance;
    }
    
    /*public boolean isValidId(String id) {
        if(id.length()==11) {
            if(id.charAt(0)=='0' && id.charAt(1)=='1' && id.charAt(2)=='7') return true;
            else if(id.charAt(0)=='0' && id.charAt(1)=='1' && id.charAt(2)=='3') return true;
            else if(id.charAt(0)=='0' && id.charAt(1)=='1' && id.charAt(2)=='5') return true;
            else if(id.charAt(0)=='0' && id.charAt(1)=='1' && id.charAt(2)=='8') return true;
            else if(id.charAt(0)=='0' && id.charAt(1)=='1' && id.charAt(2)=='9') return true;
        }
        return false;
    }*/
    
    public abstract void setId(String id);
    public abstract void setType(String type);
    public abstract void setPin(String pin);
    public abstract void setBalance(float balance);
    public abstract String getId();
    public abstract String getType();
    public abstract String getPin();
    public abstract float getBalance();
}
