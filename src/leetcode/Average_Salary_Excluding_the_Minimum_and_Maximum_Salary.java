package leetcode;

public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public static void main(String[] args) {
        int salary[] = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
//        [48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000]
        double ans = average(salary);
        System.out.println(ans);
    }

    static double average(int[] salary) {
        double ans = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<salary.length;i++){
            if(salary[i] > max){
                max = salary[i];
            }

            if(salary[i] < min){
                min = salary[i];
            }
        }

        double sum = 0;
        for (int i=0;i<salary.length;i++){
            if(salary[i] > min && salary[i] < max){
                sum += salary[i];
            }
        }

        ans =   sum / (salary.length - 2);
//        System.out.println(res);

        return ans;
    }
}
