public class ZeroAtEnd {
    public static void main(String[] args) {
        int[] arr={2,0,1,0,3,0,0,5,6};
        int n=arr.length;
        int count=0;

        for (int i=0; i<n; i++){
            if (arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while (count<n){
            arr[count]=0;
            count++;
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
