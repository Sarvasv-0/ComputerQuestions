package SeventhChapterQuestions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float average=0f;
        int[] marks =new int[50];
        for(int i =0;i<marks.length;i++){
            System.out.print("Enter marks of student no."+(i+1));
            marks[i]=sc.nextInt();
        }
        for(int i =0;i<marks.length;i++){
            average+=marks[i];
        }
        System.out.println("The Average of marks: "+average);
    }
}