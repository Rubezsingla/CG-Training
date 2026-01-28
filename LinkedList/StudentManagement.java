package LinkedList;

import java.util.Scanner;

class StudentNode {
    int roll;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentManagement {

    static StudentNode head = null;

    static void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode node = new StudentNode(roll, name, age, grade);
        node.next = head;
        head = node;
    }

    static void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode node = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = node;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    static void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    static void search(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    static void updateGrade(int roll, char grade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
    }

    static void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addAtEnd(101, "Rubez", 20, 'A');
        addAtEnd(102, "Rohit", 21, 'B');
        addAtBeginning(100, "Samarpit", 19, 'A');

        display();
        System.out.println();

        updateGrade(102, 'A');
        deleteByRoll(101);

        display();
    }
}
