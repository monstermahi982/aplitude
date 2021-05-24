package stack_queue_450;

public class nextLargerElemnet_7 {
    public static void main(String[] args) {
        int array [] =  {11, 13, 21, 3};
//        printLarger(array);
        usingStack(array);
    }

    static class stack{
        int top;
        int item [] = new int[100];
        void push(int x){
            if(top == 99){
                System.out.println("stack overflow");
            }else {
                item[++top] = x;
            }
        }

        int pop(){
            if(top == -1){
                System.out.println("stack underflow");
                return -1;
            }else{
                int element = item[top];
                top--;
                return element;
            }
        }

        boolean isEmpty(){
            return (top == -1) ? true : false;
        }
    }

    private static void usingStack(int[] array) {
        int i=0;
        stack s = new stack();
        s.top = -1;
        int element , next;
        s.push(array[0]);

        for(i=1;i<array.length;i++){
            next = array[i];
            if(s.isEmpty() == false){
                element = s.pop();
                while (element < next){
                    System.out.println(element + " ------ " + next);
                    if(s.isEmpty() == true){
                        break;
                    }
                    element = s.pop();
                }
                if(element > next)
                    s.push(element);
            }
            s.push(next);
        }
        while (s.isEmpty() == false){
            element = s.pop();
            next = -1;
            System.out.println(element + " --------- " + next);
        }
    }

    private static void printLarger(int[] array) {
        int next;
        for(int i=0;i<array.length;i++){
            next = -1;
            for(int j=i+1;j<array.length;j++){
                if(array[i] < array[j]){
                    next  = array[j];
                    break;
                }
            }
            System.out.println(array[i] + " ----- "+ next);
        }
    }
}
