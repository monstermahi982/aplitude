package problems_on_arrays;

import java.util.*;

public class problem_13 {
    public static void main(String[] args) {
        String word = "this is monster 342 luckey number 90";
        String[] name = word.split(" ");


            for(int i=0;i<name.length;i++) {
                try {
                    int number = Integer.parseInt(name[i]);
                    String size = Integer.toString(number);
                    int array [] = new int[size.length()];
                    int count = 0;
                    int value = number;
                    while (value > 0){
                        array[count] = value % 10;
                        count++;
                        value = value / 10;
                    }
                    for(int k=0;k<array.length;k++){
                        if(array[k] == 9){
                            return;
                        }
                    }
                    long a = 200;
                    int s;
                    System.out.println(number);
                }catch (Exception e){
//                    System.out.println(e);
                }
            }

//        for(int i=0;i<name.length;i++){
//            if(name[i].)
//        }
    }
}
