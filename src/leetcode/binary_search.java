package leetcode;

public class binary_search {
    public static void main(String[] args) {
        int array [] = {-1,0,3,5,9,12};
        int target = 9;
        int ans = search(array, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

//        while (l <= r){
//            int mid = l + (r-1) / 2;
//
//            if(nums[mid] == target ){
//                return mid;
//            }
//
//            if(nums[mid] < target){
//                l = mid + 1;
//            }
//
//            if(nums[mid] > target){
//                r = mid - 1;
//            }
//        }

        int ans =  binary_search_b(nums, l , r, target);

        return ans;
    }

    static int binary_search_b(int array[], int l,int r, int target){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (array[mid] == target)
                return mid;

            if (array[mid] > target)
                return binary_search_b(array, l, mid - 1, target);

            return binary_search_b(array, mid + 1, r, target);
        }
        return -1;
    }
}
