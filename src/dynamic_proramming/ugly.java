package dynamic_proramming;

public class ugly {
    public static void main(String[] args) {
        int num = 150;
//        using brute force method
        int ans = find_ugly(num);
        System.out.println(ans);
//        using dynamic programming
//        int ans = fing_nth_ugly(num);
//        System.out.println(ans);


    }

    private static int find_ugly(int num) {
        int i=1;
        int count = 1;
        while (num > count){
            i++;
            if(isugly(i) == 1){
                count++;
            }
        }
        return i;
    }

    private static int isugly(int i) {
        i = maxDivide(i , 2);
        i = maxDivide(i , 3);
        i = maxDivide(i , 5);
        return (i == 1) ? 1 : 0;
    }

    private static int maxDivide(int a, int b) {
        while (a % b == 0){
            a = a / b;
        }
        return a;
    }



    private static int fing_nth_ugly(int num) {
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        int array[] = new int[num];
        array[0] = 1;
        int number = 0;
        for (int i=1;i<array.length;i++){
            int f2 = 2 * array[p2];
            int f3 = 3 * array[p3];
            int f5 = 5 * array[p5];
            number = Math.min(f2, Math.min(f3,f5));
            array[i] = number;
            if(number == f2){
                p2++;
            }
            if(number == f3){
                p3++;
            }
            if(number == f5){
                p5++;
            }
        }
        return number;
    }
}
