package Test;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int r = 0;

            for (int j = 0; j <= i; j++) {
                left = left + arr[j];
            }
            for (int k = i + 1; k < n; k++) {
                r = r + arr[k];
            }
            if (left == r) {
                System.out.println("yes");
            }
        }
    }
}
