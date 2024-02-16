/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package management.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.Document;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Devi
 */
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        SellerInput = new javax.swing.JTextField();
        SellerLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsListTable = new javax.swing.JTable();
        NameInput = new javax.swing.JTextField();
        PriceInput = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        QuantityInput = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        AddBillBtn = new javax.swing.JButton();
        MoneyPaidLabel = new javax.swing.JLabel();
        MoneyPaidInput = new javax.swing.JTextField();
        ReturnInput = new javax.swing.JTextField();
        ReturnLabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        TotalInput = new javax.swing.JTextField();
        CountMoneyBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JLabel();
        NavSelling = new javax.swing.JLabel();
        NavViewSells = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(83, 92, 145));

        jPanel2.setBackground(new java.awt.Color(27, 26, 85));

        jLabel4.setBackground(new java.awt.Color(27, 26, 85));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sell Products");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NameLabel.setBackground(new java.awt.Color(27, 26, 85));
        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Name");
        NameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SellerInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SellerInput.setText("Who are you ...");
        SellerInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerInputActionPerformed(evt);
            }
        });

        SellerLabel.setBackground(new java.awt.Color(27, 26, 85));
        SellerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SellerLabel.setForeground(new java.awt.Color(255, 255, 255));
        SellerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SellerLabel.setText("Seller");
        SellerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setBackground(new java.awt.Color(27, 26, 85));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Your Bill");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PrintBtn.setBackground(new java.awt.Color(83, 92, 145));
        PrintBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        ItemsListTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ItemsListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ItemsListTable.setRowHeight(25);
        ItemsListTable.setShowHorizontalLines(true);
        ItemsListTable.setShowVerticalLines(true);
        ItemsListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemsListTable);

        NameInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });

        PriceInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        QuantityLabel.setBackground(new java.awt.Color(27, 26, 85));
        QuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuantityLabel.setText("Quantity");
        QuantityLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        QuantityInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        QuantityInput.setText("How Much ...");
        QuantityInput.setToolTipText("");
        QuantityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityInputActionPerformed(evt);
            }
        });

        BillTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillTable.setRowHeight(25);
        BillTable.setShowHorizontalLines(true);
        BillTable.setShowVerticalLines(true);
        jScrollPane2.setViewportView(BillTable);

        AddBillBtn.setBackground(new java.awt.Color(83, 92, 145));
        AddBillBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBillBtn.setText("Add to Bill");
        AddBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBillBtnActionPerformed(evt);
            }
        });

        MoneyPaidLabel.setBackground(new java.awt.Color(83, 92, 145));
        MoneyPaidLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MoneyPaidLabel.setForeground(new java.awt.Color(255, 255, 255));
        MoneyPaidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MoneyPaidLabel.setText("Money Paid :");
        MoneyPaidLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MoneyPaidInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MoneyPaidInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyPaidInputActionPerformed(evt);
            }
        });

        ReturnInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ReturnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnInputActionPerformed(evt);
            }
        });

        ReturnLabel.setBackground(new java.awt.Color(83, 92, 145));
        ReturnLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReturnLabel.setForeground(new java.awt.Color(255, 255, 255));
        ReturnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReturnLabel.setText("Return :");
        ReturnLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TotalLabel.setBackground(new java.awt.Color(83, 92, 145));
        TotalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalLabel.setText("Total :");
        TotalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TotalInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TotalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalInputActionPerformed(evt);
            }
        });

        CountMoneyBtn.setBackground(new java.awt.Color(83, 92, 145));
        CountMoneyBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CountMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
        CountMoneyBtn.setText("Count");
        CountMoneyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CountMoneyBtnMouseClicked(evt);
            }
        });
        CountMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountMoneyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel)
                            .addComponent(PriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceLabel))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SellerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellerLabel)
                            .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(AddBillBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MoneyPaidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TotalLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TotalInput)
                                    .addComponent(MoneyPaidInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(CountMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PrintBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ReturnLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ReturnInput)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SellerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SellerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriceLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddBillBtn)
                                    .addComponent(PriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoneyPaidInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoneyPaidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReturnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReturnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrintBtn)
                            .addComponent(CountMoneyBtn))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        LogOutBtn.setBackground(new java.awt.Color(27, 26, 85));
        LogOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogOutBtn.setText("Log out");
        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseClicked(evt);
            }
        });

        NavSelling.setBackground(new java.awt.Color(27, 26, 85));
        NavSelling.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NavSelling.setForeground(new java.awt.Color(255, 255, 255));
        NavSelling.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NavSelling.setText("Selling");
        NavSelling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NavSellingMouseClicked(evt);
            }
        });

        NavViewSells.setBackground(new java.awt.Color(27, 26, 85));
        NavViewSells.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NavViewSells.setForeground(new java.awt.Color(255, 255, 255));
        NavViewSells.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NavViewSells.setText("View Sells");
        NavViewSells.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NavViewSellsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NavSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NavViewSells))
                .addGap(52, 52, 52)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(NavSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NavViewSells, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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

    
 public Selling() {
        initComponents();
        ShowProducts();
        PriceInput.setEditable(false);
        NameInput.setEditable(false);
        MoneyPaidInput.setEditable(false);
        ReturnInput.setEditable(false);
    }

    int increaseId;
    ResultSet resultSet = null;
    Statement statement = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     private void ShowProducts() {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from m_product");
            ItemsListTable.setModel(DbUtils.resultSetToTableModel(resultSet));
                
        } catch (SQLException ex) {
            System.out.println("exception = " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Failed to retrieve product list: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     private void CountBill() {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
            {
                Statement statement = connection.createStatement();
                ResultSet executeQuery = statement.executeQuery("select max(id) from m_bill");
                executeQuery.next();
                increaseId = executeQuery.getInt(1) + 1;

            } 
        }   catch (SQLException ex) {

        }
    }
     
     private void InsertBill() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
              // Cek apakah item sudah ada dalam database
              // CountBill();
              PreparedStatement preStatement = connection.prepareStatement("INSERT INTO m_bill(seller, date, amount, money, return_money) VALUES(?, ?, ?, ?, ?)");
              // id -> preStatement.setInt(1, increaseId);
              preStatement.setString(1, SellerInput.getText());
              preStatement.setString(2, LocalDateTime.now().toString().substring(0, 10));
              preStatement.setInt(3, TotalPrice);
              preStatement.setInt(4, Integer.parseInt(MoneyPaidInput.getText()));
              preStatement.setInt(5, changeMoney);
              int row = preStatement.executeUpdate();
              JOptionPane.showMessageDialog(this, "Bill Added!", "Success", JOptionPane.INFORMATION_MESSAGE);

              ShowProducts();
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Failed to insert bill: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
          }
     }    
    
    private void QuantityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityInputActionPerformed

    private void PriceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceInputActionPerformed

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInputActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        try {
            if (TotalPrice == 0) {
                JOptionPane.showMessageDialog(this, "The product has not been added yet!");
            } else {
                // Check if enough money is paid
                int moneyPaid = Integer.parseInt(MoneyPaidInput.getText());
                if (moneyPaid >= TotalPrice) {
                    InsertBill();
                    BillTable.print();

                    // Clear fields after printing
                    MoneyPaidInput.setText("");
                    ReturnInput.setText("");
                    QuantityInput.setText("");
                    PrintBtn.setEnabled(false); // Disable Print button until next payment

                    // Reset TotalPrice
                    TotalPrice = 0;
                    TotalInput.setText("Rp. " + TotalPrice);

                    // Make MoneyPaidInput non-editable again
                    MoneyPaidInput.setEditable(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient payment!");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_PrintBtnActionPerformed
    
    private void SellerInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerInputActionPerformed

    int TotalPrice = 0;
    private void AddBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBillBtnActionPerformed
       if (NameInput.getText().isEmpty() || QuantityInput.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            int Total = Integer.parseInt(PriceInput.getText()) * Integer.parseInt(QuantityInput.getText());
            TotalPrice += Total;
            TotalInput.setText("Rp. " + TotalPrice);

            DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
            String nextRowId = String.valueOf(model.getRowCount());
            model.addRow(new Object[]{
                Integer.parseInt(nextRowId) + 1,
                NameInput.getText(),
                PriceInput.getText(),
                QuantityInput.getText(),
                Total
            });

            MoneyPaidInput.setEditable(true); // Allow editing of money paid after adding products
        }
    }//GEN-LAST:event_AddBillBtnActionPerformed
    
    int changeMoney = 0;
    private void CalculateReturn() {
        try {
            int moneyPaid = Integer.parseInt(MoneyPaidInput.getText());
            int returnAmount = moneyPaid - TotalPrice;
            if (returnAmount >= 0) {
                ReturnInput.setText("Rp. " + returnAmount);
                changeMoney = returnAmount;
                PrintBtn.setEnabled(true); // Enable print button only if enough money is paid
            } else {
                ReturnInput.setText("");
                PrintBtn.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Insufficient payment!");
            }
        } catch (NumberFormatException ex) {
            // Handle non-integer input in MoneyPaidInput
            ReturnInput.setText("");
            PrintBtn.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Invalid input for money paid!");
        }
    }

    
    int Key = 0;
    private void ItemsListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsListTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ItemsListTable.getModel();
        int selectedRow = ItemsListTable.getSelectedRow();
        Key = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        NameInput.setText(model.getValueAt(selectedRow, 1).toString());
        PriceInput.setText(model.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_ItemsListTableMouseClicked

    private void MoneyPaidInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyPaidInputActionPerformed
        
    }//GEN-LAST:event_MoneyPaidInputActionPerformed

    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutBtnMouseClicked

    private void NavSellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavSellingMouseClicked
        new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NavSellingMouseClicked

    private void NavViewSellsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavViewSellsMouseClicked
        new ViewSells().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NavViewSellsMouseClicked

    private void ReturnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnInputActionPerformed

    private void TotalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalInputActionPerformed

    private void CountMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountMoneyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountMoneyBtnActionPerformed

    private void CountMoneyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CountMoneyBtnMouseClicked
        CalculateReturn();
    }//GEN-LAST:event_CountMoneyBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBillBtn;
    private javax.swing.JTable BillTable;
    private javax.swing.JButton CountMoneyBtn;
    private javax.swing.JTable ItemsListTable;
    private javax.swing.JLabel LogOutBtn;
    private javax.swing.JTextField MoneyPaidInput;
    private javax.swing.JLabel MoneyPaidLabel;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NavSelling;
    private javax.swing.JLabel NavViewSells;
    private javax.swing.JTextField PriceInput;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QuantityInput;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JTextField ReturnInput;
    private javax.swing.JLabel ReturnLabel;
    private javax.swing.JTextField SellerInput;
    private javax.swing.JLabel SellerLabel;
    private javax.swing.JTextField TotalInput;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
