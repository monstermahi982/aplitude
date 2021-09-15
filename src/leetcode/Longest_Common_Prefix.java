package leetcode;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String array [] = {"flower","flow","flight"};
        String ans = longestCommonPrefix(array);
        System.out.println(ans);
    }

    private static String longestCommonPrefix(String[] array) {
//        find minimun string
        String ans = "";
        int minimumLength = array[0].length();
        for(int i=1;i<array.length;i++){
            minimumLength = Math.min(minimumLength, array[i].length());
        }

        for(int i=0;i<minimumLength;i++){
            char current  = array[0].charAt(i);
//            foreach loop
//            for(String str: array){
//                if(str.charAt(i) != current){
//                    return ans;
//                }
//            }
            for(int j=1;j<array.length;j++){
                if(array[i].charAt(i) != current){
                    return ans;
                }
            }
            ans = ans + current;
        }
        return ans;
    }
}
