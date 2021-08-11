package interview_question;

public class practice15 {
    public static void main(String[] args) {
//        bubble sort
        int array [] = {1,4,2,6,5};
//        bubble_sort(array);
        insertaion_sort(array);
//        selection_sort(array);
        for (int i:array) {
            System.out.println(i);
        }
    }

    private static void insertaion_sort(int[] array) {

    }

    private static void selection_sort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    private static void bubble_sort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
