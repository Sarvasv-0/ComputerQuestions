package FifthChapterQuestions;

import java.util.Scanner;
public class Q2Student {
    Scanner sc=new Scanner(System.in);
    String rollNumber;
    String studentName;
    char grade;
    void acceptRollNumber(){
        System.out.print("Enter your roll number: ");
        rollNumber=sc.next();
    }
    void acceptName(){
        System.out.print("Enter your name: ");
        studentName=sc.nextLine();
    }
    void displayAverage() {
        System.out.print("Enter the total marks: ");
        int totalMarks=sc.nextInt();
        float average=totalMarks/3;
        System.out.printf("Your average is: %f\n",average);
    }
    void displayPercentage() {
        System.out.print("Enter the total marks: ");
        int totalMarks=sc.nextInt();
        float percentage=(totalMarks/300)*100; //note that the percentage will be the same as average
        System.out.printf("Your percentage is: %f\n",percentage);
    }
    void acceptGrade() {
        System.out.print("Enter your grade: ");
        grade=sc.next().charAt(0);
    }
    public static void main(String[] args) {
        Q2Student sarvasv=new Q2Student();
        sarvasv.acceptName();
        sarvasv.acceptRollNumber();
        sarvasv.displayAverage();
        sarvasv.displayPercentage();
        sarvasv.acceptGrade();
    }
}