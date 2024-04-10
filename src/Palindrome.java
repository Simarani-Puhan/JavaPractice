public class Palindrome {
    public static void main(String[] args) {
        String str="kamaks";

        String nstr="";

        for (int i=0; i<str.length(); i++){
            nstr=str.charAt(i)+nstr;
        }
        System.out.println(nstr);
       if (str.equals(nstr)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}
