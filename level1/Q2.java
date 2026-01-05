// Program to check if the first number is the smallest
package level1;
import java.util.Scanner;

class Q2{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get three numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        boolean isFirstSmallest = (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? " + isFirstSmallest);

    }
}
