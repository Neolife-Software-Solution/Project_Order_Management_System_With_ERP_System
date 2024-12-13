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
 * @author DELL
 */
public class EmployeeAddress extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeAddress
     */
    public EmployeeAddress() {
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
        jPanel4 = new javax.swing.JPanel();
        BackToDashboardPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();
        detailsPanel = new javax.swing.JPanel();
        provinceTextField = new javax.swing.JTextField();
        provinceLabel = new javax.swing.JLabel();
        provinceComboBox = new javax.swing.JComboBox<>();
        provinceButton = new com.k33ptoo.components.KButton();
        employeeIDLabel = new javax.swing.JLabel();
        employeeIDTextField = new javax.swing.JTextField();
        districtLabel = new javax.swing.JLabel();
        districtComboBox = new javax.swing.JComboBox<>();
        districtTextField = new javax.swing.JTextField();
        districtButton = new com.k33ptoo.components.KButton();
        cityLabel = new javax.swing.JLabel();
        cityComboBox = new javax.swing.JComboBox<>();
        cityTextField = new javax.swing.JTextField();
        cityButton = new com.k33ptoo.components.KButton();
        addressLine1Label = new javax.swing.JLabel();
        addressLine1TextField = new javax.swing.JTextField();
        addressLine2Label = new javax.swing.JLabel();
        addressLine2TextField = new javax.swing.JTextField();
        submitButton = new com.k33ptoo.components.KButton();
        clearButton = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        HeaderPanel.setBackground(new java.awt.Color(153, 153, 153));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(780, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Address");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(260, 260, 260))
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

        jPanel4.setLayout(new java.awt.BorderLayout());

        BackToDashboardPanel.setBackground(new java.awt.Color(153, 153, 153));
        BackToDashboardPanel.setPreferredSize(new java.awt.Dimension(808, 50));

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
                .addContainerGap(965, Short.MAX_VALUE))
        );
        BackToDashboardPanelLayout.setVerticalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToDashboardButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(BackToDashboardPanel, java.awt.BorderLayout.PAGE_END);

        provinceTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        provinceTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        provinceTextField.setText("New Province");

        provinceLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        provinceLabel.setText("Select Province");

        provinceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        provinceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinceComboBoxActionPerformed(evt);
            }
        });

        provinceButton.setText("Add");
        provinceButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        provinceButton.setkEndColor(new java.awt.Color(0, 204, 204));
        provinceButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        provinceButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        provinceButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        provinceButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        provinceButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        provinceButton.setkStartColor(new java.awt.Color(0, 102, 153));
        provinceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinceButtonActionPerformed(evt);
            }
        });

        employeeIDLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        employeeIDLabel.setText("Employee ID");

        employeeIDTextField.setEnabled(false);

        districtLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        districtLabel.setText("Select District");

        districtComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        districtComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtComboBoxActionPerformed(evt);
            }
        });

        districtTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        districtTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        districtTextField.setText("New District");

        districtButton.setText("Add");
        districtButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        districtButton.setkEndColor(new java.awt.Color(0, 204, 204));
        districtButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        districtButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        districtButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        districtButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        districtButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        districtButton.setkStartColor(new java.awt.Color(0, 102, 153));
        districtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtButtonActionPerformed(evt);
            }
        });

        cityLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cityLabel.setText("Select City");

        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboBoxActionPerformed(evt);
            }
        });

        cityTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        cityTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cityTextField.setText("New City");

        cityButton.setText("Add");
        cityButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cityButton.setkEndColor(new java.awt.Color(0, 204, 204));
        cityButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        cityButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        cityButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        cityButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        cityButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        cityButton.setkStartColor(new java.awt.Color(0, 102, 153));
        cityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityButtonActionPerformed(evt);
            }
        });

        addressLine1Label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        addressLine1Label.setText("Address Line 1");

        addressLine2Label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        addressLine2Label.setText("Address Line 2");

        submitButton.setText("Submit");
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitButton.setkEndColor(new java.awt.Color(0, 204, 204));
        submitButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        submitButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        submitButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        submitButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        submitButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        submitButton.setkStartColor(new java.awt.Color(0, 102, 153));

        clearButton.setText("Clear");
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearButton.setkEndColor(new java.awt.Color(0, 204, 204));
        clearButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        clearButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        clearButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        clearButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        clearButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        clearButton.setkStartColor(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(districtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provinceLabel)
                            .addComponent(employeeIDLabel))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(districtComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(provinceComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(employeeIDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(cityTextField)
                                .addGap(18, 18, 18)
                                .addComponent(cityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(districtTextField)
                                .addGap(18, 18, 18)
                                .addComponent(districtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailsPanelLayout.createSequentialGroup()
                                .addComponent(provinceTextField)
                                .addGap(18, 18, 18)
                                .addComponent(provinceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(addressLine2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressLine2TextField))
                            .addGroup(detailsPanelLayout.createSequentialGroup()
                                .addComponent(addressLine1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressLine1TextField)))
                        .addGap(221, 221, 221))))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDLabel)
                    .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provinceLabel)
                    .addComponent(provinceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provinceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provinceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(districtLabel)
                    .addComponent(districtComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(districtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(districtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLine1Label)
                    .addComponent(addressLine1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLine2Label)
                    .addComponent(addressLine2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel4.add(detailsPanel, java.awt.BorderLayout.CENTER);

        BodyPanel.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(BodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
         
        this.dispose();
         
    }//GEN-LAST:event_BackToDashboardButtonActionPerformed

    private void provinceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinceButtonActionPerformed

    private void provinceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinceComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinceComboBoxActionPerformed

    private void districtComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtComboBoxActionPerformed

    private void districtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtButtonActionPerformed

    private void cityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityComboBoxActionPerformed

    private void cityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        FlatMacLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAddress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JPanel BackToDashboardPanel;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel addressLine1Label;
    private javax.swing.JTextField addressLine1TextField;
    private javax.swing.JLabel addressLine2Label;
    private javax.swing.JTextField addressLine2TextField;
    private com.k33ptoo.components.KButton cityButton;
    private javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private com.k33ptoo.components.KButton clearButton;
    private javax.swing.JPanel detailsPanel;
    private com.k33ptoo.components.KButton districtButton;
    private javax.swing.JComboBox<String> districtComboBox;
    private javax.swing.JLabel districtLabel;
    private javax.swing.JTextField districtTextField;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JTextField employeeIDTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private com.k33ptoo.components.KButton provinceButton;
    private javax.swing.JComboBox<String> provinceComboBox;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JTextField provinceTextField;
    private com.k33ptoo.components.KButton submitButton;
    // End of variables declaration//GEN-END:variables
}
