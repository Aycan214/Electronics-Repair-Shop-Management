package electronicgoodsrepairmentshopmgmtsystems;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ElectronicGoodsRepairmentShopMGMTSystems {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Customer> customers = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<RepairOrder> orders = new ArrayList<>();
        List<RepairItem> items = new ArrayList<>();
        List<Part> parts = new ArrayList<>();
        List<Usage> usages = new ArrayList<>();

        // Step 1: Add all data
        try {
            System.out.println("--- 1. ADD ALL DATA ---");
            test_Customer(customers);
            test_Employee(employees);
            test_RepairOrder(orders, sdf);
            test_RepairItem(items);
            test_Part(parts);
            test_Usage(usages, sdf);
            System.out.println("Successfully added " + customers.size() + " customers, " +employees.size() + " employees, " +items.size() + " items, " +orders.size() + " orders, " +parts.size() + " parts, and " +usages.size() + " usages.");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Step 2: List all
        System.out.println("\n--- 2. LIST ALL  ---");
        System.out.println("\nCustomers:"); Customer.list_all_customers(customers);
        System.out.println("\nEmployees:"); Employee.list_all_employees(employees);
        System.out.println("\nOrders:"); RepairOrder.list_all_orders(orders);
        System.out.println("\nItems:"); RepairItem.list_all_items(items);
        System.out.println("\nParts:"); Part.list_all_parts(parts);
        System.out.println("\nUsages:"); Usage.list_all_usages(usages);

        // Step 3: Edit the 1st and 2nd object
        System.out.println("\n--- 3. EDIT THE 2ND AND 1ST OBJECT (Customer,Employee) ---");
        Customer.edit_customer(customers, 1, "Aycan", "Örnekli (Edited)", "05329999999", "ahmet@mail.com", "Ankara/Turkey");
        Customer.edit_customer(customers, 2, "Kemal", "Çelik (Edited)", "05338888888", "zeynep@mail.com", "Istanbul/Turkey");
        
        Employee.edit_employee(employees, 1, "Ayşe", "Tekin", "Senior Tech", 5500f); 
        Employee.edit_employee(employees, 2, "Ali", "Can", "Technician", 4400f); 

        // Step 4: List all
        System.out.println("\n--- 4. AFTER EDIT (1st & 2nd Objects) LIST ALL ---");
        System.out.println("Customers:"); Customer.list_all_customers(customers);
        System.out.println("Employees:"); Employee.list_all_employees(employees);

        // Step 5: Backup
        System.out.println("\n--- 5. BACKUP PROCESS ---");
        Customer.backup_customers(customers);
        Employee.backup_employees(employees);
        RepairOrder.backup_orders(orders);
        RepairItem.backup_items(items);
        Part.backup_parts(parts);
        Usage.backup_usages(usages);

        // Step 6: Delete 3rd and 2nd object
         System.out.println("\n--- 6. DELETE 3RD AND 2ND OBJECT (ID:3, ID:2) ---");
        Customer.delete_customer(customers, 3);
        Customer.delete_customer(customers, 2);

        Employee.delete_employee(employees, 3);
        Employee.delete_employee(employees, 2);

        RepairOrder.delete_order(orders, 3);
        RepairOrder.delete_order(orders, 2);

        // Step 7: List all
        System.out.println("\n--- 7. AFTER DELETION (3rd & 2nd Objects) LIST ALL ---");
        System.out.println("Customers:"); Customer.list_all_customers(customers);
        System.out.println("Employees:"); Employee.list_all_employees(employees);
        System.out.println("Orders:"); RepairOrder.list_all_orders(orders);

        // Step 8: Edit the 2nd object
         System.out.println("\n--- 8. EDIT THE 2ND OBJECT (ID:2) ---");
        Customer.edit_customer(customers, 2, "Zeynep", "Kurtarmaya Calisilan", "0000000", "zeynep@newmail.com", "Istanbul");

        // Step 9: List all
        System.out.println("\n--- 9. LIST ALL---");
        Customer.list_all_customers(customers);

        // Step 10: Restore
        System.out.println("\n--- 10. RESTORE PROCESS ---");
        Customer.restore_customers(customers);
        Employee.restore_employees(employees);
        RepairOrder.restore_orders(orders);
        RepairItem.restore_items(items);
        Part.restore_parts(parts);
        Usage.restore_usages(usages);

        // Step 11: List all
        System.out.println("\n--- 11. FINAL LIST AFTER RESTORE ---");
        Customer.list_all_customers(customers);
    }

    public static void test_Customer(List<Customer> list) {
        Customer.add_customer(list, 1, "Ahmet", "Yılmaz", "05321234567", "ahmet@mail.com", "Ankara/Turkey");
        Customer.add_customer(list, 2, "Zeynep", "Demir", "05339876543", "zeynep@mail.com", "Istanbul/Turkey");
        Customer.add_customer(list, 3, "Mehmet", "Kaya", "05481110000", "mehmet@mail.com", "Istanbul/Turkey");
        Customer.add_customer(list, 4, "Filiz", "Eren", "05332223344", "filiz@mail.com", "Famagusta/Northern Cyprus");
        Customer.add_customer(list, 5, "Hasan", "Çelik", "05425556677", "hasan@mail.com", "Nicosia/Northern Cyprus");
    }

    public static void test_Employee(List<Employee> list) {
        Employee.add_employee(list, 1, "Ayşe", "Tekin", "Technician", 4500f);
        Employee.add_employee(list, 2, "Ali", "Can", "Technician", 4200f);
        Employee.add_employee(list, 3, "Burak", "Öz", "Manager", 8500f);
    }

    public static void test_RepairOrder(List<RepairOrder> list, SimpleDateFormat sdf) throws ParseException {
        RepairOrder.add_order(list, 1, 1, sdf.parse("01/12/2025"), "Pending", 0f);
        RepairOrder.add_order(list, 2, 2, sdf.parse("02/12/2025"), "In Progress", 0f);
        RepairOrder.add_order(list, 3, 3, sdf.parse("03/12/2025"), "Ready", 4500f);
        RepairOrder.add_order(list, 4, 4, sdf.parse("05/12/2025"), "Delivered", 1200f);
    }

    public static void test_RepairItem(List<RepairItem> list) {
        RepairItem.add_item(list, 1, 1, 1, "iPhone 11", "Mobile Phone", "Apple", "SN11001", "Screen Replacement");
        RepairItem.add_item(list, 2, 2, 2, "Dell XPS", "Laptop", "Dell", "SN22002", "Battery Not Charging");
        RepairItem.add_item(list, 3, 3, 1, "Samsung Smart TV", "TV", "Samsung", "SN33003", "Does Not Power On (Power Issue)");
        RepairItem.add_item(list, 4, 4, 2, "PS5 Controller", "Gaming Accessory", "Sony", "SN44004", "Stuck Button");
        RepairItem.add_item(list, 5, 5, 1, "iPad Pro", "Tablet", "Apple", "SN55005", "Back Glass Broken");
    }

    public static void test_Part(List<Part> list) {
        Part.add_part(list, 1, "iPhone 11 LCD Screen", 25, 150f);
        Part.add_part(list, 2, "Laptop Battery (Dell)", 10, 80f);
        Part.add_part(list, 3, "Power Supply Unit (TV)", 5, 200f);
        Part.add_part(list, 4, "Controller Button Set", 50, 50f);
        Part.add_part(list, 5, "iPad Pro Back Glass", 15, 750f);
    }

    public static void test_Usage(List<Usage> list, SimpleDateFormat sdf) throws ParseException {
        Usage.add_usage(list, 1, 3, 3, 1, sdf.parse("04/12/2025"));
        Usage.add_usage(list, 2, 4, 4, 1, sdf.parse("05/12/2025"));
        Usage.add_usage(list, 3, 2, 2, 1, sdf.parse("06/12/2025"));
        Usage.add_usage(list, 4, 1, 1, 1, sdf.parse("07/12/2025"));
    }
}