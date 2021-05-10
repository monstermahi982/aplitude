package array_450;

//input => {0, 1, 2, 0, 1, 2}
//output => {0, 0, 1, 1, 2, 2}

public class sort0123_4 {
    public static void main(String[] args) {
        int array [] = {0,1,1,2,0,2,0,1};
//        sort_array(array);
        another_approach(array);
        print_array(array);
    }

    private static void another_approach(int[] array) {
        int i , count0 = 0, count1 = 0 , count2 = 0;
        for(i=0;i<array.length;i++){
            switch (array[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        System.out.println(count0  + " " + count1 + " " + count2);
        i = 0;
        while (count0>0){
            array[i++] = 0;
            count0--;
        }
        while (count1>0){
            array[i++] = 1;
            count1--;
        }
        while (count2>0){
            array[i++] = 2;
            count2--;
        }

    }

    private static void print_array(int[] array) {
        for (int i: array) {
            System.out.println(i);
        }
    }

    private static void sort_array(int[] array) {
        int low = 0;
        int high = array.length-1;
        int mid = 0, temp =0;
        while (mid<=high){
            switch (array[mid]){
                case 0:{
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:mid++;
                    break;
                case 2:{
                    temp = array[mid];
                    array[mid] = array[high];
                    array[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
