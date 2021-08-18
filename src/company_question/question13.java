package company_question;

//sum of max subarray

public class question13 {
    public static void main(String[] args) {
        int array [] = {-2,1,-3,4,-1,2,1,-5,4};
        findSubArray(array);
    }

    private static void findSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int maxEnd = 0;
        for(int i=0;i<array.length;i++){
            maxEnd = maxEnd + array[i];
            if(max < maxEnd){
                max = maxEnd;
            }
            if(maxEnd < 0){
                maxEnd = 0;
            }
        }
        System.out.println(max);
    }
}
