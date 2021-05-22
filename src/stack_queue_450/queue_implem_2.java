package stack_queue_450;

class Queue{
    int front , rear , size;
    int capacity;
    int array[];

    public  Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(Queue queue){
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }

    void enqeue(int item){
        if(isFull(this))
            return;
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqeued to queue");
    }

    int deqeue(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    int front(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    int rear(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear];
    }
}

public class queue_implem_2 {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);
        queue.enqeue(10);
        queue.enqeue(20);
        queue.enqeue(30);
        queue.enqeue(40);

        System.out.println(queue.deqeue() + " deqeue form queue");
        System.out.println("front item is " + queue.front());
        System.out.println("rear item is  " + queue.rear());
    }
}
