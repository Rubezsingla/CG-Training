package ObjectOrientedDesignProblem.ObjectDesign;

import java.util.ArrayList;

// Employee class
class Employee {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void showEmployee() {
        System.out.println("   Employee ID: " + empId + ", Name: " + name);
    }
}

// Department class (contains Employees)
class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, int id) {
        employees.add(new Employee(name, id));
    }

    public void showDepartment() {
        System.out.println(" Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

// Company class (contains Departments)
class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

// Main class
public class CompanyAndDepartments {
    public static void main(String[] args) {

        // Creating Company
        Company company = new Company("Tech Solutions Pvt Ltd");

        // Creating Departments
        Department dev = new Department("Development");
        Department hr = new Department("Human Resources");

        // Adding Employees
        dev.addEmployee("Amit", 101);
        dev.addEmployee("Neha", 102);

        hr.addEmployee("Rahul", 201);
        hr.addEmployee("Pooja", 202);

        // Adding Departments to Company
        company.addDepartment(dev);
        company.addDepartment(hr);

        // Display all details
        company.showCompanyDetails();

        // When company object is destroyed, all departments and employees are also destroyed
        company = null;

        System.out.println("\nCompany deleted. All departments and employees are also removed.");
    }
}
