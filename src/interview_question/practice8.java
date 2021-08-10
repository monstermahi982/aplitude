package interview_question;

public class practice8 {
    public static void main(String[] args) {
        String name = "abbccbba";
        String rever = "";
        for(int i=name.length()-1;i>=0;i--){
            rever = rever.concat(String.valueOf(name.charAt(i)));
        }
//        ispalindrome(name,rever);
        if(palireverse(name , 0 , name.length()-1)){
            System.out.println("palin");
        }else {
            System.out.println("not");
        }
    }

    private static boolean palireverse(String name, int s, int e) {
        if(s==e || s > e){
            return true;
        }
        if(name.charAt(s) != name.charAt(e)){
            return false;
        }
        return palireverse(name , s+1,e-1);
    }


    private static void ispalindrome(String name, String rever) {
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) != rever.charAt(i)){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("is palinedrome");
    }
}
