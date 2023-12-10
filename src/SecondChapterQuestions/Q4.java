package SecondChapterQuestions;

import java.util.Scanner;

public class Q4 {
    private int num1,num2;
    public void setVars(int x,int y) {
        num1=x;
        num2=y;
    }
    public void getVars() {
        System.out.println("Number 1="+num1);
        System.out.println("Number 2="+num2);
    }
    public static void main(String[] args) {
        Q4 obj1=new Q4();
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        obj1.setVars(sc.nextInt(),sc.nextInt());
        obj1.getVars();
    }
}