package interview_question;

class stackLink{
    class Node{
        int data;
        Node next;
    }
    Node top;

    boolean isEmpty(){
        return top == null ? true : false;
    }

    stackLink(){
        this.top = null;
    }

    public void push(int data){
        Node temp = new Node();
        if(temp == null){
            System.out.println("overflow");
            return;
        }
        temp.data = data;
        temp.next = top;
        top = temp;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }else {
            return top.data;
        }
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }else {
            int x = top.data;
            top = top.next;
            return x;
        }
    }
}

public class practice4 {
    public static void main(String[] args) {
        stackLink stl = new stackLink();
        stl.push(1);
        stl.push(2);
        stl.push(3);
        stl.pop();
        System.out.println(stl.pop());
        System.out.println(stl.peek());
    }
}
