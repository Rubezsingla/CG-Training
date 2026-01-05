// Program to print multiplication table from 6 to 9
package level2;
import java.util.Scanner;

class Q3{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int number = input.nextInt();


        for (int i = 6; i <= 9; i++) {


            int product = number * i;


            System.out.println(number + " * " + i + " = " + product);
        }

    }
}
