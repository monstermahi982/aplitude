//just for fun

public class problem8 {
    public static void main(String[] args) {
        int array [] = { 10 , 32 , 2 , 3 , 20 , 20};
        findrepeatingarrY(array , array.length);
    }

    private static void findrepeatingarrY(int[] array, int length) {
        int temp = -1;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                if(temp == array[j]){
                    System.out.print(array[j] + " ");
                }
                System.out.print(" -- ");
                temp = array[j];
            }
        }
    }
}
