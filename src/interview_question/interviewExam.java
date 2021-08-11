package interview_question;

class animal{
    String name = "cow-animal";
    void action(){
        System.out.println(name + " is walking");
    }
}

class cow extends animal{

}

public class interviewExam {
    public static void main(String[] args) {
        cow c = new cow();
        System.out.println(c.name);
    }
}
