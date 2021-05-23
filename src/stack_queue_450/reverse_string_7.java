package stack_queue_450;

public class reverse_string_7 {
    public static void main(String[] args) {
        String name = "mahesh";
        reverse(name , name.length());
    }

    private static void reverse(String name, int n) {
        char array [] = new char[n];
        int top = 0;
        for(int i=0;i<n;i++){
            array[i] = name.charAt(i);
            top++;
        }

        for(int i = n -1 ; i>= 0;i--)
            System.out.print(array[i]);
    }
}
