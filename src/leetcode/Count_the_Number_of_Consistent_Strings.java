package leetcode;

public class Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args) {
        String allowed = "ab";
        String words [] = {"ad","bd","aaab","baa","badab"};
        int ans  = countConsistentStrings(allowed,words);
    }

    private static int countConsistentStrings(String allowed, String[] words) {
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j) == )
            }
        }
        return 0;
    }
}
