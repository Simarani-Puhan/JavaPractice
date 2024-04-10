public class LinearSearch {
    public static void main(String[] args) {
        int[]arr={2,5,3,7};
        int n=3;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==n){
                System.out.println("No "+n+" found at index "+i);
                break;
            }
        }
    }
}
