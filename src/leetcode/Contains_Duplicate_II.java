package leetcode;

import java.util.HashSet;

public class Contains_Duplicate_II {
    public static void main(String[] args) {

        int array[] = {1,2,3,1,2,3};
        int k= 2;
        System.out.println(containsNearbyDuplicate(array,k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i] == nums[j]){
//                    if(Math.abs(i - j) <= k ){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;


        if(nums==null || nums.length<2 || k==0)
            return false;

        int i=0;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int j=0; j<nums.length; j++){
            if(!set.add(nums[j])){
                return true;
            }

            if(set.size()>=k+1){
                set.remove(nums[i++]);
            }
        }

        return false;
    }
}
