package problems_on_recursion;

public class print_N_orders {
    public static void main(String[] args) {

        int N = 8;
        traverse(N);
    }

    private static void traverse(int n) {
        if(n==0){
            return;
        }
        traverse(n-1);
        System.out.println(n);

    }
}
