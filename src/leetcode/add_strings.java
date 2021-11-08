package leetcode;

public class add_strings {
    public static void main(String[] args) {
        String a = "456" , b = "77";
        String ans = addStrings(a,b);
        System.out.println(ans);
    }

    static String addStrings(String num1, String num2) {
        return String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
    }
}
