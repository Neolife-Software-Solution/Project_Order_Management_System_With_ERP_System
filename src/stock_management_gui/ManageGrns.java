/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stock_management_gui;

/**
 *
 * @author GOLDEN FIELD
 */
public class ManageGrns extends javax.swing.JFrame {

    /**
     * Creates new form ManageGrns
     */
    public ManageGrns() {
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
        GRNsearchPanal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        GRNSearchTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        SIgnOutPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        GrnsTableBody = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageGRNtable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setPreferredSize(new java.awt.Dimension(689, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setText("Manage GRNS");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(242, 242, 242))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        GRNsearchPanal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GRNsearchPanal.setPreferredSize(new java.awt.Dimension(689, 60));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Search Product By Name");

        javax.swing.GroupLayout GRNsearchPanalLayout = new javax.swing.GroupLayout(GRNsearchPanal);
        GRNsearchPanal.setLayout(GRNsearchPanalLayout);
        GRNsearchPanalLayout.setHorizontalGroup(
            GRNsearchPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GRNsearchPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GRNSearchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap(170, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        GRNsearchPanalLayout.setVerticalGroup(
            GRNsearchPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GRNsearchPanalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(GRNsearchPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GRNSearchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyPanel.add(GRNsearchPanal, java.awt.BorderLayout.PAGE_START);

        SIgnOutPanel.setPreferredSize(new java.awt.Dimension(689, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N

        javax.swing.GroupLayout SIgnOutPanelLayout = new javax.swing.GroupLayout(SIgnOutPanel);
        SIgnOutPanel.setLayout(SIgnOutPanelLayout);
        SIgnOutPanelLayout.setHorizontalGroup(
            SIgnOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIgnOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(648, Short.MAX_VALUE))
        );
        SIgnOutPanelLayout.setVerticalGroup(
            SIgnOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SIgnOutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        bodyPanel.add(SIgnOutPanel, java.awt.BorderLayout.PAGE_END);

        ManageGRNtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ManageGRNtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN ID", "Supplier Name", "Paymnt Status", "Sub Total", "Paid", "Payment Due"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageGRNtable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ManageGRNtable);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Print GRNS");

        javax.swing.GroupLayout GrnsTableBodyLayout = new javax.swing.GroupLayout(GrnsTableBody);
        GrnsTableBody.setLayout(GrnsTableBodyLayout);
        GrnsTableBodyLayout.setHorizontalGroup(
            GrnsTableBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrnsTableBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrnsTableBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(42, 42, 42))
        );
        GrnsTableBodyLayout.setVerticalGroup(
            GrnsTableBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrnsTableBodyLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        bodyPanel.add(GrnsTableBody, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ManageGrns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageGrns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageGrns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageGrns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageGrns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GRNSearchTextField;
    private javax.swing.JPanel GRNsearchPanal;
    private javax.swing.JPanel GrnsTableBody;
    private javax.swing.JTable ManageGRNtable;
    private javax.swing.JPanel SIgnOutPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
