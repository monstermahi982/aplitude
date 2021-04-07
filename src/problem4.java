//Union and Intersection of two sorted arrays

//        Input : arr1[] = {1, 3, 4, 5, 7}
//          arr2[] = {2, 3, 5, 6}
//        Output : Union : {1, 2, 3, 4, 5, 6, 7}
//          Intersection : {3, 5}
//
//        Input : arr1[] = {2, 5, 6}
//          arr2[] = {4, 6, 8, 10}
//        Output : Union : {2, 4, 5, 6, 8, 10}
//          Intersection : {6}

public class problem4 {
    public static void main(String[] args) {
        int array1 [] = {2 , 4 , 6 , 8};
        int array2 [] = {2 , 3 , 4 , 5};
        int m = array1.length;
        int n = array2.length;
        printunion(array1 , array2 , m , n);
    }

    private static void printunion(int[] array1, int[] array2, int m, int n) {
        int i = 0 , j = 0;
        while (i < m && j < n){
            if(array1[i] < array2[j]){
                System.out.print(array1[i++] + " ");
            }
            else if(array1[i] > array2[j]){
                System.out.print(array2[j++] + " ");
            }
            else {
                System.out.print(array2[j++] + " ");
                i++;
            }
        }

        while (i < m)
            System.out.print(array1[i++] + " - " );

        while (j < n)
            System.out.print(array2[j++] + " - ");
    }
}
