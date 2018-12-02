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
public class Customer extends User {
    private String customerName;
    
    @Override
    public void createAccount(){
        
    }
    
    public boolean isValidQrCode(String qr) {
        return true;
    }
    
    public boolean isValidAgentId(String agentId) {
        return true;
    }
    
    public void sendMoney() {
        
    }
    
    public void cashOut() {
        
    } 
    
    public void mobileRecharge() {
        
    }
    
    public void makePayment() {
        
    }
    
    public void getStatement() {
        
    }
    
    public void checkBalance() {
        a.getAccountBalance();
    }
}
