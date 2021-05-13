package array_450;

public class kadane_13 {
    public static void main(String[] args) {
        int array [] = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int ans = max_subarray(array);
        int ans = another_max_subarray(array);
        System.out.println(ans);
    }

    private static int another_max_subarray(int[] array) {
        int max = 0;
        int curr = 0;
        for(int i=1;i<array.length;i++){
            curr = Math.max(array[i] , curr + array[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    private static int max_subarray(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = 0;
        for(int i=0;i<array.length;i++){
            min = min + array[i];
            if(max < min){
                max = min;
            }
            if(min < 0 )
                min = 0;
        }
        return max;
    }
}
