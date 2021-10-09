package leetcode;

import java.util.Stack;

public class reverse_string {
    public static void main(String[] args) {
        char array[] = {'h','e','l','l','o'};
//        reverseString(array);
        usingStach(array);
        for (char i:array) {
            System.out.print(i + " ");
        }

    }

    private static void usingStach(char[] array) {
        Stack st = new Stack();
        for (int i=0;i<array.length;i++){
            st.push(array[i]);
        }
        for (int i=0;i<array.length;i++){
            array[i] = (char) st.pop();
        }
    }

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }

    }
}
