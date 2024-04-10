import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String > list=new LinkedList<>();

        list.add("rani");
        list.addFirst("sima");
        list.addLast("puhan");

       // System.out.println(list);

        Iterator<String> it= list.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.print(s+" ");
        }
    }
}
