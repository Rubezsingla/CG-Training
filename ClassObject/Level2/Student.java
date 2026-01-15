package ClassObject.Level2;

class Student {
    String name;
    int rollNumber;
    int marks;

    char calculateGrade() {
        if (marks >= 80) return 'A';
        else if (marks >= 60) return 'B';
        else if (marks >= 40) return 'C';
        else return 'F';
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aman";
        s.rollNumber = 12;
        s.marks = 75;

        s.displayDetails();
    }
}
