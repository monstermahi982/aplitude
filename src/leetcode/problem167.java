package leetcode;

public class problem167 {
    public static void main(String[] args) {
        int array[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(array,target);
        for (int i:ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int ans [] = new int[2];

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length;j++){
                if(i != j){
                    if(numbers[i] + numbers[j] == target){
                        ans[0] = i;ans[1] = j;
                        return ans;
                    }
                }
            }
        }

        ans[0] = -1;ans[1] = -1;
        return ans;
    }
}
