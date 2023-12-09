import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.print("Enter the principal : ");
        Scanner sc=new Scanner(System.in);
        int P =sc.nextInt();
        System.out.print("Enter the rate of interest : ");
        int R=sc.nextInt();
        System.out.print("Enter the time (in years): ");
        int T=sc.nextInt();
        int I=(P*R*T)/100;
        System.out.println("The simple interest is: "+I);
    }
}