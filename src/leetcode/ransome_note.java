package leetcode;

public class ransome_note {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        int array[] = new int[256];

        for (int i=0;i<ransomNote.length();i++){
            int pos = (char) ransomNote.charAt(i);
            array[pos] = array[pos] + 1;
        }

        for (int i=0;i<magazine.length();i++){
            int pos = (char) magazine.charAt(i);
            array[pos] = array[pos] - 1;
        }

        for (int i=0;i<256;i++){
            if (array[i] > 1) {
                return false;
            }

        }

        return true;
    }
}
