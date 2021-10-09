package leetcode;

public class valid_anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s, t));
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
