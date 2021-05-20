public class statck_queue_450 {
    static class MyStack{
        int maxSize;
        long [] stackArray;
        int top;

        public MyStack(int s){
            maxSize = s;
            stackArray = new long[maxSize];
            top = -1;
        }

        public void push(long j){
            stackArray[++top] = j;
        }
        public long pop(){
            return stackArray[top--];
        }
        public long peef(){
            return stackArray[top];
        }
        public boolean isEmpty(){
            return (top == -1);
        }
        public boolean isFull(){
            return (top == maxSize - 1);
        }

    }
    public static void main(String[] args) {
        MyStack st = new MyStack(10);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        System.out.println(st.peef());


    }
}
