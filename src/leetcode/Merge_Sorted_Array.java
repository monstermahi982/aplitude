package leetcode;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int [] array1 = {-1,0,0,3,3,3,0,0,0}, array2 = {1,2,2};
        merge_arrays(array1,array2);
        for (int i:array1) {
            System.out.print(i +  " ");
        }
    }

    private static void merge_arrays(int[] array1, int[] array2) {

        int size = 0;
            for (int i=0;i<array1.length;i++){
                if(size >= array2.length){
                    Arrays.sort(array1);
                    return;
                }
                if(array1[i] == 0){
                    array1[i] = array2[size];
                    size++;
                }
            }
        Arrays.sort(array1);

    }
}
