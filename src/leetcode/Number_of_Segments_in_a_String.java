package leetcode;

public class Number_of_Segments_in_a_String {
    public static void main(String[] args) {
        String s = "love live! mu'sic forever";
        if(s.length()==0)
            System.out.println(0);
        s+=" ";
        int segment=0;
        for(int i=0;i<s.length();i++)
        {
            if(i>0 && s.charAt(i)==' ' && s.charAt(i-1)!=' ')
                segment++;
        }
        System.out.println(segment);
    }
}
