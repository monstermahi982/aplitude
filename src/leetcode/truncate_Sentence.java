package leetcode;

public class truncate_Sentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;

        String ans = truncateSentence(s,k);
        System.out.println(ans);
    }

    private static String truncateSentence(String s, int k) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                k--;
            }

            if(k == 0){
                String name = "";
                for(int j=0;j<i;j++){
                    name = name + s.charAt(j);
                }
                return name;
            }
        }

        return s;
    }
}
