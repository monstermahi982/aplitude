package interview_question;

public class practice6 {
    public static void main(String[] args) {
        String name = "aaabccddggaaaa";
        ans(name);
    }

    private static void ans(String name) {
        String ans = "";
        int count = 1;
        for(int i=0;i<name.length()-1;i++){
            if(name.charAt(i) == name.charAt(i+1)){
                count++;
            }else {
                ans = ans.concat(String.valueOf(name.charAt(i)) + count);
                count = 1;
            }
        }
        ans = ans.concat(String.valueOf(name.charAt(name.length()-1)) + count);
        System.out.println(ans);
    }
}
