package company_question;

import java.util.Scanner;

//case 1
//4
//2 1
//2 2
//5 1
//1 3
//output = 1

//case 2
//2
//2 2
//2 2
//output = 1

public class problem23 {
    public static void main(String[] args) {

//        hardcore input
        int array[][] = { {2,1},{2,2},{5,1},{1,3} };

//        user input
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for(int i=0;i<N;i++){
//            for(int j=0;j<array[i].length;j++)
//                array[i][j] = sc.nextInt();

        int Xcamindex = -1;
        for(int i=0;i<array.length;i++)
            if(array[i][0] > Xcamindex)
                Xcamindex = i;

//        finding X campains M1 + M2
        int Xsum = array[Xcamindex][0] + array[Xcamindex][1];

//        adding all M1 exclude Xcamindex
        int Ysum = 0;
        for(int i=0;i<array.length;i++)
                if(i != Xcamindex)
                    Ysum += array[i][0];

//        finding ans
        if(Xsum > Ysum){
            System.out.println(1);
        }else{
            System.out.println(0);
        }




    }
}
