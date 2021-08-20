package company_question;

//accentare coding question;
//char replace

public class question16 {
    public static void main(String[] args) {
        String name = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        String newName = "";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == ch1){
                newName += ch2;
            }else if(name.charAt(i) == ch2){
                newName += ch1;
            }else {
                newName += name.charAt(i);
            }
        }
        System.out.println(newName);
    }
}
