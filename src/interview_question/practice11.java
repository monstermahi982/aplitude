package interview_question;

public class practice11 {
    public static void main(String[] args) {
        String name = "maheshs";
        printdup(name);
    }

    private static void printdup(String name) {
        char array [] = name.toCharArray();
        for(int i=0;i<name.length();i++){
            for(int j=i+1;j<name.length();j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }
}
