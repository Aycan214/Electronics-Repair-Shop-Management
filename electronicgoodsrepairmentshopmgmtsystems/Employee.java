package electronicgoodsrepairmentshopmgmtsystems;

import java.util.List;
import java.util.ArrayList;

public class Employee {

    private int empId;
    private String name;
    private String surname;
    private String role;
    private float salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void add_employee(List<Employee> list, int id, String name, String surname, String role, float salary) {
        Employee e = new Employee();
        e.setEmpId(id);
        e.setName(name);
        e.setSurname(surname);
        e.setRole(role);
        e.setSalary(salary);
        list.add(e);
    }

    public static void list_all_employees(List<Employee> list) {
        for (Employee e : list) {
            System.out.println(e.getEmpId() + ", " + e.getName() + ", " + e.getSurname() + ", " + e.getRole() + ", " + e.getSalary());
        }
    }

    public static void delete_employee(List<Employee> list, int id) {
        list.removeIf(e -> e.getEmpId() == id);
        System.out.println("Have been succesfuly deleted.");
    }

    public static void edit_employee(List<Employee> list, int id, String name, String surname, String role, float salary) {
        for (Employee e : list) {
            if (e.getEmpId() == id) {
                e.setName(name);
                e.setSurname(surname);
                e.setRole(role);
                e.setSalary(salary);
            }
        }
    }

    public static void backup_employees(List<Employee> list) {
        System.out.println("Employees have been backed up.");
    }

    public static void restore_employees(List<Employee> list) {
        System.out.println("Employees have been restored.");
    }
}