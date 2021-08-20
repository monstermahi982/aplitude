package company_question;
//accentare question

public class question15 {
    public static void main(String[] args) {
        int array [] = {3, 2, 1, 7, 5, 4};
        int smallE = Integer.MAX_VALUE;
        int smallO = Integer.MAX_VALUE;
        int smallEV = Integer.MAX_VALUE;
        int smallOV = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] % 2 == 0){
                if(array[i] < smallE){
                    smallE = array[i];
                }
            }else {
                if(array[i] < smallO){
                    smallO = array[i];
                }
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i] % 2 == 0){
                if(array[i] < smallEV && array[i] != smallE){
                    smallEV = array[i];
                }
            }else {
                if(array[i] < smallOV && array[i] != smallO){
                    smallOV = array[i];
                }
            }
        }
        System.out.println(smallOV + smallEV);
    }
}
