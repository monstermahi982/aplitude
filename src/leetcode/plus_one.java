package leetcode;

public class plus_one {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,9};

        int array1 [] = plusObe(array);
        for (int i:array1) {
            System.out.print(i + " ");
        }

//        for(int i=0;i<array.length;i++){
//            if(array[i] == array.length){
//                array[i] = array[i] + 1;
//            }
//        }
//
//        for (int i: array) {
//            System.out.print(i + " ");
//        }


//        String s = "";
//        for(int i=0;i<array.length;i++){
//            s = s.concat(String.valueOf(array[i]));
//        }
//        int no = Integer.parseInt(s);
//        no = no +1;
//        s = String.valueOf(no);
//        int[] array2 = new int[s.length()];
//        for (int i=0;i<s.length();i++){
//            array2[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
//        }
//        for (int i:array2) {
//            System.out.print(i + " ");
//        }
    }

    private static int[] plusObe(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                System.out.println(digits[i]++);
                return digits;
            }
            digits[i] = 0;
        }

        System.out.println("this outside");
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
