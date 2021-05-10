package array_450;

//need chnages
//second approach is to sort the array first and then find the kth position
public class kth_max_min_3 {
    public static void main(String[] args) {
        int array [] = {1,4,2,3,6,9};
        int maxk = kth_max(array,0,array.length-1,2);
        int mink = kth_min(array,0,array.length-1,2);
        System.out.println(maxk + " " +mink);
    }

    private static int kth_min(int[] array, int i, int j, int k) {
        int temp = array[0], count = 1;
        while (k!=count){
            for(int x =0;x<j;x++){
                if(array[x]<temp){
                    temp = array[x];
                }
            }
            count++;
        }
        return temp;
    }

    private static int kth_max(int[] array, int i, int j, int k) {
        int temp = array[0];
        int count = 1;
        while (k != count){
            for (int x=0;x<j;x++){
                if(array[x] > temp){
                    temp = array[x];
                }
            }
            count++;
        }
        return temp;
    }
}
