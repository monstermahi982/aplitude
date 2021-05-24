package stack_queue_450;

class Stack{
    int size;
    int top;
    char [] array;

    Stack(int n){
        top = -1;
        array = new char[n];
        size = n;
    }

    boolean isEmpty(){
        return (top < 0);
    }

    boolean push(char x){
        if(top >= size){
            System.out.println("stack overflow ");
            return false;
        }else {
            array[++top] = x;
            return true;
        }
    }

    char pop(){
        if(top < 0){
            System.out.println("stack underflow");
            return 0;
        }else{
            char x = array[top--];
            return x;
        }
    }
}



public class reverse_string_7 {
    public static void main(String[] args) {
//        String name = "mahesh";
//        reverse(name , name.length());

        StringBuffer name = new StringBuffer("mahesh");
        System.out.println(name);
        reversUsingStack(name);
        System.out.println(name);

    }

    private static void reversUsingStack(StringBuffer name) {
        Stack obj = new Stack(name.length());

        for(int i=0;i<name.length();i++)
            obj.push(name.charAt(i));

        for (int i=0;i<name.length();i++){
            char ch = obj.pop();
            name.setCharAt(i , ch);
        }
    }

    private static void reverse(String name, int n) {
        char array [] = new char[n];
        int top = 0;
        for(int i=0;i<n;i++){
            array[i] = name.charAt(i);
            top++;
        }

        for(int i = n -1 ; i>= 0;i--)
            System.out.print(array[i]);
    }
}
