/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.JFrame;

/**
 *
 * @author GOLDEN FIELD
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
        BackToDashboardPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        employeeIdLabel = new javax.swing.JLabel();
        employeeIdTextField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        fNameLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        dOBLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        contactNoLabel = new javax.swing.JLabel();
        contactNoTextField = new javax.swing.JTextField();
        dateOfHireLabel = new javax.swing.JLabel();
        employeeTypeLabel = new javax.swing.JLabel();
        fullTimeRadio = new javax.swing.JRadioButton();
        partTimeRadio = new javax.swing.JRadioButton();
        internRadio = new javax.swing.JRadioButton();
        refreshButton = new javax.swing.JButton();
        dateOfBirthDayChooser = new com.toedter.calendar.JDateChooser();
        dateOfHireDayChooser1 = new com.toedter.calendar.JDateChooser();
        dateOfHireDayChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        addressButton = new com.k33ptoo.components.KButton();
        submitButton = new com.k33ptoo.components.KButton();
        updateButton = new com.k33ptoo.components.KButton();
        employeeTypeLabel1 = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        HeaderPanel.setBackground(new java.awt.Color(153, 153, 153));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(732, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(280, 280, 280))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        getContentPane().add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        BackToDashboardPanel.setBackground(new java.awt.Color(153, 153, 153));
        BackToDashboardPanel.setPreferredSize(new java.awt.Dimension(732, 50));

        BackToDashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-arrow.png"))); // NOI18N
        BackToDashboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGap(909, 909, 909))
        );
        BackToDashboardPanelLayout.setVerticalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToDashboardButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(BackToDashboardPanel, java.awt.BorderLayout.PAGE_END);

        bodyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        employeeIdLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        employeeIdLabel.setText("Employee ID");

        employeeIdTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        generateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/generate.png"))); // NOI18N
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        fNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        fNameLabel.setText("First Name");

        fNameTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        dOBLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        dOBLabel.setText("Date Of Birth");

        emailLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        emailLabel.setText("Email");

        emailTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lNameLabel.setText("Last Name");

        lNameTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        contactNoLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        contactNoLabel.setText("Contact Number");

        contactNoTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        dateOfHireLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        dateOfHireLabel.setText("Date Of Hire");

        employeeTypeLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        employeeTypeLabel.setText("Employee Type");

        buttonGroup1.add(fullTimeRadio);
        fullTimeRadio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        fullTimeRadio.setText("Full Time");

        buttonGroup1.add(partTimeRadio);
        partTimeRadio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        partTimeRadio.setText("Part Time");
        partTimeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(internRadio);
        internRadio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        internRadio.setText("Intern");

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("to");

        emailLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        emailLabel1.setText("Address");

        addressButton.setText("Add");
        addressButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addressButton.setkEndColor(new java.awt.Color(0, 204, 204));
        addressButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        addressButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        addressButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        addressButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        addressButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        addressButton.setkStartColor(new java.awt.Color(0, 102, 153));
        addressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitButton.setkEndColor(new java.awt.Color(0, 204, 204));
        submitButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        submitButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        submitButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        submitButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        submitButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        submitButton.setkStartColor(new java.awt.Color(0, 102, 153));

        updateButton.setText("Update");
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setkEndColor(new java.awt.Color(0, 204, 204));
        updateButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        updateButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        updateButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkStartColor(new java.awt.Color(0, 102, 153));

        employeeTypeLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        employeeTypeLabel1.setText("Gender");

        buttonGroup1.add(maleRadio);
        maleRadio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        maleRadio.setText("Male");

        buttonGroup1.add(femaleRadio);
        femaleRadio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        femaleRadio.setText("Female");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(employeeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(367, 367, 367))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                                        .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                                        .addComponent(lNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2)))
                                .addGap(361, 361, 361))
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bodyPanelLayout.createSequentialGroup()
                                        .addComponent(employeeIdTextField)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(generateButton))
                                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fNameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(50, 50, 50)))
                        .addGap(19, 19, 19))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel1)
                            .addComponent(addressButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(dOBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(375, 375, 375))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(contactNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(352, 352, 352))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(employeeTypeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(refreshButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                                .addComponent(employeeTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(330, 330, 330))
                            .addComponent(dateOfBirthDayChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactNoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyPanelLayout.createSequentialGroup()
                                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bodyPanelLayout.createSequentialGroup()
                                        .addComponent(dateOfHireDayChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addGap(12, 12, 12))
                                    .addGroup(bodyPanelLayout.createSequentialGroup()
                                        .addComponent(dateOfHireLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(40, 40, 40)))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(dateOfHireDayChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                                .addComponent(fullTimeRadio)
                                .addGap(18, 18, 18)
                                .addComponent(partTimeRadio)
                                .addGap(18, 18, 18)
                                .addComponent(internRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(36, 36, 36))))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIdLabel)
                    .addComponent(dOBLabel))
                .addGap(12, 12, 12)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(employeeIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirthDayChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(contactNoLabel))
                .addGap(12, 12, 12)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(lNameLabel)
                        .addGap(12, 12, 12)
                        .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(employeeTypeLabel1)
                        .addGap(12, 12, 12)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadio)
                            .addComponent(femaleRadio))))
                .addGap(18, 18, 18)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addGap(12, 12, 12)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(addressButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(employeeTypeLabel)
                        .addGap(12, 12, 12)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullTimeRadio)
                            .addComponent(partTimeRadio)
                            .addComponent(internRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateOfHireLabel)
                        .addGap(12, 12, 12)
                        .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfHireDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfHireDayChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateButtonActionPerformed

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        System.exit(0);
        
    }//GEN-LAST:event_BackToDashboardButtonActionPerformed

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentHidden

    private void addressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressButtonActionPerformed
        
        EmployeeAddress address = new EmployeeAddress();
        address.setVisible(true);
    }//GEN-LAST:event_addressButtonActionPerformed

    private void partTimeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partTimeRadioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JPanel BackToDashboardPanel;
    private javax.swing.JPanel HeaderPanel;
    private com.k33ptoo.components.KButton addressButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactNoLabel;
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JLabel dOBLabel;
    private com.toedter.calendar.JDateChooser dateOfBirthDayChooser;
    private com.toedter.calendar.JDateChooser dateOfHireDayChooser1;
    private com.toedter.calendar.JDateChooser dateOfHireDayChooser2;
    private javax.swing.JLabel dateOfHireLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel employeeIdLabel;
    private javax.swing.JTextField employeeIdTextField;
    private javax.swing.JLabel employeeTypeLabel;
    private javax.swing.JLabel employeeTypeLabel1;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JRadioButton fullTimeRadio;
    private javax.swing.JButton generateButton;
    private javax.swing.JRadioButton internRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JRadioButton partTimeRadio;
    private javax.swing.JButton refreshButton;
    private com.k33ptoo.components.KButton submitButton;
    private com.k33ptoo.components.KButton updateButton;
    // End of variables declaration//GEN-END:variables
}