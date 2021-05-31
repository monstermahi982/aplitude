package problems_on_linklist;

class Linklist {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }


    //        insert method
    public static Linklist insert(Linklist list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }

    public static Linklist insertatbeg(Linklist list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node temp = list.head;
            list.head = new_node;
            new_node.next = temp;

        }
        return list;
    }

    public static Linklist insertatend(Linklist list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node temp = list.head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;

        }
        return list;
    }

    public static Linklist insertatpos(Linklist list, int data , int x) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node prevtemp = list.head;
            while (prevtemp.data != x ){
                prevtemp = prevtemp.next;
            }
            Node nexttemp = prevtemp.next;
            prevtemp.next = new_node;
            new_node.next = nexttemp;

        }
        return list;
    }
    //        print method
    public static void printList(Linklist list) {
        Node temp = list.head;
        System.out.println("list is ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}


public class problem3 {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list = Linklist.insert(list , 1);
        list = Linklist.insert(list , 3);
        list = Linklist.insert(list , 8);
        list = Linklist.insert(list , 2);
        list = Linklist.insertatbeg(list , 99);
        list = Linklist.insertatend(list , 69);
        list = Linklist.insertatpos(list , 33 , 3);
        list.printList(list);
    }
}
