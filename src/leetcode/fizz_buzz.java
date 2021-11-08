package leetcode;

import java.util.ArrayList;
import java.util.List;

public class fizz_buzz {
    public static void main(String[] args) {
        int a = 3;
        for (String x: fizzBuzz(a)) {
            System.out.print(x);
        }
    }

    static List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                r.add("FizzBuzz");
            }else if(i % 3 == 0){
                r.add("Fizz");
            }else if(i % 5 == 0){
                r.add("Buzz");
            }else {
                r.add(String.valueOf(i));
            }
        }
        return r;
    }
}
