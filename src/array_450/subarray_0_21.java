package array_450;



//not completed

import java.util.HashSet;
import java.util.Set;

public class subarray_0_21 {
    public static void main(String[] args) {
        int array [] = {4, 2, -3, 1, 6};
        boolean ans = subarry_0(array);
        System.out.println(ans);
    }

    private static boolean subarry_0(int[] array) {
        Set<Integer> hashset = new HashSet<>();
        int sum =0;
        for(int i=0;i<array.length;i++){
            sum += array[i];

        }
        return false;
    }
}
