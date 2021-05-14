package array_450;

public class count_pairs_with_given_sum_18 {
    public static void main(String[] args) {
        int array [] = {1, 5, 7, 1};
        int K = 6;
        int ans = getPaircount(array , K);
        System.out.println(ans);
    }

    private static int getPaircount(int[] array, int k) {
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i] + array[j] == k)
                    count++;
            }
        }
        return count;
    }
}
