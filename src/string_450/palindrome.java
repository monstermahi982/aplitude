package string_450;

public class palindrome {
    public static void main(String[] args) {
        String a = "maham";
        if(isPalindrome(a)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

//    check the 0th position and n-1 th position is equal or not
    private static boolean isPalindrome(String a) {
        int i=0 , j = a.length() - 1;
        while(i<j){
            if(a.charAt(i) != a.charAt(j))
                return false;
                i++;
                j--;
        }
        return true;
    }
}
