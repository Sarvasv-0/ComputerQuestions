package SixthChapterQuestions.Q2.pkg1;
import java.util.Scanner;

public class Test {
    public static int thisIsAMethod() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        return num1+num2;
    }
}