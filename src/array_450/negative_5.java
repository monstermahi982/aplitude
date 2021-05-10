package array_450;

//Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//Output: -12 -13 -5 -7 -3 -6 11 6 5

public class negative_5 {
    public static void main(String[] args) {
        int array [] = {-2,-1,-7,2,6,9,-2,-5};
//        sort_negative(array,0,array.length-1);
        using_sorting(array);
        print_array(array);
    }

    private static void using_sorting(int[] array) {
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i] < 0){
                if(i!=j){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
    }

    private static void print_array(int[] array) {
        for (int i:array) {
            System.out.println(i);
        }
    }

    private static void sort_negative(int[] array, int l, int r) {
        while (l<=r){
            if(array[l] < 0 && array[r] < 0)
                l++;
            else if(array[l]>0 && array[r] < 0){
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
            else if(array[l] > 0 && array[r] > 0)
                r--;
            else {
                l++;
                r--;
            }

        }
    }
}
