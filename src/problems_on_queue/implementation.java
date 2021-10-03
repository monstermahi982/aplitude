package problems_on_queue;

class queue{
    private static int rear, front, capacity;
    private static int array[];

    queue(int c){
        capacity = c;
        front = rear = 0;
        array = new int[capacity];
    }

    void enqueue(int data){
        if(capacity == rear){
            System.out.println("queue is full");
            return;
        }else {
            array[rear] = data;
            rear++;
        }
        return;
    }

    int dequeue(){
        int value = -1;
        if(front == rear){
            System.out.println("queue is full");
            return value;
        }else {
            value = array[0];
            for(int i=0;i<rear;i++){
                array[i] = array[i+1];
            }
            if(rear < capacity){
                array[rear] = 0;
            }
            rear--;
        }
        return value;
    }

    void display(){
        if(front == rear){
            System.out.println("queue is empty");
            return;
        }
        for (int i=0;i<rear;i++){
            System.out.print(array[i] + " ");
        }
    }

    int front(){
        if(front == rear){
            System.out.println("queue is empty");
            return -1;
        }
        return array[front];
    }
}

public class implementation {
    public static void main(String[] args) {
        queue q = new queue(10);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.front());
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.dequeue());
        q.display();
    }
}
