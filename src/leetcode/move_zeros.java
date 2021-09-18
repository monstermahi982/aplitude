package leetcode;

public class move_zeros {
    public static void main(String[] args) {
        int array [] = {0,1,0,3,12};
        move(array);
        for (int i:array) {
            System.out.print(i + " ");
        }
    }

    private static void move(int[] array) {
        int l = 0;
        int r = array.length-1;
        while (l < r){
            if(array[r] == 0){
                System.out.println("fdfgdf");
                r--;
            }else if(array[l] == 0){
                System.out.println("fdfgdf");
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;r--;
            }else {
                l++;r--;
            }
        }
    }
}
