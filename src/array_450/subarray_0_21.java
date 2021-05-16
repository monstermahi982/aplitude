package array_450;

import java.util.HashSet;
import java.util.Set;

public class subarray_0_21 {
    public static void main(String[] args) {
        int array [] = {-3, 2, 3, 1, 6};
//        if(subarry_0(array))
//            System.out.println("yes");
//        else
//            System.out.println("not");
        boolean ans = another_approach(array);
        System.out.println(ans);
    }

    private static boolean another_approach(int[] array) {
        int sum = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                sum = sum + array[j];
                if(sum == 0)
                    return true;
            }
            sum = 0;
        }
        return false;
    }

    private static boolean subarry_0(int[] array) {
        Set<Integer> hashset = new HashSet<>();
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];

            if(array[i] == 0 || sum == 0 || hashset.contains(sum))
                return true;
        }
        return false;
    }
}
