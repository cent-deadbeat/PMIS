/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pmis;

import components.DatabaseHelper;
import components.inventoryItem;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class EditProducts extends javax.swing.JFrame {

    /**
     * Creates new form EditProducts
     */
    
    private int productID;

    public void setProductID(int id) {
        this.productID = id;
    }
    
    public void someMethod() {
        inventoryItem item = new inventoryItem();  // Create an instance of inventoryItem
        int productID = item.getProductID();      // Call the instance method
        System.out.println("Product ID: " + productID);
    }

    public EditProducts() {
        initComponents();
        
    }
    
    public void loadProductDetails() {
        try {
            // Fetch product details from database
            DatabaseHelper db = new DatabaseHelper();
            Object[] productDetails = db.getProductById(productID); // Fetch product data by ID

            if (productDetails != null) {
                // Populate text fields with fetched details
                productNameTxtbx.setText((String) productDetails[0]);
                productTypeTxtbx.setText((String) productDetails[1]);
                priceTxtbx.setText(String.valueOf(productDetails[2]));
                dosageTxtbx.setText((String) productDetails[3]);
                stocksTxtbx.setText(String.valueOf(productDetails[4]));
                
                //for Restock
                pnameLbl.setText((String) productDetails[0]);
                ptypeLbl.setText((String) productDetails[1]);
                ppriceLbl.setText(String.valueOf(productDetails[2]));
                dosageLbl.setText((String) productDetails[3]);

                // Populate date fields safely
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                if (productDetails[5] != null && !((String) productDetails[5]).isEmpty()) {
                    dcDeliveryDate.setDate(sdf.parse((String) productDetails[5]));
                } else {
                    dcDeliveryDate.setDate(null);
                }

                if (productDetails[6] != null && !((String) productDetails[6]).isEmpty()) {
                    dcManufacturedDate.setDate(sdf.parse((String) productDetails[6]));
                } else {
                    dcManufacturedDate.setDate(null);
                }

                if (productDetails[7] != null && !((String) productDetails[7]).isEmpty()) {
                    dcExpirationDate.setDate(sdf.parse((String) productDetails[7]));
                } else {
                    dcExpirationDate.setDate(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Product not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading product details: " + e.getMessage());
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        editPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        productNameTxtbx = new javax.swing.JTextField();
        productTypeTxtbx = new javax.swing.JTextField();
        priceTxtbx = new javax.swing.JTextField();
        stocksTxtbx = new javax.swing.JTextField();
        dcDeliveryDate = new com.toedter.calendar.JDateChooser();
        dcManufacturedDate = new com.toedter.calendar.JDateChooser();
        dcExpirationDate = new com.toedter.calendar.JDateChooser();
        editProduct = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dosageTxtbx = new javax.swing.JTextField();
        restockPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stocksTxtbx1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dcDeliveryDate1 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        dcManufacturedDate1 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        dcExpirationDate1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnameLbl = new javax.swing.JLabel();
        ptypeLbl = new javax.swing.JLabel();
        ppriceLbl = new javax.swing.JLabel();
        dosageLbl = new javax.swing.JLabel();
        restockBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(483, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(483, 665));

        editPanel.setBackground(new java.awt.Color(255, 248, 250));
        editPanel.setPreferredSize(new java.awt.Dimension(483, 660));

        jButton2.setText("Restock");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Edit Product");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Product Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Product Type:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Product Price:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Product Stocks:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Delivery Date:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Manufactured Date:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Expiration Date:");

        productNameTxtbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTxtbxActionPerformed(evt);
            }
        });

        editProduct.setText("Edit Product");
        editProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Dosage:");

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(editProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dosageTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productTypeTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(stocksTxtbx)
                                        .addComponent(dcDeliveryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dcManufacturedDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dcExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(23, 23, 23))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(productNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(productTypeTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(priceTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dosageTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(stocksTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(dcDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addComponent(dcManufacturedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(dcExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editProduct)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("tab1", editPanel);

        restockPanel.setBackground(new java.awt.Color(255, 255, 255));
        restockPanel.setPreferredSize(new java.awt.Dimension(483, 660));

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Restock Product");
        jLabel2.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Dosage:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Manufactured Date:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Expiration Date:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Product Name:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Product Type:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Product Price:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Product Stocks:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Delivery Date:");

        pnameLbl.setText("Pname");

        ptypeLbl.setText("pType");

        ppriceLbl.setText("pPrice");

        dosageLbl.setText("Dosage");

        restockBtn.setText("Restock");
        restockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restockBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout restockPanelLayout = new javax.swing.GroupLayout(restockPanel);
        restockPanel.setLayout(restockPanelLayout);
        restockPanelLayout.setHorizontalGroup(
            restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restockPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(restockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(restockPanelLayout.createSequentialGroup()
                        .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stocksTxtbx1)
                            .addComponent(dcDeliveryDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcManufacturedDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcExpirationDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnameLbl)
                            .addComponent(ptypeLbl)
                            .addComponent(ppriceLbl)
                            .addComponent(dosageLbl))))
                .addGap(27, 27, 27))
            .addGroup(restockPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(restockBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        restockPanelLayout.setVerticalGroup(
            restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(57, 57, 57)
                .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(pnameLbl))
                .addGap(30, 30, 30)
                .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(ptypeLbl))
                .addGap(38, 38, 38)
                .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(ppriceLbl))
                .addGap(31, 31, 31)
                .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(dosageLbl))
                .addGap(33, 33, 33)
                .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(restockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel18)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel12)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restockPanelLayout.createSequentialGroup()
                        .addGroup(restockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, restockPanelLayout.createSequentialGroup()
                                .addComponent(stocksTxtbx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(dcDeliveryDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addComponent(dcManufacturedDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(dcExpirationDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(restockBtn)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", restockPanel);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -35, -1, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void editProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductActionPerformed
        // TODO add your handling code here:
        try {
            // Fetch updated values from text fields
            String name = productNameTxtbx.getText().trim();
            String type = productTypeTxtbx.getText().trim();
            String priceText = priceTxtbx.getText().trim();
            String dosage = dosageTxtbx.getText().trim();
            String stocksText = stocksTxtbx.getText().trim();

            double price = Double.parseDouble(priceText);
            int stocks = Integer.parseInt(stocksText);

            // Format dates
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String deliveryDate = sdf.format(dcDeliveryDate.getDate());
            String manufacturedDate = sdf.format(dcManufacturedDate.getDate());
            String expirationDate = sdf.format(dcExpirationDate.getDate());

            // Call updateProduct method
            boolean success = DatabaseHelper.updateProduct(productID, name, type, price, dosage, stocks, deliveryDate, manufacturedDate, expirationDate);

            if (success) {
                JOptionPane.showMessageDialog(null, "Product updated successfully!");
                dispose(); // Close the window
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update product. Please try again.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format. Please check price and stock values.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_editProductActionPerformed

    private void productNameTxtbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTxtbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTxtbxActionPerformed

    private void restockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restockBtnActionPerformed
        // TODO add your handling code here:
        try {
            // Fetch updated values from text fields
            String name = pnameLbl.getText().trim();
            String type = ptypeLbl.getText().trim();
            String priceText = ppriceLbl.getText().trim();
            String dosage = dosageLbl.getText().trim();
            String stocksText = stocksTxtbx1.getText().trim();

            double price = Double.parseDouble(priceText);
            int stocks = Integer.parseInt(stocksText);

            // Format dates
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String deliveryDate = sdf.format(dcDeliveryDate1.getDate());
            String manufacturedDate = sdf.format(dcManufacturedDate1.getDate());
            String expirationDate = sdf.format(dcExpirationDate1.getDate());

            // Call updateProduct method
            boolean success = DatabaseHelper.insertProduct(name, type, price, dosage, stocks, deliveryDate, manufacturedDate, expirationDate);

            if (success) {
                JOptionPane.showMessageDialog(null, "Product updated successfully!");
                dispose(); // Close the window
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update product. Please try again.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format. Please check price and stock values.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_restockBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EditProducts().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dcDeliveryDate;
    private com.toedter.calendar.JDateChooser dcDeliveryDate1;
    private com.toedter.calendar.JDateChooser dcExpirationDate;
    private com.toedter.calendar.JDateChooser dcExpirationDate1;
    private com.toedter.calendar.JDateChooser dcManufacturedDate;
    private com.toedter.calendar.JDateChooser dcManufacturedDate1;
    private javax.swing.JLabel dosageLbl;
    private javax.swing.JTextField dosageTxtbx;
    private javax.swing.JPanel editPanel;
    private javax.swing.JButton editProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel pnameLbl;
    private javax.swing.JLabel ppriceLbl;
    private javax.swing.JTextField priceTxtbx;
    private javax.swing.JTextField productNameTxtbx;
    private javax.swing.JTextField productTypeTxtbx;
    private javax.swing.JLabel ptypeLbl;
    private javax.swing.JButton restockBtn;
    private javax.swing.JPanel restockPanel;
    private javax.swing.JTextField stocksTxtbx;
    private javax.swing.JTextField stocksTxtbx1;
    // End of variables declaration//GEN-END:variables
}