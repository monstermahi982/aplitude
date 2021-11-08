package leetcode;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char letters[] = {'c','f','j'}, target = 'a';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int arr[] = new int[256];
        for (int i=0;i< letters.length;i++){
            arr[ (int) letters[i] ]++;
        }
        for(int i=(int) target + 1;i<arr.length;i++){
            if(arr[i] >= 1){
                return (char) i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 1){
                return (char) i;
            }
        }
        return ' ';
    }
}
