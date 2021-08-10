package interview_question;

public class practice9 {
    public static void main(String[] args) {
        String name = "monster is bad";
        countChar(name);
    }

    private static void countChar(String name) {
        int count = 0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
