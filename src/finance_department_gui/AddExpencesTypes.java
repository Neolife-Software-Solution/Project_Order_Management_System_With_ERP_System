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
public class AddExpencesTypes extends javax.swing.JFrame {

    /**
     * Creates new form AddExpencesTypes
     */
    public AddExpencesTypes() {
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
        bodyPanal = new javax.swing.JPanel();
        ExpencesAddSectionPanal = new javax.swing.JPanel();
        ExpencesTypeTextField = new javax.swing.JTextField();
        addTypeButton = new javax.swing.JButton();
        updateTypeButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        TypeSearchPanal = new javax.swing.JPanel();
        ExpencesTypeSearchPanal = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ExpencesTablePanal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        signOutButtonPanal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanal.setPreferredSize(new java.awt.Dimension(720, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Expences Types");

        javax.swing.GroupLayout headerPanalLayout = new javax.swing.GroupLayout(headerPanal);
        headerPanal.setLayout(headerPanalLayout);
        headerPanalLayout.setHorizontalGroup(
            headerPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanalLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(229, 229, 229))
        );
        headerPanalLayout.setVerticalGroup(
            headerPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(headerPanal, java.awt.BorderLayout.PAGE_START);

        bodyPanal.setLayout(new java.awt.BorderLayout());

        ExpencesAddSectionPanal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExpencesAddSectionPanal.setPreferredSize(new java.awt.Dimension(720, 90));

        ExpencesTypeTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ExpencesTypeTextField.setText("Add Expences Types");
        ExpencesTypeTextField.setToolTipText("Add Expences Type");
        ExpencesTypeTextField.setName(""); // NOI18N

        addTypeButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addTypeButton.setText("Add Type");

        updateTypeButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        updateTypeButton.setText("Update Type");

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N
        refreshButton.setToolTipText("Refresh");

        javax.swing.GroupLayout ExpencesAddSectionPanalLayout = new javax.swing.GroupLayout(ExpencesAddSectionPanal);
        ExpencesAddSectionPanal.setLayout(ExpencesAddSectionPanalLayout);
        ExpencesAddSectionPanalLayout.setHorizontalGroup(
            ExpencesAddSectionPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpencesAddSectionPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExpencesTypeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(143, 143, 143)
                .addComponent(addTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ExpencesAddSectionPanalLayout.setVerticalGroup(
            ExpencesAddSectionPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpencesAddSectionPanalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ExpencesAddSectionPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                    .addGroup(ExpencesAddSectionPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ExpencesTypeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(addTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(updateTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        bodyPanal.add(ExpencesAddSectionPanal, java.awt.BorderLayout.PAGE_START);

        TypeSearchPanal.setLayout(new java.awt.BorderLayout());

        ExpencesTypeSearchPanal.setPreferredSize(new java.awt.Dimension(720, 60));

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextField1.setToolTipText("Search Expences Type By Name");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Search  By Type Name");

        javax.swing.GroupLayout ExpencesTypeSearchPanalLayout = new javax.swing.GroupLayout(ExpencesTypeSearchPanal);
        ExpencesTypeSearchPanal.setLayout(ExpencesTypeSearchPanalLayout);
        ExpencesTypeSearchPanalLayout.setHorizontalGroup(
            ExpencesTypeSearchPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpencesTypeSearchPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(391, 391, 391))
            .addComponent(jSeparator1)
        );
        ExpencesTypeSearchPanalLayout.setVerticalGroup(
            ExpencesTypeSearchPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExpencesTypeSearchPanalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ExpencesTypeSearchPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TypeSearchPanal.add(ExpencesTypeSearchPanal, java.awt.BorderLayout.PAGE_START);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expences ID", "Expences Type Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout ExpencesTablePanalLayout = new javax.swing.GroupLayout(ExpencesTablePanal);
        ExpencesTablePanal.setLayout(ExpencesTablePanalLayout);
        ExpencesTablePanalLayout.setHorizontalGroup(
            ExpencesTablePanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpencesTablePanalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        ExpencesTablePanalLayout.setVerticalGroup(
            ExpencesTablePanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpencesTablePanalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        TypeSearchPanal.add(ExpencesTablePanal, java.awt.BorderLayout.CENTER);

        signOutButtonPanal.setPreferredSize(new java.awt.Dimension(826, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        jButton1.setToolTipText("Sign Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signOutButtonPanalLayout = new javax.swing.GroupLayout(signOutButtonPanal);
        signOutButtonPanal.setLayout(signOutButtonPanalLayout);
        signOutButtonPanalLayout.setHorizontalGroup(
            signOutButtonPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signOutButtonPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(782, Short.MAX_VALUE))
        );
        signOutButtonPanalLayout.setVerticalGroup(
            signOutButtonPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signOutButtonPanalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TypeSearchPanal.add(signOutButtonPanal, java.awt.BorderLayout.PAGE_END);

        bodyPanal.add(TypeSearchPanal, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
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
                new AddExpencesTypes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExpencesAddSectionPanal;
    private javax.swing.JPanel ExpencesTablePanal;
    private javax.swing.JPanel ExpencesTypeSearchPanal;
    private javax.swing.JTextField ExpencesTypeTextField;
    private javax.swing.JPanel TypeSearchPanal;
    private javax.swing.JButton addTypeButton;
    private javax.swing.JPanel bodyPanal;
    private javax.swing.JPanel headerPanal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel signOutButtonPanal;
    private javax.swing.JButton updateTypeButton;
    // End of variables declaration//GEN-END:variables
}
