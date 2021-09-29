package company_question;

import java.util.Scanner;

public class problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int array [] = new int[N];
        int k = sc.nextInt();
        for (int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        int ans = findAns(array,k);
        System.out.println(ans);
    }

    private static int findAns(int[] array, int k) {
        int even = Integer.MAX_VALUE;
        int odd = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(i % 2 == 0){
                if(array[i] < even){
                    even = array[i];
                }
            }else {
                if(array[i] < odd){
                    odd = array[i];
                }
            }
        }
        return Math.max(odd,even);
    }
}
