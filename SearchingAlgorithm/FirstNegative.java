package SearchingAlgorithm;

import java.util.*;

public class FirstNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int b=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
               b=i;
            }
        }
        if(b==0){
            System.out.println(-1);
        }
        else{
            System.out.println(b);
        }

    }
}
