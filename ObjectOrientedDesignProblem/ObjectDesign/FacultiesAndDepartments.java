package ObjectOrientedDesignProblem.ObjectDesign;

import java.util.ArrayList;

// Faculty Class (Aggregation)
class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void showFaculty() {
        System.out.println("   Faculty Name: " + name + ", Subject: " + subject);
    }
}

// Departments Class (Composition)
class Departments {
    private String deptName;
    private ArrayList<Faculty> faculties;

    public Departments(String deptName) {
        this.deptName = deptName;
        this.faculties = new ArrayList<>();
    }

    // Aggregation
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartment() {
        System.out.println(" Department: " + deptName);
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }
}

// University Class (Composition)
class University {
    private String universityName;
    private ArrayList<Departments> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Departments dept) {
        departments.add(dept);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);
        for (Departments d : departments) {
            d.showDepartment();
        }
    }
}

// Main Class
public class FacultiesAndDepartments {
    public static void main(String[] args) {

        // Faculty (Independent)
        Faculty f1 = new Faculty("engineer", "Computer Science");
        Faculty f2 = new Faculty("Dr. Mehta", "Mathematics");

        // University
        University uni = new University("National Tech University");

        // Departments
        Departments cs = new Departments("Computer Science");
        Departments maths = new Departments("Mathematics");

        // Add faculty to departments
        cs.addFaculty(f1);
        maths.addFaculty(f2);

        // Add departments to university
        uni.addDepartment(cs);
        uni.addDepartment(maths);

        // Display details
        uni.showUniversityDetails();

        // Delete university
        uni = null;

        System.out.println("\nUniversity deleted.");
        System.out.println("Departments are also deleted.");
        System.out.println("Faculty still exists independently:");

        f1.showFaculty();
        f2.showFaculty();
    }
}
