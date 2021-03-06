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
    protected float limit;
    
    public User(String id, String type, String pin, float balance, float limit) {
        this.id = id;
        this.type = type;
        this.pin = pin;
        this.balance = balance;
        this.limit = limit;
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
    public abstract void setLimit(float limit);
    public abstract String getId();
    public abstract String getType();
    public abstract String getPin();
    public abstract float getBalance();
    public abstract float getLimit();
}
