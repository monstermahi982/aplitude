package string_450;

public class count_say_7 {
    public static void main(String[] args) {
        String a = "11225533333";
        countANDsay(a);
    }

    private static void countANDsay(String a) {
        int array [] = new int[256];
        for(int i=0;i<a.length();i++){
            int x = (int) a.charAt(i);
            array[x]++;
        }
        for (int j=0;j<array.length;j++) {
            if(array[j] != 0){
                char c = (char) j;
                System.out.println(c + " -> " + array[j]);
            }
        }
    }
}
