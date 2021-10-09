package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class valid_anagram {
    public static void main(String[] args) {
        String s = "a", t = "ab";

//        System.out.println(isAnagram(s, t));
        System.out.println(usingStack(s,t));
    }

    private static boolean usingStack(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) +1);
            }else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i)) > 1){
                    map.put(t.charAt(i), map.get(t.charAt(i)) -1);
                }else {
                    map.remove(t.charAt(i));
                }
            }else {
                map.put(t.charAt(i), 1);
            }
        }

        if (map.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    private static boolean isAnagram(String s, String t) {

        int[] array1 = new int[256];
        int[] array2 = new int[256];

        for(int i=0;i<s.length();i++){
            int pos = (char) s.charAt(i);
            array1[pos] = array1[pos] + 1;
        }

        for(int i=0;i<t.length();i++){
            int pos = (char) t.charAt(i);
            array2[pos] = array2[pos] + 1;
        }

        for(int i=0;i<256;i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }


        return true;
    }
}
