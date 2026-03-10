package march10;

import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        String str="11101111011111";
        HashMap<Integer,Character> mp=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        char c='A';
        for(int i=1;i<=26;i++){
            mp.put(i,c++);
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
            if(str.charAt(i)=='0'){
                sb.append(mp.get(count));
                count=0;
            }
        }
        if(str.charAt(str.length()-1)=='1'){
            sb.append(mp.get(count));
        }
        System.out.println(sb);
    }
}
