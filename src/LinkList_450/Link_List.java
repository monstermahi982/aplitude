package LinkList_450;

public class Link_List {
    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }



    public static Link_List insert(Link_List ll , int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if(ll.head == null){
            ll.head = new_node;
        }else {
            Node temp = ll.head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }

        return ll;
    }

    public static void display(Link_List list){
        Node temp = list.head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Link_List list = new Link_List();
        list.insert(list,1);
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,3);
//        list.display(list);
//        list.insertFirst(list, 9);
//        list.insertLast(list,7);
//        list.insetPos(list, 8 , 4);
//        list.display(list);
//        list.removeDuplicate(list);
        head = list.reverse(head);
        list.display(list);

    }

    private Node reverse(Node node) {
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

    private Link_List removeDuplicate(Link_List list) {
        if(list.head == null || list.head == null){
            return list;
        }
        Node temp = list.head.next;
        Node prev = list.head;

        while (temp != null){
            if(temp.data == prev.data){
                prev.next = temp.next;
                temp = temp.next;
            }else {
                prev = temp;
                temp = temp.next;
            }
        }
        return  list;
    }

    private Link_List insetPos(Link_List list, int data,int pos) {
        return list;
    }

    private Link_List insertLast(Link_List list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        Node temp = list.head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
        return list;
    }

    private Link_List insertFirst(Link_List list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        new_node.next = list.head;
        list.head = new_node;
        return list;
    }
}
