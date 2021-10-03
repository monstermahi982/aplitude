package leetcode;

public class jump_game {
    public static void main(String[] args) {
        int array [] = {2,3,1,1,4};
        System.out.println(canJump(array));
    }

    static boolean canJump(int[] nums) {
        int data = nums[0];
        for (int i=0;i<nums.length;i++){
            if(data <= i && nums[i] == 0){
                return false;
            }
            if(i + nums[i] > data){
                data = i + nums[i];
            }
            if(data >= nums.length-1){
                return true;
            }
        }
        return false;
    }

}
