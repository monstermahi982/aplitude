package string_450;

import java.util.Arrays;

public class shuffel_6 {
    public static void main(String[] args) {
        String a = "mahesh";
        String b = "monstermahesh";
        boolean c = isShuffledSubString(a,b);
        if(c)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    static boolean isShuffledSubString(String A, String B)
    {
        int n = A.length();
        int m = B.length();
       if (n > m)
            return false;
        else
        {
            A = sort(A);
            for (int i = 0; i < m; i++)
            {
                if (i + n - 1 >= m)
                    return false;
                String str = "";

                for (int j = 0; j < n; j++)
                    str += B.charAt(i + j);

                str = sort(str);

                if (str.equals(A))
                    return true;
            }
        }
        return false;
    }

    static String sort(String inputString)
    {
        char tempArray[] = inputString.toCharArray();

        Arrays.sort(tempArray);

        return String.valueOf(tempArray);
    }
}
