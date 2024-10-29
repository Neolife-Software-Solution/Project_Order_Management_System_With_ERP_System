/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author sanja
 */
public class AddNewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form Add_New_Customer
     */
    public AddNewCustomer() {
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

        HeaderPanel = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        LogOutPanel = new javax.swing.JPanel();
        BackToDashboard = new javax.swing.JButton();
        CustomerViewPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        Search = new javax.swing.JLabel();
        Points = new javax.swing.JLabel();
        PointsTextfield = new javax.swing.JTextField();
        SearchTextfield = new javax.swing.JTextField();
        AddCustomerPanel = new javax.swing.JPanel();
        FirstName = new javax.swing.JLabel();
        FirstNameTextfield = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        LastNameTextfield = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        AddressTextfield = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        EmailAddressTextfield = new javax.swing.JTextField();
        mobile = new javax.swing.JLabel();
        MobileTextfield = new javax.swing.JTextField();
        AddNewCustomerButton = new javax.swing.JButton();
        DeleteCustomerButton = new javax.swing.JButton();
        UpdateCustomerButton = new javax.swing.JButton();
        CustomerID = new javax.swing.JLabel();
        Regenarate = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        HeaderPanel.setPreferredSize(new java.awt.Dimension(656, 60));

        Header.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        Header.setText("New Customer");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(Header)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Header)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        BodyPanel.setLayout(new java.awt.BorderLayout());

        LogOutPanel.setPreferredSize(new java.awt.Dimension(656, 50));

        BackToDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-arrow.png"))); // NOI18N
        BackToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogOutPanelLayout = new javax.swing.GroupLayout(LogOutPanel);
        LogOutPanel.setLayout(LogOutPanelLayout);
        LogOutPanelLayout.setHorizontalGroup(
            LogOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToDashboard)
                .addContainerGap(760, Short.MAX_VALUE))
        );
        LogOutPanelLayout.setVerticalGroup(
            LogOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogOutPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(BackToDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BodyPanel.add(LogOutPanel, java.awt.BorderLayout.PAGE_END);

        CustomerTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Address", "Email", "Mobile", "Points"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(CustomerTable);

        Search.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Search.setText("Full Name / Email / Mobile");

        Points.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Points.setText("Ponits");

        PointsTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        SearchTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        AddCustomerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddCustomerPanel.setPreferredSize(new java.awt.Dimension(656, 200));

        FirstName.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        FirstName.setText("First Name");

        FirstNameTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        LastName.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        LastName.setText("Last Name ");

        LastNameTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LastNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextfieldActionPerformed(evt);
            }
        });

        Address.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Address.setText("Address");

        AddressTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        Email.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Email.setText("Email Address");

        EmailAddressTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmailAddressTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressTextfieldActionPerformed(evt);
            }
        });

        mobile.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        mobile.setText("Mobile No");

        MobileTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MobileTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileTextfieldActionPerformed(evt);
            }
        });

        AddNewCustomerButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddNewCustomerButton.setText("Add New Customer ");
        AddNewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewCustomerButtonActionPerformed(evt);
            }
        });

        DeleteCustomerButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DeleteCustomerButton.setText("Delete Customer");
        DeleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerButtonActionPerformed(evt);
            }
        });

        UpdateCustomerButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UpdateCustomerButton.setText("Update Customer");
        UpdateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustomerButtonActionPerformed(evt);
            }
        });

        CustomerID.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CustomerID.setText("Customer ID");

        Regenarate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/generate.png"))); // NOI18N

        javax.swing.GroupLayout AddCustomerPanelLayout = new javax.swing.GroupLayout(AddCustomerPanel);
        AddCustomerPanel.setLayout(AddCustomerPanelLayout);
        AddCustomerPanelLayout.setHorizontalGroup(
            AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                        .addComponent(CustomerID)
                        .addGap(51, 51, 51)
                        .addComponent(Regenarate))
                    .addComponent(FirstName)
                    .addComponent(LastName)
                    .addComponent(FirstNameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(LastNameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Address)
                    .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Email)
                        .addComponent(mobile)
                        .addComponent(EmailAddressTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addComponent(MobileTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addComponent(AddressTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddNewCustomerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(UpdateCustomerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        AddCustomerPanelLayout.setVerticalGroup(
            AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(AddNewCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Regenarate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(FirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FirstNameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastNameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCustomerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddressTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MobileTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailAddressTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomerViewPanelLayout = new javax.swing.GroupLayout(CustomerViewPanel);
        CustomerViewPanel.setLayout(CustomerViewPanelLayout);
        CustomerViewPanelLayout.setHorizontalGroup(
            CustomerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerViewPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(CustomerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search)
                    .addComponent(SearchTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CustomerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Points)
                    .addComponent(PointsTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Refresh)
                .addGap(41, 41, 41))
            .addGroup(CustomerViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(AddCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        CustomerViewPanelLayout.setVerticalGroup(
            CustomerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerViewPanelLayout.createSequentialGroup()
                .addComponent(AddCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CustomerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CustomerViewPanelLayout.createSequentialGroup()
                        .addComponent(Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CustomerViewPanelLayout.createSequentialGroup()
                        .addComponent(Points)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PointsTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        BodyPanel.add(CustomerViewPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(BodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewCustomerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddNewCustomerButtonActionPerformed

    private void DeleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteCustomerButtonActionPerformed

    private void UpdateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustomerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateCustomerButtonActionPerformed

    private void MobileTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileTextfieldActionPerformed

    private void BackToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardActionPerformed

//        Logout Button
        System.exit(0);
        
    }//GEN-LAST:event_BackToDashboardActionPerformed

    private void EmailAddressTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressTextfieldActionPerformed

    private void LastNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextfieldActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddCustomerPanel;
    private javax.swing.JButton AddNewCustomerButton;
    private javax.swing.JLabel Address;
    private javax.swing.JTextField AddressTextfield;
    private javax.swing.JButton BackToDashboard;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JPanel CustomerViewPanel;
    private javax.swing.JButton DeleteCustomerButton;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailAddressTextfield;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameTextfield;
    private javax.swing.JLabel Header;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameTextfield;
    private javax.swing.JPanel LogOutPanel;
    private javax.swing.JTextField MobileTextfield;
    private javax.swing.JLabel Points;
    private javax.swing.JTextField PointsTextfield;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel Regenarate;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField SearchTextfield;
    private javax.swing.JButton UpdateCustomerButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mobile;
    // End of variables declaration//GEN-END:variables
}
