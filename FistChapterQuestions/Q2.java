import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter a letter: ");
        Scanner sc=new Scanner(System.in);
        char inp=sc.next().charAt(0);
        inp=Character.toLowerCase(inp);
        if(inp =='a'||inp=='e'||inp=='i'||inp=='o'||inp=='u'){
            System.out.println("The letter is a vowel");
        }
        else {
            System.out.println("The letter is a consonant");
        }
    }
}