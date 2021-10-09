package leetcode;

public class find_the_difference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));



    }

    static char findTheDifference(String s, String t) {
        int array[] = new int[256];

        for (int i=0;i<s.length();i++){
            int pos = (char) s.charAt(i);
            array[pos] = array[pos] + 1;
        }

        for (int i=0;i<t.length();i++){
            int pos = (char) t.charAt(i);
            array[pos] = array[pos] - 1;
        }

        for (int i=0;i<256;i++){
            if (array[i] < 0) {
                return (char) i;
            }

        }
        return 'A';
    }
}
