package leetcode;

import java.util.Arrays;

public class two_sorted_arrays {
    public static void main(String[] args) {
        int array1 [] = {1,2,4};
        int array2 [] = {1,3,4};
        mergerTwoArrays(array1,array2);
    }

    private static void mergerTwoArrays(int[] array1, int[] array2) {
        int array3 [] = new int[array1.length+array2.length];
        int x = 0;
        while (x < array3.length){
            for (int i=0;i<array1.length;i++){
                array3[x++] = array1[i];
            }
            for (int i=0;i<array2.length;i++){
                array3[x++] = array2[i];
            }
        }

        Arrays.sort(array3);

        for (int i:array3) {
            System.out.print(i + " ");
        }
    }
}
