package bit_manipulation;

import java.util.Timer;

public class problem1 {
    public static void main(String[] args) {
        int a = 452532;
        int b = 65634564;
        long start = System.nanoTime();
//        a ^= b;
//        b ^= a;
//        a ^= b;
//        int temp = a;
//        a = b;
//        b = temp;
        a = a + b;
        b = a -b;
        a = a - b;
        long end = System.nanoTime() - start;
        System.out.println(end);
    }
}
