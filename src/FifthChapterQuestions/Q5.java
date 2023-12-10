package FifthChapterQuestions;

import java.util.Scanner;public class Q5 {
    public static void main(String[] args) {
        System.out.print("Enter a letter: ");
        Scanner sc=new Scanner(System.in);
        Character letter=sc.next().charAt(0);
        if(Character.isLowerCase(letter)){
            System.out.println("The letter is lower-case");
        }
        else if(Character.isUpperCase(letter)){
            System.out.println("The letter is upper case");
        }
        else {
            System.out.println("Invalid Input!!");
        }
    }
}