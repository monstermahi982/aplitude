package leetcode;

public class rotate_array {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(array,k);
        for (int x:array) {
            System.out.print(x + " ");
        }
    }


    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length- k - 1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }

    static void reverse(int []array, int i, int j){
        while (i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }


}
