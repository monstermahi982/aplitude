package leetcode;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder sb = new StringBuilder();
//        sb.append(s);

        String b = "";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        System.out.println(s);

        for(int i=s.length()-1;i>=0;i--){
            b = b.concat(String.valueOf(s.charAt(i)));
        }

//        System.out.println(sb);
        if (s.equals(b)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

                if("amanaplanacanalpanama" == "amanaplanacanalpanama"){
                    System.out.println("true");
                }
    }
}
