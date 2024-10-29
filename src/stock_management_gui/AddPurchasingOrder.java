/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stock_management_gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author GOLDEN FIELD
 */
public class AddPurchasingOrder extends javax.swing.JFrame {

    /**
     * Creates new form AddPurchasingOrder
     */
    public AddPurchasingOrder() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        grnbatchAndStockaddingPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        grnIdTextField = new javax.swing.JTextField();
        grnIDGenerateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BatchSelectComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        NewBatchAddingTextField = new javax.swing.JTextField();
        NewBatchAddingButton = new javax.swing.JButton();
        SupplierAndSelectProductAddingPanel = new javax.swing.JPanel();
        addProductToGRNS = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SupplierSelectComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        AddProductComboBox = new javax.swing.JTextField();
        GrnStatusSelectComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        GRNaddButton = new javax.swing.JButton();
        GRNupdateButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        GRNSaddingTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GRNaddingtable = new javax.swing.JTable();
        BackToDashboardPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setPreferredSize(new java.awt.Dimension(805, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add GRNS");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(342, 342, 342))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        grnbatchAndStockaddingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        grnbatchAndStockaddingPanel.setPreferredSize(new java.awt.Dimension(783, 132));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("GRN ID");

        grnIdTextField.setEditable(false);
        grnIdTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        grnIDGenerateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/generate.png"))); // NOI18N
        grnIDGenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnIDGenerateButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Select Batch");

        BatchSelectComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BatchSelectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BatchSelectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchSelectComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Add New Batch");

        NewBatchAddingTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        NewBatchAddingButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NewBatchAddingButton.setText("Add New Batch");
        NewBatchAddingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBatchAddingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout grnbatchAndStockaddingPanelLayout = new javax.swing.GroupLayout(grnbatchAndStockaddingPanel);
        grnbatchAndStockaddingPanel.setLayout(grnbatchAndStockaddingPanelLayout);
        grnbatchAndStockaddingPanelLayout.setHorizontalGroup(
            grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grnbatchAndStockaddingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewBatchAddingTextField)
                    .addComponent(grnIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addGroup(grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grnbatchAndStockaddingPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(grnIDGenerateButton)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BatchSelectComboBox, 0, 258, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(grnbatchAndStockaddingPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(NewBatchAddingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        grnbatchAndStockaddingPanelLayout.setVerticalGroup(
            grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grnbatchAndStockaddingPanelLayout.createSequentialGroup()
                .addGroup(grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grnbatchAndStockaddingPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(grnIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BatchSelectComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addComponent(jLabel3))))
                    .addGroup(grnbatchAndStockaddingPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(grnIDGenerateButton)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(grnbatchAndStockaddingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NewBatchAddingTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(NewBatchAddingButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        bodyPanel.add(grnbatchAndStockaddingPanel, java.awt.BorderLayout.PAGE_START);

        SupplierAndSelectProductAddingPanel.setLayout(new java.awt.BorderLayout());

        addProductToGRNS.setPreferredSize(new java.awt.Dimension(815, 128));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Select Supplier");

        SupplierSelectComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        SupplierSelectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Add Product");

        AddProductComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        GrnStatusSelectComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        GrnStatusSelectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Select Status");

        GRNaddButton.setText("Add GRNS");

        GRNupdateButton.setText("Update GRNS");

        javax.swing.GroupLayout addProductToGRNSLayout = new javax.swing.GroupLayout(addProductToGRNS);
        addProductToGRNS.setLayout(addProductToGRNSLayout);
        addProductToGRNSLayout.setHorizontalGroup(
            addProductToGRNSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductToGRNSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addProductToGRNSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addProductToGRNSLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SupplierSelectComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addProductToGRNSLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(GrnStatusSelectComboBox, 0, 269, Short.MAX_VALUE)))
                .addGroup(addProductToGRNSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addProductToGRNSLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddProductComboBox)
                        .addGap(15, 15, 15))
                    .addGroup(addProductToGRNSLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(GRNaddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GRNupdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addContainerGap(121, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
        );
        addProductToGRNSLayout.setVerticalGroup(
            addProductToGRNSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductToGRNSLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(addProductToGRNSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SupplierSelectComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(AddProductComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(addProductToGRNSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GrnStatusSelectComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(GRNaddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(GRNupdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SupplierAndSelectProductAddingPanel.add(addProductToGRNS, java.awt.BorderLayout.PAGE_START);

        GRNaddingtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GRNaddingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Product ID", "Product Name", "QTY", "Batch NO", "Receiving Status", "MFD", "EXP", "Buying Price", "Selling Price", "Discount", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GRNaddingtable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(GRNaddingtable);

        javax.swing.GroupLayout GRNSaddingTablePanelLayout = new javax.swing.GroupLayout(GRNSaddingTablePanel);
        GRNSaddingTablePanel.setLayout(GRNSaddingTablePanelLayout);
        GRNSaddingTablePanelLayout.setHorizontalGroup(
            GRNSaddingTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GRNSaddingTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
        );
        GRNSaddingTablePanelLayout.setVerticalGroup(
            GRNSaddingTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GRNSaddingTablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SupplierAndSelectProductAddingPanel.add(GRNSaddingTablePanel, java.awt.BorderLayout.CENTER);

        BackToDashboardPanel.setPreferredSize(new java.awt.Dimension(833, 50));

        BackToDashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-arrow.png"))); // NOI18N
        BackToDashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToDashboardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackToDashboardPanelLayout = new javax.swing.GroupLayout(BackToDashboardPanel);
        BackToDashboardPanel.setLayout(BackToDashboardPanelLayout);
        BackToDashboardPanelLayout.setHorizontalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToDashboardButton)
                .addContainerGap(786, Short.MAX_VALUE))
        );
        BackToDashboardPanelLayout.setVerticalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToDashboardButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SupplierAndSelectProductAddingPanel.add(BackToDashboardPanel, java.awt.BorderLayout.PAGE_END);

        bodyPanel.add(SupplierAndSelectProductAddingPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BatchSelectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchSelectComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BatchSelectComboBoxActionPerformed

    private void NewBatchAddingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBatchAddingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewBatchAddingButtonActionPerformed

    private void grnIDGenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnIDGenerateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnIDGenerateButtonActionPerformed

    //SignOutButtonCode
    
    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
        
        //Code for exit in system
        
        System.exit(0);
        
    }//GEN-LAST:event_BackToDashboardButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPurchasingOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddProductComboBox;
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JPanel BackToDashboardPanel;
    private javax.swing.JComboBox<String> BatchSelectComboBox;
    private javax.swing.JPanel GRNSaddingTablePanel;
    private javax.swing.JButton GRNaddButton;
    private javax.swing.JTable GRNaddingtable;
    private javax.swing.JButton GRNupdateButton;
    private javax.swing.JComboBox<String> GrnStatusSelectComboBox;
    private javax.swing.JButton NewBatchAddingButton;
    private javax.swing.JTextField NewBatchAddingTextField;
    private javax.swing.JPanel SupplierAndSelectProductAddingPanel;
    private javax.swing.JComboBox<String> SupplierSelectComboBox;
    private javax.swing.JPanel addProductToGRNS;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton grnIDGenerateButton;
    private javax.swing.JTextField grnIdTextField;
    private javax.swing.JPanel grnbatchAndStockaddingPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
