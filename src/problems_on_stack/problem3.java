package problems_on_stack;

//impelementation of stack using array

class Stack{
    static  final int MAX = 100;
    int top;
    int array [] = new int[MAX];

//    empty stack
    boolean isEmpty(){
     return (top < 0);
    }

    void push(int x){
        if(top >= (MAX -1)){
            System.out.println("stack overflows");
            return;
        }else {
            array[++top] = x;
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("stack underflows");
            return 0;
        }else {
            int x = array[top--];
            return x;
        }
    }

    int peek(){
        if(top < 0){
            System.out.println("stack underflows");
            return 0;
        }else {
            int x = array[top];
            return x;
        }
    }

}

public class problem3 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
