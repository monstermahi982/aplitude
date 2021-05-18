package string_450;

//not solved

public class palindrome_8 {
    public static void main(String[] args) {
        String a = "forgeeksskeegfor";
        int ans = longestsubstring(a);
        System.out.println(ans);
    }

    private static int longestsubstring(String a) {
        int max = 1 ,  start = 0;
        for(int i=0;i<a.length();i++){
            for(int j=i;j<a.length();j++){
                int flag = 1;
                for(int k=0;k<(j-i+1)/2;k++)
                    if(a.charAt(i+k) != a.charAt(j-k))
                        flag = 0;
                if(flag != 0 && (j - i +1) > max){
                    start = i;
                    max = j-i+1;
                }
            }
        }
        System.out.println("longest substring is ");
        printsubstring(a,start,start+max-1);
        return max;
    }

    private static void printsubstring(String a, int start, int i) {
        for(int x = start ;x<= i;++i ){
            System.out.println(a.charAt(x));
        }
    }
}
