package Test;

public class s5 {
    public static void main(String[] args) {
     String s="abcd";
     StringBuilder sb=new StringBuilder(s);
     for(int i=0;i<s.length();i++){
         if(i%2==0){
             sb.setCharAt(i,Character.toUpperCase(s.charAt(i)));
         }
         else{
             sb.setCharAt(i,Character.toLowerCase(s.charAt(i)));
         }
     }
     System.out.println(sb.toString());

    }
}
