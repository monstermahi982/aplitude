package company_question;

//stock price profit

public class question12 {
    public static void main(String[] arg) {
        int array [] = {2,4,1};
        findPrice(array);
    }

    private static void findPrice(int[] array) {
        int min = array[0];
        int max = 0;
        int minIndex = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }

        for(int i=minIndex;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        System.out.println(max-min);
    }
}
