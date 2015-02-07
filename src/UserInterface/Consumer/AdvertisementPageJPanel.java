/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Consumer;

import Business.Advertiser.Advertisement;
import Business.Consumer.Consumer;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Exchange.WinningBids;
import Business.Publisher.AdSpace;
import java.awt.CardLayout;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhinav
 */
public class AdvertisementPageJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ArrayList<WinningBids> bidsWon;
    private PublisherEnterprise publisherEnterprise;
    private Consumer consumer;
    /**
     * Creates new form AdvertisementPageJPanel
     */
    public AdvertisementPageJPanel(JPanel upc, ArrayList<WinningBids> wb, PublisherEnterprise pe, Consumer c) {
        initComponents();
        this.userProcessContainer = upc;
        this.bidsWon = wb;
        this.publisherEnterprise = pe;
        this.consumer = c;
        
        populatePage();
    }
    
    private void populatePage()
    {
        websitejLabel.setText("Welcome to " + publisherEnterprise.getName() + "'s website");
        
        for(WinningBids wb : bidsWon)
        {
            AdSpace ad = wb.getAdSpace();
            AdvertiserEnterprise advertiserEnterprise = wb.getAdvertiserEnterprise();
            BufferedImage image = loadAvertisement(advertiserEnterprise, ad);
            String choice = ad.getPosition();
            switch(choice)
            {
                case "Top":
                    topjLabel.setIcon(new ImageIcon(image));
                    break;
                case "Left":
                    leftjLabel.setIcon(new ImageIcon(image));
                    break;
                case "Right":
                    rightjLabel.setIcon(new ImageIcon(image));
                    break;
                case "Bottom":
                    bottomjLabel.setIcon(new ImageIcon(image));
                    break;
            }
            
        }
    }
    
    private BufferedImage loadAvertisement(AdvertiserEnterprise enterprise, AdSpace adSpace)
    {
        int from = 800;
        int to = 2200;
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int t = c.get(Calendar.HOUR_OF_DAY) * 100 + c.get(Calendar.MINUTE);
        boolean isDay = to > from && t >= from && t <= to || to < from && (t >= from || t <= to);
        BufferedImage image = null;
        BufferedImage outputImage = null;
        try
        {
            
            for(Advertisement ad : enterprise.getAdvertisementList())
            {
                if(isDay)
                {
                    if(ad.getTimeOfDay().equalsIgnoreCase("day"))
                    {
                        File file = new File(ad.getAdURL());
                        image = ImageIO.read(file);
                        outputImage = new BufferedImage(Math.round(adSpace.getWidth()), Math.round(adSpace.getHeight()), image.getType());
                        Graphics2D g2d = outputImage.createGraphics();
                        g2d.drawImage(image, 0, 0, Math.round(adSpace.getWidth()), Math.round(adSpace.getHeight()), null);
                        g2d.dispose();
                    }
                }
                else
                {
                    if(ad.getTimeOfDay().equalsIgnoreCase("night"))
                    {
                        File file = new File(ad.getAdURL());
                        image = ImageIO.read(file);
                        outputImage = new BufferedImage(Math.round(adSpace.getWidth()), Math.round(adSpace.getHeight()), image.getType());
                        Graphics2D g2d = outputImage.createGraphics();
                        g2d.drawImage(image, 0, 0, Math.round(adSpace.getWidth()), Math.round(adSpace.getHeight()), null);
                        g2d.dispose();
                    }
                }
            }
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(AdvertisementPageJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outputImage;
    }
    
    private AdvertiserEnterprise getAdvertiser(String position)
    {
        AdvertiserEnterprise enterprise = null;
        for(WinningBids wb : bidsWon)
        {
            if(wb.getAdSpace().getPosition().equalsIgnoreCase(position))
            {
                enterprise = wb.getAdvertiserEnterprise();
            }
        }
        return enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton1 = new javax.swing.JButton();
        rightjLabel = new javax.swing.JLabel();
        websitejLabel = new javax.swing.JLabel();
        topjLabel = new javax.swing.JLabel();
        leftjLabel = new javax.swing.JLabel();
        bottomjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        rightjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightjLabelMouseClicked(evt);
            }
        });

        websitejLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        websitejLabel.setText("Publisher Name");

        topjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topjLabelMouseClicked(evt);
            }
        });

        leftjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftjLabelMouseClicked(evt);
            }
        });

        bottomjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottomjLabelMouseClicked(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Website Content");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(websitejLabel)
                                .addGap(0, 115, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(leftjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rightjLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(bottomjLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(topjLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(websitejLabel)
                    .addComponent(backJButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(rightjLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(leftjLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(topjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addComponent(bottomjLabel)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void topjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topjLabelMouseClicked
        
        AdvertiserEnterprise enterprise = getAdvertiser("top");
        enterprise.setConsumerClicks(enterprise.getConsumerClicks() + 1);
        userProcessContainer.add("Browse Products", new BrowseProductsJPanel(userProcessContainer, enterprise, consumer));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);

    }//GEN-LAST:event_topjLabelMouseClicked

    private void rightjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightjLabelMouseClicked
        
        AdvertiserEnterprise enterprise = getAdvertiser("right");
        enterprise.setConsumerClicks(enterprise.getConsumerClicks() + 1);
        userProcessContainer.add("Browse Products", new BrowseProductsJPanel(userProcessContainer, enterprise, consumer));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_rightjLabelMouseClicked

    private void leftjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftjLabelMouseClicked
        
        AdvertiserEnterprise enterprise = getAdvertiser("left");
        enterprise.setConsumerClicks(enterprise.getConsumerClicks() + 1);
        userProcessContainer.add("Browse Products", new BrowseProductsJPanel(userProcessContainer, enterprise, consumer));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_leftjLabelMouseClicked

    private void bottomjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottomjLabelMouseClicked
        
        AdvertiserEnterprise enterprise = getAdvertiser("bottom");
        enterprise.setConsumerClicks(enterprise.getConsumerClicks() + 1);
        userProcessContainer.add("Browse Products", new BrowseProductsJPanel(userProcessContainer, enterprise, consumer));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_bottomjLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel bottomjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel leftjLabel;
    private javax.swing.JLabel rightjLabel;
    private javax.swing.JLabel topjLabel;
    private javax.swing.JLabel websitejLabel;
    // End of variables declaration//GEN-END:variables
}
