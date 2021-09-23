package LinkList_450;

public class doubly_linklist {

    static Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = prev = null;
        }
    }

    private static doubly_linklist insert(doubly_linklist dl , int data){
        Node new_node = new Node(data);
        Node temp = dl.head;
        if(temp == null){
            temp = new_node;
        }else {
            while (temp.next != null){
                temp = temp.next;
            }

        }
        return dl;
    }

    public static void main(String[] args) {

        doubly_linklist dl = new doubly_linklist();
        dl.insert(dl, 2);
    }
}
