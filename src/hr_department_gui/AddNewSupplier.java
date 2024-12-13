/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author 2003k
 */
public class AddNewSupplier extends javax.swing.JFrame {

    /**
     * Creates new form AddNewSupplier
     */
    public AddNewSupplier() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        kButton1 = new com.k33ptoo.components.KButton();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        supplierAddPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SupplierIdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ContactTextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LastNameTextfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EmailTextfield = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        addButton = new com.k33ptoo.components.KButton();
        updateButton = new com.k33ptoo.components.KButton();
        deleteButton = new com.k33ptoo.components.KButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        CompanyComboBox = new javax.swing.JComboBox<>();
        BackToDashboardPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();

        kButton1.setText("kButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(153, 153, 153));
        headerPanel.setPreferredSize(new java.awt.Dimension(928, 45));
        headerPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Supplier ");
        jLabel1.setPreferredSize(new java.awt.Dimension(181, 50));
        headerPanel.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        supplierAddPanel.setPreferredSize(new java.awt.Dimension(946, 234));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Supplier ID");

        SupplierIdTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Gender");

        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setText("Male");

        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("First Name");

        FirstNameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Contact");

        ContactTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Last Name");

        LastNameTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        EmailTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmailTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextfieldActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addButton.setkEndColor(new java.awt.Color(0, 204, 204));
        addButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        addButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        addButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        addButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        addButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        addButton.setkStartColor(new java.awt.Color(0, 102, 153));

        updateButton.setText("Update");
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setkEndColor(new java.awt.Color(0, 204, 204));
        updateButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        updateButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        updateButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkStartColor(new java.awt.Color(0, 102, 153));

        deleteButton.setText("Delete");
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setkEndColor(new java.awt.Color(0, 204, 204));
        deleteButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        deleteButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        deleteButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkStartColor(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout supplierAddPanelLayout = new javax.swing.GroupLayout(supplierAddPanel);
        supplierAddPanel.setLayout(supplierAddPanelLayout);
        supplierAddPanelLayout.setHorizontalGroup(
            supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierAddPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SupplierIdTextField))
                    .addGroup(supplierAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastNameTextfield)))
                .addGap(128, 128, 128)
                .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supplierAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FemaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(supplierAddPanelLayout.createSequentialGroup()
                        .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailTextfield)
                            .addComponent(ContactTextfield))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierAddPanelLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        supplierAddPanelLayout.setVerticalGroup(
            supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierAddPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupplierIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FemaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(supplierAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bodyPanel.add(supplierAddPanel, java.awt.BorderLayout.PAGE_START);

        SupplierTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "First Name", "Last Name", "Contact", "Email", "Company", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(SupplierTable);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Company");

        CompanyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CompanyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CompanyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CompanyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        bodyPanel.add(tablePanel, java.awt.BorderLayout.CENTER);

        BackToDashboardPanel.setBackground(new java.awt.Color(153, 153, 153));
        BackToDashboardPanel.setPreferredSize(new java.awt.Dimension(946, 50));

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
                .addContainerGap(902, Short.MAX_VALUE))
        );
        BackToDashboardPanelLayout.setVerticalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackToDashboardButton)
                .addContainerGap())
        );

        bodyPanel.add(BackToDashboardPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CompanyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyComboBoxActionPerformed

    private void EmailTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextfieldActionPerformed

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
      
        this.dispose();
        
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
                new AddNewSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JPanel BackToDashboardPanel;
    private javax.swing.JComboBox<String> CompanyComboBox;
    private javax.swing.JTextField ContactTextfield;
    private javax.swing.JTextField EmailTextfield;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField LastNameTextfield;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JTextField SupplierIdTextField;
    private javax.swing.JTable SupplierTable;
    private com.k33ptoo.components.KButton addButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.k33ptoo.components.KButton deleteButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JPanel supplierAddPanel;
    private javax.swing.JPanel tablePanel;
    private com.k33ptoo.components.KButton updateButton;
    // End of variables declaration//GEN-END:variables
}
