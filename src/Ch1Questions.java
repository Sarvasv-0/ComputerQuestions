import java.util.Scanner;

public class Ch1Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 1
//        Write a program to check if a number input by the user is vowel or consonant

/*
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.println("The Input number is even");
        }
        else {
            System.out.println("The Input number is odd");
        }
*/

//        Question 2
//        Write a Java program to check if a letter input by the user is vowel or consonant

        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("The Input letter is a vowel");
        }
        else {
            System.out.println("The Input letter is a consonant");
        }
    }
}
