package leetcode;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String value = "()[]{}()()()()()()()";
        System.out.println(isValid(value));
    }

    static boolean isValid(String s){
//        simple approach
//        int square = 0, curly = 0, round = 0;
//        for(int i=0;i<s.length();i++){
//            switch (s.charAt(i)){
//                case '{' : curly++; break;
//                case '}' : curly--; break;
//                case '(' : round++; break;
//                case ')' : round--; break;
//                case '[' : square++; break;
//                case ']' : square--; break;
//                default:return false;
//            }
//        }
//        if(square ==0 &&  curly ==0 && round == 0){
//            return true;
//        }
//        return false;


        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char top = st.empty() ? '#' : st.peek();

            if(top == '(' && s.charAt(i) == ')'){
                st.pop();
            }else if(top == '{' && s.charAt(i) == '}'){
                st.pop();
            }else if(top == '[' && s.charAt(i) == ']'){
                st.pop();
            }else {
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty();
    }
}
