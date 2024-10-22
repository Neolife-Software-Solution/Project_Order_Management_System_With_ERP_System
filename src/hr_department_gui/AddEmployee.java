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
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
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
        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        AddEmployeePanel = new javax.swing.JPanel();
        EmployeeIdLabel = new javax.swing.JLabel();
        EmployeeIdField = new javax.swing.JTextField();
        FirstNameLabel = new javax.swing.JLabel();
        FNameField = new javax.swing.JTextField();
        DOBLabel = new javax.swing.JLabel();
        DOBField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        EmploymentTypeLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        LNameField = new javax.swing.JTextField();
        ContactNumberLabel = new javax.swing.JLabel();
        ContactNumberField = new javax.swing.JTextField();
        DateOfHireLabel = new javax.swing.JLabel();
        DateOfHireField = new javax.swing.JTextField();
        FullTime = new javax.swing.JRadioButton();
        PartTime = new javax.swing.JRadioButton();
        Intern = new javax.swing.JRadioButton();
        SignOutPanel = new javax.swing.JPanel();
        SignOutButton = new javax.swing.JButton();
        ButtonPanel = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        HeaderPanel.setPreferredSize(new java.awt.Dimension(100, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(307, 307, 307))
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

        AddEmployeePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AddEmployeePanel.setPreferredSize(new java.awt.Dimension(784, 510));

        EmployeeIdLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmployeeIdLabel.setText("Employee ID");

        EmployeeIdField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        FirstNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        FirstNameLabel.setText("First Name");

        FNameField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        FNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameFieldActionPerformed(evt);
            }
        });

        DOBLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DOBLabel.setText("Date of Birth");

        DOBField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DOBField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBFieldActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmailLabel.setText("Email");

        EmailField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        EmploymentTypeLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmploymentTypeLabel.setText("Employment Type");

        LastNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        LastNameLabel.setText("Last Name");

        LNameField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        LNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameFieldActionPerformed(evt);
            }
        });

        ContactNumberLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ContactNumberLabel.setText("Contact Number");

        ContactNumberField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        DateOfHireLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DateOfHireLabel.setText("Date of Hire");

        DateOfHireField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        buttonGroup1.add(FullTime);
        FullTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FullTime.setText("Full Time");

        buttonGroup1.add(PartTime);
        PartTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PartTime.setText("Part Time");
        PartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartTimeActionPerformed(evt);
            }
        });

        buttonGroup1.add(Intern);
        Intern.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Intern.setText("Intern");

        javax.swing.GroupLayout AddEmployeePanelLayout = new javax.swing.GroupLayout(AddEmployeePanel);
        AddEmployeePanel.setLayout(AddEmployeePanelLayout);
        AddEmployeePanelLayout.setHorizontalGroup(
            AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEmployeePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddEmployeePanelLayout.createSequentialGroup()
                        .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeIdField)
                            .addComponent(FNameField)
                            .addComponent(DOBField)
                            .addComponent(EmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmploymentTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ContactNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(DateOfHireLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(DateOfHireField, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addGroup(AddEmployeePanelLayout.createSequentialGroup()
                                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ContactNumberField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LNameField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(10, 10, 10)))
                        .addGap(108, 108, 108))
                    .addGroup(AddEmployeePanelLayout.createSequentialGroup()
                        .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PartTime, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(FullTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(Intern, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addGap(495, 495, 495))))
        );
        AddEmployeePanelLayout.setVerticalGroup(
            AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEmployeePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(EmployeeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(FNameField))
                .addGap(24, 24, 24)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContactNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContactNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(DOBField))
                .addGap(18, 18, 18)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateOfHireLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateOfHireField, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(EmailField))
                .addGap(18, 18, 18)
                .addComponent(EmploymentTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Intern, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(FullTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PartTime, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        BodyPanel.add(AddEmployeePanel, java.awt.BorderLayout.PAGE_START);

        SignOutPanel.setPreferredSize(new java.awt.Dimension(784, 55));

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
                .addGap(26, 26, 26)
                .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(709, Short.MAX_VALUE))
        );
        SignOutPanelLayout.setVerticalGroup(
            SignOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignOutButton)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        BodyPanel.add(SignOutPanel, java.awt.BorderLayout.PAGE_END);

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddButton.setText("Add");

        SubmitButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(110, 110, 110)
                .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(109, 109, 109)
                .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BodyPanel.add(ButtonPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(BodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void FNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameFieldActionPerformed

    private void DOBFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void LNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameFieldActionPerformed

    private void PartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PartTimeActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        FlatMacLightLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel AddEmployeePanel;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextField ContactNumberField;
    private javax.swing.JLabel ContactNumberLabel;
    private javax.swing.JTextField DOBField;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JTextField DateOfHireField;
    private javax.swing.JLabel DateOfHireLabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmployeeIdField;
    private javax.swing.JLabel EmployeeIdLabel;
    private javax.swing.JLabel EmploymentTypeLabel;
    private javax.swing.JTextField FNameField;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JRadioButton FullTime;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JRadioButton Intern;
    private javax.swing.JTextField LNameField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JRadioButton PartTime;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JPanel SignOutPanel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
