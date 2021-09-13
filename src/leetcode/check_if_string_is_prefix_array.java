package leetcode;

public class check_if_string_is_prefix_array {
    public static void main(String[] args) {
        String array [] = {"i","love","leetcode","apples"};
        String s = "iloveleetcode";

        System.out.println(isPrefixString(array , s));
    }

    private static boolean isPrefixString(String[] array, String s) {
//        int i=0;
//        while(i<array.length && s.length()!=0) {
//            if(s.startsWith(array[i])){
//                s = s.substring(array[i].length(), s.length());
//            }else{
//                break;
//            }
//            i++;
//        }
//        return s.length()==0;
//        my approach
        String val = "";
        for(int i=0;i<array.length;i++){
            val = val + array[i];

            if(val.equals(s)){
                return true;
            }
        }
        return false;
    }
}
