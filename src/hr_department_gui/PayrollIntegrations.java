/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author 2003k
 */
public class PayrollIntegrations extends javax.swing.JFrame {

    /**
     * Creates new form PayrollIntegrations
     */
    public PayrollIntegrations() {
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
        headingText = new javax.swing.JLabel();
        bodyPanal = new javax.swing.JPanel();
        payrollAddPanel = new javax.swing.JPanel();
        PayrollIdTextfield = new javax.swing.JTextField();
        EmployeeIDTextfield = new javax.swing.JTextField();
        EmployeeNameTextfield = new javax.swing.JTextField();
        EmployeeSalaryTextfield = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        PayAdvanceButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        RefreshButton = new javax.swing.JButton();
        BackPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PayrollTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanal.setPreferredSize(new java.awt.Dimension(874, 45));
        headerPanal.setLayout(new java.awt.BorderLayout());

        headingText.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        headingText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingText.setText("Add Payroll");
        headerPanal.add(headingText, java.awt.BorderLayout.CENTER);

        getContentPane().add(headerPanal, java.awt.BorderLayout.PAGE_START);

        bodyPanal.setLayout(new java.awt.BorderLayout());

        payrollAddPanel.setPreferredSize(new java.awt.Dimension(891, 150));

        PayrollIdTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PayrollIdTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PayrollIdTextfield.setText("Payroll ID");
        PayrollIdTextfield.setPreferredSize(new java.awt.Dimension(87, 32));

        EmployeeIDTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmployeeIDTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmployeeIDTextfield.setText("Enter Employee ID");

        EmployeeNameTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmployeeNameTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmployeeNameTextfield.setText("Employee Name");

        EmployeeSalaryTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmployeeSalaryTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmployeeSalaryTextfield.setText("Employee Salary");

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddButton.setText("Add");

        PayAdvanceButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PayAdvanceButton.setText("Pay Advanced");

        RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N

        javax.swing.GroupLayout payrollAddPanelLayout = new javax.swing.GroupLayout(payrollAddPanel);
        payrollAddPanel.setLayout(payrollAddPanelLayout);
        payrollAddPanelLayout.setHorizontalGroup(
            payrollAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payrollAddPanelLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(payrollAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EmployeeSalaryTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(PayrollIdTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(payrollAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmployeeIDTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(payrollAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmployeeNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(payrollAddPanelLayout.createSequentialGroup()
                        .addComponent(PayAdvanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        payrollAddPanelLayout.setVerticalGroup(
            payrollAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payrollAddPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(payrollAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PayrollIdTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeIDTextfield)
                    .addComponent(EmployeeNameTextfield))
                .addGap(29, 29, 29)
                .addGroup(payrollAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeSalaryTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayAdvanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bodyPanal.add(payrollAddPanel, java.awt.BorderLayout.PAGE_START);

        BackPanel.setPreferredSize(new java.awt.Dimension(891, 50));

        BackToDashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-arrow.png"))); // NOI18N
        BackToDashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToDashboardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToDashboardButton)
                .addContainerGap(850, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToDashboardButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyPanal.add(BackPanel, java.awt.BorderLayout.PAGE_END);

        PayrollTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PayrollTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payroll ID", "Date", "Employee Name", "Total Advanced", "Paid Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PayrollTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(PayrollTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        bodyPanal.add(tablePanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
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
                new PayrollIntegrations().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JTextField EmployeeIDTextfield;
    private javax.swing.JTextField EmployeeNameTextfield;
    private javax.swing.JTextField EmployeeSalaryTextfield;
    private javax.swing.JButton PayAdvanceButton;
    private javax.swing.JTextField PayrollIdTextfield;
    private javax.swing.JTable PayrollTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JPanel bodyPanal;
    private javax.swing.JPanel headerPanal;
    private javax.swing.JLabel headingText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel payrollAddPanel;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
