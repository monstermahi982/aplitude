package problems_on_recursion;

public class problem_1 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        int r=3;
        printCombination(array , r , array.length);
    }

    private static void printCombination(int[] array, int r, int n) {
        int data [] = new int[n];
        combination(array , data , 0 , n-1 , 0 , r);
    }

    private static void combination(int[] array, int[] data, int start, int end, int index, int r) {
        if(index == r){
            for(int i=0;i<r;i++){
                System.out.print(data[i] + " ");
            }
            System.out.println("");
            return;
        }
        for(int i=start;i<=end && end-i+1 >= r-index;i++){
            data[index] = array[i];
            combination(array , data , i+1 , end , index+1 , r);
        }
    }
}
