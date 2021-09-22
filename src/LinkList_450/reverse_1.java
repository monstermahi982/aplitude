package LinkList_450;

import java.util.LinkedList;

class Linklist{
    static Link_List.Node head;

    static class Node {
        int data;
        Node next;


        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void print(Node node){
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}

public class reverse_1 {
    public static void main(String[] args) {
//        Linklist linklist = new Linklist();
//        linklist.head = new Linklist.Node(85);
//        linklist.head.next = new Linklist.Node(15);
//        linklist.head.next.next = new Linklist.Node(4);
//        linklist.head.next.next.next = new Linklist.Node(20);
//        linklist.print(Linklist.head);
//        System.out.println();
//        Linklist.head = linklist.reverse(Linklist.head);
//        System.out.println("reverse list is ");
//        linklist.print(Linklist.head);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
//        for (int i=list.size() -1;i>=0;i--){
//            System.out.print(list.get(i) + " ");
//        }

    }
}
