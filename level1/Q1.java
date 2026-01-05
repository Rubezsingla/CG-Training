// Program to check if a number is divisible by 5
package level1;
import java.util.Scanner;

class Q1{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int number = input.nextInt();


        boolean isDivisibleByFive = (number % 5 == 0);


        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);

        input.close();
    }
}
