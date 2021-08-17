package company_question;

//reverse a number 892 = 298

public class question10 {
    public static void main(String[] args) {
        int a = 123;
        int reverse = reverseNumber(a);
        System.out.println(reverse);
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
