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

/*
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("The Input letter is a vowel");
        }
        else {
            System.out.println("The Input letter is a consonant");
        }
*/

//        Question 3
//        Write a program to swap values of two variables without creating third variable
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("first number: "+num1+" and second number: "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("first number: "+num1+" and second number: "+num2);
    }
}
