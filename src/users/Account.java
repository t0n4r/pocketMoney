/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author Zahid
 */
public class Account {
    private String accountId;
    private String accountType;
    private String password;
    private float accountBalance;
    private float withDrawLimit;
    
    public void setAccountInfo(String id, String type, String pass, float bln, float wl) {
        this.accountId = id;
        this.accountType = type;
        this.password = pass;
        this.accountBalance = bln;
        this.withDrawLimit = wl;
    }
}
