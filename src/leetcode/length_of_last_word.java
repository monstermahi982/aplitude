package leetcode;

public class length_of_last_word {
    public static void main(String[] args) {
        String name = "Hello world";
        int ans = find(name);
        System.out.println(ans);
    }

    private static int find(String s) {
        int n=s.length();
        if(n==0) return 0;

        int start,end;

        start=0;
        while(start< n && s.charAt(start)==' ') start++;    //left trim

        end=n-1;
        while(end >=0 && s.charAt(end)==' ') end--;      //right trim

        if(start>end) return 0;

        int pos=end;
        while(pos>=start)
        {
            if(s.charAt(pos)==' ') return end-pos;
            else pos--;
        }

        return end-pos;

    }
}
