import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        //Arrays.sort(arr);

        //Sorting an array
        int temp;
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        //Print the sorting array
        /*for (int i=0; i<arr.length;  i++){
            System.out.print(arr[i]);
        }*/

        //Print zero at end
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
        //System.out.println(arr[0]+arr[arr.length-1]); //Adding two numbers

       /* for (int i=0; i<arr.length-1; i++){
            System.out.println(arr[arr.length-2]); //second largest
            System.out.println(arr[1]);       //second smallest
            break;
        }*/
    }
}
