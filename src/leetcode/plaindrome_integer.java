package leetcode;

public class plaindrome_integer {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
            int temp = x;
            int reverse = 0;
            while(x != 0){
                reverse = reverse * 10 + x % 10;
                x = x / 10;
            }
        System.out.println(temp);
        System.out.println(reverse);
            if(temp == reverse){
                return true;
            }else{
                return false;
            }


//            another approach
//        if (x < 0)
//            return false;
//
//        // initialize how many zeros
//        int div = 1;
//        while (x / div >= 10) {
//            div *= 10;
//        }
//
//        while (x != 0) {
//            int left = x / div;
//            int right = x % 10;
//
//            if (left != right)
//                return false;
//
//            x = (x % div) / 10;
//            div /= 100;
//        }
//
//        return true;
    }
}
