package company_question;

//sorting arrays 0 , 1;

import java.util.Scanner;
public class question17 {
    public static void main(String[] args) {
        int array [] = {0,1,0,1,0,1,0,1,0};
        int l = 0;
        int r = array.length-1;
        int count  = 0;
        while (l<r){
            count++;
            if(array[l] == 1 && array[r] == 0){
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }else if(array[l] == 0 && array[r] == 1){
                l++;
                r--;
            }else if(array[l] == 0){
                l++;
            }else {
                r--;
            }

        }

        for (int i:array) {
            System.out.print(i+ " ");
        }
        System.out.println(count);
    }
}
