package array_450;

public class common_3array_19 {
    public static void main(String[] args) {
        int array1 [] = {1,2,3,4,5,6};
        int array2 [] = {5,6,7,8,9};
        int array3 [] = {1,3,5,6,8,9};
//        common_element(array1,array2,array3);
        another_approach(array1,array2,array3);
    }

    private static void another_approach(int[] array1, int[] array2, int[] array3) {
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                for(int k=0;k<array3.length;k++){
                    if(array1[i] == array2[j] && array2[j] == array3[k])
                        System.out.println(array1[i]);
                }
            }
        }
    }

    private static void common_element(int[] array1, int[] array2, int[] array3) {
        int i=0,j=0,k=0;
        while (i < array1.length && j < array2.length && k < array3.length){
            if(array1[i] == array2[j] && array2[j] == array3[k]){
                System.out.println(array1[i]);
                i++;
                j++;
                k++;
            }else if(array1[i] < array2[j]){
                    i++;
            }else if(array2[j] < array3[k]){
                j++;
            }else {
                k++;
            }
        }
    }
}
