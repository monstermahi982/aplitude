package array_450;

import java.util.Arrays;

public class median_equal_array_35 {
    public static void main(String[] args) {
        int array1 [] = {1, 12, 15, 26, 38};
        int array2 [] = {2, 13, 17, 30, 45};
//        if (array1.length == array2.length){
//            System.out.println("medain is " + getmedain(array1 , array2));
//        }else{
//            System.out.println("arrays are unqeual");
//        }
        if (array1.length == array2.length){
            System.out.println(using_unions(array1,array2));
        }else{
            System.out.println("unequal array");
        }
    }

    private static int using_unions(int[] array1, int[] array2) {
        int n = array1.length;
        int j=0 , i = n - 1;
        while (array1[i] > array2[j] && j < n && i > -1){
            int temp  = array1[i];
            array1[i] = array2[j];
            array2[j] = temp;
            i--;
            j++;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        return (array1[n-1] + array2[0]) / 2;
    }






    private static int getmedain(int[] array1, int[] array2) {
        int i=0,j=0;
        int count =0;
        int m1 = -1, m2 = -1;
        for(count = 0;count <= array1.length; count++){
            if(i==array1.length){
                m1 = m2;
                m2 = array2[0];
                break;
            }else if(j==array1.length){
                m1 = m2;
                m2 = array2[0];
                break;
            }

            if(array1[i] <= array2[j]){
                m1 = m2;
                m2 =array1[i];
                i++;
            }else {
                m1 = m2;
                m2 = array2[j];
                j++;
            }
        }
        return (m1 + m2) / 2;
    }
}
