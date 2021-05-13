package array_450;

//not solved
public class merge_array_12 {
    public static void main(String[] args) {
        int array1[] = {1 ,3, 5, 7};
        int array2[] = {0, 2, 6, 8 ,9};
        mergeArray(array1, array2);
        for (int i: array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i: array2) {
            System.out.print(i + " ");
        }
    }

    private static void mergeArray(int[] array1, int[] array2) {
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i] > array2[j]){
                    int temp = array1[i];
                    array1[i] = array2[j];
                    array2[j] = temp;
                }
//                if(array1[i] == array1[array1.length]){
//                    return;
//                }
            }
        }
    }
}
