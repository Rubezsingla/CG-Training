// Program to print odd and even numbers from 1 to a given number
package level2;
import java.util.Scanner;

class Q1{

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int number = input.nextInt();

        if (number > 0) {


            for (int i = 1; i <= number; i++) {

                // Check odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }

        } else {
            System.out.println("Please enter a natural number");
        }


    }
}
