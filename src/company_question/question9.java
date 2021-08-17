package company_question;
//sum of two number

public class question9 {
    public static void main(String[] args) {
        int nums [] = {3,2,4};
        twoSum(nums,6);
    }
    private static int[] twoSum(int[] nums, int target) {
        int array [] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i] + nums[j] == target && i != j){
                    array[0] = nums[i];
                    array[1] = nums[j];
                    for (int k:array) {
                        System.out.println(k);
                    }
                    return array;
                }
            }
        }
        for (int i:array) {
            System.out.println(i);
        }
        return array;
    }
}
