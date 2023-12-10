package SeventhChapterQuestions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks =new int[50];
        for(int i =0;i<marks.length;i++){
            System.out.printf("Enter marks of student no.%d: ",(i+1));
            marks[i]=sc.nextInt();
        }
        int max= marks[0];
        int min=marks[0];
        int minPos=0;
        int maxPos= 0;
        for(int i=1;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
                maxPos=i;
            }
        }
        for(int i=1;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
                minPos=i;
            }
        }
        System.out.printf("The Greatest number is %d at %d\n",max,maxPos);
        System.out.printf("The Smallest number is %d at %d\n",min,minPos);
    }
}