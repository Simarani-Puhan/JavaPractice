public class StringEvenLength {
    public static void main(String[] args) {
        String str="This is a sima";
       String[]  s=str.split(" ");
       String newStr="";

       for (int i=0; i<s.length; i++){
           newStr = newStr+s[i];
           if(newStr.length()%2==0){
               System.out.println(newStr);
           }
           newStr="";
       }

    }
}
