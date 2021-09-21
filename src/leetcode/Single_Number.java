package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Single_Number {
    public static void main(String[] args) {
        int array[] = {2,2,1};
        int ans = singleNumber(array);
        System.out.println(ans);
    }

    public static int singleNumber(int[] nums) {
        Set s = new HashSet();

        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                s.remove(nums[i]);
            }else {
                s.add(nums[i]);
            }

        }

        int val = -1;
        for (Object i:s) {
            val = (int) i;
        }
        return val;
    }
}
