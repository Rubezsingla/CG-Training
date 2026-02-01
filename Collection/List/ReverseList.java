package Collection.List;

import java.util.*;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        int left=0;
        int right=arr.size()-1;

        while(left<right){
            int temp=arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
        }

        System.out.println(arr);

        LinkedList<Integer> list = new LinkedList<>();


        int n1 = sc.nextInt();

        // Input
        for (int i = 0; i < n1; i++) {
            list.add(sc.nextInt());
        }

        // Reverse logic
        int left1 = 0;
        int right1 = list.size() - 1;

        while (left1 < right1) {
            int temp = list.get(left1);
            list.set(left1, list.get(right1));
            list.set(right1, temp);

            left1++;
            right1--;
        }

        System.out.println("Reversed LinkedList: " + list);
    }
}
