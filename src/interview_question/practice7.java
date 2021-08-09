package interview_question;

public class practice7 {
    public static void main(String[] args) {
        int N = 53;
        int sum = 0;
        while (N != 0){
            sum += N % 10;
            N = N /10;
        }
        System.out.println(sum);
    }
}
