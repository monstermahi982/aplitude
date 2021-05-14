package array_450;

public class next_permutation_15 {
    public static void main(String[] args) {
        int array [] = {1,3,2};
        next_permutation(array);
        for (int i:array) {
            System.out.print(i + " ");
        }
    }

    private static void next_permutation(int[] array) {
        int i = array.length-2;
        while (i>=0 && array[i+1] <= array[i]){
            i--;
        }
        if(i>=0){
            int j = array.length - 1;
            while(j>=0 && array[j]<=array[i]){
                j--;
            }
            swap(array,i,j);
        }
        reverse(array,i+1);
    }

    private static void reverse(int[] array, int start) {
        int i = start , j = array.length-1;
        while (i<j){
            swap(array,i,j);
            i++;
            i--;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

