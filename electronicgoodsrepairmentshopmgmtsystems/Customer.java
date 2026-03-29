package electronicgoodsrepairmentshopmgmtsystems;

import java.util.List;
import java.util.ArrayList;

public class Customer {

    private int custId;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String address;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void add_customer(List<Customer> list, int id, String name, String surname, String phone, String email, String address) {
        Customer c = new Customer();
        c.setCustId(id);
        c.setName(name);
        c.setSurname(surname);
        c.setPhone(phone);
        c.setEmail(email);
        c.setAddress(address);
        list.add(c);
    }

    public static void list_all_customers(List<Customer> list) {
        for (Customer c : list) {
            System.out.println(c.getCustId() + ", " + c.getName() + ", " + c.getSurname() + ", " + c.getPhone() + ", " + c.getAddress());
        }
    }

    public static void delete_customer(List<Customer> list, int id) {
        list.removeIf(c -> c.getCustId() == id);
        System.out.println("Have been succesfuly deleted.");
    }

    public static void edit_customer(List<Customer> list, int id, String name, String surname, String phone, String email, String address) {
        for (Customer c : list) {
            if (c.getCustId() == id) {
                c.setName(name);
                c.setSurname(surname);
                c.setPhone(phone);
                c.setEmail(email);
                c.setAddress(address);
            }
        }
    }

    public static void backup_customers(List<Customer> list) {
        System.out.println("Customers have been backed up.");
    }

    public static void restore_customers(List<Customer> list) {
        System.out.println("Customers have been restored.");
    }
}