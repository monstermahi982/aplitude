package array_450;

public class jump_reach_end_9 {
    public static void main(String[] args) {
        int array[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        int ans = noJumps(array , 0 , array.length-1);
        System.out.println(ans);
    }

    private static int noJumps(int[] array, int l, int h) {
        if (h == l)
            return 0;

        if (array[l] == 0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h
                && i <= l + array[l];
             i++) {
            int jumps = noJumps(array, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }
    }
