package leetcode;

public class problem34 {
    public static void main(String[] args) {
        int array[] = { 5,7,7,8,8,10};
        int target = 8;
        int ans[]= find_ans(array,target);
//        System.out.println();
        for (int i:ans){
            System.out.print(i + " ");
        }
    }

    private static int[] find_ans(int[] array, int target) {
        int l = 0;
        int r = array.length-1;
        while (l<r){
            int mid = l + (r-1) / 2;
            if(array[mid] < target){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        int first = l;
        if(l<array.length && array[l] == target){
            l=0;
            r = array.length-1;
            while (l<r){
                int m = l+(r-1)/2;
                if(array[m] > target){
                    r = m-1;
                }else{
                    l=m;
                }
            }
            return new int[]{first,r};
        }

        return new int[]{-1,-1};
    }

    private static boolean binar_search(int array[],int l , int r, int x) {
        while (l <= r){
            int mid = l + (r-1) / 2;

            if(array[mid] == x)
                return true;

            if(array[mid] > x)
                return binar_search(array,l,mid-1,x);

            if(array[mid] < x)
                return binar_search(array,mid +1, r,x);

        }
        return false;
    }
}
