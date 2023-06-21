import java.util.Scanner;

public class Ch1Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 1
//        Write a program to check if a number input by the user is vowel or consonant

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.println("The Input number is even");
        }
        else {
            System.out.println("The Input number is odd");
        }


    }
}
