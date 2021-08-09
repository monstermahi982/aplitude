package interview_question;

public class practice5 {
    public static void main(String[] args) {
        String name = "maheshmaes";
        nonRepeat(name);
    }

    private static void nonRepeat(String name) {
        int i=0;
        int j=name.charAt(name.length());
        while (i<j){
            if(name.charAt(i) == name.charAt(j)){
                j--;
                break;
            }
        }
        System.out.println();
    }
}
