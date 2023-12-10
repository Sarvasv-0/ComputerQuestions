package FifthChapterQuestions;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        System.out.println(word.toUpperCase());
    }
}