package leetcode;

public class Implement_strStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String neddle = "ll";
        int ans = strStr(haystack,neddle);
        System.out.println(ans);
    }

    private static int strStr(String haystack, String neddle) {
        if(neddle.length() == 0)
            return 0;
        int i=0;
        for(i=0;i<=haystack.length()-neddle.length();i++){
            int j;
            for(j=0;j<neddle.length();j++){
                if(neddle.charAt(j) != haystack.charAt(i+j)){
                    break;
                }
            }
            if(j == neddle.length()){
                return i;
            }
        }
        return -1;
    }
}
