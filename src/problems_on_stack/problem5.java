package problems_on_stack;

import java.util.LinkedList;

class Stacks{
    LinkedList<Integer> ll = new LinkedList<>();
    void push(int data){
        ll.add(data);
        System.out.println(data +  " is inserted");
    }
    int pop(){
       return ll.removeLast();
    }
    int peek(){
        return ll.getLast();
    }

}

public class problem5 {
    public static void main(String[] args) {
        Stacks st = new Stacks();
        st.push(10);
        st.push(30);
        st.push(20);
        st.push(90);
        st.pop();
        System.out.println(st.peek());
    }
}
