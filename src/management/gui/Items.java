package management.gui;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Items extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TitleItemsManagement = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        CategoryLabel = new javax.swing.JLabel();
        PriceInput = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        CategoryDropdown = new javax.swing.JComboBox<>();
        ItemsListLabel = new javax.swing.JLabel();
        ItemsListDropdown = new javax.swing.JComboBox<>();
        FilterLabel = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsManagementTable = new javax.swing.JTable();
        ReloadBtn = new javax.swing.JButton();
        NavItems = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(83, 92, 145));

        jPanel2.setBackground(new java.awt.Color(27, 26, 85));

        TitleItemsManagement.setBackground(new java.awt.Color(27, 26, 85));
        TitleItemsManagement.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TitleItemsManagement.setForeground(new java.awt.Color(255, 255, 255));
        TitleItemsManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleItemsManagement.setText("Items Management");
        TitleItemsManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NameLabel.setBackground(new java.awt.Color(27, 26, 85));
        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Name");
        NameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NameInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NameInput.setText("Input Your Product ...");
        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });

        CategoryLabel.setBackground(new java.awt.Color(27, 26, 85));
        CategoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CategoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CategoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CategoryLabel.setText("Category");
        CategoryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PriceInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PriceInput.setText("Input Your Price ....");
        PriceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceInputActionPerformed(evt);
            }
        });

        PriceLabel.setBackground(new java.awt.Color(27, 26, 85));
        PriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLabel.setText("Price");
        PriceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CategoryDropdown.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CategoryDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Snack" }));

        ItemsListLabel.setBackground(new java.awt.Color(27, 26, 85));
        ItemsListLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemsListLabel.setForeground(new java.awt.Color(255, 255, 255));
        ItemsListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ItemsListLabel.setText("Items List");
        ItemsListLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ItemsListDropdown.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ItemsListDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Snack" }));
        ItemsListDropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemsListDropdownItemStateChanged(evt);
            }
        });
        ItemsListDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemsListDropdownActionPerformed(evt);
            }
        });

        FilterLabel.setBackground(new java.awt.Color(27, 26, 85));
        FilterLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FilterLabel.setForeground(new java.awt.Color(255, 255, 255));
        FilterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FilterLabel.setText("Filter");
        FilterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        EditBtn.setBackground(new java.awt.Color(83, 92, 145));
        EditBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(83, 92, 145));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(83, 92, 145));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ItemsManagementTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ItemsManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        ItemsManagementTable.setRowHeight(25);
        ItemsManagementTable.setShowHorizontalLines(true);
        ItemsManagementTable.setShowVerticalLines(true);
        ItemsManagementTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsManagementTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemsManagementTable);

        ReloadBtn.setBackground(new java.awt.Color(83, 92, 145));
        ReloadBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReloadBtn.setForeground(new java.awt.Color(255, 255, 255));
        ReloadBtn.setText("Reload");
        ReloadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReloadBtnMouseClicked(evt);
            }
        });
        ReloadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(TitleItemsManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ItemsListDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PriceLabel)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(PriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(EditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(AddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ReloadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addComponent(ItemsListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleItemsManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(CategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReloadBtn)
                .addGap(18, 18, 18)
                .addComponent(ItemsListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemsListDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        NavItems.setBackground(new java.awt.Color(27, 26, 85));
        NavItems.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NavItems.setForeground(new java.awt.Color(255, 255, 255));
        NavItems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NavItems.setText("Items");
        NavItems.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NavItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NavItemsMouseClicked(evt);
            }
        });

        LogOutBtn.setBackground(new java.awt.Color(27, 26, 85));
        LogOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogOutBtn.setText("Log Out");
        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NavItems, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(NavItems, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Items() {
        initComponents();
        ShowProducts();
    }
    int increaseId;
    ResultSet resultSet = null;
    Statement statement = null;
    
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
       if(NameInput.getText().isEmpty() || PriceInput.getText().isEmpty() || CategoryDropdown.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
                // Cek apakah item sudah ada dalam database
//                countProd();
                String itemName = NameInput.getText();
                String category = CategoryDropdown.getSelectedItem().toString();
                int price = Integer.parseInt(PriceInput.getText());

                PreparedStatement preStatement = connection.prepareStatement("DELETE FROM m_product WHERE id = ?");
                preStatement.setInt(1, Key);
                int row = preStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item Deleted!");
                ShowProducts();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ShowProducts() {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from m_product");
            ItemsManagementTable.setModel(DbUtils.resultSetToTableModel(resultSet));
                
        } catch (SQLException ex) {
            System.out.println("exception = " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "An error occurred while retrieving the list of items. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void CountProd() {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
            {
                Statement statement = connection.createStatement();
                ResultSet executeQuery = statement.executeQuery("select max(id) from m_product");
                executeQuery.next();
                increaseId = executeQuery.getInt(1) + 1;

            } 
        }   catch (SQLException ex) {

        }
    }
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
         // TODO add your handling code here:
       if(NameInput.getText().isEmpty() || PriceInput.getText().isEmpty() || CategoryDropdown.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
                // Cek apakah item sudah ada dalam database
                // CountProd();
                String itemName = NameInput.getText();
                String category = CategoryDropdown.getSelectedItem().toString();
                int price = Integer.parseInt(PriceInput.getText());

                PreparedStatement preStatement = connection.prepareStatement("INSERT INTO m_product(name, category, price) VALUES(?, ?, ?)");
                // id -> preStatement.setInt(1, increaseId)
                preStatement.setString(1, NameInput.getText());
                preStatement.setString(2, CategoryDropdown.getSelectedItem().toString());
                preStatement.setInt(3, Integer.parseInt(PriceInput.getText()));
                int row = preStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item Added!");
                ShowProducts();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        if (NameInput.getText().isEmpty() || PriceInput.getText().isEmpty() || CategoryDropdown.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
                // Cek apakah item sudah ada dalam database
                String itemName = NameInput.getText();
                String category = CategoryDropdown.getSelectedItem().toString();
                int price = Integer.parseInt(PriceInput.getText());

                PreparedStatement preStatement = connection.prepareStatement("UPDATE m_product SET name=?, category=?, price=? WHERE id=?");
                preStatement.setString(1, NameInput.getText());
                preStatement.setString(2, CategoryDropdown.getSelectedItem().toString());
                preStatement.setInt(3, Integer.parseInt(PriceInput.getText()));
                preStatement.setInt(4, Key); // Assuming you have selectedProductId defined somewhere to store the ID of the selected product
                int row = preStatement.executeUpdate();
                if (row > 0) {
                    JOptionPane.showMessageDialog(this, "Item Edited!");
                    ShowProducts(); // Refresh the table with updated data
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to edit item!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void PriceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceInputActionPerformed

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInputActionPerformed

    int Key = 0;
    private void ItemsManagementTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsManagementTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ItemsManagementTable.getModel();
        int selectedRow = ItemsManagementTable.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        NameInput.setText(model.getValueAt(selectedRow, 1).toString());
        PriceInput.setText(model.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_ItemsManagementTableMouseClicked

    private void FilterProducts() {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root")) {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from m_product where category = '" + ItemsListDropdown.getSelectedItem().toString() + "'");
            ItemsManagementTable.setModel(DbUtils.resultSetToTableModel(resultSet));
                
        } catch (SQLException ex) {
            System.out.println("exception = " + ex.getMessage());
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    private void ItemsListDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemsListDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemsListDropdownActionPerformed

    private void ItemsListDropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemsListDropdownItemStateChanged
        FilterProducts();
    }//GEN-LAST:event_ItemsListDropdownItemStateChanged

    private void ReloadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadBtnActionPerformed
        // TODO add your handling code here:
         ShowProducts();
    }//GEN-LAST:event_ReloadBtnActionPerformed

    private void ReloadBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReloadBtnMouseClicked

    }//GEN-LAST:event_ReloadBtnMouseClicked

    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutBtnMouseClicked

    private void NavItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavItemsMouseClicked
        new Items().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NavItemsMouseClicked

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> CategoryDropdown;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel FilterLabel;
    private javax.swing.JComboBox<String> ItemsListDropdown;
    private javax.swing.JLabel ItemsListLabel;
    private javax.swing.JTable ItemsManagementTable;
    private javax.swing.JLabel LogOutBtn;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NavItems;
    private javax.swing.JTextField PriceInput;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JButton ReloadBtn;
    private javax.swing.JLabel TitleItemsManagement;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
