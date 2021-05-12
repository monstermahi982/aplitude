package string_450;

public class cyclic_rotate_5 {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "DCABE";
        if(array_rotation(a,b)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    private static boolean array_rotation(String a, String b) {
        if(a.length() == b.length() && (a+b).indexOf(b) != -1){
            return true;
        }else{
            return false;
        }

    }
}
