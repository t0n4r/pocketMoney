/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalframes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.ButtonGroup;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Zahid
 */
public class Report extends javax.swing.JInternalFrame {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        activityRadioButton.setSelected(false);
        transactionRadioButton.setSelected(false);
        topUsersRadioButton.setSelected(false);
        ButtonGroup reportGroup = new ButtonGroup();
        reportGroup.add(activityRadioButton);
        reportGroup.add(transactionRadioButton);
        reportGroup.add(topUsersRadioButton);
        
        generatePieChart();
        
        
    }

    void generatePieChart(){
        DefaultPieDataset piedataset = new DefaultPieDataset();  
        piedataset.setValue("Accounts", new Integer(11));  
        piedataset.setValue("Human Resource", new Integer(22)); 
        piedataset.setValue("Commercial", new Integer(11));  
        piedataset.setValue("Production", new Integer(21));  
        piedataset.setValue("Marketing", new Integer(10));  
       
        JFreeChart piechart = ChartFactory.createPieChart(  
           "Pie Chart",   // Title  
            piedataset,  //dataset           
            true,    //legends              
            true,    //tools               
            true    //urls                
        );  
       
        piechart.getTitle().setPaint(Color.RED); // Set the colour of the title  
        piechart.setBackgroundPaint(Color.BLUE);
      
        PiePlot p=(PiePlot)piechart.getPlot();
        p.setBackgroundPaint(Color.white);        
      
        ChartPanel cPanel= new ChartPanel(piechart);
        //pieChartPanel.removeAll();
        //pieChartPanel.add(cPanel,BorderLayout.CENTER);
        //pieChartPanel.validate();
    }
        
    void generateBarChart(){
        int i=0;
        Random e = new Random();
        int[] a = new int[8];
        for(int r=0;r<7;r++){
           a[r]=e.nextInt(15)+20;
        }
        DefaultCategoryDataset bardataset = new DefaultCategoryDataset();  
        //for(int j=0;j<c;j++){
        bardataset.setValue(a[0],Integer.toString(a[0]) ,"2015" );
        bardataset.setValue(a[1],Integer.toString(a[1]) ,"2014" );
        bardataset.setValue(a[2],Integer.toString(a[2]) ,"2013" );
        bardataset.setValue(a[3],Integer.toString(a[3]) ,"2012" );
        bardataset.setValue(a[4],Integer.toString(a[4]) ,"2011" );
        bardataset.setValue(a[5],Integer.toString(a[5]) ,"2010" ); 
        bardataset.setValue(a[6],Integer.toString(a[6]) ,"2009" );
       
        JFreeChart barchart = ChartFactory.createBarChart3D(  
            "yearly data",  //Title      
            "year",         // X axis 
            "Number",       //y
            bardataset,             
            PlotOrientation.VERTICAL,      
            true,                
            true,                
            false               
        ); 
        
        barchart.getTitle().setPaint(Color.black);  
        barchart.setBackgroundPaint(Color.WHITE);
     
        // Set the background colour of the chart  
        CategoryPlot cp = barchart.getCategoryPlot(); 
     
        cp.setBackgroundPaint(Color.white);       
        cp.setRangeGridlinePaint(Color.blue);// Set the colour of the plot gridlines  

        ChartPanel cPanel= new ChartPanel(barchart); 

        //BarRenderer r = (BarRenderer)barchart.getCategoryPlot().getRenderer();
        //r.setSeriesPaint(0, Color.PINK);
          
        //barChartPanel.add(cPanel,BorderLayout.CENTER);
    }//end of barChart();
    
    void generateLineChart(){
        Random e= new Random();
        int []a=new int [100];
        for(int r=0;r<7;r++){
            a[r]=e.nextInt(20)+18;
        }
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
        dataset.setValue(a[0],"Amount" ,"2015" );
        dataset.setValue(a[1],"Amount" ,"2014" );
        dataset.setValue(a[2],"Amount" ,"2013" );
        dataset.setValue(a[3],"Amount" ,"2012" );
        dataset.setValue(a[4],"Amount" ,"2011" );
        dataset.setValue(a[5],"Amount" ,"2010" ); 
        dataset.setValue(a[6],"Amount" ,"2009" );
     
        JFreeChart lineChart = ChartFactory.createLineChart(  
            "Line Chart",  // Title  
            "Year.",             // X-axis Label  
            "Amount",             //y 
            dataset,             
            PlotOrientation.VERTICAL,        
            false,                 
            true,                
            false                    
        ); 
        lineChart.getTitle().setPaint(Color.black);     
        lineChart.setBackgroundPaint(Color.WHITE);
    
        CategoryPlot cp = lineChart.getCategoryPlot(); 
        cp.setBackgroundPaint(Color.white);       
        cp.setRangeGridlinePaint(Color.blue);      
        ChartPanel cPanel= new ChartPanel(lineChart); 

        //lineChartPanel.add(cPanel,BorderLayout.CENTER);
    }//end of lineChart();
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        userTypeLabel = new javax.swing.JLabel();
        customerCheckBox = new javax.swing.JCheckBox();
        agentCheckBox = new javax.swing.JCheckBox();
        merchantCheckBox = new javax.swing.JCheckBox();
        reportDateLabel = new javax.swing.JLabel();
        reportTypeLabel = new javax.swing.JLabel();
        activityRadioButton = new javax.swing.JRadioButton();
        transactionRadioButton = new javax.swing.JRadioButton();
        topUsersRadioButton = new javax.swing.JRadioButton();
        barButton = new javax.swing.JButton();
        pieButton = new javax.swing.JButton();
        lineButton = new javax.swing.JButton();
        tableButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Report - PocketMoney");

        userTypeLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        userTypeLabel.setText("Select user types: ");

        customerCheckBox.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        customerCheckBox.setText("Customer");

        agentCheckBox.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        agentCheckBox.setText("Agent");

        merchantCheckBox.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        merchantCheckBox.setText("Merchant");

        reportDateLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        reportDateLabel.setText("Enter Report date:");

        reportTypeLabel.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        reportTypeLabel.setText("Select report type: ");

        activityRadioButton.setText("User Activity");

        transactionRadioButton.setText("Transaction Trends");

        topUsersRadioButton.setText("Top Users");

        barButton.setText("Export as Bar Chart");
        barButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barButtonActionPerformed(evt);
            }
        });

        pieButton.setText("Export as Pie Chart");
        pieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieButtonActionPerformed(evt);
            }
        });

        lineButton.setText("Export as Line Graph");
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });

        tableButton.setText("Export as Table");
        tableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agentCheckBox)
                    .addComponent(topUsersRadioButton)
                    .addComponent(transactionRadioButton)
                    .addComponent(merchantCheckBox)
                    .addComponent(customerCheckBox)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeLabel)
                    .addComponent(reportDateLabel)
                    .addComponent(reportTypeLabel)
                    .addComponent(activityRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(reportDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentCheckBox)
                    .addComponent(barButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(merchantCheckBox)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(activityRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionRadioButton)
                    .addComponent(lineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topUsersRadioButton)
                .addGap(45, 45, 45)
                .addComponent(tableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barButtonActionPerformed

    private void tableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableButtonActionPerformed

    private void pieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieButtonActionPerformed

        
    }//GEN-LAST:event_pieButtonActionPerformed

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lineButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton activityRadioButton;
    private javax.swing.JCheckBox agentCheckBox;
    private javax.swing.JButton barButton;
    private javax.swing.JCheckBox customerCheckBox;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JButton lineButton;
    private javax.swing.JCheckBox merchantCheckBox;
    private javax.swing.JButton pieButton;
    private javax.swing.JLabel reportDateLabel;
    private javax.swing.JLabel reportTypeLabel;
    private javax.swing.JButton tableButton;
    private javax.swing.JRadioButton topUsersRadioButton;
    private javax.swing.JRadioButton transactionRadioButton;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables
}
