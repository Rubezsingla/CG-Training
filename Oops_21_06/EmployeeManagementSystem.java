package Oops_21_06;

// EmployeeManagementSystem.java

abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation - Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Abstract Method
    public abstract double calculateSalary();

    // Concrete Method
    public void displayDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Salary        : " + calculateSalary());
    }
}

// Interface
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Full Time Employee
class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee implements Department {

    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hours) {
        super(id, name, hourlyRate);
        this.hoursWorked = hours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * hoursWorked;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Main Class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Polymorphism
        Employee emp1 = new FullTimeEmployee(101, "Rubez", 50000);
        Employee emp2 = new PartTimeEmployee(102, "singla", 500, 40);

        // Department assignment
        ((Department) emp1).assignDepartment("IT");
        ((Department) emp2).assignDepartment("Support");

        // Display Details
        System.out.println("---- Employee 1 ----");
        emp1.displayDetails();
        System.out.println("Department : " +
                ((Department) emp1).getDepartmentDetails());

        System.out.println("\n---- Employee 2 ----");
        emp2.displayDetails();
        System.out.println("Department : " +
                ((Department) emp2).getDepartmentDetails());
    }
}

