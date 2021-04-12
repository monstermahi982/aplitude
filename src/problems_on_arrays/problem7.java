package problems_on_arrays;//Find the Missing Number
//You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list.
//        One of the integers is missing in the list. Write an efficient code to find the missing integer.

//        Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
//        Output: 5
//        Explanation: The missing number from 1 to 8 is 5
//
//        Input: arr[] = {1, 2, 3, 5}
//        Output: 4
//        Explanation: The missing number from 1 to 5 is 4

public class problem7 {
    public static void main(String[] args) {
        int array [] = {1 , 2 , 4 , 5 };
        int n = array.length;
//        printarray(array , n);
        System.out.println();
//        int miss = findmissingnumber(array , n);
//        System.out.println(miss);
        System.out.println(anotherway(array , n));
    }

    private static int anotherway(int[] array, int n) {
        int a = array[0];
        int b = 1;
        for (int i=1;i<n;i++){
            a = a ^ array[i];
        }
        for (int i =2 ; i<=n+1 ; i++){
            b = b ^ i;
        }
        return (a+b);
    }

    private static void printarray(int[] array, int n) {
        for(int i=0 ; i<n ; i++){
            System.out.print(array[i] + " ");
        }
    }

//    using formula  n*(n+1)/2
    private static int findmissingnumber(int[] array, int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= array[i];
        return total;

    }
}
