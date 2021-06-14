package searching_sorting_450;

public class problem_2 {
    public static void main(String[] args) {
        int array [] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
//        System.out.println(linearfixedPoint(array , array.length));
        System.out.println(binaryfixedPoint(array , 0 ,array.length-1));
    }

    private static int binaryfixedPoint(int[] array, int l, int h) {
        if(h >= l){
            int mid = (l + h) / 2;
            if(mid == array[mid])
                return mid;
            if(mid > array[mid])
                return binaryfixedPoint(array,(mid+1),h);
            else
                return binaryfixedPoint(array , l , (mid-1));
        }
        return -1;
    }

    private static int linearfixedPoint(int[] array, int n) {
            for(int i=0;i<n;i++){
                if(array[i] == i){
                    return i;
                }
            }
            return -1;
    }
}
