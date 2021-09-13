package leetcode;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String word1 [] = {"a", "cb"};
        String word2 [] = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String value1 = null;
        String value2 = null;
        for(int i=0;i<word1.length;i++){
            value1 = value1 + word1[i];
        }
        for(int i=0;i<word2.length;i++){
            value2 = value2 + word2[i];
        }

        if(value1.equals(value2)){
            return true;
        }
        return false;
    }
}
