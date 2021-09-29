package leetcode;

public class Move_Zeroes {
    public static void main(String[] args) {
        int array[] = {0,1,0,3,12};
        moveZeroes(array);
        for (int i:array) {
            System.out.print(i + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
//        int l = 0 , r = nums.length-1;
//        while (l <= r){
//            if(nums[l] == 0 && nums[r] != 0){
//                nums[l] = nums[r];
//                nums[r] = 0;
//                l++;r--;
//            }else if(nums[l] != 0){
//                l++;
//            }else if(nums[r] == 0){
//                r--;
//            }
//        }


//        for (int i=0;i<nums.length;i++){
//            if(i+1 == nums.length){
//                return;
//            }
//            if(nums[i] == 0 && nums[i+1] != 0){
//                nums[i] = nums[i+1];
//                nums[i+1] = 0;
////                i++;
//            }
//        }

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }

            j++;
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }
    }
}
