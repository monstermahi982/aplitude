package interview_question;

import java.util.LinkedList;
import java.util.Queue;

class Stack{
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    int N;
    Stack(){
        N = 0;
    }
    void push(int data){
        N++;
        queue2.add(data);
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.remove();
        }
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
    }

    int pop(){
        if(queue1.isEmpty())
            return -1;
        int a = queue1.peek();
        queue1.remove();
        N--;
        return a;
    }

    int top(){
        if(queue1.isEmpty()){
            return -1;
        }
        return queue1.peek();
    }
    int size(){
        return N;
    }
}


public class practice13 {
    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        System.out.println(sc.size());
        System.out.println(sc.pop());
        System.out.println(sc.top());

    }
}
