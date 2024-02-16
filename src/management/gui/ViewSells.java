package management.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ViewSells extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TitleListOfSells = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListSellsTable = new javax.swing.JTable();
        NavSelling = new javax.swing.JLabel();
        NavViewSells = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(83, 92, 145));

        jPanel2.setBackground(new java.awt.Color(27, 26, 85));

        TitleListOfSells.setBackground(new java.awt.Color(27, 26, 85));
        TitleListOfSells.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TitleListOfSells.setForeground(new java.awt.Color(255, 255, 255));
        TitleListOfSells.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleListOfSells.setText("List of Sells");
        TitleListOfSells.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ListSellsTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListSellsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ListSellsTable.setRowHeight(25);
        ListSellsTable.setShowHorizontalLines(true);
        ListSellsTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(ListSellsTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(TitleListOfSells, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleListOfSells, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                    .addComponent(NavViewSells)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LogOutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NavSelling, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                .addGap(84, 84, 84)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(NavSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NavViewSells, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

    public ViewSells() {
        initComponents();
        ShowBill();
    }

    int increaseId;
    ResultSet resultSet = null;
    Statement statement = null;
    
    private void ShowBill() {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop_db", "root", "root")) {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from m_bill");
            ListSellsTable.setModel(DbUtils.resultSetToTableModel(resultSet));
                
        } catch (SQLException ex) {
            System.out.println("exception = " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "An error occurred while retrieving the list of sells. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutBtnMouseClicked

    private void NavViewSellsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavViewSellsMouseClicked
        new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NavViewSellsMouseClicked

    private void NavSellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavSellingMouseClicked
        new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NavSellingMouseClicked

    
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
            java.util.logging.Logger.getLogger(ViewSells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSells().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListSellsTable;
    private javax.swing.JLabel LogOutBtn;
    private javax.swing.JLabel NavSelling;
    private javax.swing.JLabel NavViewSells;
    private javax.swing.JLabel TitleListOfSells;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
