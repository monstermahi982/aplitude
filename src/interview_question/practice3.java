package interview_question;

class stack{
    static final int MAX = 1000;
    int top;
    int array [] = new int[MAX];

    boolean isEmpty(){
        return (top < 0);
    }
    stack(){
        top = -1;
    }
    boolean push(int data){
        if(top >= (MAX - 1)){
            System.out.println("stack overflow");
            return false;
        }else {
            array[++top] = data;
            return true;
        }
    }
    int pop(){
        if(isEmpty()){
            return 0;
        }else {
            int x = array[top--];
            return x;
        }
    }

    int peek(){
        if(isEmpty()){
            return 0;
        }else {
            return array[top];
        }
    }
}

public class practice3 {
    public static void main(String[] args) {
//        stack implementaion
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
