public class ReverseString {
    public static void main(String[] args) {
        String str="sima";
        String nstr=" ";

         for (int i=0; i<str.length(); i++){
             nstr=str.charAt(i)+nstr;

         }
        System.out.println("Reverse String :"+nstr);
    }

}
