package problems_on_arrays;// Program to cyclically rotate an array by one
//        Input:  arr[] = {1, 2, 3, 4, 5}
//        Output: arr[] = {5, 1, 2, 3, 4}


public class problem6 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        int n = array.length;
        printarray(array , n);
        rotatearray(array , n);
        System.out.println();
        printarray(array , n);
    }

    private static void rotatearray(int[] array, int n) {
//        algorithm for rotations
        int temp = array[n-1];
        for (int j=n-1;j>0;j--){
            array[j] = array[j-1];
        }
        array[0] = temp;
    }

    private static void printarray(int[] array, int n) {
        for (int i=0 ; i<n ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
