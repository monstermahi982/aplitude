package interview_question;

class queue{
    final static int N = 10;
    int array [] = new int[N];
    int front , rear;

    queue(){
        front = rear = 0;
    }

    void push(int data){
        if(N == rear){
            System.out.println("queue is full");
            return;
        }else {
            array[rear++] = data;
        }
    }
    void pop(){
        if(front == rear){
            System.out.println("queue is empty");
        }else {
            for(int i=0;i<rear;i++){
                array[i] = array[i+1];
            }
            if(rear < N){
                array[rear] = 0;
            }
            rear--;
        }
    }
    void display(){
        if(front == rear){
            System.out.println("empty");
        }else {
            for(int i=0;i<rear;i++){
                System.out.println(array[i]);
            }
        }
    }
}

public class practice14 {
    public static void main(String[] args) {
        queue q = new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.pop();
        q.display();
    }
}
