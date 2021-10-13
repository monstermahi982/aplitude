package leetcode;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int array [] = {1,2,3,4};
        for (int i : runningSum(array)){
            System.out.print(i + " ");
        }
    }

    static int[] runningSum(int[] nums) {
        int result [] = new int[nums.length];

//        for (int i=0;i<nums.length;i++){
//            for(int j=0;j<=i;j++){
//                result[i] += nums[j];
//            }
//        }

        result[0] = nums[0];
        for (int i=1;i<nums.length;i++){
            result[i] = nums[i] + result[i-1];
        }

        return result;
    }
}
