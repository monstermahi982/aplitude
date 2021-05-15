package array_450;

//not splved
import java.util.Arrays;

public class pos_neg_alter_20 {
    public static void main(String[] args) {
        int array [] = {2,5,-2,9,-3};

        print_array(array);
        Arrays.sort(array);
        System.out.println();

        print_array(array);
        System.out.println();

        rearrange(array);
        print_array(array);
    }

    private static void print_array(int[] array) {
        for (int i:array) {
            System.out.print(i + " ");
        }
    }

    private static void rearrange(int[] array) {
        int pos = 0;
        int neg = 0;
        int last = array.length - 1;
        for(int i=0;i<array.length;i++){
            if(array[i] < 0)
                neg++;
            else
                pos++;
        }
        for(int i=0;i<array.length;i++)
        {
            if(i % 2 == 0 || i != 1 && array[i] < 0){
                int temp = array[i];
                array[i] = array[last];
                array[last] = temp;
            }
        }
    }
}
