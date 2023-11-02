import java.util.Scanner;
public class Q1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        // Question 1
        // Write a program to read marks of 50 students and store them in an array. Calculate the average marks.
        
        byte[] studentMarks = new byte[50];
        for(int i = 0;i<studentMarks.length;i++) {
            System.out.printf("Enter the Marks of Student no. "+(i+1)+": ");
            studentMarks[i]=sc.nextByte();
        }
        int temp=0;
        for(int i=0;i<studentMarks.length;i++) {
            temp += studentMarks[i];
        }
        temp/=50;
        System.out.printf("The Average of all marks is: %d",temp);
    }
}
