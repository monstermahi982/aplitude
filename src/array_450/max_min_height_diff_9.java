package array_450;

import java.util.Arrays;

public class max_min_height_diff_9 {
    public static void main(String[] args) {
        int array [] = {1, 10, 14, 14, 14, 15};
        int k = 6;
//        int ans = getMInDif(array,array.length,k);
        int ans = another_approach(array,k);
        System.out.println(ans);
    }

    private static int another_approach(int[] array, int k) {
        for(int i=0;i<array.length;i++){
            if(array[i] <= k)
                array[i] = array[i] + k;
            else
                array[i] = array[i] - k;
        }
        int small = array[0];
        int big = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] < small)
                small = array[i];
            if(array[i] > big)
                big = array[i];
        }
        int ans = big - small;
        return ans;
    }

    private static int getMInDif(int[] array, int size, int k) {
        if(size==1)
            return 0;
        Arrays.sort(array);
        int ans = array[array.length-1] - array[0];

        int small = array[0] + k;
        int big = array[size-1] - k;

        if(small > big){
            int temp = small;
            small = big;
             big = temp;
        }

        for(int i = 1; i < size-1;i++){
            int sub = array[i] -k;
            int add = array[i] +k;

            if(sub >= small || add <= big){
                continue;
            }
            if(big-sub <= add -small)
                small = sub;
            else
                big = add;
        }
        return  Math.min(ans, big-small);
    }
}
