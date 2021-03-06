/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Advertiser;

import Business.Enterprise.AdvertiserEnterprise;
import Business.WorkRequest.InvoiceRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhinav
 */
public class ManageFinanceAccountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AdvertiserEnterprise enterprise;
    /**
     * Creates new form ManageFinanceAccountJPanel
     */
    public ManageFinanceAccountJPanel(JPanel upc, AdvertiserEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = upc;
        this.enterprise = enterprise;
        
        populateTable();
    }
    
    private void populateTable()
    {
        balancejTextField.setText(String.valueOf(enterprise.getAccount().getTotalBalance()));
        
        DefaultTableModel model = (DefaultTableModel) paymentjTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request : enterprise.getWorkQueue().getWorkQueue())
        {
            if(request instanceof InvoiceRequest)
            {
                InvoiceRequest invoice = (InvoiceRequest)request;
                Object[] row = new Object[5];
                row[0] = invoice.getPublisherEnterprise();
                row[1] = invoice.getPublisherPrice();
                row[2] = invoice.getAgencyPrice();
                row[3] = invoice.getTotalPrice();
                row[4] = request;
                
                model.addRow(row);
            }
        }
    }           

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        payjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        balancejTextField = new javax.swing.JTextField();
        updatejButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addjButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Finance Account");

        paymentjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Publisher", "Publisher Amount", "Marketing Amount", "Total Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        paymentjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(paymentjTable);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Payments");

        payjButton.setText("Pay Amount");
        payjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payjButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Total Balance:");

        balancejTextField.setEditable(false);

        updatejButton.setText("Update");
        updatejButton.setEnabled(false);
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel4.setText("$");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addjButton.setText("Add Money");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(payjButton)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addjButton)
                        .addGap(18, 18, 18)
                        .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(balancejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payjButton)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(balancejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatejButton)
                    .addComponent(addjButton))
                .addGap(27, 27, 27)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        
        try
        {
            float balance = Float.parseFloat(balancejTextField.getText());
            if(balance < enterprise.getAccount().getTotalBalance())
            {
                JOptionPane.showMessageDialog(null, "Balance cannot be less than the earlier amount");
                return;
            }
            enterprise.getAccount().setTotalBalance(balance);
            updatejButton.setEnabled(false);
            balancejTextField.setEditable(false);
            addjButton.setEnabled(true);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Please enter balance in correct format");
        }
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void payjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payjButtonActionPerformed
        
        int selectedRow = paymentjTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a payment from the table");
            return;
        }
        InvoiceRequest request = (InvoiceRequest) paymentjTable.getValueAt(selectedRow, 4);
        if(request.getStatus().equalsIgnoreCase("paid"))
        {
            JOptionPane.showMessageDialog(null, "Payment already complete");
            return;
        }
        request.getPublisherEnterprise().getAccount().setTotalBalance(request.getPublisherEnterprise().getAccount().getTotalBalance() 
                + request.getPublisherPrice());
        enterprise.getAgency().getAccount().setTotalBalance(enterprise.getAgency().getAccount().getTotalBalance() 
                + request.getAgencyPrice());
        enterprise.getAccount().setTotalBalance(enterprise.getAccount().getTotalBalance() - request.getTotalPrice());
        request.setStatus("Paid");
        enterprise.getAccount().setTotalSpent(enterprise.getAccount().getTotalSpent() + request.getTotalPrice());
        populateTable();
        
    }//GEN-LAST:event_payjButtonActionPerformed

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed

        updatejButton.setEnabled(true);
        balancejTextField.setEditable(true);
        addjButton.setEnabled(false);
    }//GEN-LAST:event_addjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField balancejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton payjButton;
    private javax.swing.JTable paymentjTable;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
