package company_question;

//sorting array 0 , 1 , 2

public class problems18 {
    public static void main(String[] args) {
        int array [] = {0,1,2,0,1,2,0,1,2,0,1,2,};

//        method1

        int l =0 ;
        int r = array.length-1;
        int mid = 0;

        while (mid<=r){
            switch (array[mid]){
                case 0: {
                    int temp = array[l];
                    array[l] = array[mid];
                    array[mid] = temp;
                    l++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2: {
                    int temp = array[mid];
                    array[mid] = array[r];
                    array[r] = temp;
                    r--;
                    break;
                }
            }
        }


//        method 2

        int count0 = 0 , count1 = 0 , count2 = 0;

        for (int i=0;i<array.length;i++){
            if(array[i] == 0){
                count0++;
            }else if(array[i] == 1){
                count1++;
            }else if(array[i] == 2){
                count2++;
            }
        }

        int j =0;
        while (count0 > 0){
            array[j++] = 0;
            count0--;
        }
        while (count1 > 0){
            array[j++] = 1;
            count1--;
        }
        while (count2 > 0){
            array[j++] = 2;
            count2--;
        }


        for (int i:array) {
            System.out.print(i + " ");
        }
    }
}
