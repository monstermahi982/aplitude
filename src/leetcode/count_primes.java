package leetcode;

public class count_primes {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(countPrimes(n));
    }

    static public int countPrimes(int n) {
        int count = 0;

        for (int i=1;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int n) {
        int m=n/2;
        if(n==0||n==1){
            return false;
        }else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
