import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inp=sc.nextInt();
        if(inp%2==0) {
            System.out.println("The number you've entered is an even number");
        }
        else {
            System.out.println("The number you've entered is an odd number");
        }
    }
}