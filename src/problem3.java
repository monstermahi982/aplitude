//Move all negative numbers to beginning and positive to end with constant extra space
//        Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//        Output: -12 -13 -5 -7 -3 -6 11 6 5

import java.io.*;
public class problem3 {
    public static void main(String[] args) {
        int array [] = { 2 , -7 , 6 , 4 , -3 , 3 , -2 , 9 , -4 , -2 };
        int n = array.length;
//        rearrange(array , n);
        shiftall(array , 0 , n - 1);
        printArray(array , n);
    }

    static void shiftall(int[] arr, int left, int right)
    {

        // Loop to iterate over the
        // array from left to the right
        while (left <= right)
        {
            if (arr[left] < 0 && arr[right] < 0)
                left++;
            else if (arr[left] > 0 && arr[right] < 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else
            {
                left++;
                right--;
            }
        }
    }

    private static void rearrange(int[] arr, int n) {
        int j = 0 , temp;
        for (int i = 0 ; i< n ; i++){
            if(arr[i] < 0){
                if (i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
