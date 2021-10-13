package leetcode;

import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int array1 [] = {1,2,2,1};
        int array2 [] = {2,2};
        for (int i : intersection(array1,array2)){
            System.out.print(i + " ");
        }

    }

    static int[] intersection(int[] nums1, int[] nums2) {

        HashSet set1 = new HashSet();
        for (int i:nums1) {
            set1.add(i);
        }

        HashSet set2 = new HashSet();
        for (int i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int result[] = new int[set2.size()];
        int i=0;
        for (Object n:set2) {
            result[i++] = (int) n;
        }

        return result;
    }
}
