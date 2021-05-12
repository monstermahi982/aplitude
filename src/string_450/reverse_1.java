package string_450;

//reverse a given string

public class reverse_1 {
    public static void main(String[] args) {
        String a = "mahesh";
        reverse1(a,a.length());
    }

    private static void reverse1(String a, int length) {
        for (int i=length-1 ; i>=0 ; i--){
            System.out.print(a.charAt(i));
        }
    }
}
