//Find the largest three distinct elements in an array
//        Input: arr[] = {10, 4, 3, 50, 23, 90}
//        Output: 90, 50, 23

import java.util.Arrays;

public class problem9 {
    public static void main(String[] args) {
        int array [] = {1,2,12,4,5,6};
//        printlargest3(array , array.length);
        anotherway(array , array.length);
    }

    private static void anotherway(int[] array, int length) {
        Arrays.sort(array);
//        int temp = -1;
        for (int i=length-1; i>=length-3;i--){
            System.out.print(array[i] + " ");
        }
    }

    private static void printlargest3(int[] array, int n) {
        int i , a , b , c;
        if(n<3){
            System.out.println("invalid array");
        }
        a = b = c = Integer.MIN_VALUE;
        for (i=0;i<n;i++){
            if (array[i] > a){
                c=b;
                b=a;
                a=array[i];
            }
            else if(array[i] > b){
                c=b;
                b=array[i];
            }
            else if(array[i]>c){
                c = array[i];
            }
        }
        System.out.println("the largest element is " + a + " " + b + " "+ c );
    }
}
