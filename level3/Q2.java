package level3;
import java.util.Scanner;

class Q2{

    public static void main(String[] args) {


        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Input values
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        // Perform operation
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                System.out.println("Result: " + (first / second));
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}
