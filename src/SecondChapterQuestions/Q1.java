package SecondChapterQuestions;

import java.util.Scanner;

public class Q1 {
    int a,b;
    public static void main(String []args) {
        System.out.print("Enter 1st number: ");
        Scanner sc=new Scanner(System.in);
        Q1 obj1 = new Q1();
        obj1.a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        obj1.b=sc.nextInt();
        System.out.println("Addition of both integers is: "+(obj1.a+obj1.b));
    }
}