import java.util.Scanner;

public class Q1Student {
    Scanner sc=new Scanner(System.in);
    private int adno;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;
    private float average;
    private float getavg() {
        average=(m1+m2+m3+m4+m5)/5;
        return average;
    }
    public void readInfo() {
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your admission number: ");
        adno=sc.nextInt();
        System.out.print("Enter Marks in 1st Subject");
        m1=sc.nextInt();
        System.out.print("Enter Marks in 2nd Subject");
        m2=sc.nextInt();
        System.out.print("Enter Marks in 3rd Subject");
        m3=sc.nextInt();
        System.out.print("Enter Marks in 4th Subject");
        m4=sc.nextInt();
        System.out.print("Enter Marks in 5th Subject");
        m5=sc.nextInt();
    }
    public void displayInfo() {
        System.out.print("Name: "+name);
        System.out.print("Admission number: "+adno);
        System.out.print("Marks in 1st subject: "+m1);
        System.out.print("Marks in 2nd subject: "+m2);
        System.out.print("Marks in 3rd subject: "+m3);
        System.out.print("Marks in 4th subject: "+m4);
        System.out.print("Marks in 5th subject: "+m5);
        System.out.print("Average Marks: "+average);
    }
    public static void main(String[] args) {
        
    }
}