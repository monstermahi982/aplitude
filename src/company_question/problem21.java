package company_question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem21 {
    public static void main(String[] args) {
        int array [] = {0,1,2,3,4,5};
        int count = 0;
        isDone(array, count);
        Set s = new HashSet();
        ArrayList s2 = new ArrayList();

        Scanner s1 =  new Scanner(System.in);
    }

    private static void isDone(int[] array, int count) {
        for (int i=0;i<array.length;i++){
            if (i != array.length-1){
                if(array[i] == i){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    count++;
                }
            }else {
                if(array[i] == i){
                    int temp = array[i];
                    array[i] = array[0];
                    array[0] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}
