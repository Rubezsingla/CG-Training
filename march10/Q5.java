package march10;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        String str="build";
        String str1="dubli";

        char[] arr=str.toCharArray();
        char[] arr1=str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        for(int i=0;i<str.length();i++){
            if(arr[i]!=arr1[i]){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
