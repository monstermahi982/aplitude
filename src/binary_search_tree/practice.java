package binary_search_tree;

class LinkList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head;

    public void insert(int data){
        Node new_node = new Node(data);
        Node temp = head;
        if(temp == null){
            head = new_node;
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;

    }

    public void insertAtTop(int data){
        Node new_node = new Node(data);
        Node temp = head;
        if(temp == null){
            head = new_node;
        }
        head = new_node;
        new_node.next = temp;
    }

    public void insertAtBottom(int data){
        Node new_node = new Node(data);
        Node temp = head;
        if(temp == null){
            head = new_node;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public void insertAtKey(int data , int key){
        Node new_node = new Node(data);
        Node temp = head;
        if(temp == null){
            System.out.println("list is empty");
            return;
        }
        while (temp.data != key || temp.next != null){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("key not found");
            return;
        }
        System.out.println("key found");
//        temp.next = new_node;
    }

    public void reverse(){
        Node prevTemp = null;
        Node current = head;
        Node nextTemp = null;
        while (current != null){
            nextTemp = current.next;
            current.next = prevTemp;
            prevTemp = current;
            current = nextTemp;
        }
    }

    public  void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class practice {
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.printList();
//        ll.insertAtTop(9);
//        ll.insertAtBottom(9);
        ll.reverse();
        ll.printList();
//        ll.insertAtKey(7,7);
    }
}




























//    private static void selection_sort(int[] array) {
//        for(int i=0;i<array.length;i++){
//           int min=i;
//           for(int j=i;j<array.length;j++){
//               if(array[j] < array[min]){
//                   min = j;
//               }
//           }
//           int temp = array[i];
//           array[i] = array[min];
//           array[min] = temp;
//        }
//    }

//    private static void bubble_sort_1(int[] array) {
//        for(int i=0;i<array.length-1;i++){
//            for(int j=0;j<array.length-1;j++){
//                if(array[j+1] < array[j]){
//                    int temp = array[j+1];
//                    array[j+1] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//    }

//    private static void bubble_sort(int[] array) {
//        for(int i=0;i<array.length;i++){
//            for(int j=0;j<array.length;j++){
//                if(array[i] < array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//    }

