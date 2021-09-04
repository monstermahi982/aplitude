package matrix_problems;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int array [][] = new int[m][n];

//        input 2-D array
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                array[i][j] = sc.nextInt();

//        output 2-D array
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

//        find element
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(array[i][j] == 10)
                    System.out.println("element found at " + i + " row" + " " +j + " column");


//        spiral order
        int row_start = 0 , row_end = m-1;
        int col_start = 0 , col_end = m-1;

        for(int i=0;i<array.length;i++){

        }
    }
}
