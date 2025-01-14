/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hr_department_gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.MySql;

/**
 *
 * @author Avishka
 */
public class ManageEmployee extends javax.swing.JFrame {

    // Hashmaps for Employee status, department, type, position
    private static HashMap<String, String> statusTypeMap = new HashMap<>();
    private static HashMap<String, String> departmaentTypeHashMap = new HashMap<>();
    private static HashMap<String, String> empTypeHashMap = new HashMap<>();
    private static HashMap<String, String> positiontypeHashMap = new HashMap<>();

    public ManageEmployee() {

        initComponents();     // Initialize components
        addPlaceholder();     // call textfields placeholder method
        initializeRowSorter(); // call table row sorter method
        loadEmployeeData();   // call table data load method
        loadEmployeeStatus(); // call employee status combobox load method
        loadDepartment();     // call employee department combobox load method
        loadEmployeeType();   // call employee type combobox load method
        loadPosition();       // call employee position combobox load method

    }

    // Placeholders add method
    private void addPlaceholder() {

        // postalcodeTextField placeholder & color
        EmployeeSearchField.setText("Enter Employee Name or ID");
        EmployeeSearchField.setForeground(Color.GRAY);

    }

    // global variables of Table & ComboBox Models
    private DefaultTableModel tablemodel;
    private DefaultComboBoxModel model;
    private DefaultComboBoxModel model2;

    // table row sorter
    private TableRowSorter<DefaultTableModel> rowSorter;

    // table row sort initializer
    private void initializeRowSorter() {

        // get ManageEmployeeTable as DefaultTableModel
        tablemodel = (DefaultTableModel) ManageEmployeeTable.getModel();

        // create new row sorter to tablemodel
        rowSorter = new TableRowSorter<>(tablemodel);

        // add row sorter to table
        ManageEmployeeTable.setRowSorter(rowSorter);

    }

