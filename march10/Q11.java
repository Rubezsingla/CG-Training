package march10;

public class Q11 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int b=(n+1)*(n+2)/2;
        System.out.println(b-sum);
        }
}
