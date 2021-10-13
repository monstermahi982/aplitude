package leetcode;

import java.awt.font.FontRenderContext;

public class Count_Good_Triplets {
    public static void main(String[] args) {
        int array [] = {3,0,1,1,9,7};
        int a = 7, b = 2 , c = 3;
        int ans = countGoodTriplets(array,a,b,c);
        System.out.println(ans);

    }

    static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;

        long start = System.nanoTime();

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (Math.abs( arr[i] - arr[j] ) <= a){
                for (int k=j+1;k<arr.length;k++){


                        if (Math.abs( arr[j] - arr[k] ) <= b) {
                            if (Math.abs( arr[i] - arr[k] ) <= c){
                                ans++;
                            }
                        }
                    }
                }
            }
        }

        long elapsedTime = System.nanoTime() - start;

        System.out.println(elapsedTime);

        return ans;
    }
}
