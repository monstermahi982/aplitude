package leetcode;

import java.util.HashSet;
import java.util.Set;

public class duplicate_numbers {
    public static void main(String[] args) {
        int array[] = {3,2,1};
        boolean ans = isDuplicate(array);
        System.out.println(ans);
    }

    private static boolean isDuplicate(int[] nums) {
        Set set = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