    // Employee Details Table load method
    private void loadEmployeeData() {

        try {

            // search query
            ResultSet resultSet = MySql.executeSearch("SELECT employee_id, nic, first_name, last_name, contact_number, email, "
                    + "date_of_birth, date_of_hire, date_of_final, gender_name, address_line01, address_line02, "
                    + "status_name, type_name, position_name, department_name "
                    + "FROM employee "
                    + "INNER JOIN employee_address ON employee.employee_address_em_address_id = employee_address.em_address_id "
                    + "LEFT JOIN department ON employee.department_department_id = department.department_id "
                    + "LEFT JOIN employee_position ON employee.employee_position_employee_position_id = employee_position.employee_position_id "
                    + "INNER JOIN employee_type ON employee.employee_type_employee_type_id = employee_type.employee_type_id "
                    + "LEFT JOIN employee_status ON employee.employee_status_employee_status_id = employee_status.employee_status_id "
                    + "INNER JOIN gender ON employee.gender_gender_id = gender.gender_id");

            // get ManageEmployeeTable as DefaultTableModel
            tablemodel = (DefaultTableModel) ManageEmployeeTable.getModel();
            tablemodel.setRowCount(0); // Clear table before loading new data

            // to check available result
            boolean hasData = false;

            // query row checker and updater loop
            while (resultSet.next()) {

                // if there's a data boolean value will be true
                hasData = true;

                // get address as a variable
                String address = (resultSet.getString("address_line01") != null ? resultSet.getString("address_line01") : "")
                        + " " + (resultSet.getString("address_line02") != null ? resultSet.getString("address_line02") : "");

                // add row to table
                tablemodel.addRow(new Object[]{
                    resultSet.getString("employee_id"),
                    resultSet.getString("nic"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("contact_number"),
                    resultSet.getString("email"),
                    resultSet.getString("date_of_birth"),
                    resultSet.getString("date_of_hire"),
                    resultSet.getString("date_of_final") != null ? resultSet.getString("date_of_final") : "     -     ",
                    resultSet.getString("gender_name"),
                    address,
                    resultSet.getString("status_name") != null ? resultSet.getString("status_name") : "     -     ",
                    resultSet.getString("type_name"),
                    resultSet.getString("position_name") != null ? resultSet.getString("position_name") : "     -     ",
                    resultSet.getString("department_name") != null ? resultSet.getString("department_name") : "     -     "

                });

            }

            // checks if data loaded from query if not shows a message
            if (!hasData) {

                JOptionPane.showMessageDialog(this, "No data found for employees.", "Info", JOptionPane.INFORMATION_MESSAGE);

            }

            // sets model to table
            ManageEmployeeTable.setModel(tablemodel);

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    // method for load Employ Status to Comboboxes
    private void loadEmployeeStatus() {

        try {

            // search query
            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `employee_status`");

            // create new arraylist
            ArrayList<String> arrayList = new ArrayList<>();

            // add default value
            arrayList.add("Select Status");

            // query row checker and updater loop
            while (resultSet.next()) {

                // adds data to arraylist
                arrayList.add(resultSet.getString("status_name"));

                // store data to hashmap for future use
                statusTypeMap.put(resultSet.getString("status_name"), resultSet.getString("employee_status_id"));

            }

            // create new model
            model = new DefaultComboBoxModel();
            EmployeeStatusComboBox.setModel(model); // set model to combobox

            // create another new model
            model2 = new DefaultComboBoxModel();
            statusComboBox.setModel(model2);  // set model2 to combobox

            // add arraylist to model
            model.addAll(arrayList);

            // add arraylist to model2
            model2.addAll(arrayList);

            // set default values for two status comboxes
            EmployeeStatusComboBox.setSelectedItem("Select Status");
            statusComboBox.setSelectedItem("Select Status");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // method for load Employ Department to Combobox
    private void loadDepartment() {

        try {

            // search query
            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `department`");

            // create new arraylist
            ArrayList<String> arrayList = new ArrayList<>();

            // add default value
            arrayList.add("Select Department");

            // query row checker and updater loop
            while (resultSet.next()) {

                // adds data to arraylist
                arrayList.add(resultSet.getString("department_name"));

                // store data to hashmap for future use
                departmaentTypeHashMap.put(resultSet.getString("department_name"), resultSet.getString("department_id"));
            }

            // create new model
            model = new DefaultComboBoxModel();
            DepartmentComboBox.setModel(model);  // set model to combobox

            // add arraylist to model
            model.addAll(arrayList);

            // set default value to DepartmentComboBox
            DepartmentComboBox.setSelectedItem("Select Department");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void loadEmployeeType() {

        try {

            // search query
            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `employee_type`");

            // create new arraylist
            ArrayList<String> arrayList = new ArrayList<>();

            // add default value
            arrayList.add("Select Type");

            // query row checker and updater loop
            while (resultSet.next()) {

                // adds data to arraylist
                arrayList.add(resultSet.getString("type_name"));

                // store data to hashmap for future use
                empTypeHashMap.put(resultSet.getString("type_name"), resultSet.getString("employee_type_id"));

            }

            // create new model
            model = new DefaultComboBoxModel();
            employeeTypeComboBox.setModel(model);  // set model to combobox

            // add arraylist to model
            model.addAll(arrayList);

            // set default value to employeeTypeComboBox
            employeeTypeComboBox.setSelectedItem("Select Type");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void loadPosition() {

        try {

            // search query
            ResultSet resultSet = MySql.executeSearch("SELECT * FROM `employee_position`");

            // create new arraylist
            ArrayList<String> arrayList = new ArrayList<>();

            // add default value
            arrayList.add("Select Position");

            // query row checker and updater loop
            while (resultSet.next()) {

                // adds data to arraylist
                arrayList.add(resultSet.getString("position_name"));

                // store data to hashmap for future use
                positiontypeHashMap.put(resultSet.getString("position_name"), resultSet.getString("employee_position_id"));

            }

            // create new model
            model = new DefaultComboBoxModel();
            positionComboBox.setModel(model);  // set model to combobox

            // add arraylist to model
            model.addAll(arrayList);

            // set default value to positionComboBox
            positionComboBox.setSelectedItem("Select Position");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // method to update Employee status (Update button code)
    private void updateEmployeeStatus() {

        try {

            // Get Employee ID from the table
            int row = ManageEmployeeTable.getSelectedRow();

            // check if a row selected
            if (row != -1) {

                // Get data from selected row
                String empId = ManageEmployeeTable.getValueAt(row, 0).toString();

                // Get the selected status from the ComboBox
                String newStatus = (String) EmployeeStatusComboBox.getSelectedItem();

                if (newStatus == null || newStatus.equals("Select Status")) {

                    JOptionPane.showMessageDialog(this, "Please select a valid status!", "Validation Error", JOptionPane.WARNING_MESSAGE);
                    return;

                }

                // Update the database with the new status
                String query = "UPDATE `employee` "
                        + "INNER JOIN `employee_status` ON `employee`.`employee_status_employee_status_id` = `employee_status`.`employee_status_id`"
                        + "SET `status_name` = '" + newStatus + "' "
                        + "WHERE `employee_id` = '" + empId + "'";

                // take the affected query row count
                int rowsAffected = MySql.executeUpdate(query);

                // checks if there is a affected row 
                if (rowsAffected > 0) {

                    JOptionPane.showMessageDialog(this, "Employee status updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Refresh the table
                    loadEmployeeData();

                } else {

                    JOptionPane.showMessageDialog(this, "Employee ID not found!", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating employee status: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    // method to update Employee status (Update button code)
    private void deleteEmployeeStatus() {

        try {

            // Get Employee ID from the table
            int row = ManageEmployeeTable.getSelectedRow();

            // check if a row selected
            if (row != -1) {

                // Get data from selected row
                String empId = ManageEmployeeTable.getValueAt(row, 0).toString();

                // Confirm deletion
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this employee?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

                // if not yes option code
                if (confirm != JOptionPane.YES_OPTION) {

                    return; // User canceled deletion

                }

                // Delete the employee from the database
                String query = "DELETE FROM `employee` WHERE `employee_id` = '" + empId + "'";

                // take the affected query row count
                int rowsAffected = MySql.executeUpdate(query);

                // checks if there is a affected row 
                if (rowsAffected > 0) {

                    JOptionPane.showMessageDialog(this, "Employee deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Refresh the table
                    loadEmployeeData();

                } else {

                    JOptionPane.showMessageDialog(this, "Employee ID not found!", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating employee status: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    // Filter Table By Department Combobox
    private void filterTableByDepartment() {

        // variable for get combobox selected item
        String selectedDepartment = (String) DepartmentComboBox.getSelectedItem();

        // checks string value null or default
        if (selectedDepartment == null || selectedDepartment.equals("Select Department")) {

            // Show all rows if "Select Department" is chosen
            rowSorter.setRowFilter(null);
            return;

        }

        // reset code for other ComboBoxes and Dates
        statusComboBox.setSelectedIndex(0);
        employeeTypeComboBox.setSelectedIndex(0);
        positionComboBox.setSelectedIndex(0);
        dateOfHireFromDayChooser.setDate(null);
        dateOfHireToDayChooser.setDate(null);

        // Apply a filter based on the department name in the relevant column
        rowSorter.setRowFilter(RowFilter.regexFilter("^" + selectedDepartment + "$", 14));

    }

    // Filter Table By Position Combobox
    private void filterTableByPosition() {

        // variable for get combobox selected item
        String selectedPostion = (String) positionComboBox.getSelectedItem();

        // checks string value null or default
        if (selectedPostion == null || selectedPostion.equals("Select Position")) {

            // Show all rows if "Select Position" is chosen
            rowSorter.setRowFilter(null);
            return;

        }

        // reset code for other ComboBoxes and Dates
        DepartmentComboBox.setSelectedIndex(0);
        statusComboBox.setSelectedIndex(0);
        employeeTypeComboBox.setSelectedIndex(0);
        dateOfHireFromDayChooser.setDate(null);
        dateOfHireToDayChooser.setDate(null);

        // Apply a filter based on the department name in the relevant column
        rowSorter.setRowFilter(RowFilter.regexFilter("^" + selectedPostion + "$", 13));

    }

    // Filter Table By Type Combobox
    private void filterTableByType() {

        // variable for get combobox selected item
        String selectedType = (String) employeeTypeComboBox.getSelectedItem();

        // checks string value null or default        
        if (selectedType == null || selectedType.equals("Select Type")) {

            // Show all rows if "Select Type" is chosen
            rowSorter.setRowFilter(null);
            return;

        }

        // reset code for other ComboBoxes and Dates
        DepartmentComboBox.setSelectedIndex(0);
        statusComboBox.setSelectedIndex(0);
        positionComboBox.setSelectedIndex(0);
        dateOfHireFromDayChooser.setDate(null);
        dateOfHireToDayChooser.setDate(null);

        // Apply a filter based on the department name in the relevant column
        rowSorter.setRowFilter(RowFilter.regexFilter("^" + selectedType + "$", 12));

    }

    // Filter Table By Status Combobox
    private void filterTableByStatus() {

        // variable for get combobox selected item
        String selectedStatus = (String) statusComboBox.getSelectedItem();

        // checks string value null or default        
        if (selectedStatus == null || selectedStatus.equals("Select Status")) {

            // Show all rows if "Select Status" is chosen
            rowSorter.setRowFilter(null);
            return;

        }

        // reset code for other ComboBoxes and Dates
        DepartmentComboBox.setSelectedIndex(0);
        statusComboBox.setSelectedIndex(0);
        positionComboBox.setSelectedIndex(0);
        dateOfHireFromDayChooser.setDate(null);
        dateOfHireToDayChooser.setDate(null);

        // Apply a filter based on the department name in the relevant column
        rowSorter.setRowFilter(RowFilter.regexFilter("^" + selectedStatus + "$", 11));

    }

    private Date fromDate = null;
    private Date toDate = null;

    // Filter Table By Hired Date
    private void filterByDateRange() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); // Ensure strict date validation

        try {

            // Handle cases based on selected dates
            String query = null;

            if (fromDate != null && toDate != null) {
                // Both dates are selected: Filter rows between the two dates

                String formattedFromDate = sdf.format(fromDate);
                String formattedToDate = sdf.format(toDate);

                // SQL query to fetch rows within the date range
                query = "SELECT `employee_id`, `nic`, `first_name`, `last_name`, `contact_number`, `email`, `date_of_birth`, `date_of_hire`, `date_of_final`, "
                        + "`gender_name`, `address_line01`, `address_line02`, `status_name`, `type_name`, `position_name`, `department_name` "
                        + "FROM `employee` "
                        + "INNER JOIN `employee_address`  ON `employee`.`employee_address_em_address_id` = `employee_address`.`em_address_id` "
                        + "LEFT JOIN `department`  ON `employee`.`department_department_id` = `department`.`department_id` "
                        + "LEFT JOIN `employee_position`  ON `employee`.`employee_position_employee_position_id` = `employee_position`.`employee_position_id` "
                        + "INNER JOIN `employee_type`  ON `employee`.`employee_type_employee_type_id` = `employee_type`.`employee_type_id` "
                        + "LEFT JOIN `employee_status`  ON `employee`.`employee_status_employee_status_id` = `employee_status`.`employee_status_id` "
                        + "INNER JOIN `gender`  ON `employee`.`gender_gender_id` = `gender`.`gender_id` "
                        + "WHERE `employee`.`date_of_hire` BETWEEN '" + formattedFromDate + "' AND '" + formattedToDate + "'";

                if (!isValidPastDate(fromDate)) {
                    // Check if Employee Selected Birth Date is in Past or not

                    JOptionPane.showMessageDialog(this, "Please Select a Valid Minimum Hire Date to sort table!", "Warning: Invalid Date Of Hire", JOptionPane.WARNING_MESSAGE);

                    dateOfHireFromDayChooser.grabFocus(); // Gets focus to dateOfBirthDayChooser 

                } else if (!isValidPastDate(toDate)) {
                    // Check if Employee Selected Birth Date is in Past or not

                    JOptionPane.showMessageDialog(this, "Please Select a Valid Maximum Hire Date to sort table!", "Warning: Invalid Date Of Hire", JOptionPane.WARNING_MESSAGE);

                    dateOfHireToDayChooser.grabFocus(); // Gets focus to dateOfBirthDayChooser 

                }

            } else if (fromDate != null) {
                // Only "From" date is selected: Filter rows on or after this date

                String formattedFromDate = sdf.format(fromDate);

                // SQL query to fetch rows after the from date
                query = "SELECT `employee_id`, `nic`, `first_name`, `last_name`, `contact_number`, `email`, `date_of_birth`, `date_of_hire`, `date_of_final`, "
                        + "`gender_name`, `address_line01`, `address_line02`, `status_name`, `type_name`, `position_name`, `department_name` "
                        + "FROM `employee` "
                        + "INNER JOIN `employee_address`  ON `employee`.`employee_address_em_address_id` = `employee_address`.`em_address_id` "
                        + "LEFT JOIN `department`  ON `employee`.`department_department_id` = `department`.`department_id` "
                        + "LEFT JOIN `employee_position`  ON `employee`.`employee_position_employee_position_id` = `employee_position`.`employee_position_id` "
                        + "INNER JOIN `employee_type`  ON `employee`.`employee_type_employee_type_id` = `employee_type`.`employee_type_id` "
                        + "LEFT JOIN `employee_status`  ON `employee`.`employee_status_employee_status_id` = `employee_status`.`employee_status_id` "
                        + "INNER JOIN `gender`  ON `employee`.`gender_gender_id` = `gender`.`gender_id` "
                        + "WHERE `employee`.`date_of_hire` >= '" + formattedFromDate + "'";

                if (!isValidPastDate(fromDate)) {
                    // Check if Employee Selected Birth Date is in Past or not

                    JOptionPane.showMessageDialog(this, "Please Select a Valid Minimum Hire Date to sort table!", "Warning: Invalid Date Of Hire", JOptionPane.WARNING_MESSAGE);

                    dateOfHireFromDayChooser.grabFocus(); // Gets focus to dateOfBirthDayChooser 

                }

            } else if (toDate != null) {
                // Only "To" date is selected: Filter rows on or before this date

                String formattedToDate = sdf.format(toDate);

                // SQL query to fetch rows before the to date
                query = "SELECT `employee_id`, `nic`, `first_name`, `last_name`, `contact_number`, `email`, `date_of_birth`, `date_of_hire`, `date_of_final`, "
                        + "`gender_name`, `address_line01`, `address_line02`, `status_name`, `type_name`, `position_name`, `department_name` "
                        + "FROM `employee` "
                        + "INNER JOIN `employee_address`  ON `employee`.`employee_address_em_address_id` = `employee_address`.`em_address_id` "
                        + "LEFT JOIN `department`  ON `employee`.`department_department_id` = `department`.`department_id` "
                        + "LEFT JOIN `employee_position`  ON `employee`.`employee_position_employee_position_id` = `employee_position`.`employee_position_id` "
                        + "INNER JOIN `employee_type`  ON `employee`.`employee_type_employee_type_id` = `employee_type`.`employee_type_id` "
                        + "LEFT JOIN `employee_status`  ON `employee`.`employee_status_employee_status_id` = `employee_status`.`employee_status_id` "
                        + "INNER JOIN `gender`  ON `employee`.`gender_gender_id` = `gender`.`gender_id` "
                        + "WHERE `employee`.`date_of_hire` <= '" + formattedToDate + "'";

                if (!isValidPastDate(toDate)) {
                    // Check if Employee Selected Birth Date is in Past or not

                    JOptionPane.showMessageDialog(this, "Please Select a Valid Maximum Hire Date to sort table!", "Warning: Invalid Date Of Hire", JOptionPane.WARNING_MESSAGE);

                    dateOfHireToDayChooser.grabFocus(); // Gets focus to dateOfBirthDayChooser 

                }

            }

            if (query != null) {
                // Execute the query and update the table

                ResultSet resultSet = MySql.executeSearch(query);

                tablemodel = (DefaultTableModel) ManageEmployeeTable.getModel();
                tablemodel.setRowCount(0); // Clear the table

                boolean found = false;

                while (resultSet.next()) {

                    found = true;

                    String address = (resultSet.getString("address_line01") != null ? resultSet.getString("address_line01") : "")
                            + " "
                            + (resultSet.getString("address_line02") != null ? resultSet.getString("address_line02") : "");

                    tablemodel.addRow(new Object[]{
                        resultSet.getString("employee_id"),
                        resultSet.getString("nic"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("contact_number"),
                        resultSet.getString("email"),
                        resultSet.getString("date_of_birth"),
                        resultSet.getString("date_of_hire"),
                        resultSet.getString("date_of_final") != null ? resultSet.getString("date_of_final") : "     -     ",
                        resultSet.getString("gender_name"),
                        address,
                        resultSet.getString("status_name") != null ? resultSet.getString("status_name") : " - ",
                        resultSet.getString("type_name"),
                        resultSet.getString("position_name") != null ? resultSet.getString("position_name") : "     -     ",
                        resultSet.getString("department_name") != null ? resultSet.getString("department_name") : "     -     "

                    });

                }

                if (!found) {

                    JOptionPane.showMessageDialog(this, "No data found!", "No Results!", JOptionPane.INFORMATION_MESSAGE);

                }

            }

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error filtering by date range: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    // EmployeeSearchField search Employee method
    private void searchEmployee() {

        String search = EmployeeSearchField.getText().trim();

        // Validate input
        if (search.isEmpty() || search.equals("Enter Employee Name or ID")) {

            JOptionPane.showMessageDialog(this, "Please enter an Employee ID or Name!", "Validation Error!", JOptionPane.WARNING_MESSAGE);

            // Show all rows if EmployeeSearchField is empty
            rowSorter.setRowFilter(null);
            return;

        }

        // Check for invalid characters
        if (!search.matches("\\d+") && !search.matches("[a-zA-Z\\s]+")) {

            JOptionPane.showMessageDialog(this, "Invalid input! Enter only numeric Employee ID or alphabetic Name.", "Validation Error!", JOptionPane.WARNING_MESSAGE);
            return;

        }

        try {

            // query variable initialize
            String query = null;

            // Determine whether the input is numeric (ID) or alphabetic (Name)
            if (search.matches("[a-zA-Z\\s]+")) {
                // Alphabetic input (Name)

                // assign name query
                query = "SELECT `employee_id`, `nic`, `first_name`, `last_name`, `contact_number`, `email`, `date_of_birth`, "
                        + "`date_of_hire`, `date_of_final`, `gender_name`, `address_line01`, `address_line02`, "
                        + "`status_name`, `type_name`, `position_name`, `department_name` "
                        + "FROM `employee` "
                        + "INNER JOIN `employee_address` ON `employee`.`employee_address_em_address_id` = `employee_address`.`em_address_id` "
                        + "LEFT JOIN `department` ON `employee`.`department_department_id` = `department`.`department_id` "
                        + "LEFT JOIN `employee_position` ON `employee`.`employee_position_employee_position_id` = `employee_position`.`employee_position_id` "
                        + "INNER JOIN `employee_type` ON `employee`.`employee_type_employee_type_id` = `employee_type`.`employee_type_id` "
                        + "LEFT JOIN `employee_status` ON `employee`.`employee_status_employee_status_id` = `employee_status`.`employee_status_id` "
                        + "INNER JOIN `gender` ON `employee`.`gender_gender_id` = `gender`.`gender_id` "
                        + "WHERE `employee`.`first_name` LIKE '%" + search + "%' OR `employee`.`last_name` LIKE '%" + search + "%'";

            } else {
                // Numeric input (Employee ID)

                // assign id query
                query = "SELECT `employee_id`, `nic`, `first_name`, `last_name`, `contact_number`, `email`, `date_of_birth`, "
                        + "`date_of_hire`, `date_of_final`, `gender_name`, `address_line01`, `address_line02`, "
                        + "`status_name`, `type_name`, `position_name`, `department_name` "
                        + "FROM `employee` "
                        + "INNER JOIN `employee_address` ON `employee`.`employee_address_em_address_id` = `employee_address`.`em_address_id` "
                        + "LEFT JOIN `department` ON `employee`.`department_department_id` = `department`.`department_id` "
                        + "LEFT JOIN `employee_position` ON `employee`.`employee_position_employee_position_id` = `employee_position`.`employee_position_id` "
                        + "INNER JOIN `employee_type` ON `employee`.`employee_type_employee_type_id` = `employee_type`.`employee_type_id` "
                        + "LEFT JOIN `employee_status` ON `employee`.`employee_status_employee_status_id` = `employee_status`.`employee_status_id` "
                        + "INNER JOIN `gender` ON `employee`.`gender_gender_id` = `gender`.`gender_id` "
                        + "WHERE `employee`.`employee_id` LIKE '%" + search + "%'";

            }

            // checks if query not null
            if (query != null) {

                // execute search query
                ResultSet resultSet = MySql.executeSearch(query);

                // assign ManageEmployeeTable as a DefaultTableModel
                tablemodel = (DefaultTableModel) ManageEmployeeTable.getModel();
                tablemodel.setRowCount(0); // clear the table

                // boolean variable for check query results empty or not
                boolean found = false;

                // Populate the table model with fetched data
                while (resultSet.next()) {

                    // sets boolean true if data found
                    found = true;

                    // get address as a variable
                    String address = (resultSet.getString("address_line01") != null ? resultSet.getString("address_line01") : "")
                            + " "
                            + (resultSet.getString("address_line02") != null ? resultSet.getString("address_line02") : "");

                    // add row to table
                    tablemodel.addRow(new Object[]{
                        resultSet.getString("employee_id"),
                        resultSet.getString("nic"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("contact_number"),
                        resultSet.getString("email"),
                        resultSet.getString("date_of_birth"),
                        resultSet.getString("date_of_hire"),
                        resultSet.getString("date_of_final") != null ? resultSet.getString("date_of_final") : "     -     ",
                        resultSet.getString("gender_name"),
                        address,
                        resultSet.getString("status_name") != null ? resultSet.getString("status_name") : "     -     ",
                        resultSet.getString("type_name"),
                        resultSet.getString("position_name") != null ? resultSet.getString("position_name") : "     -     ",
                        resultSet.getString("department_name") != null ? resultSet.getString("department_name") : "     -     "

                    });

                }

                // if no data validation part
                if (!found) {

                    JOptionPane.showMessageDialog(this, "No matching employee found!", "No Results!", JOptionPane.INFORMATION_MESSAGE);

                }

            }

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error searching employee: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    // Method to validate the selected date as a Past Date
    public static boolean isValidPastDate(Date selectedDate) {

        // Convert Date to LocalDate
        LocalDate selectedLocalDate = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();

        // Check if the selected date is not after today
        return !selectedLocalDate.isAfter(today);

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
        dateOfHireFromDayChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dateOfHireToDayChooser = new com.toedter.calendar.JDateChooser();
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
        EmployeeSearchField.setToolTipText("Please Search Using Only Employee ID or Name!");
        EmployeeSearchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmployeeSearchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmployeeSearchFieldFocusLost(evt);
            }
        });

        EmployeeStatusComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EmployeeStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        EmployeeStatusComboBox.setToolTipText("Please Choose Employee Status for Update Employee!");
        EmployeeStatusComboBox.setPreferredSize(new java.awt.Dimension(75, 32));

        EmployeeStatusLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmployeeStatusLabel.setText("Employee Status");

        RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh.png"))); // NOI18N
        RefreshButton.setToolTipText("");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Name or ID");

        searchButton.setText("Search");
        searchButton.setToolTipText("Click Here to Search!");
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchButton.setkEndColor(new java.awt.Color(0, 204, 204));
        searchButton.setkHoverEndColor(new java.awt.Color(0, 102, 153));
        searchButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        searchButton.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        searchButton.setkPressedColor(new java.awt.Color(0, 102, 153));
        searchButton.setkSelectedColor(new java.awt.Color(0, 102, 153));
        searchButton.setkStartColor(new java.awt.Color(0, 102, 153));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

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
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(EmployeeStatusComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
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
        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        positionComboBox.setPreferredSize(new java.awt.Dimension(75, 32));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        employeeTypeComboBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        employeeTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
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
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        statusComboBox.setPreferredSize(new java.awt.Dimension(72, 32));
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });

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
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        dateOfHireFromDayChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateOfHireFromDayChooserPropertyChange(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("to");

        dateOfHireToDayChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateOfHireToDayChooserPropertyChange(evt);
            }
        });

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
                        .addComponent(dateOfHireFromDayChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(dateOfHireToDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(dateOfHireToDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfHireFromDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                "Employee ID", "NIC", "First Name", "Last Name", "Contact Number", "Email", "Date of Birth", "Date of Hire", "Date of Final", "Gender", "Address", "Status", "Employee Type", "Position", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageEmployeeTable.getTableHeader().setReorderingAllowed(false);
        ManageEmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageEmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ManageEmployeeTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        bodyPanel.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed

        this.dispose();

    }//GEN-LAST:event_BackToDashboardButtonActionPerformed

    private void DepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentComboBoxActionPerformed

        filterTableByDepartment();

    }//GEN-LAST:event_DepartmentComboBoxActionPerformed

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed

        filterTableByPosition();

    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void employeeTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeTypeComboBoxActionPerformed

        filterTableByType();

    }//GEN-LAST:event_employeeTypeComboBoxActionPerformed

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed

        filterTableByStatus();

    }//GEN-LAST:event_statusComboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        searchEmployee();

    }//GEN-LAST:event_searchButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed

        reset();

    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void EmployeeSearchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmployeeSearchFieldFocusGained

        // Checks and set clear the current cityTextField to enter data to it
        if (EmployeeSearchField.getText().equals("Enter Employee Name or ID")) {

            EmployeeSearchField.setText("");
            EmployeeSearchField.setForeground(Color.BLACK);

        }

    }//GEN-LAST:event_EmployeeSearchFieldFocusGained

    private void EmployeeSearchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmployeeSearchFieldFocusLost

        // Sets back the placeholder of EmployeeSearchField
        if (EmployeeSearchField.getText().isEmpty()) {

            EmployeeSearchField.setText("Enter Employee Name or ID");
            EmployeeSearchField.setForeground(Color.GRAY);

        }

    }//GEN-LAST:event_EmployeeSearchFieldFocusLost

    private void ManageEmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageEmployeeTableMouseClicked

        if (evt.getClickCount() == 1) {

            int row = ManageEmployeeTable.getSelectedRow();

            if (row != -1) {

                // Get data from selected row
                String empId = ManageEmployeeTable.getValueAt(row, 0).toString();
                String fname = ManageEmployeeTable.getValueAt(row, 2).toString();
                String lname = ManageEmployeeTable.getValueAt(row, 3).toString();

                // sets text color to black
                EmployeeSearchField.setForeground(Color.BLACK);

                EmployeeSearchField.setText(empId + " - " + fname + " " + lname);

            }

        }

        if (evt.getClickCount() == 2) {

            // Confirm Update Employee data
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to Update this Employee Data?", "Confirm to Proceed Update", JOptionPane.YES_NO_OPTION);

            // if not yes option code
            if (confirm != JOptionPane.YES_OPTION) {

                return; // User canceled updation

            }

            int row = ManageEmployeeTable.getSelectedRow();

            if (row != -1) {

                // Get data from selected row
                String empId = ManageEmployeeTable.getValueAt(row, 0).toString();
                
                // call openAddEmployeeGUI
                openAddEmployeeGUI(empId);
                
                this.setVisible(false); // Hide Manage Employee (this) Frame
                
            }

        }

    }//GEN-LAST:event_ManageEmployeeTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        updateEmployeeStatus();

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        deleteEmployeeStatus();

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void dateOfHireFromDayChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateOfHireFromDayChooserPropertyChange

        // Get the From Data from the dateOfHireFromDayChooser
        fromDate = dateOfHireFromDayChooser.getDate();

        filterByDateRange();

    }//GEN-LAST:event_dateOfHireFromDayChooserPropertyChange

    private void dateOfHireToDayChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateOfHireToDayChooserPropertyChange

        // Get the To Data from the dateOfHireToDayChooser
        toDate = dateOfHireToDayChooser.getDate();

        filterByDateRange();

    }//GEN-LAST:event_dateOfHireToDayChooserPropertyChange

    private void openAddEmployeeGUI(String empId) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddEmployee(this, empId).setVisible(true);
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageEmployee().setVisible(true);
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
    private javax.swing.JPanel addingPanel;
    private javax.swing.JPanel bodyPanel;
    private com.toedter.calendar.JDateChooser dateOfHireFromDayChooser;
    private com.toedter.calendar.JDateChooser dateOfHireToDayChooser;
    private com.k33ptoo.components.KButton deleteButton;
    private javax.swing.JComboBox<String> employeeTypeComboBox;
    private javax.swing.JPanel headerPanel;
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

    private void reset() {

        // Reset all components to default values
        EmployeeSearchField.setText("");
        EmployeeStatusComboBox.setSelectedIndex(0);

        DepartmentComboBox.setSelectedIndex(0);
        statusComboBox.setSelectedIndex(0);
        employeeTypeComboBox.setSelectedIndex(0);
        positionComboBox.setSelectedIndex(0);
        dateOfHireFromDayChooser.setDate(null);
        dateOfHireToDayChooser.setDate(null);

        // Re-add the placeholders to refreshed TextFields
        addPlaceholder();

        // Re-Load EmployeeData
        loadEmployeeData();

        // grabs EmployeeSearchField focus
        EmployeeSearchField.grabFocus();

    }
}
