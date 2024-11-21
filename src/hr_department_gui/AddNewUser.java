/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import java.sql.ResultSet;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mysql.cj.util.DnsSrv;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.MySql;

/**
 *
 * @author 2003k
 */
public class AddNewUser extends javax.swing.JFrame {

    private static HashMap<String, String> departmentMap = new HashMap<>();
    private static HashMap<String, String> positionMap = new HashMap<>();

    /**
     * Creates new form AddNewUser
     */
    public AddNewUser() {

        initComponents();
        loadDearpement();
        loadPosition();
        loadEmployee();
        loadDearpement2();

    }

    private void loadDearpement() {

//        load Dearpement Start
        try {

            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `department`");

            Vector<String> vector = new Vector<>();
            vector.add("select");

            while (resultSet.next()) {

                vector.add(resultSet.getString("department_name"));
                departmentMap.put(resultSet.getString("department_name"), resultSet.getString("department_id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            employeeDepartmentComboBox.setModel(model);

        } catch (Exception e) {

            e.printStackTrace();

        }
        //        load Dearpement End

    }

    private void loadDearpement2() {

//        load Dearpement Start
        try {

            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `department`");

            Vector<String> vector = new Vector<>();
            vector.add("select");

            while (resultSet.next()) {

                vector.add(resultSet.getString("department_name"));
                departmentMap.put(resultSet.getString("department_name"), resultSet.getString("department_id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            departmentComboBox.setModel(model);

        } catch (Exception e) {

            e.printStackTrace();

        }
        //        load Dearpement End

    }

    public void loadPosition() {

        try {

            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `employee_position` ");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {

                vector.add(resultSet.getString("position_name"));
                positionMap.put(resultSet.getString("position_name"), resultSet.getString("employee_position_id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            positionComboBox.setModel(model);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

//    DefaultTableModel Goloble Variable
    DefaultTableModel model;

    public void loadEmployee() {

        try {

            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `employee` "
                    + "INNER JOIN `employee_user` ON `employee`.`employee_id` = `employee_user`.`employee_employee_id`"
                    + "INNER JOIN `department` ON `department`.`department_id` = `employee`.`department_department_id` "
                    + "INNER JOIN `employee_position` ON `employee_position`.`employee_position_id` = `employee`.`employee_position_employee_position_id` ");

            model = (DefaultTableModel) NewuserTable.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {

                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("employee.employee_id"));
                vector.add(resultSet.getString("employee.first_name"));
                vector.add(resultSet.getString("employee.last_name"));
                vector.add(resultSet.getString("employee_user.user_name"));
                vector.add(resultSet.getString("department.department_name"));
                vector.add(resultSet.getString("employee_position.position_name"));
                vector.add(resultSet.getString("employee_user.user_password"));

                model.addRow(vector);

            }

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        BackToDashboardPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        detailsPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        employeeIDTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        employeeNameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        employeeDepartmentComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        positionComboBox = new javax.swing.JComboBox<>();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        PasswordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        buttonPanel = new javax.swing.JPanel();
        addButton = new com.k33ptoo.components.KButton();
        updateButton = new com.k33ptoo.components.KButton();
        deleteButton = new com.k33ptoo.components.KButton();
        refreshButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        departmentComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        NewuserTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(153, 153, 153));
        headerPanel.setPreferredSize(new java.awt.Dimension(942, 45));
        headerPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New User");
        jLabel1.setPreferredSize(new java.awt.Dimension(190, 50));
        headerPanel.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setLayout(new java.awt.BorderLayout());

        BackToDashboardPanel.setBackground(new java.awt.Color(153, 153, 153));
        BackToDashboardPanel.setPreferredSize(new java.awt.Dimension(1007, 50));

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
                .addContainerGap(1055, Short.MAX_VALUE))
        );
        BackToDashboardPanelLayout.setVerticalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackToDashboardButton)
                .addContainerGap())
        );

        bodyPanel.add(BackToDashboardPanel, java.awt.BorderLayout.PAGE_END);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Employee ID");

        employeeIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDTextFieldActionPerformed(evt);
            }
        });
        employeeIDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeIDTextFieldKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel9.setText("Department");

        employeeNameTextField.setEditable(false);
        employeeNameTextField.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("User Name");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel11.setText("Password");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel12.setText("Employee Name");

        employeeDepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeDepartmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeDepartmentComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel13.setText("Position");

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        kButton1.setText("ADD");
        kButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(0, 204, 204));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButton1.setkPressedColor(new java.awt.Color(0, 102, 153));
        kButton1.setkSelectedColor(new java.awt.Color(0, 102, 153));
        kButton1.setkStartColor(new java.awt.Color(0, 102, 153));

