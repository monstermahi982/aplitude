package array_450;

public class max_min_2 {
    public static void main(String[] args) {
        int array [] = {8,1,2,3,0, 9,4,5,6};
        int min = min_array(array);
        int max = max_array(array);
        System.out.println(min+" "+max);
    }

    private static int max_array(int[] array) {
        int temp=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] > temp){
                temp = array[i];
            }
        }
        return temp;
    }

    private static int min_array(int[] array) {
        int temp=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] < temp){
                temp = array[i];
            }
        }
        return temp;
    }
}
