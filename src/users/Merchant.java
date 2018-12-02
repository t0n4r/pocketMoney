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
public class Merchant extends User {
    private String businessInstitutionName;
    private String businessType;
    private String terminalId;
    
    @Override
    public void createAccount() {
        
    }
    
    public boolean isValidAgentId() {
        return true;
    }
    
    public void cashOut() {
        
    }
    
    public void getStatement() {
        
    }
    
    public void checkBalance() {
        a.getAccountBalance();
    }
}
