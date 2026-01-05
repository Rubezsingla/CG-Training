// Program to create a simple calculator
package level3;
import java.util.Scanner;

class Q5{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        // Initialize count
        int count = 0;

        // Loop to count digits
        while (number != 0) {
            number = number / 10;
            count++;
        }

        // Print result
        System.out.println("Number of digits: " + count);

    }
}
