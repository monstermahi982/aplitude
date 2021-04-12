package problems_on_stack;

//reverse the array using stack
import java.util.Stack;

public class problem2 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7};

//        for (int i: array) {
//            System.out.print(i +  " ");
//        }

        Stack<Integer> st = new Stack<>();

        for (int i=0 ; i<array.length;i++){
            st.push(array[i]);
        }
//        System.out.println(st.peek());
//        reverse the array
        int n = st.size();
        for (int i=0;i<n;i++){
            System.out.print(st.pop() + " ");
        }
    }
}
