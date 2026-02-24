package Test;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n;i=i+2){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
