package company_question;

public class question19 {
    public static void main(String[] args) {
        int array [] = {1,0 , 2 , 2 , 1,1,0,1,0 , 1, 1 , 2 ,1 ,0 ,2,0 , 1, 1 , 2 ,1 ,0 ,2};

//        login
//        int l = 0;
//        int mid = 0;
//        int r = array.length-1;
//        while (mid <= r){
//            switch (array[mid]){
//                case 0:{
//                    int temp = array[l];
//                    array[l] = array[mid];
//                    array[mid] = temp;
//                    l++;
//                    mid++;
//                    break;
//                }
//                case 1:{
//                    mid++;
//                    break;
//                }
//                case 2:{
//                    int temp = array[mid];
//                    array[mid] = array[r];
//                    array[r] = temp;
//                    mid++;
//                    r--;
//                    break;
//                }
//            }
//        }

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == 0){
                count0++;
            }else if(array[i] == 1){
                count1++;
            }else if(array[i] == 2){
                count2++;
            }
        }

        int j=0;

        while (count0 > 0){
            array[j]  =0;
            j++;
            count0--;
        }

        while (count1 > 0){
            array[j++]  =1;
            count1--;
        }

        while (count2 > 0){
            array[j++]  =2;
            count2--;
        }




        for (int i:array) {
            System.out.print(i + " ");
        }
    }
}
