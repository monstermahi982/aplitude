package problems_on_arrays;

public class array1 {
    public static void main(String[] args) {
//        simple array problem
        int [] array = {2,3,5,1,3};

        System.out.println("---------------------------------");

//        length of array
        System.out.println(array.length);

        System.out.println("---------------------------------");

//        foreach loop
        for (int x: array) {
            System.out.println(x);
        }

        System.out.println("---------------------------------");

//        simple for loop
        for(int i = 0 ; i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("---------------------------------");

//        reverse a array
        for (int i=array.length - 1 ; i>=0 ; i--){
            System.out.println(array[i]);
        }


    }
}
