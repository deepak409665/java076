package UNIT3;
import java.util.Iterator;
import java.util.LinkedList;


public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("fourth");
        Iterator itr = ll.descendingIterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        ll.remove("third");
        ll.remove("zero");
        ll.remove("fifth");
        System.out.println(ll);

    }
}
