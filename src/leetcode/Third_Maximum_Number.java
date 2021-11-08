package leetcode;

import java.util.Arrays;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int array[] = {4, 3, 2, 1};
        int ans = thirdMax(array);
        System.out.println(ans);

    }

    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=0, len=nums.length ;
        for(int i=len-1;i>0;i--){
            if(nums[i]>nums[i-1])
                count++;
            if(count>=2)
                return nums[i-1];
        }
        return nums[len-1];
    }
}
