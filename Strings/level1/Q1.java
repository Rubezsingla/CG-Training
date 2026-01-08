package Strings.level1;
import java.util.*;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str1 = sc.next();
        boolean flag=true;
        if(str.length()!=str1.length()){
            flag=false;
        }
        else {
            for (int i = 0; i < str1.length(); i++) {
                if (str.charAt(i) != str1.charAt(i)) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.print(str.equals(str1));

    }
}
