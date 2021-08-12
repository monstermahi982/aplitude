package company_question;

public class question2 {
    public static void main(String[] args) {
        int array [] = {6,3,5,2,8,1,9,10};
        bubble_sort(array);
        for (int i: array) {
            System.out.println(i);
        }
    }

    private static void bubble_sort(int[] array) {
        int count = 0;
        for(int i=0;i<array.length-1;i++){
            count++;
            boolean flag = true;
            for(int j=0;j<array.length-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                System.out.println(count + " is count");
                return;
            }
        }
        System.out.println(count + " is count");
    }
}
