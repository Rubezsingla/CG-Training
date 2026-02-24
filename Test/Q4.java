package Test;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int diff=0;
        int max=0;
        for(int i=0;i<n;i++){
             diff=0;
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]>diff){
                    diff=arr[j]-arr[i];
                    max=Math.max(max,diff);
                }
            }

        }
        System.out.println(max);
    }
}
