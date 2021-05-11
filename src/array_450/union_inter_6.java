package array_450;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class union_inter_6 {
    public static void main(String[] args) {
        int array1 [] = {1,2,3};
        int array2 [] = {1,5,2};
//        using hash map collection
        union_array(array1,array1.length,array2,array2.length);
//        using new array
        another_approach(array1,array2);
        intersection_array(array1,array2);
        inother_approach(array1,array2);
    }

    private static void inother_approach(int[] array1, int[] array2) {
        int array3 [] = new int[100];
        for(int i=0; i<array1.length;i++){
            array3[array1[i]] = 1;
        }
        for(int i=0; i<array2.length;i++){
            if(array3[array2[i]] == 1){
                System.out.println(array2[i]);
            }
        }
    }

    private static void intersection_array(int[] array1, int[] array2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
         for(int i=0;i<array1.length;i++){
             hashSet1.add(array1[i]);
         }
        for(int i=0;i<array2.length;i++){
            if(hashSet1.contains(array2[i])){
                System.out.println(array2[i]);
            }
        }
    }

    private static void another_approach(int[] array1, int[] array2) {
        int array3 [] = new int[100];
        System.out.println(array3.length);
        for(int i=0 ; i<array1.length;i++){
            array3[array1[i]] = 1;
        }
        for(int i=0 ; i<array2.length;i++){
            array3[array2[i]] = 1;
        }
        for (int i=0;i<array3.length;i++) {
            if(array3[i] == 1){
                System.out.println(i);
            }
        }
    }

    private static void union_array(int[] array1, int length1, int[] array2, int length2) {
        Map<Integer , Integer> map = new HashMap();
        for(int i =0 ; i<length1 ;i++){
            map.put(array1[i] , i);
        }
        for(int i =0 ; i<length2 ;i++){
            map.put(array2[i] , i);
        }
        for(Map.Entry maEntry : map.entrySet()){
            System.out.println(maEntry.getKey());
        }

    }
}
