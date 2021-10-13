package leetcode;

import java.util.Arrays;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int array [] = {4,3,2,1};
        int ans = thirdMax(array);
        System.out.println(ans);

    }

    static int thirdMax(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int ans = 0;

        int temp = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if(temp > nums[i]){
//                ans = i;
                temp = nums[i];
            }
        }
        System.out.println(temp);

        for (int i=0;i<nums.length;i++){
            if(temp > nums[i] && temp < nums[i]){
//                ans = i;
                temp = nums[i];
            }
        }
        System.out.println(nums[ans]);
        for (int i=0;i<nums.length;i++){
            if(temp < nums[i] && temp > temp){
//                ans = i;
                temp = nums[i];
            }
        }
        System.out.println(nums[ans]);

        return ans;
    }
}
