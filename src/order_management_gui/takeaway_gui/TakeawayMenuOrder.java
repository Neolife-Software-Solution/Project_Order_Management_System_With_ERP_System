/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package order_management_gui.takeaway_gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author Hash_Boy
 */
public class TakeawayMenuOrder extends javax.swing.JDialog {

    /**
     * Creates new form Dining_Menu_Order
     */
    public TakeawayMenuOrder(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        menuOrderPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FoodNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Person1RadioButton = new javax.swing.JRadioButton();
        Person2RadioButton = new javax.swing.JRadioButton();
        Person1PriceLabel = new javax.swing.JLabel();
        Person2PriceLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        QtySpinner = new javax.swing.JSpinner();
        MakeAnOrderButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        headerPanel.setPreferredSize(new java.awt.Dimension(637, 50));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Takeaway Menu Order");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText(" Food Name");
        jLabel2.setOpaque(true);

        FoodNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        FoodNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FoodNameLabel.setText("Selected Food Name");
        FoodNameLabel.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("    Portion");
        jLabel3.setOpaque(true);

        buttonGroup1.add(Person1RadioButton);
        Person1RadioButton.setText("1 Person");

        buttonGroup1.add(Person2RadioButton);
        Person2RadioButton.setText("2 Person");

        Person1PriceLabel.setBackground(new java.awt.Color(255, 255, 255));
        Person1PriceLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        Person1PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Person1PriceLabel.setText("0.00");
        Person1PriceLabel.setOpaque(true);

        Person2PriceLabel.setBackground(new java.awt.Color(255, 255, 255));
        Person2PriceLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        Person2PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Person2PriceLabel.setText("0.00");
        Person2PriceLabel.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Qty");

        QtySpinner.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        MakeAnOrderButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MakeAnOrderButton.setText("Make an Order");

        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CancelButton.setText("Cancel");

        javax.swing.GroupLayout menuOrderPanelLayout = new javax.swing.GroupLayout(menuOrderPanel);
        menuOrderPanel.setLayout(menuOrderPanelLayout);
        menuOrderPanelLayout.setHorizontalGroup(
            menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuOrderPanelLayout.createSequentialGroup()
                        .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FoodNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Person1RadioButton)
                                .addGap(81, 81, 81)
                                .addComponent(Person2RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(QtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Person1PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(Person2PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(menuOrderPanelLayout.createSequentialGroup()
                        .addComponent(MakeAnOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        menuOrderPanelLayout.setVerticalGroup(
            menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FoodNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Person1RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Person2RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Person1PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Person2PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MakeAnOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        bodyPanel.add(menuOrderPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TakeawayMenuOrder dialog = new TakeawayMenuOrder(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel FoodNameLabel;
    private javax.swing.JButton MakeAnOrderButton;
    private javax.swing.JLabel Person1PriceLabel;
    private javax.swing.JRadioButton Person1RadioButton;
    private javax.swing.JLabel Person2PriceLabel;
    private javax.swing.JRadioButton Person2RadioButton;
    private javax.swing.JSpinner QtySpinner;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel menuOrderPanel;
    // End of variables declaration//GEN-END:variables
}
