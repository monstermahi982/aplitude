package stack_queue_450;

class kStack{
    int  array[];
    int top [];
    int next [];

    int k,n;
    int free;

    kStack(int k1 , int n1){
        int n = n1;
        int k = k1;
        array = new int[n];
        top = new int[k];
        next = new int[n];

        for(int i=0;i< k ;i++){
            top[i] = -1;
        }
        free = 0;
        for(int i= 0;i<n;i++){
            next[i] = i+1;
        }
        next[n-1] = -1;
    }

    boolean isFull(){
        return (free == -1);
    }

    boolean isEmpty(int sn)
    {
        return (top[sn] == -1);
    }

    void push(int item , int sn){
        if(isFull()){
            System.out.println("stack overflow");
            return;
        }
        int i= free;
        free = next[i];
        next[i] = top[sn];
        top[sn] = i;
        array[i] = item;
    }

    int pop(int sn){
        if(isEmpty(sn)){
            System.out.println("stack underflow");
            return Integer.MAX_VALUE;
        }
        int i = top[sn];
        next[i] = free;
        return array[i];
    }
}

public class kstack_5 {
    public static void main(String[] args) {
        int k = 3 , n = 10;
        kStack ks = new kStack(k , n);
        ks.push(15, 2);
        ks.push(45, 2);

        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
}
