package interview_question;

import java.util.Arrays;

public class practice12 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,9,7,10,90};
//        thirdlargest(array);
//        thirdlargestarray(array);
        thirdlargestanotherapproach(array);
    }

    private static void thirdlargestanotherapproach(int[] array) {
        int first = array[0] , second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int i=1;i<array.length;i++){
            if(array[i] > first){
                third = second;
                second = first;
                first = array[i];
            }else if(array[i] > second){
                third = second;
                second = array[i];
            }else if(array[i] > third){
                third = array[i];
            }
        }
        System.out.println(third);
    }

    private static void thirdlargestarray(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length-3]);
    }

    private static void thirdlargest(int[] array) {
        int first = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] > first)
                first = array[i];
        }
        int second = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] > second && array[i] < first){
                second = array[i];
            }
        }
        int third = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] > third && array[i] < second){
                third = array[i];
            }
        }
        System.out.println(third);

    }
}
