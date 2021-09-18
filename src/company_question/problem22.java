package company_question;

public class problem22 {
    public static void main(String[] args) {
        int num = 126;
        int ans  = find(num);
        System.out.println(ans);
    }

    private static int find(int num) {
        int value = num;
        int sum = 0;
        while (value != 0){
            sum += value % 10;
            value = value / 10;
        }

        int ans = num / sum;

        return num / sum;
    }
}
