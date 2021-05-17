package searching_sorting_450;

import java.util.ArrayList;

public class first_last_element_1 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,4,4,5,6};
        int x = 4;
//        search_similar_array(array , x);
//        using binary search
//        int high = array.length-1;
//        int low = 0;
//        System.out.println("first occurence "+first(array ,high,low, x));
//        System.out.println("last occurence "+last(array ,high , low ,x));

//        using arraylist
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : array)
            list.add(i);
        System.out.println("first occurence "+first_another(list , x));
        System.out.println("last occurence "+last_another(list , x));
    }

    private static int last_another(ArrayList<Integer> list, int x) {
        return list.lastIndexOf(x);
    }

    private static int first_another(ArrayList<Integer> list, int x) {
        return  list.indexOf(x);
    }

    private static int last(int[] array, int high, int low, int x) {

        if(high >= low){
            int mid = low + (high - low) / 2;
            if((mid == array.length - 1 || x < array[mid + 1]) && array[mid] == x)
                return  mid;
            else if(x < array[mid])
                return  last(array,low , (mid -1) , x);
            else
                return last(array,(mid+1) , high , x);
        }
        return  -1;

    }

    private static int first(int[] array, int high , int low , int x) {
        if(high >= low){
            int mid = low + (high - low) / 2;
            if((mid == 0 || x > array[mid - 1]) && array[mid] == x)
                return mid;
            else if(x > array[mid])
                return first(array, (mid + 1) , high , x );
            else
                return first(array,low , (mid - 1) , x);
        }
        return  -1;
    }

    private static void search_similar_array(int[] array , int x) {
        int first = -1 , last = -1;
        for(int i=0;i<array.length;i++){
            if(x != array[i])
                continue;
            if(first == -1)
                first = i;
            last = i;
        }
        if(first != -1){
            System.out.println("first occurence " + first);
            System.out.println("second occurence " + last);
        }else{
            System.out.println("not found");
        }
    }
}
