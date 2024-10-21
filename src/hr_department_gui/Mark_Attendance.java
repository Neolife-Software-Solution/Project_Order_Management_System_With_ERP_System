/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author sanja
 */
public class Mark_Attendance extends javax.swing.JFrame {

    /**
     * Creates new form Mark_Attendance
     */
    public Mark_Attendance() {
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

        HeaderPane = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        AddEmployeePanel = new javax.swing.JPanel();
        EmpIDTextfield = new javax.swing.JTextField();
        EmpNameTextfield = new javax.swing.JTextField();
        EmpID = new javax.swing.JLabel();
        EmpName = new javax.swing.JLabel();
        AdjustDateButton = new javax.swing.JButton();
        AttendancePanel = new javax.swing.JPanel();
        SearchEmployeePanel = new javax.swing.JPanel();
        EmpID_Name = new javax.swing.JLabel();
        EmpID_NameTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        EmployeeAttendanceView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AttendanceView = new javax.swing.JTable();
        Logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        Header.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        Header.setText("Attendance");

        Date.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        Date.setText("DD / MM / YYYY");

        Time.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time.setText("HH :: MM :: SS");

        javax.swing.GroupLayout HeaderPaneLayout = new javax.swing.GroupLayout(HeaderPane);
        HeaderPane.setLayout(HeaderPaneLayout);
        HeaderPaneLayout.setHorizontalGroup(
            HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPaneLayout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(Header)
                .addGap(227, 227, 227)
                .addGroup(HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        HeaderPaneLayout.setVerticalGroup(
            HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Header)
                    .addGroup(HeaderPaneLayout.createSequentialGroup()
                        .addComponent(Date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Time)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(HeaderPane, java.awt.BorderLayout.PAGE_START);

        BodyPanel.setLayout(new java.awt.BorderLayout());

        AddEmployeePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EmpIDTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        EmpNameTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        EmpID.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpID.setText("Employee ID");

        EmpName.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpName.setText("Employee Name");

        AdjustDateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AdjustDateButton.setText("Adjust Date");

        javax.swing.GroupLayout AddEmployeePanelLayout = new javax.swing.GroupLayout(AddEmployeePanel);
        AddEmployeePanel.setLayout(AddEmployeePanelLayout);
        AddEmployeePanelLayout.setHorizontalGroup(
            AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEmployeePanelLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpIDTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpID))
                .addGap(66, 66, 66)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpName)
                    .addGroup(AddEmployeePanelLayout.createSequentialGroup()
                        .addComponent(EmpNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(AdjustDateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        AddEmployeePanelLayout.setVerticalGroup(
            AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEmployeePanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmpID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpIDTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdjustDateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        BodyPanel.add(AddEmployeePanel, java.awt.BorderLayout.PAGE_START);

        AttendancePanel.setLayout(new java.awt.BorderLayout());

        EmpID_Name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpID_Name.setText("Employee ID / Name");

        EmpID_NameTextfield.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("To");

        javax.swing.GroupLayout SearchEmployeePanelLayout = new javax.swing.GroupLayout(SearchEmployeePanel);
        SearchEmployeePanel.setLayout(SearchEmployeePanelLayout);
        SearchEmployeePanelLayout.setHorizontalGroup(
            SearchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchEmployeePanelLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(SearchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpID_Name)
                    .addGroup(SearchEmployeePanelLayout.createSequentialGroup()
                        .addComponent(EmpID_NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        SearchEmployeePanelLayout.setVerticalGroup(
            SearchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchEmployeePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(EmpID_Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SearchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmpID_NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(SearchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        AttendancePanel.add(SearchEmployeePanel, java.awt.BorderLayout.PAGE_START);

        AttendanceView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AttendanceView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendance_ID", "Employee_ID", "Employee_Name", "Date", "Time", "Present", "Absent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AttendanceView.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AttendanceView);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N

        javax.swing.GroupLayout EmployeeAttendanceViewLayout = new javax.swing.GroupLayout(EmployeeAttendanceView);
        EmployeeAttendanceView.setLayout(EmployeeAttendanceViewLayout);
        EmployeeAttendanceViewLayout.setHorizontalGroup(
            EmployeeAttendanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeAttendanceViewLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(EmployeeAttendanceViewLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmployeeAttendanceViewLayout.setVerticalGroup(
            EmployeeAttendanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeAttendanceViewLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Logout)
                .addContainerGap())
        );

        AttendancePanel.add(EmployeeAttendanceView, java.awt.BorderLayout.CENTER);

        BodyPanel.add(AttendancePanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(BodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mark_Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddEmployeePanel;
    private javax.swing.JButton AdjustDateButton;
    private javax.swing.JPanel AttendancePanel;
    private javax.swing.JTable AttendanceView;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel EmpID;
    private javax.swing.JTextField EmpIDTextfield;
    private javax.swing.JLabel EmpID_Name;
    private javax.swing.JTextField EmpID_NameTextfield;
    private javax.swing.JLabel EmpName;
    private javax.swing.JTextField EmpNameTextfield;
    private javax.swing.JPanel EmployeeAttendanceView;
    private javax.swing.JLabel Header;
    private javax.swing.JPanel HeaderPane;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel SearchEmployeePanel;
    private javax.swing.JLabel Time;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
