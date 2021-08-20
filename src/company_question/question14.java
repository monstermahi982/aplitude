package company_question;

//accenatre coding question
public class question14 {
    public static void main(String[] args) {
        int D = 6, N = 30;
        int notDiv = 0;
        int Div = 0;
        for(int i=0;i<=N;i++){
            if(i % 6 == 0){
                Div += i;
            }else {
                notDiv += i;
            }
        }
        System.out.println(notDiv - Div);
    }
}
