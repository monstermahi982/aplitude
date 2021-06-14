package searching_sorting_450;

public class problem_3 {
    public static void main(String[] args) {
        int array[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 3;
        System.out.println(pivotedBinarySearch(array,  target));
    }

    private static int pivotedBinarySearch(int[] array, int target) {
        int pivot = findPivot(array , 0 , array.length-1);
        if(pivot == -1)
            return binarySearch(array , 0 , array.length-1, target);
        if(array[pivot] == target)
            return pivot;
        if(array[0] <= target)
            return binarySearch(array , 0 , pivot - 1 , target);
        return binarySearch(array , pivot + 1 , array.length-1 , target);
    }

    private static int binarySearch(int[] array, int l, int h, int target) {
        if(h<l)
            return -1;
        int mid = (l + h);
        if(target == array[mid])
            return mid;
        if(target > array[mid])
            return binarySearch(array , (mid +1) , h , target);
        return binarySearch(array , l , (mid -1) , target);
    }

    private static int findPivot(int[] array, int l, int h) {
        if(h < l)
            return -1;
        if(h == l)
            return l;

        int mid = (l + h) / 2;
        if(mid < h && array[mid] > array[mid + 1])
            return mid;
        if(mid > l && array[mid] < array[mid-1])
            return -1;
        if(array[l] >= array[mid])
            return findPivot(array , l ,mid-1 );
        return findPivot(array , mid + 1 , h);
    }


}
