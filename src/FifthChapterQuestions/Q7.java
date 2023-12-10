package FifthChapterQuestions;

public class Q7 {
    byte a=11;
    short b=15;
    int c=21;
    int multiply3vars() {
        return a*b*c;
    }
    public static void main(String[] args) {
        Q7 obj =new Q7();
        System.out.println(obj.multiply3vars());
    }
}