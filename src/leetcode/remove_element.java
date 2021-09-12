package leetcode;

public class remove_element {
    public static void main(String[] args) {
        int array[] = {2, 2, 2};
        int val = 0;
//    int ans = findAns(array, val);
//        System.out.println(ans);
//    }

        int ans2 = anothe_approach(array, val);
        System.out.println(ans2);
    }

    //        private static int findAns ( int[] array, int val){
//            int i = 0;
//            int j = array.length - 1;
//            int k = 0;
//            if (array.length == 2) {
//                if (array[0] != val && array[1] != val) {
//                    return k + 2;
//                } else if (array[0] != val && array[1] == val) {
//                    return ++k;
//                } else if (array[0] == val && array[1] != val) {
//                    int temp = array[0];
//                    array[0] = array[1];
//                    array[1] = temp;
//                    return ++k;
//                }
//                return k;
//            }
//            if (array.length == 1) {
//                if (array[0] != val) {
//                    return ++k;
//                }
//                return k;
//            }
//            while (i < j) {
//                k++;
//                if (array[i] == val && array[j] != val) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                    i++;
//                    j--;
//                } else if (array[i] == val && array[j] == val) {
//                    j--;
//                } else if (array[i] != val && array[j] != val) {
//                    i++;
//                    j--;
//                } else if (array[i] != val && array[j] == val) {
//                    i++;
//                }
//            }
//            return k;
//        }
    private static int anothe_approach(int[] A, int elem) {
        int i = 0;
        int j = 0;

        while (j < A.length) {
            if (A[j] != elem) {
                A[i] = A[j];
                i++;
            }

            j++;
        }

        return i;
    }

}

