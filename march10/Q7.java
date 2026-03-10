package march10;

import java.util.LinkedHashSet;

public class Q7 {
    public static void main(String[] args) {
        String str="CsharpstarZ";
        LinkedHashSet<Character>hs=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));
        }
        for(char count:hs){
            System.out.print(count);
        }
    }
}
