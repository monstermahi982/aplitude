package company_question;

import java.util.HashMap;
import java.util.Map;

public class question3 {
    public static void main(String[] args) {
        String name = "maheshmmmmmm";
        print_duplicate(name);
    }

    private static void print_duplicate(String name) {
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<name.length();i++){
            if(hm.containsKey(name.charAt(i))){
                hm.put(name.charAt(i) , hm.get(name.charAt(i)) + 1);
            }else {
                hm.put(name.charAt(i) , 1);
            }

        }
        for(int i=0;i<hm.size();i++){
            if(hm.get(name.charAt(i)) > 1){
                System.out.println(name.charAt(i) + " " +hm.get(name.charAt(i)));
            }
        }
    }
}
