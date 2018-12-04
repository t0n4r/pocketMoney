/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docs;

import java.util.ArrayList;
import java.util.Date;
import transaction.Transactions;

/**
 *
 * @author Zahid
 */
public class Statement extends Document {
    private Date date;
    private String userId;
    private ArrayList<Transactions> transactions;
    
    @Override
    public void createDocument() {
        
    }
    
    public void showStatement() {
        
    }
}
