package company_question;

//accentaure coding problems

//data := i = starting
//        j = ending
//        d = occuring in between i and j

public class question6 {
    public static void main(String[] args) {
        int i=2,j=30,d=3;
        find_occurence(i,j,d);
    }

    private static void find_occurence(int j, int k, int d) {
        int count = 0;
        for(int i=j;i<k;i++){
            if (i == d){
                count++;
            }else {
                int x = i;
                while (x != 0){
                    if(x % 10 == d){
                        count++;
                    }
                    x = x / 10;
                }
            }
        }
        System.out.println(count);
    }
}
