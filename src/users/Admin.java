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
public class Admin extends User {
    private String accessKey;
    
    @Override
    public void createAccount(String id, String type, String pass, float bln, float wl){
        
    }
    
    public boolean isValidAccessKey() {
        return true;
    }
    
    public void distributeMoney() {
        
    }
    
    public void viewUserActivity() {
        
    }
    
    public void viewDailyTransactionLog() {
        
    }
    
    public void getUserActivityReport() {
        
    }
    
    public void getRankReport() {
        
    }
}
