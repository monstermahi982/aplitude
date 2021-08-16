package company_question;

//accenture question

//data := input array = [1 2 3 4]
//          output array = [24 12 8 6]

public class question7 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4};
        sol(array);
    }

    private static void sol(int[] array) {
        int ans [] = new int[array.length];
        for(int i=0;i<array.length;i++){
            int value = 1;
            for(int j=0;j<array.length;j++){
                if( i != j){
                    value = value * array[j];
                }
            }
            ans[i] = value;
        }
        for (int i:ans) {
            System.out.print(i + " ");
        }
    }
}
