/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author Avishka
 */
public class ManageEmployee extends javax.swing.JFrame {

    /**
     * Creates new form ManageEmployee
     */
    public ManageEmployee() {
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
        BackToDashboardPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        addingPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        SearchPanel = new javax.swing.JPanel();
        EmployeeSearchField = new javax.swing.JTextField();
        EmployeeStatusComboBox = new javax.swing.JComboBox<>();
        EmployeeStatusLabel = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        searchButton = new com.k33ptoo.components.KButton();
        addButton = new com.k33ptoo.components.KButton();
        jPanel4 = new javax.swing.JPanel();
        DepartmentLabel2 = new javax.swing.JLabel();
        DepartmentComboBox = new javax.swing.JComboBox<>();
        DateOfHireLabel2 = new javax.swing.JLabel();
        StatusLabel2 = new javax.swing.JLabel();
        positionComboBox = new javax.swing.JComboBox<>();
        employeeTypeComboBox = new javax.swing.JComboBox<>();
        JobTitleLabel2 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        EmployeeTypeLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        updateButton = new com.k33ptoo.components.KButton();
        deleteButton = new com.k33ptoo.components.KButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ManageEmployeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(153, 153, 153));
        headerPanel.setPreferredSize(new java.awt.Dimension(896, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employee");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGap(280, 280, 280))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        BackToDashboardPanel.setBackground(new java.awt.Color(153, 153, 153));
        BackToDashboardPanel.setPreferredSize(new java.awt.Dimension(896, 50));

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
                .addContainerGap(992, Short.MAX_VALUE))
        );
        BackToDashboardPanelLayout.setVerticalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackToDashboardButton)
                .addContainerGap())
        );

        getContentPane().add(BackToDashboardPanel, java.awt.BorderLayout.PAGE_END);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        addingPanel.setLayout(new java.awt.BorderLayout());

        SearchPanel.setPreferredSize(new java.awt.Dimension(803, 130));

        EmployeeSearchField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        EmployeeStatusComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EmployeeStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmployeeStatusComboBox.setPreferredSize(new java.awt.Dimension(75, 32));

        EmployeeStatusLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmployeeStatusLabel.setText("Employee Status");

        RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Name or ID");

        searchButton.setText("Search");
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchButton.setkEndColor(new java.awt.Color(0, 204, 204));
        searchButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        searchButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        searchButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        searchButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        searchButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        searchButton.setkStartColor(new java.awt.Color(0, 102, 153));

        addButton.setText("Add");
        addButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addButton.setkEndColor(new java.awt.Color(0, 204, 204));
        addButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        addButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        addButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        addButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        addButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        addButton.setkStartColor(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(EmployeeStatusLabel)
                        .addGap(12, 12, 12)
                        .addComponent(EmployeeStatusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(EmployeeSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmployeeSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addComponent(RefreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmployeeStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeStatusComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
            .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
            .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );

        addingPanel.add(searchPanel, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(1026, 230));

        DepartmentLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DepartmentLabel2.setText("Sort By Department");
        DepartmentLabel2.setPreferredSize(new java.awt.Dimension(122, 32));

        DepartmentComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DepartmentComboBox.setPreferredSize(new java.awt.Dimension(75, 32));
        DepartmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentComboBoxActionPerformed(evt);
            }
        });

        DateOfHireLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DateOfHireLabel2.setText("Sort By Employee Type");
        DateOfHireLabel2.setPreferredSize(new java.awt.Dimension(122, 32));

        StatusLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        StatusLabel2.setText("Sort By Position");
        StatusLabel2.setPreferredSize(new java.awt.Dimension(86, 32));

        positionComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        positionComboBox.setPreferredSize(new java.awt.Dimension(75, 32));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        employeeTypeComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        employeeTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeTypeComboBox.setPreferredSize(new java.awt.Dimension(75, 32));
        employeeTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeTypeComboBoxActionPerformed(evt);
            }
        });

        JobTitleLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        JobTitleLabel2.setText("Sort By Status");
        JobTitleLabel2.setPreferredSize(new java.awt.Dimension(98, 32));

        statusComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statusComboBox.setPreferredSize(new java.awt.Dimension(72, 32));

        EmployeeTypeLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmployeeTypeLabel2.setText("Sort By Date of Hire");
        EmployeeTypeLabel2.setPreferredSize(new java.awt.Dimension(140, 32));

        updateButton.setText("Update");
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setkEndColor(new java.awt.Color(0, 204, 204));
        updateButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        updateButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        updateButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkStartColor(new java.awt.Color(0, 102, 153));

        deleteButton.setText("Delete");
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setkEndColor(new java.awt.Color(0, 204, 204));
        deleteButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        deleteButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        deleteButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkStartColor(new java.awt.Color(0, 102, 153));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("to");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateOfHireLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartmentLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DepartmentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(positionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeeTypeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JobTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartmentComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DepartmentLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JobTitleLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeTypeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateOfHireLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatusLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeTypeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addingPanel.add(jPanel4, java.awt.BorderLayout.CENTER);

        bodyPanel.add(addingPanel, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(1026, 200));

        ManageEmployeeTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ManageEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Contact Number", "Email", "Address", "Date of Birth", "Department", "Position", "Employee Type", "Status", "Date Of Hire", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageEmployeeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ManageEmployeeTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        bodyPanel.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BackToDashboardButtonActionPerformed

    private void DepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentComboBoxActionPerformed

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void employeeTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeTypeComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JPanel BackToDashboardPanel;
    private javax.swing.JLabel DateOfHireLabel2;
    private javax.swing.JComboBox<String> DepartmentComboBox;
    private javax.swing.JLabel DepartmentLabel2;
    private javax.swing.JTextField EmployeeSearchField;
    private javax.swing.JComboBox<String> EmployeeStatusComboBox;
    private javax.swing.JLabel EmployeeStatusLabel;
    private javax.swing.JLabel EmployeeTypeLabel2;
    private javax.swing.JLabel JobTitleLabel2;
    private javax.swing.JTable ManageEmployeeTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JLabel StatusLabel2;
    private com.k33ptoo.components.KButton addButton;
    private javax.swing.JPanel addingPanel;
    private javax.swing.JPanel bodyPanel;
    private com.k33ptoo.components.KButton deleteButton;
    private javax.swing.JComboBox<String> employeeTypeComboBox;
    private javax.swing.JPanel headerPanel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> positionComboBox;
    private com.k33ptoo.components.KButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JComboBox<String> statusComboBox;
    private com.k33ptoo.components.KButton updateButton;
    // End of variables declaration//GEN-END:variables
}
