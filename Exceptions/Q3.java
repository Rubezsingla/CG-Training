package Exceptions;
import java.util.*;
// Custom Exception (User-defined Exception)
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("Access granted!");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

