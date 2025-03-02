/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package order_management_gui.dinning_gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Hash_Boy
 */
public class Dining extends javax.swing.JFrame {

    /**
     * Creates new form Takeaway
     */
    public Dining() {
        initComponents();
        this.setExtendedState(Dining.MAXIMIZED_BOTH);
        dt();
        times();
    }

    public void dt() {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dd = sdf.format(d);
        date.setText(dd);

    }
    Timer t;
    SimpleDateFormat st;

    public void times() {

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss");

                String tt = st.format(dt);
                time.setText(tt);
            }
        });
        t.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        addDataPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tableAndPayPanel = new javax.swing.JPanel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        updateButton = new com.k33ptoo.components.KButton();
        paymentPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        updateButton1 = new com.k33ptoo.components.KButton();
        footerPanel = new javax.swing.JPanel();
        signOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(0, 153, 102));
        headerPanel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        headerPanel.setMinimumSize(new java.awt.Dimension(100, 50));
        headerPanel.setPreferredSize(new java.awt.Dimension(855, 50));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Date :");

        date.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("yyyy/mm/dd");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setText("Time :");

        time.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("hh : mm : ss");

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dinning");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        addDataPanel.setBackground(new java.awt.Color(0, 153, 102));
        addDataPanel.setPreferredSize(new java.awt.Dimension(855, 150));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/banner.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout addDataPanelLayout = new javax.swing.GroupLayout(addDataPanel);
        addDataPanel.setLayout(addDataPanelLayout);
        addDataPanelLayout.setHorizontalGroup(
            addDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        addDataPanelLayout.setVerticalGroup(
            addDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        bodyPanel.add(addDataPanel, java.awt.BorderLayout.PAGE_START);

        tableAndPayPanel.setLayout(new java.awt.BorderLayout());

        OrderTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FID", "Food Name", "Portion", "QTY", "Item Price", "Total Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(OrderTable);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Count of Orders");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Customer Name");

        updateButton.setText("Menu");
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setkEndColor(new java.awt.Color(51, 255, 51));
        updateButton.setkHoverEndColor(new java.awt.Color(0, 153, 102));
        updateButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateButton.setkHoverStartColor(new java.awt.Color(51, 255, 51));
        updateButton.setkPressedColor(new java.awt.Color(0, 153, 102));
        updateButton.setkSelectedColor(new java.awt.Color(0, 153, 102));
        updateButton.setkStartColor(new java.awt.Color(0, 153, 102));
        updateButton.setPreferredSize(new java.awt.Dimension(185, 32));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tablePanelLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                    .addGap(32, 32, 32)))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tableAndPayPanel.add(tablePanel, java.awt.BorderLayout.CENTER);

        paymentPanel.setPreferredSize(new java.awt.Dimension(1044, 110));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Total Payment :");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("0.00");

        updateButton1.setText("Make an Order");
        updateButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton1.setkEndColor(new java.awt.Color(51, 255, 51));
        updateButton1.setkHoverEndColor(new java.awt.Color(0, 153, 102));
        updateButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateButton1.setkHoverStartColor(new java.awt.Color(51, 255, 51));
        updateButton1.setkPressedColor(new java.awt.Color(0, 153, 102));
        updateButton1.setkSelectedColor(new java.awt.Color(0, 153, 102));
        updateButton1.setkStartColor(new java.awt.Color(0, 153, 102));
        updateButton1.setPreferredSize(new java.awt.Dimension(185, 32));
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                .addContainerGap(748, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        tableAndPayPanel.add(paymentPanel, java.awt.BorderLayout.PAGE_END);

        bodyPanel.add(tableAndPayPanel, java.awt.BorderLayout.CENTER);

        footerPanel.setBackground(new java.awt.Color(0, 153, 102));
        footerPanel.setPreferredSize(new java.awt.Dimension(855, 45));

        signOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signOutButton)
                .addContainerGap(1000, Short.MAX_VALUE))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bodyPanel.add(footerPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dining().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderTable;
    private javax.swing.JPanel addDataPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel date;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JButton signOutButton;
    private javax.swing.JPanel tableAndPayPanel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel time;
    private com.k33ptoo.components.KButton updateButton;
    private com.k33ptoo.components.KButton updateButton1;
    // End of variables declaration//GEN-END:variables
}
