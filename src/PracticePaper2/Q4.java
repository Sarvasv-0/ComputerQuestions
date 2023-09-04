package PracticePaper2;

import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {
        Employee codeName = new Employee();
        codeName.pan=12345678;
        codeName.name="01010111 01101111 01110111 00100000 01111001 01101111 01110101 00100000 01100110 01101111 01110101 01101110 01100100 00100000 01101001 01110100 00100001";
        codeName.taxIncome=60000;
        codeName.input();
        codeName.calc();
        codeName.display();
    }
}

class Employee {
    Scanner sc = new Scanner(System.in);
    int pan;
    String name;
    double taxIncome;
    double tax;
    void input() {
        System.out.print("Enter your PAN number: ");
        pan = sc.nextInt();
        System.out.print("Enter your Name: ");
        name = sc.nextLine();
        System.out.print("Enter your Taxable Income: ");
        taxIncome = sc.nextDouble();
    }
    void calc() {
        if (taxIncome <= 100000) {
            tax = 0;
        } else if (taxIncome>=100001 && taxIncome<=150000) {
            tax =(((taxIncome-100000)*10)/100);
        } else if (taxIncome>=150001 && taxIncome<=250000) {
            tax=5000+(((150000-taxIncome)*20)/100);
        } else if (taxIncome>250000) {
            tax=25000+(((250000-taxIncome)*30)/100);
        }
    }
    void display() {
        System.out.printf("Your Name is: %s\n", name);
        System.out.printf("Your PAN Number is: %d \n", pan);
        System.out.printf("Your Tax is: %f\n", tax);
        System.out.printf("Your Taxable Income is: %f\n", taxIncome);
    }
}