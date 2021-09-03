package dynamic_proramming;

public class fibonacci_number {
    public static void main(String[] args) {
        int N = 9;
//        using brute force method  same for dp
//        int ans = itersively(N);
//        System.out.println(ans);

//        using recursion method
//        int ans = recursion(N);
//        System.out.println(ans);

//        using dynamic programming
//        int ans = dynamic(N);
//        System.out.println(ans);

//        using another approach
        int ans = another(N);
        System.out.println(ans);
    }

    private static int another(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        if(n == 0)
            return n;
        for(int i=2;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    private static int dynamic(int n) {
        int array [] = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for(int i=2;i<array.length;i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }

    private static int recursion(int n) {
        if(n <= 1)
            return n;
        return recursion(n-1) + recursion(n-2);
    }

    private static int itersively(int n) {
        int array [] = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for(int i=2;i<array.length;i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }
}
