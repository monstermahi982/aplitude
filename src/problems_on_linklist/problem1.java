package problems_on_linklist;

import java.io.OutputStream;
import java.util.LinkedList;

public class problem1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.addFirst(11);
        ll.addLast(99);
        ll.remove(2);
        ll.removeFirst();
        ll.removeLast();
        int size = ll.size();
        for(int a : ll){
            System.out.println(a);
        }
    }
}

