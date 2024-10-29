/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author Avishka
 */
public class ManageEmployee extends javax.swing.JFrame {

    /**
     * Creates new form ManageEmployee
     */
    public ManageEmployee() {
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
        BackToDashboardPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        addingPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        SearchPanel = new javax.swing.JPanel();
        EmployeeSearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        EmployeeStatusComboBox = new javax.swing.JComboBox<>();
        EmployeeStatusLabel = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        DepartmentLabel2 = new javax.swing.JLabel();
        DepartmentComboBox2 = new javax.swing.JComboBox<>();
        DateOfHireLabel2 = new javax.swing.JLabel();
        StatusLabel2 = new javax.swing.JLabel();
        StatusComboBox2 = new javax.swing.JComboBox<>();
        UpdateButton2 = new javax.swing.JButton();
        DateOfHireComboBox2 = new javax.swing.JComboBox<>();
        JobTitleLabel2 = new javax.swing.JLabel();
        JobTitleComboBox2 = new javax.swing.JComboBox<>();
        EmployeeTypeLabel2 = new javax.swing.JLabel();
        EmployeeTypeComboBox2 = new javax.swing.JComboBox<>();
        DeleteButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ManageEmployeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setPreferredSize(new java.awt.Dimension(896, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employee");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addGap(280, 280, 280))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        BackToDashboardPanel.setPreferredSize(new java.awt.Dimension(896, 50));

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
                .addContainerGap(1082, Short.MAX_VALUE))
        );
        BackToDashboardPanelLayout.setVerticalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackToDashboardButton)
                .addContainerGap())
        );

        getContentPane().add(BackToDashboardPanel, java.awt.BorderLayout.PAGE_END);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        addingPanel.setLayout(new java.awt.BorderLayout());

        SearchPanel.setPreferredSize(new java.awt.Dimension(803, 130));

        EmployeeSearchField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmployeeSearchField.setText("Search by Name or ID");

        SearchButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SearchButton.setText("Search");

        EmployeeStatusComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EmployeeStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmployeeStatusComboBox.setPreferredSize(new java.awt.Dimension(75, 32));

        EmployeeStatusLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmployeeStatusLabel.setText("Employee Status");

        RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(EmployeeStatusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmployeeStatusComboBox, 0, 253, Short.MAX_VALUE)
                        .addGap(184, 184, 184))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(EmployeeSearchField)
                        .addGap(100, 100, 100)))
                .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(EmployeeSearchField))
                    .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(EmployeeStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(EmployeeStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1126, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 50, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        addingPanel.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(1026, 230));

        DepartmentLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DepartmentLabel2.setText("Sort By Department");
        DepartmentLabel2.setPreferredSize(new java.awt.Dimension(122, 32));

        DepartmentComboBox2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DepartmentComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DepartmentComboBox2.setPreferredSize(new java.awt.Dimension(75, 32));
        DepartmentComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentComboBox2ActionPerformed(evt);
            }
        });

        DateOfHireLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DateOfHireLabel2.setText("Sort By Date of Hire");
        DateOfHireLabel2.setPreferredSize(new java.awt.Dimension(122, 32));

        StatusLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        StatusLabel2.setText("Sort By Status");
        StatusLabel2.setPreferredSize(new java.awt.Dimension(86, 32));

        StatusComboBox2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        StatusComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        StatusComboBox2.setPreferredSize(new java.awt.Dimension(75, 32));
        StatusComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusComboBox2ActionPerformed(evt);
            }
        });

        UpdateButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UpdateButton2.setText("Update");
        UpdateButton2.setPreferredSize(new java.awt.Dimension(72, 32));
        UpdateButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton2ActionPerformed(evt);
            }
        });

        DateOfHireComboBox2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DateOfHireComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DateOfHireComboBox2.setPreferredSize(new java.awt.Dimension(75, 32));
        DateOfHireComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateOfHireComboBox2ActionPerformed(evt);
            }
        });

        JobTitleLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JobTitleLabel2.setText("Sort By Job Title");
        JobTitleLabel2.setPreferredSize(new java.awt.Dimension(98, 32));

        JobTitleComboBox2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JobTitleComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JobTitleComboBox2.setPreferredSize(new java.awt.Dimension(72, 32));

        EmployeeTypeLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmployeeTypeLabel2.setText("Sort By Employee Type");
        EmployeeTypeLabel2.setPreferredSize(new java.awt.Dimension(140, 32));

        EmployeeTypeComboBox2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EmployeeTypeComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmployeeTypeComboBox2.setMinimumSize(new java.awt.Dimension(72, 25));
        EmployeeTypeComboBox2.setPreferredSize(new java.awt.Dimension(75, 32));

        DeleteButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DeleteButton2.setText("Delete");
        DeleteButton2.setPreferredSize(new java.awt.Dimension(72, 32));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(DeleteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DepartmentLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StatusLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateOfHireLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateOfHireComboBox2, 0, 222, Short.MAX_VALUE)
                            .addComponent(StatusComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DepartmentComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(210, 210, 210)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmployeeTypeLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(JobTitleLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JobTitleComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeTypeComboBox2, 0, 222, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DepartmentComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DepartmentLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateOfHireComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateOfHireLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JobTitleLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JobTitleComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmployeeTypeComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmployeeTypeLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(StatusComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        addingPanel.add(jPanel4, java.awt.BorderLayout.CENTER);

        bodyPanel.add(addingPanel, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(1026, 200));

        ManageEmployeeTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ManageEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Contact Number", "Email", "Address", "Gender", "Date of Birth", "Department", "Job Title", "Employee Type", "Date of Hire", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageEmployeeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ManageEmployeeTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        bodyPanel.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BackToDashboardButtonActionPerformed

    private void DepartmentComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentComboBox2ActionPerformed

    private void StatusComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusComboBox2ActionPerformed

    private void UpdateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButton2ActionPerformed

    private void DateOfHireComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateOfHireComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateOfHireComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JPanel BackToDashboardPanel;
    private javax.swing.JComboBox<String> DateOfHireComboBox2;
    private javax.swing.JLabel DateOfHireLabel2;
    private javax.swing.JButton DeleteButton2;
    private javax.swing.JComboBox<String> DepartmentComboBox2;
    private javax.swing.JLabel DepartmentLabel2;
    private javax.swing.JTextField EmployeeSearchField;
    private javax.swing.JComboBox<String> EmployeeStatusComboBox;
    private javax.swing.JLabel EmployeeStatusLabel;
    private javax.swing.JComboBox<String> EmployeeTypeComboBox2;
    private javax.swing.JLabel EmployeeTypeLabel2;
    private javax.swing.JComboBox<String> JobTitleComboBox2;
    private javax.swing.JLabel JobTitleLabel2;
    private javax.swing.JTable ManageEmployeeTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JComboBox<String> StatusComboBox2;
    private javax.swing.JLabel StatusLabel2;
    private javax.swing.JButton UpdateButton2;
    private javax.swing.JPanel addingPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
