package march10;

import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {

        String str="ABCCCC";
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
            else{
                hm.put(str.charAt(i),1);
            }
        }

        int max=0;

        for(char ch:hm.keySet()){
            if(hm.get(ch)>max){
                max=hm.get(ch);
            }
        }

        int count=0;

        for(char ch:hm.keySet()){
            if(hm.get(ch)==max){
                count++;
            }
        }

        if(count>1){
            System.out.println(0);
        }else{
            System.out.println(max);
        }
    }
}