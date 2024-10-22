/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
/**
 *
 * @author DELL
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

        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        SearchPanel = new javax.swing.JPanel();
        EmployeeSearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        EmployeeStatusComboBox = new javax.swing.JComboBox<>();
        EmployeeStatusLabel = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JButton();
        TablePanel = new javax.swing.JPanel();
        TableUpdatePanel = new javax.swing.JPanel();
        DepartmentLabel = new javax.swing.JLabel();
        DepartmentComboBox = new javax.swing.JComboBox<>();
        JobTitleLabel = new javax.swing.JLabel();
        JobTitleComboBox = new javax.swing.JComboBox<>();
        DateOfHireLabel = new javax.swing.JLabel();
        DateOfHireComboBox = new javax.swing.JComboBox<>();
        EmployeeTypeLabel = new javax.swing.JLabel();
        EmployeeTypeComboBox = new javax.swing.JComboBox<>();
        StatusLabel = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        SignOutPanel = new javax.swing.JPanel();
        SignOutButton = new javax.swing.JButton();
        TableViewPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ManageEmployeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        HeaderPanel.setPreferredSize(new java.awt.Dimension(803, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employee");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(280, 280, 280))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        BodyPanel.setLayout(new java.awt.BorderLayout());

        SearchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchPanel.setPreferredSize(new java.awt.Dimension(803, 130));

        EmployeeSearchField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmployeeSearchField.setText("Search by Name or ID");

        SearchButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SearchButton.setText("Search");

        EmployeeStatusComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EmployeeStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        EmployeeStatusLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        EmployeeStatusLabel.setText("Employee Status");

        RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(EmployeeStatusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmployeeStatusComboBox, 0, 204, Short.MAX_VALUE)
                        .addGap(184, 184, 184))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(EmployeeSearchField)
                        .addGap(100, 100, 100)))
                .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(110, 110, 110)
                .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeSearchField)
                            .addComponent(RefreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeeStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeStatusComboBox))
                .addGap(38, 38, 38))
        );

        BodyPanel.add(SearchPanel, java.awt.BorderLayout.PAGE_START);

        TablePanel.setLayout(new java.awt.BorderLayout());

        TableUpdatePanel.setPreferredSize(new java.awt.Dimension(803, 200));

        DepartmentLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DepartmentLabel.setText("Sort By Department");

        DepartmentComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DepartmentComboBox.setPreferredSize(new java.awt.Dimension(75, 25));

        JobTitleLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JobTitleLabel.setText("Sort By Job Title");

        JobTitleComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JobTitleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JobTitleComboBox.setPreferredSize(new java.awt.Dimension(72, 25));

        DateOfHireLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DateOfHireLabel.setText("Sort By Date of Hire");

        DateOfHireComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DateOfHireComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DateOfHireComboBox.setPreferredSize(new java.awt.Dimension(75, 25));
        DateOfHireComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateOfHireComboBoxActionPerformed(evt);
            }
        });

        EmployeeTypeLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmployeeTypeLabel.setText("Sort By Employee Type");

        EmployeeTypeComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EmployeeTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmployeeTypeComboBox.setMinimumSize(new java.awt.Dimension(72, 25));

        StatusLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        StatusLabel.setText("Sort By Status");

        StatusComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        StatusComboBox.setPreferredSize(new java.awt.Dimension(75, 25));
        StatusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusComboBoxActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.setPreferredSize(new java.awt.Dimension(72, 25));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setPreferredSize(new java.awt.Dimension(72, 25));

        javax.swing.GroupLayout TableUpdatePanelLayout = new javax.swing.GroupLayout(TableUpdatePanel);
        TableUpdatePanel.setLayout(TableUpdatePanelLayout);
        TableUpdatePanelLayout.setHorizontalGroup(
            TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableUpdatePanelLayout.createSequentialGroup()
                .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TableUpdatePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableUpdatePanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepartmentLabel)
                            .addComponent(DateOfHireLabel)
                            .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateOfHireComboBox, 0, 162, Short.MAX_VALUE)
                            .addComponent(StatusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DepartmentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(222, 222, 222)
                        .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeTypeLabel)
                            .addComponent(JobTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JobTitleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        TableUpdatePanelLayout.setVerticalGroup(
            TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TableUpdatePanelLayout.createSequentialGroup()
                        .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TableUpdatePanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(DepartmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(DepartmentComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TableUpdatePanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(DateOfHireLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(DateOfHireComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TableUpdatePanelLayout.createSequentialGroup()
                        .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JobTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JobTitleComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmployeeTypeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(EmployeeTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatusComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(TableUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );

        TablePanel.add(TableUpdatePanel, java.awt.BorderLayout.PAGE_START);

        SignOutPanel.setPreferredSize(new java.awt.Dimension(915, 50));

        SignOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignOutPanelLayout = new javax.swing.GroupLayout(SignOutPanel);
        SignOutPanel.setLayout(SignOutPanelLayout);
        SignOutPanelLayout.setHorizontalGroup(
            SignOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignOutButton)
                .addContainerGap(937, Short.MAX_VALUE))
        );
        SignOutPanelLayout.setVerticalGroup(
            SignOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignOutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignOutButton)
                .addContainerGap())
        );

        TablePanel.add(SignOutPanel, java.awt.BorderLayout.PAGE_END);

        TableViewPanel.setPreferredSize(new java.awt.Dimension(981, 200));

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

        javax.swing.GroupLayout TableViewPanelLayout = new javax.swing.GroupLayout(TableViewPanel);
        TableViewPanel.setLayout(TableViewPanelLayout);
        TableViewPanelLayout.setHorizontalGroup(
            TableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableViewPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        TableViewPanelLayout.setVerticalGroup(
            TableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablePanel.add(TableViewPanel, java.awt.BorderLayout.CENTER);

        BodyPanel.add(TablePanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(BodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StatusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusComboBoxActionPerformed

    private void DateOfHireComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateOfHireComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateOfHireComboBoxActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
         System.exit(0);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        FlatMacLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JComboBox<String> DateOfHireComboBox;
    private javax.swing.JLabel DateOfHireLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox<String> DepartmentComboBox;
    private javax.swing.JLabel DepartmentLabel;
    private javax.swing.JTextField EmployeeSearchField;
    private javax.swing.JComboBox<String> EmployeeStatusComboBox;
    private javax.swing.JLabel EmployeeStatusLabel;
    private javax.swing.JComboBox<String> EmployeeTypeComboBox;
    private javax.swing.JLabel EmployeeTypeLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JComboBox<String> JobTitleComboBox;
    private javax.swing.JLabel JobTitleLabel;
    private javax.swing.JTable ManageEmployeeTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JPanel SignOutPanel;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JPanel TableUpdatePanel;
    private javax.swing.JPanel TableViewPanel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
