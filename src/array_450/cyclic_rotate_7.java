package array_450;

public class cyclic_rotate_7 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        print_array(array);
        System.out.println("\n");
        rotate(array);
        print_array(array);
    }

    private static void print_array(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
    }

    private static void rotate(int[] array) {
        int x = array[array.length-1];
        for(int i=array.length-1;i>0;i--)
            array[i] = array[i-1];
        array[0] = x;
    }
}
