package string_450;
//Print all the duplicates in the input string

public class duplicate_string_3 {
    static final int NO_OF_CHARS = 256;
    public static void main(String[] args) {
        String a = "mahesh";
        printdup(a);
    }

    private static void printdup(String a) {
        int[] count = new int[NO_OF_CHARS];
        fillcharcount(a,count);
        for(int i=0;i<NO_OF_CHARS;i++){
            if(count[i]>1){
                System.out.println((char)(i) + ", count = " + count[i]);
            }
        }

    }

    private static void fillcharcount(String a, int[] count) {
        for(int i=0;i<a.length();i++){
            count[a.charAt(i)]++;
        }
    }
}
