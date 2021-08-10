package interview_question;

public class practice10 {
    public static void main(String[] args) {
        int N = 10;
//        int array [] = new int[N];
//        printFibo(N ,array);
//        for (int i:array) {
//            System.out.print(i + " ");
//        }
//        printfibona(N);
        for(int i=0;i<N;i++){
            System.out.print(fiborec(i) + " ");
        }

    }

    private static int fiborec(int n) {
        if(n<=1){
            return n;
        }
        return fiborec(n-1) + fiborec(n-2);
    }

    private static void printfibona(int n) {
        int num1 = 0 , num2 = 1;
        int count = 0;
        while (count < n){
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count++;
        }
    }

    private static void printFibo(int n, int[] array) {
        for(int i=0;i<array.length;i++){
            if(i==0){
                array[i] = 0;
            }else if(i==1){
                array[i] = 1;
            }else {
                array[i] = array[i-1] + array[i-2];
            }
        }
    }
}
