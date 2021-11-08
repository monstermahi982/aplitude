package leetcode;

public class reverse_string_2 {

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String ans = reverseStr(s,k);
        System.out.println(ans);
    }

    static String reverseStr(String s, int k) {
        StringBuffer result = new StringBuffer();
        for(int i=0; i<s.length()/k+1; i++){

            int maxIndex = Math.min(i*k+k, s.length());

            if(i%2 == 0){
                result.append(new StringBuffer(s.substring(i*k, maxIndex)).reverse());
            }else{
                result.append(s.substring(i*k, maxIndex));
            }

        }
        return result.toString();
    }
}
