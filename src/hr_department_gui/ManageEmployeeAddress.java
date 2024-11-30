/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.MySql;

/**
 *
 * @author DELL
 */
public class ManageEmployeeAddress extends javax.swing.JFrame {

    private String sid;

    private Map<String, Integer> provinceMap = new HashMap<>();
    private Map<String, Integer> districtMap = new HashMap<>();
//    private static HashMap<String, String> departmentMap = new HashMap<>();

    /**
     * Creates new form ManageEmployeeAddress
     */
    public ManageEmployeeAddress() {
        initComponents();
        loadAddress();
        loadProvinces();
        provinceComboBox.addActionListener(e -> loadDistricts());
        DistricComboBox.addActionListener(e -> loadCities());
//        loadDistricts();
//        loadDearpement();
    }

    DefaultTableModel model;

    private void loadAddress() {

        try {

            ResultSet resultSet = MySql.executeSearch(" SELECT * FROM `employee_address` "
                    + "INNER JOIN `employee` ON `employee`.`employee_address_em_address_id` = `employee_address`.`em_address_id` "
                    + "INNER JOIN `city` ON `city`.`city_id` = `employee_address`.`city_city_id` "
                    + "INNER JOIN `province` ON `province`.`province_id` = `employee_address`.`province_province_id` "
                    + "INNER JOIN `district` ON `district`.`district_id` = `employee_address`.`district_district_id` ");

            model = (DefaultTableModel) ManageEmployeeAddressTable.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {

                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("employee.employee_id"));
                vector.add(resultSet.getString("employee.first_name"));
                vector.add(resultSet.getString("employee.last_name"));
                vector.add(resultSet.getString("employee_address.address_line01"));
                vector.add(resultSet.getString("employee_address.address_line02"));
                vector.add(resultSet.getString("province.province_name"));
                vector.add(resultSet.getString("district.district_name"));
                vector.add(resultSet.getString("city.city_name"));
                vector.add(resultSet.getString("employee.email"));

                model.addRow(vector);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

// Load provinces from the database and populate the provinceComboBox
    private void loadProvinces() {

        try {

            // Fetch all provinces from the database
            ResultSet rs = MySql.executeSearch("SELECT * FROM province");

            // Clear existing items from the combo box and map
            provinceComboBox.removeAllItems();

            provinceMap.clear();

            // Add "Select" as the first item in the combo box
            provinceComboBox.addItem("Select");

            // Add each province to the combo box and map
            while (rs.next()) {

                String provinceName = rs.getString("province_name");

                int provinceId = rs.getInt("province_id");

                provinceComboBox.addItem(provinceName);

                provinceMap.put(provinceName, provinceId); // Store province ID for lookup

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

// Load districts based on the selected province
    private void loadDistricts() {

        // Get the selected province name
        String selectedProvince = (String) provinceComboBox.getSelectedItem();

        // Check if a province is selected
        if (selectedProvince == null || "Select".equals(selectedProvince)) {

            System.out.println("No province selected.");
            DistricComboBox.removeAllItems();
            CityComboBox.removeAllItems();
            DistricComboBox.addItem("Select");
            CityComboBox.addItem("Select");
            return;

        }

        // Retrieve the province ID from the map
        Integer provinceId = provinceMap.get(selectedProvince);

        if (provinceId == null) {

            System.out.println("Province not found in the map: " + selectedProvince);
            return;

        }

        try {
            // Query to fetch districts related to the selected province
            String query = "SELECT * FROM district WHERE province_province_id = " + provinceId;

            ResultSet rs = MySql.executeSearch(query);

            // Clear existing items from the district combobox and map
            DistricComboBox.removeAllItems();

            districtMap.clear();

            // Add each district to the combo box and map
            while (rs.next()) {

                String districtName = rs.getString("district_name");

                int districtId = rs.getInt("district_id");

                DistricComboBox.addItem(districtName);

                districtMap.put(districtName, districtId); // Store district ID for lookup

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

// Load cities based on the selected district
    private void loadCities() {
        // Get the selected district name
        String selectedDistrict = (String) DistricComboBox.getSelectedItem();

        // Check if a district is selected
        if (selectedDistrict == null) {

            System.out.println("No district selected.");

            return;

        }

        // Retrieve the district ID from the map
        Integer districtId = districtMap.get(selectedDistrict);

        if (districtId == null) {

            System.out.println("District not found in the map: " + selectedDistrict);

            return;

        }

        try {
            // Query to fetch cities related to the selected district
            String query = "SELECT * FROM city WHERE district_district_id = " + districtId;

            ResultSet rs = MySql.executeSearch(query);

            // Clear existing items from the city combo box
            CityComboBox.removeAllItems();

            // Add each city to the combo box
            while (rs.next()) {

                String cityName = rs.getString("city_name");

                CityComboBox.addItem(cityName);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    private void search(String searchID) {

        model = (DefaultTableModel) ManageEmployeeAddressTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        ManageEmployeeAddressTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchID, 0));

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
        SearchPanel = new javax.swing.JPanel();
        EmpId = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchButton = new com.k33ptoo.components.KButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddressLine_01 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AddressLine_02 = new javax.swing.JTextField();
        provinceComboBox = new javax.swing.JComboBox<>();
        DistricComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CityComboBox = new javax.swing.JComboBox<>();
        TableUpdatePanel = new javax.swing.JPanel();
        BackToDashboardPanel = new javax.swing.JPanel();
        BackToDashboardButton = new javax.swing.JButton();
        TableViewPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageEmployeeAddressTable = new javax.swing.JTable();
        updateButton = new com.k33ptoo.components.KButton();
        deleteButton = new com.k33ptoo.components.KButton();
        districtComboBox2 = new javax.swing.JComboBox<>();
        DistrictLabel = new javax.swing.JLabel();
        provinceComboBox2 = new javax.swing.JComboBox<>();
        ProvinceLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        cityComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        HeaderPanel.setBackground(new java.awt.Color(153, 153, 153));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(776, 60));

        jLabel1.setFont(new java.awt.Font("Audiowide", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employee Address");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        BodyPanel.setLayout(new java.awt.BorderLayout());

        SearchPanel.setPreferredSize(new java.awt.Dimension(780, 200));

        EmpId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmpIdKeyReleased(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        NameLabel.setText("Search by ID");

        searchButton.setText("Search");
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchButton.setkEndColor(new java.awt.Color(0, 204, 204));
        searchButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        searchButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        searchButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        searchButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        searchButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        searchButton.setkStartColor(new java.awt.Color(0, 102, 153));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Province");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("District");

        AddressLine_01.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Address Line 01");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Address Line 02");

        AddressLine_02.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        provinceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        DistricComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("City");

        CityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(provinceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(DistricComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)
                        .addComponent(CityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressLine_01)
                            .addComponent(AddressLine_02))))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provinceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DistricComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AddressLine_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AddressLine_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        BodyPanel.add(SearchPanel, java.awt.BorderLayout.PAGE_START);

        TableUpdatePanel.setLayout(new java.awt.BorderLayout());

        BackToDashboardPanel.setBackground(new java.awt.Color(153, 153, 153));
        BackToDashboardPanel.setPreferredSize(new java.awt.Dimension(780, 50));

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
                .addGap(18, 18, 18)
                .addComponent(BackToDashboardButton)
                .addContainerGap(1314, Short.MAX_VALUE))
        );
        BackToDashboardPanelLayout.setVerticalGroup(
            BackToDashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackToDashboardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackToDashboardButton)
                .addContainerGap())
        );

        TableUpdatePanel.add(BackToDashboardPanel, java.awt.BorderLayout.PAGE_END);

        ManageEmployeeAddressTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ManageEmployeeAddressTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Address Line 01", "Address Line 02", "Province", "District", "City", "Employee Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageEmployeeAddressTable.getTableHeader().setReorderingAllowed(false);
        ManageEmployeeAddressTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageEmployeeAddressTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ManageEmployeeAddressTable);

        updateButton.setText("Update");
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setkEndColor(new java.awt.Color(0, 204, 204));
        updateButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        updateButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        updateButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        updateButton.setkStartColor(new java.awt.Color(0, 102, 153));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
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

        districtComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DistrictLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        DistrictLabel.setText("Sort by Distrcit");

        provinceComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ProvinceLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ProvinceLabel.setText("Sort by Province");

        CityLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CityLabel.setText("Sort by City");

        cityComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout TableViewPanelLayout = new javax.swing.GroupLayout(TableViewPanel);
        TableViewPanel.setLayout(TableViewPanelLayout);
        TableViewPanelLayout.setHorizontalGroup(
            TableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableViewPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TableViewPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(TableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TableViewPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(ProvinceLabel)
                        .addGap(20, 20, 20)
                        .addComponent(provinceComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(CityLabel)
                        .addGap(20, 20, 20)
                        .addComponent(cityComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(DistrictLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(districtComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(45, 45, 45))
        );
        TableViewPanelLayout.setVerticalGroup(
            TableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableViewPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(TableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(TableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TableViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DistrictLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(districtComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(provinceComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cityComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        TableUpdatePanel.add(TableViewPanel, java.awt.BorderLayout.CENTER);

        BodyPanel.add(TableUpdatePanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(BodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BackToDashboardButtonActionPerformed

    private void EmpIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmpIdKeyReleased

        String searchID = EmpId.getText();
        search(searchID);

    }//GEN-LAST:event_EmpIdKeyReleased

    private void ManageEmployeeAddressTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageEmployeeAddressTableMouseClicked

        if (evt.getClickCount() == 2) {

            int row = ManageEmployeeAddressTable.getSelectedRow(); // Get the selected row from the table

            // Retrieve the Province name and set it in the provinceComboBox
            String Province = String.valueOf(ManageEmployeeAddressTable.getValueAt(row, 5));
            provinceComboBox.setSelectedItem(Province);

            // Retrieve the District name and set it in the DistricComboBox
            String District = String.valueOf(ManageEmployeeAddressTable.getValueAt(row, 6));
            DistricComboBox.setSelectedItem(District);

            // Retrieve the City name and set it in the CityComboBox
            String City = String.valueOf(ManageEmployeeAddressTable.getValueAt(row, 7));
            CityComboBox.setSelectedItem(City);

            // Retrieve the AddressLine_01 from the selected row and set it in the AddressLine_01 text field
            String Address01 = String.valueOf(ManageEmployeeAddressTable.getValueAt(row, 3));
            AddressLine_01.setText(Address01);

            // Retrieve the AddressLine_02 from the selected row and set it in the AddressLine_02 text field
            String Address02 = String.valueOf(ManageEmployeeAddressTable.getValueAt(row, 4));
            AddressLine_02.setText(Address02);

            // Retrieve the AddressLine_02 from the selected row and set it in the AddressLine_02 text field
            String employeeId = String.valueOf(ManageEmployeeAddressTable.getValueAt(row, 0));
            EmpId.setText(employeeId);

        }

    }//GEN-LAST:event_ManageEmployeeAddressTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        try {
            // Get the values entered by the user in the form fields
            String Province = String.valueOf(provinceComboBox.getSelectedItem());
            String District = String.valueOf(DistricComboBox.getSelectedItem());
            String City = String.valueOf(CityComboBox.getSelectedItem());
            String Addres_line_01 = AddressLine_01.getText();
            String Addres_line_02 = AddressLine_02.getText();
            String employeeId = EmpId.getText();

            // Validate the form fields to ensure that no required fields are empty
            if (Province.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Select Province", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (District.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Select District", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (City.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Select City", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (Addres_line_01.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Address Line 01", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (Addres_line_02.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Address Line 02", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                // Query to fetch the original data
                String query = "SELECT * FROM `employee_address` "
                    + "INNER JOIN `employee` ON `employee`.`employee_address_em_address_id` = `employee_address`.`em_address_id` "
                    + "INNER JOIN `city` ON `city`.`city_id` = `employee_address`.`city_city_id` "
                    + "INNER JOIN `province` ON `province`.`province_id` = `employee_address`.`province_province_id` "
                    + "INNER JOIN `district` ON `district`.`district_id` = `employee_address`.`district_district_id`";

                ResultSet rs = MySql.executeSearch(query);

                if (rs.next()) {
                    // Fetch the original values from the database
                    String originalProvince = rs.getString("province_name");
                    String originalDistrict = rs.getString("district_name");
                    String originalCity = rs.getString("city_name");
                    String originalAddressLine1 = rs.getString("address_line01");
                    String originalAddressLine2 = rs.getString("address_line02");

                    // Build the dynamic update query
                    StringBuilder updateQuery = new StringBuilder("UPDATE employee_address SET ");
                    boolean hasChanges = false;

                    if (!Province.equals(originalProvince)) {
                        updateQuery.append("province_province_id = (SELECT province_id FROM province WHERE province_name = '")
                                .append(Province).append("'), ");
                        hasChanges = true;
                    }

                    if (!District.equals(originalDistrict)) {
                        updateQuery.append("district_district_id = (SELECT district_id FROM district WHERE district_name = '")
                                .append(District).append("'), ");
                        hasChanges = true;
                    }

                    if (!City.equals(originalCity)) {
                        updateQuery.append("city_city_id = (SELECT city_id FROM city WHERE city_name = '")
                                .append(City).append("'), ");
                        hasChanges = true;
                    }

                    if (!Addres_line_01.equals(originalAddressLine1)) {
                        updateQuery.append("address_line01 = '").append(Addres_line_01).append("', ");
                        hasChanges = true;
                    }

                    if (!Addres_line_02.equals(originalAddressLine2)) {
                        updateQuery.append("address_line02 = '").append(Addres_line_02).append("', ");
                        hasChanges = true;
                    }

                    // Execute the update query if there are changes
                    if (hasChanges) {
                        // Remove trailing comma and space
                        updateQuery.setLength(updateQuery.length() - 2);
                        updateQuery.append(" WHERE employee.employee_id = ").append(employeeId);

                        MySql.executeUpdate(updateQuery.toString());
                        JOptionPane.showMessageDialog(this, "Employee data updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "No changes detected.", "Info", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating employee data.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployeeAddress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressLine_01;
    private javax.swing.JTextField AddressLine_02;
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JPanel BackToDashboardPanel;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JComboBox<String> CityComboBox;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JComboBox<String> DistricComboBox;
    private javax.swing.JLabel DistrictLabel;
    private javax.swing.JTextField EmpId;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JTable ManageEmployeeAddressTable;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel ProvinceLabel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JPanel TableUpdatePanel;
    private javax.swing.JPanel TableViewPanel;
    private javax.swing.JComboBox<String> cityComboBox2;
    private com.k33ptoo.components.KButton deleteButton;
    private javax.swing.JComboBox<String> districtComboBox2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> provinceComboBox;
    private javax.swing.JComboBox<String> provinceComboBox2;
    private com.k33ptoo.components.KButton searchButton;
    private com.k33ptoo.components.KButton updateButton;
    // End of variables declaration//GEN-END:variables
}
