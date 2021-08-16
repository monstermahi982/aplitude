package company_question;

//accentare question
//Find the frequency of character in a string.
//data := input string = "mahesh";
//            output = m=1,a=1,h2,e=1,s=1

public class question8 {
    public static void main(String[] args) {
        String name = "mahesh";
        int [] array = new int[256];
        for(int i=0;i<name.length();i++){
            int number = (int) name.charAt(i);
            array[number] = array[number] +1;
        }
        for (int i=0;i<array.length;i++){
            if(array[i] != 0){
                System.out.println((char) i + "=" +  array[i]);
            }
        }
    }
}
