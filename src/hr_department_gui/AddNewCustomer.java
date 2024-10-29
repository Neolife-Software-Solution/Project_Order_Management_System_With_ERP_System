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
        jButton1 = new javax.swing.JButton();
        CustomerViewPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EmpID3 = new javax.swing.JLabel();
        EmpName3 = new javax.swing.JLabel();
        EmpNameTextfield3 = new javax.swing.JTextField();
        EmpIDTextfield2 = new javax.swing.JTextField();
        AddCustomerPanel = new javax.swing.JPanel();
        EmpID1 = new javax.swing.JLabel();
        EmpIDTextfield = new javax.swing.JTextField();
        EmpName = new javax.swing.JLabel();
        EmpNameTextfield = new javax.swing.JTextField();
        EmpName1 = new javax.swing.JLabel();
        EmpNameTextfield1 = new javax.swing.JTextField();
        EmpID2 = new javax.swing.JLabel();
        EmpIDTextfield1 = new javax.swing.JTextField();
        EmpName2 = new javax.swing.JLabel();
        EmpNameTextfield2 = new javax.swing.JTextField();
        AddNewCustomerButton = new javax.swing.JButton();
        DeleteCustomerButton = new javax.swing.JButton();
        UpdateCustomerButton = new javax.swing.JButton();
        EmpID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogOutPanelLayout = new javax.swing.GroupLayout(LogOutPanel);
        LogOutPanel.setLayout(LogOutPanelLayout);
        LogOutPanelLayout.setHorizontalGroup(
            LogOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(760, Short.MAX_VALUE))
        );
        LogOutPanelLayout.setVerticalGroup(
            LogOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogOutPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BodyPanel.add(LogOutPanel, java.awt.BorderLayout.PAGE_END);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        EmpID3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpID3.setText("Full Name / Email / Mobile");

        EmpName3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpName3.setText("Ponits");

        EmpNameTextfield3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        EmpIDTextfield2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        AddCustomerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddCustomerPanel.setPreferredSize(new java.awt.Dimension(656, 200));

        EmpID1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpID1.setText("First Name");

        EmpIDTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        EmpName.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpName.setText("Last Name ");

        EmpNameTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmpNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNameTextfieldActionPerformed(evt);
            }
        });

        EmpName1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpName1.setText("Address");

        EmpNameTextfield1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        EmpID2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpID2.setText("Email Address");

        EmpIDTextfield1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmpIDTextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIDTextfield1ActionPerformed(evt);
            }
        });

        EmpName2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpName2.setText("Mobile No");

        EmpNameTextfield2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmpNameTextfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNameTextfield2ActionPerformed(evt);
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

        EmpID.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpID.setText("Customer ID");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/generate.png"))); // NOI18N

        javax.swing.GroupLayout AddCustomerPanelLayout = new javax.swing.GroupLayout(AddCustomerPanel);
        AddCustomerPanel.setLayout(AddCustomerPanelLayout);
        AddCustomerPanelLayout.setHorizontalGroup(
            AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCustomerPanelLayout.createSequentialGroup()
                        .addComponent(EmpID)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addComponent(EmpID1)
                    .addComponent(EmpName)
                    .addComponent(EmpIDTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(EmpNameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpName1)
                    .addGroup(AddCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EmpID2)
                        .addComponent(EmpName2)
                        .addComponent(EmpIDTextfield1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addComponent(EmpNameTextfield2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addComponent(EmpNameTextfield1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
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
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(EmpID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpIDTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpNameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCustomerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EmpName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpNameTextfield1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpNameTextfield2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpID2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpIDTextfield1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomerViewPanelLayout = new javax.swing.GroupLayout(CustomerViewPanel);
        CustomerViewPanel.setLayout(CustomerViewPanelLayout);
        CustomerViewPanelLayout.setHorizontalGroup(
            CustomerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerViewPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(CustomerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpID3)
                    .addComponent(EmpIDTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CustomerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpName3)
                    .addComponent(EmpNameTextfield3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
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
                        .addComponent(EmpID3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpIDTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CustomerViewPanelLayout.createSequentialGroup()
                        .addComponent(EmpName3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpNameTextfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
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

    private void EmpNameTextfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNameTextfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpNameTextfield2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        Logout Button
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EmpIDTextfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIDTextfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpIDTextfield1ActionPerformed

    private void EmpNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpNameTextfieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel CustomerViewPanel;
    private javax.swing.JButton DeleteCustomerButton;
    private javax.swing.JLabel EmpID;
    private javax.swing.JLabel EmpID1;
    private javax.swing.JLabel EmpID2;
    private javax.swing.JLabel EmpID3;
    private javax.swing.JTextField EmpIDTextfield;
    private javax.swing.JTextField EmpIDTextfield1;
    private javax.swing.JTextField EmpIDTextfield2;
    private javax.swing.JLabel EmpName;
    private javax.swing.JLabel EmpName1;
    private javax.swing.JLabel EmpName2;
    private javax.swing.JLabel EmpName3;
    private javax.swing.JTextField EmpNameTextfield;
    private javax.swing.JTextField EmpNameTextfield1;
    private javax.swing.JTextField EmpNameTextfield2;
    private javax.swing.JTextField EmpNameTextfield3;
    private javax.swing.JLabel Header;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel LogOutPanel;
    private javax.swing.JButton UpdateCustomerButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
