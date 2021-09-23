package leetcode;

import java.util.HashMap;

public class word_problem {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }

    static boolean wordPattern(String pattern, String s) {
        String str [] = s.split(" ");

        if(pattern.length() != str.length)
            return false;

        HashMap<Character, String> hm = new HashMap();


        for (int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            if(hm.containsKey(c)){
                String value = hm.get(c);
                if(!value.equals(str[i])){
                    return false;
                }
            }else if(hm.containsValue(str[i])){
                return false;
            }
            hm.put(c,str[i]);
        }
        return true;
    }
}
