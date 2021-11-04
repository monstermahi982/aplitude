package leetcode;

public class detect_capitol {
    public static void main(String[] args) {
        String name = "FFFFFFFFFFFFFFFFFFFFf";
        System.out.println(detectCapitalUse(name));
    }
    static boolean detectCapitalUse(String word) {
        int counter = 0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                counter++;
            }
        }
        if(counter == 0 || counter == word.length()){
            return true;
        }else if(counter == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}
