/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stock_management_gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author Avishka
 */
public class ProductManagement extends javax.swing.JFrame {

    /**
     * Creates new form ProductManagement
     */
    public ProductManagement() {
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
        bodyPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        standerdButton = new javax.swing.JButton();
        comboButton = new javax.swing.JButton();
        logOutPanel = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        viwePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setPreferredSize(new java.awt.Dimension(733, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setText("Manage Product");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        buttonPanel.setPreferredSize(new java.awt.Dimension(733, 80));

        standerdButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        standerdButton.setText("Standerd");
        standerdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standerdButtonActionPerformed(evt);
            }
        });

        comboButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboButton.setText("Combo");
        comboButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(standerdButton, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(comboButton, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(standerdButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bodyPanel.add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        logOutPanel.setPreferredSize(new java.awt.Dimension(733, 50));

        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logOutPanelLayout = new javax.swing.GroupLayout(logOutPanel);
        logOutPanel.setLayout(logOutPanelLayout);
        logOutPanelLayout.setHorizontalGroup(
            logOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logOutButton)
                .addContainerGap(675, Short.MAX_VALUE))
        );
        logOutPanelLayout.setVerticalGroup(
            logOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logOutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(26, 26, 26))
        );

        bodyPanel.add(logOutPanel, java.awt.BorderLayout.PAGE_END);

        viwePanel.setMinimumSize(new java.awt.Dimension(200, 200));
        viwePanel.setLayout(new java.awt.BorderLayout());
        bodyPanel.add(viwePanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void standerdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standerdButtonActionPerformed
        // Standerd design viwe in a jPanel viwe
        viwePanel.removeAll();
        standerd st = new standerd();
        viwePanel.add(st,BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(viwePanel);
    }//GEN-LAST:event_standerdButtonActionPerformed

    private void comboButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboButtonActionPerformed
        // TODO add your handling code here:
        viwePanel.removeAll();
        Combo cb = new Combo();
        viwePanel.add(cb,BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(viwePanel);
    }//GEN-LAST:event_comboButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        System.exit(0); // LogOut Button
    }//GEN-LAST:event_logOutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton comboButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel logOutPanel;
    private javax.swing.JButton standerdButton;
    private javax.swing.JPanel viwePanel;
    // End of variables declaration//GEN-END:variables
}