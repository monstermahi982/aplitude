package leetcode;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    static int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }

        if(nums.length == 2){
            return nums[0] > nums[1] ? 0 : 1;
        }

        int index = 0;

        for(int i=1;i<nums.length-1;i++){

            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                index = i;
            }
        }

        if(nums[nums.length-1] > nums.length-2){
            return nums.length-1;
        }

        return index;
    }
}
