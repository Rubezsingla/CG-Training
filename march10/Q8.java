package march10;

import java.util.ArrayList;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {11,11,11,13,13,20};

        List<Integer> arr1 = new ArrayList<>();

        arr1.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                arr1.add(arr[i]);
            }
        }

        int[] arr2 = new int[arr1.size()];

        for(int i = 0; i < arr1.size(); i++){
            arr2[i] = arr1.get(i);
        }

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}