        kButton2.setText("ADD");
        kButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(0, 204, 204));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButton2.setkPressedColor(new java.awt.Color(0, 102, 153));
        kButton2.setkSelectedColor(new java.awt.Color(0, 102, 153));
        kButton2.setkStartColor(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))))
                .addGap(59, 59, 59)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(employeeDepartmentComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 228, Short.MAX_VALUE)
                            .addComponent(positionComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(employeeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(employeeDepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        addButton.setText("Add");
        addButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addButton.setkEndColor(new java.awt.Color(0, 204, 204));
        addButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        addButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        addButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        addButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        addButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        addButton.setkStartColor(new java.awt.Color(0, 102, 153));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setkEndColor(new java.awt.Color(0, 204, 204));
        updateButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        updateButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        updateButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkStartColor(new java.awt.Color(0, 102, 153));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setkEndColor(new java.awt.Color(0, 204, 204));
        deleteButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        deleteButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        deleteButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        deleteButton.setkStartColor(new java.awt.Color(0, 102, 153));

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Department");

        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departmentComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentComboBoxItemStateChanged(evt);
            }
        });
        departmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentComboBoxActionPerformed(evt);
            }
        });

        NewuserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "User Name", "Department", "Position", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NewuserTable.getTableHeader().setReorderingAllowed(false);
        NewuserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewuserTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(NewuserTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(departmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jScrollPane1)
                .addGap(100, 100, 100))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyPanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BackToDashboardButtonActionPerformed


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        //    Add Button Start
        try {

            String employeeId = employeeIDTextField.getText();
            String employeeName = employeeNameTextField.getText();
            String userName = userNameTextField.getText();
            String password = String.valueOf(PasswordField.getPassword());
            String department = String.valueOf(employeeDepartmentComboBox.getSelectedItem());
            String position = String.valueOf(positionComboBox.getSelectedItem());

            if (employeeId.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Enter Your Employee ID", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (employeeName.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Enter Your Employee Name", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (userName.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Enter User Name", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (password.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Enter Password", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (!password.matches(" ^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$ ")) {

                JOptionPane.showMessageDialog(this, "Please Enter Minimum eight characters, at least one letter, one number and one special character", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (department.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Select Department", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (position.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Select Position", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {

//                Query
                MySql.executeUpdate(" INSERT INTO `employee_user` (`employee_employee_id`,`user_name`,`user_password`,`employee_name`,`department_department_id`,`employee_position_employee_position_id`) "
                        + "VALUES ('" + employeeId + "' , '" + userName + "','" + password + "','" + employeeName + "','" + departmentMap.get(department) + "','" + positionMap.get(position) + "') ");

//                Load Employee
                loadEmployee();

//                Clear All
                reset();
                
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        //    Add Button End

    }//GEN-LAST:event_addButtonActionPerformed

    private void employeeDepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeDepartmentComboBoxActionPerformed

        String department = String.valueOf(employeeDepartmentComboBox.getSelectedItem());


    }//GEN-LAST:event_employeeDepartmentComboBoxActionPerformed

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed


    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void employeeIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDTextFieldActionPerformed


    }//GEN-LAST:event_employeeIDTextFieldActionPerformed


    private void employeeIDTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeIDTextFieldKeyReleased

//        Store a Employee Id AND Trim to remove Spaces
        String empId = employeeIDTextField.getText();

        try {

//            check ID Field is empty and Clear textfield
            if (empId.isEmpty()) {

                employeeNameTextField.setText("");
                return;

            }

//            Execute Databse Query
            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `employee` WHERE `employee_id` = '" + empId + "' ");

            if (resultSet.next()) {

                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String fullName = firstName + " " + lastName;

                employeeNameTextField.setText(fullName);

            } else {

//                Clear Employee Name Text Field
                employeeNameTextField.setText("");

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_employeeIDTextFieldKeyReleased

    private void departmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboBoxActionPerformed

        try {

            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `department`");

            Vector<String> vector = new Vector<>();
            vector.add("select");

            while (resultSet.next()) {

                vector.add(resultSet.getString("department_name"));
                departmentMap.put(resultSet.getString("department_name"), resultSet.getString("department_id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            departmentComboBox.setModel(model);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_departmentComboBoxActionPerformed

    private void departmentComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentComboBoxItemStateChanged

//        ComboBox Select Change
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            String department = String.valueOf(departmentComboBox.getSelectedItem());

//            Check Valid Department is Selected
            if (!department.equals("select")) {

                try {

//                    Retrieve departement ID From the Map
                    String departmentID = departmentMap.get(department);

//                    Query
                    ResultSet resultSet = MySql.executeSearch("SELECT * FROM `employee_user` "
                            + "INNER JOIN `employee` ON `employee`.`employee_id` = `employee_user`.`employee_employee_id` "
                            + "INNER JOIN `department` ON `department`.`department_id` = `employee`.`department_department_id` "
                            + "INNER JOIN `employee_position` ON `employee_position`.`employee_position_id` = `employee`.`employee_position_employee_position_id` ");

//                    Clear and Update table
                    DefaultTableModel tableModel = (DefaultTableModel) NewuserTable.getModel();
                    tableModel.setRowCount(0);

                    while (resultSet.next()) {

                        String empID = resultSet.getString("`employee`.`employee_id`");
                        String fName = resultSet.getString("`employee`.`first_name`");
                        String lName = resultSet.getString("`employee`.`last_name`");
                        String uName = resultSet.getString("`employee_user`.`user_name`");
                        String departmentName = resultSet.getString("`department`.`department_name`");
                        String position = resultSet.getString("`employee_position`.`position_name`");

                        tableModel.addRow(new Object[]{empID, fName, lName, uName, departmentName, position});

                    }

                } catch (Exception e) {

                }

            }

        }


    }//GEN-LAST:event_departmentComboBoxItemStateChanged

    private void NewuserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewuserTableMouseClicked

        if (evt.getClickCount() == 2) {

            addButton.setVisible(false);

            int row = NewuserTable.getSelectedRow();

            String empID = String.valueOf(NewuserTable.getValueAt(row, 0));
            employeeIDTextField.setText(empID);
            employeeIDTextField.setEditable(false);

            String userName = String.valueOf(NewuserTable.getValueAt(row, 3));
            userNameTextField.setText(userName);

            String password = String.valueOf(NewuserTable.getValueAt(row, 6));
            PasswordField.setText(userName);

            String fName = String.valueOf(NewuserTable.getValueAt(row, 1));
            String lName = String.valueOf(NewuserTable.getValueAt(row, 2));
            String fullname = fName + " " + lName;
            employeeNameTextField.setText(fullname);

            String department = String.valueOf(NewuserTable.getValueAt(row, 4));
            employeeDepartmentComboBox.setSelectedItem(department);

            String position = String.valueOf(NewuserTable.getValueAt(row, 5));
            positionComboBox.setSelectedItem(position);

        }


    }//GEN-LAST:event_NewuserTableMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked

        addButton.setVisible(true);

        try {

            String employeeId = employeeIDTextField.getText();
            String employeeName = employeeNameTextField.getText();
            String userName = userNameTextField.getText();
            String password = String.valueOf(PasswordField.getPassword());
            String department = String.valueOf(employeeDepartmentComboBox.getSelectedItem());
            String position = String.valueOf(positionComboBox.getSelectedItem());

            if (employeeId.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Enter Your Employee ID", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (employeeName.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Enter Your Employee Name", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (userName.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Enter User Name", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (password.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Enter Password", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")) {

                JOptionPane.showMessageDialog(this, "Please Enter Minimum eight characters, at least one letter, one number and one special character", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (department.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Select Department", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (position.isEmpty()) {

                JOptionPane.showMessageDialog(this, "Please Select Position", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {

                MySql.executeUpdate("UPDATE `employee_user` SET `user_name` = '" + userName + "' , `user_password` = '" + password + "' , `department_department_id` = '" + departmentMap.get(department) + "' ,`employee_position_employee_position_id` = '" + positionMap.get(position) + "' WHERE `employee_employee_id` = '" + employeeId + "' ");

                loadEmployee();

                reset();
                
            }

        } catch (Exception e) {

            e.printStackTrace();
            
        }

    }//GEN-LAST:event_updateButtonMouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        
        reset();
        
    }//GEN-LAST:event_refreshButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JPanel BackToDashboardPanel;
    private javax.swing.JTable NewuserTable;
    private javax.swing.JPasswordField PasswordField;
    private com.k33ptoo.components.KButton addButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel buttonPanel;
    private com.k33ptoo.components.KButton deleteButton;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JComboBox<String> employeeDepartmentComboBox;
    private javax.swing.JTextField employeeIDTextField;
    private javax.swing.JTextField employeeNameTextField;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel tablePanel;
    private com.k33ptoo.components.KButton updateButton;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        
        employeeIDTextField.setText("");
        userNameTextField.setText("");
        PasswordField.setText("");
        employeeNameTextField.setText("");
        employeeDepartmentComboBox.setSelectedIndex(0);
        positionComboBox.setSelectedIndex(0);
        
    }
}
