import java.util.Scanner;
public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Question 2
        // Write a program to read marks of 50 students and store them in an array. Find out the Highest and the lowest scorer.
        byte studentArray[]=new byte[5];
        for(int i = 0; i<studentArray.length;i++) {
            System.out.printf("Enter the marks of student no. %d: ",(i+1));
            studentArray[i]=sc.nextByte();
        }
        int i,j,maxValue = studentArray[0],minValue = studentArray[0];
        for (i = 0; i < studentArray.length; i++) {
            if (studentArray[i] < minValue) {
                minValue = studentArray[i];
            }
        }
        for (j = 0; j < studentArray.length; j++) {
            if (studentArray[j] > maxValue) {
                maxValue = studentArray[j];
            }
        }
        System.out.printf("The Highest scorer is: %d\n",maxValue);
        System.out.printf("The Lowest scorer is: %d",minValue);
    }
}
