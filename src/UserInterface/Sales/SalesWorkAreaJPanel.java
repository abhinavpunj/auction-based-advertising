/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Sales;

import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhinav
 */
public class SalesWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AdvertiserEnterprise enterprise;
    private SalesOrganization organization;
    /**
     * Creates new form SalesWorkAreaJPanel
     */
    public SalesWorkAreaJPanel(JPanel upc, Enterprise enterprise, Organization org) {
        initComponents();
        this.userProcessContainer = upc;
        this.enterprise = (AdvertiserEnterprise) enterprise;
        this.organization = (SalesOrganization) org;
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
        manageProductsjButton = new javax.swing.JButton();
        reviewSalesjButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Work Area - Sales");

        manageProductsjButton.setText("Manage Product Catalog");
        manageProductsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductsjButtonActionPerformed(evt);
            }
        });

        reviewSalesjButton.setText("Review Sales Performance");
        reviewSalesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewSalesjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageProductsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reviewSalesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(manageProductsjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reviewSalesjButton)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProductsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductsjButtonActionPerformed
        
        userProcessContainer.add("Manage Product Catalog", new ManageProductCatalogJPanel(userProcessContainer, enterprise, organization));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_manageProductsjButtonActionPerformed

    private void reviewSalesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewSalesjButtonActionPerformed
        
        userProcessContainer.add("Review Sales Performance", new ReviewSalesPerformanceJPanel(userProcessContainer, enterprise, organization));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_reviewSalesjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageProductsjButton;
    private javax.swing.JButton reviewSalesjButton;
    // End of variables declaration//GEN-END:variables
}
