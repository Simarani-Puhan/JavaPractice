public class FindingCharacter {
    public static void main(String[] args) {
        String str="sima";
        char ch='i';

        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i)==ch){
                System.out.println("Character "+ch+" found at index  "+i);
            }
        }
    }
}
