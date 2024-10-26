/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finance_department_gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author GOLDEN FIELD
 */
public class AddCompanyPromotionTypes extends javax.swing.JFrame {

    /**
     * Creates new form AddCompanyPromotionTypes
     */
    public AddCompanyPromotionTypes() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        PromotionAddingSectionPanel = new javax.swing.JPanel();
        AddPromotionTypesTextField = new javax.swing.JTextField();
        PromotionTypesDescriptionTextField = new javax.swing.JTextField();
        AddPromotionButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        signOutPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        PromotionAddingTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PromotionTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setPreferredSize(new java.awt.Dimension(736, 50));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Company Promotion Adding");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(166, 166, 166))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        BodyPanel.setLayout(new java.awt.BorderLayout());

        PromotionAddingSectionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AddPromotionTypesTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AddPromotionTypesTextField.setText("Add Promotion Types");
        AddPromotionTypesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPromotionTypesTextFieldActionPerformed(evt);
            }
        });

        PromotionTypesDescriptionTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PromotionTypesDescriptionTextField.setText("Promotion Types Description");

        AddPromotionButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddPromotionButton.setText("Add Promotion");

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N

        javax.swing.GroupLayout PromotionAddingSectionPanelLayout = new javax.swing.GroupLayout(PromotionAddingSectionPanel);
        PromotionAddingSectionPanel.setLayout(PromotionAddingSectionPanelLayout);
        PromotionAddingSectionPanelLayout.setHorizontalGroup(
            PromotionAddingSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PromotionAddingSectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddPromotionTypesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PromotionTypesDescriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddPromotionButton)
                .addGap(37, 37, 37)
                .addComponent(refreshButton)
                .addGap(32, 32, 32))
            .addComponent(jSeparator1)
        );
        PromotionAddingSectionPanelLayout.setVerticalGroup(
            PromotionAddingSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PromotionAddingSectionPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PromotionAddingSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PromotionAddingSectionPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(AddPromotionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PromotionAddingSectionPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshButton))
                    .addGroup(PromotionAddingSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddPromotionTypesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(PromotionTypesDescriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BodyPanel.add(PromotionAddingSectionPanel, java.awt.BorderLayout.PAGE_START);

        signOutPanel.setPreferredSize(new java.awt.Dimension(764, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back-arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signOutPanelLayout = new javax.swing.GroupLayout(signOutPanel);
        signOutPanel.setLayout(signOutPanelLayout);
        signOutPanelLayout.setHorizontalGroup(
            signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signOutPanelLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 726, Short.MAX_VALUE))
        );
        signOutPanelLayout.setVerticalGroup(
            signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BodyPanel.add(signOutPanel, java.awt.BorderLayout.PAGE_END);

        PromotionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Promotion Types ID", "Promotion Type", "Promotion Description", "Promotion Adding Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PromotionTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(PromotionTable);

        javax.swing.GroupLayout PromotionAddingTablePanelLayout = new javax.swing.GroupLayout(PromotionAddingTablePanel);
        PromotionAddingTablePanel.setLayout(PromotionAddingTablePanelLayout);
        PromotionAddingTablePanelLayout.setHorizontalGroup(
            PromotionAddingTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PromotionAddingTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                .addContainerGap())
        );
        PromotionAddingTablePanelLayout.setVerticalGroup(
            PromotionAddingTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PromotionAddingTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        BodyPanel.add(PromotionAddingTablePanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(BodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddPromotionTypesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPromotionTypesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddPromotionTypesTextFieldActionPerformed

    //BackTodashboardButton
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //BackToDashboardCode
        
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCompanyPromotionTypes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPromotionButton;
    private javax.swing.JTextField AddPromotionTypesTextField;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel PromotionAddingSectionPanel;
    private javax.swing.JPanel PromotionAddingTablePanel;
    private javax.swing.JTable PromotionTable;
    private javax.swing.JTextField PromotionTypesDescriptionTextField;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel signOutPanel;
    // End of variables declaration//GEN-END:variables
}
