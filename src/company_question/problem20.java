package company_question;

//ans = 17
public class problem20 {
    public static void main(String[] args) {
        int array [] = {6,7,5,3,9,4};
        int i = 3;
        int m = 3;

        int ans = findAns(array,i,m);
        System.out.println(ans);
    }

    private static int findAns(int[] array, int i, int m) {
        int fw = 0;
        int bw = 0;
        int index = i;

        System.out.println(index);
        for(int j=index;j<m+index;j++){
            fw += array[j];
        }

        System.out.println(fw);
        for(int j=index-m+1;j<=index;j++){
            bw += array[j];
        }

        return Math.max(fw,bw);
    }
}
