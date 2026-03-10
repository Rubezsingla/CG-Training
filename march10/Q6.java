package march10;

public class Q6 {
    static boolean isPalindrome(String str1){
        int l= 0;
        int r= str1.length()-1;
        while(l<r){
            if(str1.charAt(l)!= str1.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="this is level 71";
        String[] words=str.split(" ");
        int count=0;

        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
