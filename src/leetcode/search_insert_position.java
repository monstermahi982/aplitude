package leetcode;

public class search_insert_position {
    public static void main(String[] args) {
        int array [] = {1,3,5,6};
        int target = 7;
        int ans = searchPos(array, target);
        System.out.println(ans);
    }

    private static int searchPos(int[] array, int target) {

//        linear search
//        for(int i=0;i<array.length;i++){
//            if(array[i] >= target){
//                return i;
//            }
//        }
//        return array.length;

//        binary search

        int l = 0;
        int r = array.length-1;
        int mid;
        int ans = -1;
        while (l<=r){
            mid = l + (r-1) /2;
            if(array[mid] == target){
                return mid;
            }
            if(array[mid] < target){
              ans =  l = mid +1;
            }else {
                ans = mid;
                r = mid-1;
            }
        }
        return ans;
    }
}
