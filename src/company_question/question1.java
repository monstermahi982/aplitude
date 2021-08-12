package company_question;

import java.util.HashSet;
import java.util.Scanner;

//nice interview

public class question1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4,5,6,6};
//        findDuplicate(array);
        anotherApproach(array);
    }

    private static void anotherApproach(int[] array) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<array.length;i++){
            if(hs.contains(array[i])){
                System.out.println(array[i]);
            }
            hs.add(array[i]);
        }
    }

    private static void findDuplicate(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
