package ObjectOrientedDesignProblem.ObjectDesign;

import java.util.ArrayList;

// Course Class
class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display students of this course
    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

// Student Class
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Enroll student in course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Association
    }

    // View enrolled courses
    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}

// School Class (Aggregation)
class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

// Main Class
public class SchoolAndStudents {
    public static void main(String[] args) {

        // Create School
        School school = new School("Sita Grammar School");

        // Create Students
        Student s1 = new Student("Rubez");
        Student s2 = new Student("Rohit");

        // Create Courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Add students to school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Enroll students in courses (Association)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        // Display details
        school.showStudents();

        System.out.println();
        s1.viewCourses();
        s2.viewCourses();

        System.out.println();
        c1.showStudents();
        c2.showStudents();
    }
}
