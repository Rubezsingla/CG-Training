// Program to calculate bonus based on years of service
package level2;
import java.util.Scanner;

class Q2{

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();


        double bonus = 0.0;


        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Print bonus amount
        System.out.println("Bonus Amount: " + bonus);



    }
}
