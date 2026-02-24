package Test;
import java.util.*;

public class s4 {
    public static void main(String[] args) {

        String str = "aaabbbbccdddddd";
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(!hm.containsKey(ch)) {
                hm.put(ch, 1);
            }
            else {
                hm.put(ch, hm.get(ch) + 1);
            }
        }

        for(char key : hm.keySet()) {
            System.out.print(key);
            System.out.print(hm.get(key));
        }
    }
}