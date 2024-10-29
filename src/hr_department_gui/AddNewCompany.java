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
public class AddNewCompany extends javax.swing.JFrame {

    /**
     * Creates new form AddNewCompany
     */
    public AddNewCompany() {
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

        headerPanal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        companyRegisterPanel = new javax.swing.JPanel();
        CompanyEmailTextfield = new javax.swing.JTextField();
        RegenarateButton = new javax.swing.JButton();
        CompanyNameTextfield = new javax.swing.JTextField();
        CompanyIdTextfield = new javax.swing.JTextField();
        CompanyHotlineNumberTextfield = new javax.swing.JTextField();
        CompanyAddressTextfield = new javax.swing.JTextField();
        buttonTableViewPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        SearchCompanyNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompanyRegistrationTable = new javax.swing.JTable();
        BackPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanal.setPreferredSize(new java.awt.Dimension(936, 45));
        headerPanal.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Company Registration");
        jLabel1.setPreferredSize(new java.awt.Dimension(298, 50));
        headerPanal.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(headerPanal, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        companyRegisterPanel.setPreferredSize(new java.awt.Dimension(936, 190));

        CompanyEmailTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CompanyEmailTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CompanyEmailTextfield.setText("Company Email");
        CompanyEmailTextfield.setPreferredSize(new java.awt.Dimension(106, 32));
        CompanyEmailTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyEmailTextfieldActionPerformed(evt);
            }
        });

        RegenarateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/generate.png"))); // NOI18N

        CompanyNameTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CompanyNameTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CompanyNameTextfield.setText("Company Name");
        CompanyNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyNameTextfieldActionPerformed(evt);
            }
        });

        CompanyIdTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CompanyIdTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CompanyIdTextfield.setText("Company ID");
        CompanyIdTextfield.setPreferredSize(new java.awt.Dimension(106, 32));

        CompanyHotlineNumberTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CompanyHotlineNumberTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CompanyHotlineNumberTextfield.setText("Company Hotline Number");

        CompanyAddressTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CompanyAddressTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CompanyAddressTextfield.setText("Company Address");
        CompanyAddressTextfield.setPreferredSize(new java.awt.Dimension(106, 32));
        CompanyAddressTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyAddressTextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout companyRegisterPanelLayout = new javax.swing.GroupLayout(companyRegisterPanel);
        companyRegisterPanel.setLayout(companyRegisterPanelLayout);
        companyRegisterPanelLayout.setHorizontalGroup(
            companyRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(companyRegisterPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(companyRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CompanyEmailTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(CompanyAddressTextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompanyIdTextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(RegenarateButton)
                .addGap(293, 293, 293)
                .addGroup(companyRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CompanyHotlineNumberTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(CompanyNameTextfield))
                .addGap(131, 131, 131))
        );
        companyRegisterPanelLayout.setVerticalGroup(
            companyRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(companyRegisterPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(companyRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CompanyNameTextfield)
                    .addComponent(RegenarateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompanyIdTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(companyRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyAddressTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CompanyHotlineNumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CompanyEmailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        bodyPanel.add(companyRegisterPanel, java.awt.BorderLayout.PAGE_START);

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddButton.setText("Add");

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UpdateButton.setText("Update");

        RemoveButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RemoveButton.setText("Remove");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Company Name");

        CompanyRegistrationTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CompanyRegistrationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Company Name", "Company Address", "Hotline Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CompanyRegistrationTable);

        BackPanel.setPreferredSize(new java.awt.Dimension(1025, 50));

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-arrow.png"))); // NOI18N
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addComponent(BackButton)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchCompanyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(134, 134, 134))))
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchCompanyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout buttonTableViewPanelLayout = new javax.swing.GroupLayout(buttonTableViewPanel);
        buttonTableViewPanel.setLayout(buttonTableViewPanelLayout);
        buttonTableViewPanelLayout.setHorizontalGroup(
            buttonTableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonTableViewPanelLayout.setVerticalGroup(
            buttonTableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonTableViewPanelLayout.createSequentialGroup()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyPanel.add(buttonTableViewPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CompanyNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyNameTextfieldActionPerformed

    private void CompanyEmailTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyEmailTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyEmailTextfieldActionPerformed

    private void CompanyAddressTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyAddressTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyAddressTextfieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
         FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JTextField CompanyAddressTextfield;
    private javax.swing.JTextField CompanyEmailTextfield;
    private javax.swing.JTextField CompanyHotlineNumberTextfield;
    private javax.swing.JTextField CompanyIdTextfield;
    private javax.swing.JTextField CompanyNameTextfield;
    private javax.swing.JTable CompanyRegistrationTable;
    private javax.swing.JButton RegenarateButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTextField SearchCompanyNameTextField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel buttonTableViewPanel;
    private javax.swing.JPanel companyRegisterPanel;
    private javax.swing.JPanel headerPanal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
