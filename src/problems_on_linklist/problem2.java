package problems_on_linklist;

import java.util.LinkedList;

public class problem2 {
    public static void main(String[] args) {
//        LinkedList<Character> linkedList = new LinkedList<>();
//        linkedList.add('m');
//        linkedList.add('a');
//        linkedList.add('h');
//        linkedList.add('e');
//        linkedList.add('s');
//        linkedList.add('h');

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(2);
        for (int i=0; i<linkedList.size();i++){
            System.out.print(linkedList.get(i));
        }
    }
}
