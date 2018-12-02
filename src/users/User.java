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
public abstract class User {
    protected Account a;
    
    public abstract void createAccount();
    public boolean isValidId(String id) {
        if(id.equals(a.getAccountId())){
            return true;
        }
        else return false;
    } 
    public boolean isValidPassword(String pass) {
        return true;
    }
}
