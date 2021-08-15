package company_question;

public class question5 {
    public static void main(String[] args) {
        String name = "mahesh";
//        reverse(name);
        another_reverse(name);
    }

    private static void another_reverse(String name) {
        char array [] = name.toCharArray();
        int start = 0;
        int end = array.length-1;
        while (start < end || start != end){
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (char i:array) {
            System.out.print(i + " ");
        }
    }

    private static void reverse(String name) {
        for (int i= name.length() -1 ;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
