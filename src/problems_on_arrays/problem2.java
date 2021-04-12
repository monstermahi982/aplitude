package problems_on_arrays;

public class problem2 {
     static int smaallfun(int n , int [] array){
        int a = array[0];
        for (int i = 1 ; i < n ; i++){
            if(array[i] < a){
                a = array[i];
            }
         }
    return a;
     }
     static int bigfun(int n , int [] array){
         int a = array[0];
         for (int i = 1 ; i < n ; i++){
             if(array[i] > a){
                 a = array[i];
             }
         }
         return a;
     }

    public static void main(String[] args) {
        int array [] = {200 , 43 , 235 , 10 , 5 , 2  , 400 };
        int n = array.length;
        int small_value = smaallfun(n , array);
        int big_value = bigfun(n , array);
        System.out.println(small_value);
        System.out.println(big_value);
    }
}
