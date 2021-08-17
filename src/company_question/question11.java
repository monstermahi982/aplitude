package company_question;

//integer palindrome

public class question11 {
    public static void main(String[] args) {
        int a = 122;
        int reverse = reverseNumber(a);
        if(a == reverse){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
    private static int reverseNumber(int a) {
        int reverse = 0;
        while (a != 0){
            int remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a / 10;
        }
        return reverse;
    }
}
