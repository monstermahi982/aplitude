package problems_on_arrays;

//    task 11=2

public class problem11 {
    public static void main(String[] args) {
        String s = "11=2";
        int N = 1000;
        char data [] = new char[N];

        for (int i=0; i<s.length();i++){
            data[i] = s.charAt(i);
        }

        int i=0;
        while (data[i] != '='){
            i++;
        }
        System.out.println("------");

    }
}
