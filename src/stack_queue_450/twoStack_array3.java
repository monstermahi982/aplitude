package stack_queue_450;


import java.awt.*;

class twoStack{
    int [] array;
    int size;
    int top1 , top2;

    twoStack(int n){
        size = n;
        array = new int[n];
        top1 = n / 2 + 1;
        top2 = n / 2;
    }

    void push1(int x){
        if(top1 > 0){
            top1--;
            array[top1] = x;
        }else{
            System.out.println("Stack overflow by element " + x);
        }
    }

    void push2(int x){
        if(top2 < size - 1){
            top2++;
            array[top2] = x;
        }else{
            System.out.println("Stack overflow by element " + x);
        }
    }

    int pop1(){
        if(top1 <= size / 2){
            int x =  array[top1];
            top1++;
            return x;
        }else{
            System.out.println("stack underflow");
            System.exit(1);
        }
        return 1;
    }

    int pop2(){
        if(top2 >= size / 2 + 1){
            int x =  array[top2];
            top2--;
            return x;
        }else{
            System.out.println("stack underflow");
            System.exit(1);
        }
        return 1;
    }

}

class anotherTwoStack{
    int size;
    int top1, top2;
    int arr[];

    // Constructor
    anotherTwoStack(int n)
    {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    void push1(int x){
        if(top1 < top2 -1 ){
            top1++;
            arr[top1] = x;
        }else {
            System.out.println("stack overflow");
            System.exit(1);
        }
    }

    void push2(int x){
        if(top1 < top2 -1){
            top2--;
            arr[top2] = x;
        }else {
            System.out.println("stack overflow");
            System.exit(1);
        }
    }

    int pop1(){
       if(top1 >= 0){
           int x = arr[top1];
           top1--;
           return x;
       }else {
           System.out.println("stack underflow");
           System.exit(1);
       }
       return -1;
    }

    int pop2(){
        if(top2 < size){
            int x = arr[top2];
            top2++;
            return x;
        }else {
            System.out.println("stack underflow");
            System.exit(1);
        }
        return -1;
    }
}

public class twoStack_array3 {
    public static void main(String[] args) {
//        twoStack stack = new twoStack(5);
//        stack.push1(5);
//        stack.push2(10);
//        stack.push2(15);
//        stack.push1(11);
//        stack.push2(7);
//
//        System.out.print("Popped element from stack1 is "
//                + " : " +  stack.pop1() +"\n");
//        stack.push2(40);
//        System.out.print("Popped element from stack2 is "
//                + ": " +  stack.pop2()
//                +"\n");

        anotherTwoStack stack = new anotherTwoStack(5);
        stack.push1(5);
        stack.push2(10);
        stack.push2(15);
        stack.push1(11);
        stack.push2(7);

        System.out.print("Popped element from stack1 is "
                + " : " +  stack.pop1() +"\n");
        stack.push2(40);
        System.out.print("Popped element from stack2 is "
                + ": " +  stack.pop2()
                +"\n");
    }
}
