package march10;

public class Q9 {
    public static void main(String[] args) {
        int arr[]={5,0,7,6};
        int arr1[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            else{
                arr1[j++]=arr[i];
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr1[i]);
        }

    }
}
