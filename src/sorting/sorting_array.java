package sorting;

public class sorting_array {
    public static void main(String[] args) {
        int array [] = {64,25,12,22,11};
//        selection_sort(array);
        bubble_sort(array);
        for (int i: array) {
            System.out.print(i + " ");
        }
    }

    static boolean checkAss(int array[]){
        for (int i=0;i<array.length-1;i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    static void bubble_sort(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            boolean check = checkAss(array);
            if(check)
                return;
        }
    }

    static void selection_sort(int array[]){
        for (int i=0;i<array.length;i++){
            int min = i;
            for (int j=i+1;j<array.length;j++){
                if(array[j] <  array[min]){
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

//            saving computional power
            boolean check = checkAss(array);
            if(check){
                return;
            }
        }
    }
}
