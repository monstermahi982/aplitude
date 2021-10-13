package leetcode;

import java.util.Map;
import java.util.TreeMap;

public class Shuffle_String {
    public static void main(String[] args) {
        int indices [] = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        String ans = restoreString(s, indices);
        System.out.println(ans);
    }

    static String restoreString(String s, int[] indices) {

//        TreeMap<Integer, Character> tm = new TreeMap<>();
//
//        if(indices.length !=  s.length()){
//            return s;
//        }
//        for (int i=0;i<s.length();i++){
//            tm.put(indices[i], s.charAt(i));
//        }
//
//        String res = "";
//        for (Map.Entry<Integer, Character> entry : tm.entrySet()){
//            res += entry.getValue();
//        }
//
//        return res;
        char arr[] = new char[s.length()];

        for (int i=0;i<indices.length;i++){
            arr[indices[i]] = s.charAt(i);
        }

        return String.valueOf(arr);
    }
}
