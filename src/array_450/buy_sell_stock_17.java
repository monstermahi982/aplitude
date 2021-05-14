package array_450;

public class buy_sell_stock_17 {
    public static void main(String[] args) {
        int array [] = {7,6,4,3,4};
        int ans = profit(array);
        System.out.println(ans);
    }

    private static int profit(int[] array) {
        int max_profit = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                int profit = array[j] - array[i];
                if(profit > max_profit){
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }

}
