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
public class AddEmployeeDepartments extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployeeDepartments
     */
    public AddEmployeeDepartments() {
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
        RefreshButton = new javax.swing.JButton();
        TableUpdatePanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        UpdateButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        SignOutPanel = new javax.swing.JPanel();
        SignOutButton = new javax.swing.JButton();
        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddEmployeeDepartmentsTable = new javax.swing.JTable();
        DepartmentAddPanel = new javax.swing.JPanel();
        DepartmentComboBox = new javax.swing.JComboBox<>();
        SelectDepartmentLabel = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        AddDepartmentField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        HeaderPanel.setPreferredSize(new java.awt.Dimension(796, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee Departments");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(210, 210, 210))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        BodyPanel.setLayout(new java.awt.BorderLayout());

        SearchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchPanel.setPreferredSize(new java.awt.Dimension(796, 57));

        EmployeeSearchField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmployeeSearchField.setText("Search Employee(ID,Mobile or Name)");
        EmployeeSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSearchFieldActionPerformed(evt);
            }
        });

        SearchButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SearchButton.setText("Search");

        RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(EmployeeSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addGap(108, 108, 108)
                .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeeSearchField)
                    .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        BodyPanel.add(SearchPanel, java.awt.BorderLayout.PAGE_START);

        TableUpdatePanel.setPreferredSize(new java.awt.Dimension(796, 550));
        TableUpdatePanel.setLayout(new java.awt.BorderLayout());

        ButtonPanel.setPreferredSize(new java.awt.Dimension(796, 70));

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        RemoveButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RemoveButton.setText("Remove");

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(261, 261, 261))
            .addComponent(jSeparator2)
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        TableUpdatePanel.add(ButtonPanel, java.awt.BorderLayout.PAGE_START);

        SignOutPanel.setPreferredSize(new java.awt.Dimension(796, 55));

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
                .addGap(29, 29, 29)
                .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(718, Short.MAX_VALUE))
        );
        SignOutPanelLayout.setVerticalGroup(
            SignOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignOutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TableUpdatePanel.add(SignOutPanel, java.awt.BorderLayout.PAGE_END);

        AddEmployeeDepartmentsTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddEmployeeDepartmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Mobile", "Email", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AddEmployeeDepartmentsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AddEmployeeDepartmentsTable);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TablePanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        TableUpdatePanel.add(TablePanel, java.awt.BorderLayout.CENTER);

        BodyPanel.add(TableUpdatePanel, java.awt.BorderLayout.PAGE_END);

        DepartmentComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item 1", "item 2", "item 3", "item 4" }));
        DepartmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentComboBoxActionPerformed(evt);
            }
        });

        SelectDepartmentLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        SelectDepartmentLabel.setText("Select Department");

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddButton.setText("Add");

        AddDepartmentField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AddDepartmentField.setText("Add Other Department");

        javax.swing.GroupLayout DepartmentAddPanelLayout = new javax.swing.GroupLayout(DepartmentAddPanel);
        DepartmentAddPanel.setLayout(DepartmentAddPanelLayout);
        DepartmentAddPanelLayout.setHorizontalGroup(
            DepartmentAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepartmentAddPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(SelectDepartmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DepartmentComboBox, 0, 152, Short.MAX_VALUE)
                .addGap(127, 127, 127)
                .addComponent(AddDepartmentField, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(85, 85, 85))
        );
        DepartmentAddPanelLayout.setVerticalGroup(
            DepartmentAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepartmentAddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DepartmentAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepartmentAddPanelLayout.createSequentialGroup()
                        .addComponent(DepartmentComboBox)
                        .addContainerGap())
                    .addGroup(DepartmentAddPanelLayout.createSequentialGroup()
                        .addComponent(SelectDepartmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepartmentAddPanelLayout.createSequentialGroup()
                        .addGroup(DepartmentAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddDepartmentField))
                        .addContainerGap())))
        );

        BodyPanel.add(DepartmentAddPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(BodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentComboBoxActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void EmployeeSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeSearchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployeeDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeDepartments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AddDepartmentField;
    private javax.swing.JTable AddEmployeeDepartmentsTable;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel DepartmentAddPanel;
    private javax.swing.JComboBox<String> DepartmentComboBox;
    private javax.swing.JTextField EmployeeSearchField;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JLabel SelectDepartmentLabel;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JPanel SignOutPanel;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JPanel TableUpdatePanel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
