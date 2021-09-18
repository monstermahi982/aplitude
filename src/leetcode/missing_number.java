package leetcode;

public class missing_number {
    public static void main(String[] args) {
        int array [] = {3,0,1};
        int ans = find_missing_number(array);
        System.out.println(ans);
    }

    private static int find_missing_number(int[] array) {
        int x=0;
        for(int i=0;i<array.length;i++){
            x += array[i];
        }
        int n= array.length;
        return n * (n+1)/2 - x;
    }
}
