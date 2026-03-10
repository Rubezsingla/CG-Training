package march10;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        int n=7;

        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }
}
