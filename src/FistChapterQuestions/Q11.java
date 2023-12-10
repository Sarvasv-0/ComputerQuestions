package FistChapterQuestions;

import java.util.Scanner;

public class Q11 {
    public static void method() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float average=(a+b+c)/3;
        System.out.println("The average is: "+average);
        // return average;
    }
    public static void main(String []args) {
        method();
    }
}