package PracticePaper2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.print("Enter Your Choice (1 for regular triangle and 2 for inverted triangle) : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1){
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+ " ");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+ " ");
                }
                System.out.println();
            }
        }
    }
}
