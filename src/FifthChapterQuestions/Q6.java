package FifthChapterQuestions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Formula for compound interest --> A=P(1+(r/n))^n
        System.out.print("Enter the Principal amount: ");
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        System.out.print("Enter rate of interest: ");
        int rate=sc.nextInt();
        System.out.print("Enter the time (in months): ");
        int time=sc.nextInt();
        double amount=principal*Math.pow((1+(rate/time)),time);
        System.out.println("The Final Amount is: "+Math.ceil(amount));
        System.out.println("The Compound Interest is: "+(Math.ceil(amount)-principal));
    }
}