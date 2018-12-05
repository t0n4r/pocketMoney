/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.util.ArrayList;

/**
 *
 * @author Zahid
 */
public class UserInfo {
    private ArrayList<Customer> customerInfo = new ArrayList<Customer>();
    private ArrayList<Agent> agentInfo = new ArrayList<Agent>();
    private ArrayList<Merchant> merchantInfo = new ArrayList<Merchant>();
    private ArrayList<Admin> adminInfo = new ArrayList<Admin>();
    
    public void addCustomer(Customer customer) {
        customerInfo.add(customer);
    }
    
    public void addAgent(Agent agent) {
        agentInfo.add(agent);
    }
    
    public void addMerchant(Merchant merchant) {
        merchantInfo.add(merchant);
    }
    
    public void addAdmin(Admin admin) {
        adminInfo.add(admin);
    }
}
