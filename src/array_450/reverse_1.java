package array_450;

public class reverse_1 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
//        using reverse for loop;
        reversearray(array);
//        using swap method
        reverseswap(array);
        printarray(array);
//        using reversive method
        reverse_resursive(array,0,array.length-1);
        printarray(array);
    }

    private static void reverse_resursive(int[] array, int i, int j) {
        if(i>=j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        reverse_resursive(array,i+1,j-1);
    }

    private static void printarray(int[] array) {
        for (int i:array) {
            System.out.println(i);
        }
    }

    private static void reverseswap(int[] array) {
        int i=0,j=array.length-1;
        while (i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    private static void reversearray(int[] array) {
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
