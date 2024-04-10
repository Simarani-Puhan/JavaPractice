import java.util.Scanner;

public class RemoveSpecial {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String s=sc.next();*/
        String  s="#^$$^%^^rani%^$^";
        String str="";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122){
                str=str+s.charAt(i);

            }
        }
        System.out.println(str);
    }
}
