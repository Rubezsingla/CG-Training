package Test;

import java.util.HashMap;

public class Q6 {
    public static void main(String[] args) {
        String str="abc";
        boolean flag=true;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }

        if(str.length()%2==0){
            for(int values:hm.values()){
                if(values%2!=0){
                    flag=false;

                    System.out.println("false");
                }
            }
        }
        else if(str.length()%2!=0){
            int count=0;
            for(int values:hm.values()){
                if(values%2!=0){
                    count++;
                }
            }
            if(count>1){
                flag=false;
                System.out.println("false");
            }
        }
        if(flag)
        System.out.println("true");

    }
}
