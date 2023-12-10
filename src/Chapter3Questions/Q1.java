package Chapter3Questions;

import java.util.Scanner;

public class Q1 {
    public int add(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        Q1 obj1=new Q1();
        int sum= obj1.add(sc.nextInt(),sc.nextInt());
        System.out.println("The addition of two numbers is: "+sum);
    }
}
