package array_450;

import javax.print.attribute.HashAttributeSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class duplicates_11 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,4};
//        int ans = duplicates(array);
        int ans = another_duplicates(array);
        System.out.println(ans);
    }

    private static int another_duplicates(int[] array) {
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(array[i] == array[i+1])
                return array[i];
        }
        return 0;
    }

    private static int duplicates(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j= i + 1;j<array.length;j++){
                if(array[i] == array[j])
                    return array[j];
            }
        }
        return 0;
    }
}
