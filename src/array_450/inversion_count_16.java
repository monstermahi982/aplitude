package array_450;

public class inversion_count_16 {
    public static void main(String[] args) {
        int array [] = {8, 4, 2, 1};
        int ans = inversion_count(array);
        System.out.println(ans);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i:array) {
            System.out.print(i+" ");
        }
    }

    private static int inversion_count(int[] array) {
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
