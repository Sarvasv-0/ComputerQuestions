package Assessment2;
import java.util.Scanner;

class Ch5Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question 1
//        Write a program to ask a user to input a word and convert the word into all uppercase letters. Print the output to the screen.
/*
        System.out.print("Enter a Word: ");
        String word=sc.next();
        System.out.println("The upper case for the word is: "+word.toUpperCase());
*/

//        Question 2
/*
        Create a class Student with functions to accept character and String data. The class should have methods to convert String accepted into various data types. Call appropriate methods to perform following:
        [a] Accept student roll number as a String
        [b] Accept Student Name
        [c] Accept total marks and calculate and display average by dividing by 3
        [d] Accept total marks and calculate and display percentage marks
        [e] Accept grade as a character
*/
/*
        Student ravi = new Student();
        ravi.acceptRollNumber();
        ravi.acceptName();
        ravi.displayAverageByTotalMarks();
        ravi.displayPercentageByTotalMarks();
        ravi.acceptGrade();
*/

//        Question 3
//        Write a method in Java that takes a character data type as input and returns what exactly the character contains, like letter or digit or white space
/*
        System.out.print("Enter a character: ");
        char x=sc.next().charAt(0);
        System.out.println("The Character contains a "+checkCharacter(x));
*/

//        Question 4
//        Write a program in Java to find out the square root of a given number.

/*
        System.out.print("Enter a double value: ");
        double num = sc.nextDouble();
        System.out.println("The Square root of the number is: "+Math.sqrt(num));
*/

//        Question 5
//        Write a program in Java to check the given letter is uppercase or lowercase letter

        


    }
    static String checkCharacter(char x) {
        String result;
        if (x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9') {
            result="Digit";
        } else if (x==' ') {
            result="White Space";
        } else {
            result="Either a letter or None of the Above";
        }
        return result;
    }
}
class Student {
    Scanner sc = new Scanner(System.in);
    String rollNumber;
    String nameOfStudent;
    int totalMarks;
    float average;
    float percentage;
    char grade;
    void acceptRollNumber() {
        System.out.print("Enter your Roll number: ");
        rollNumber=sc.nextLine();
    }
    void acceptName() {
        System.out.print("Enter your name: ");
        nameOfStudent=sc.nextLine();
    }
    void displayAverageByTotalMarks() {
        System.out.print("Enter the total marks you got: ");
        totalMarks =sc.nextInt();
        average = totalMarks/3.0f;
        System.out.println("Your Average is: " + average);
    }
    void displayPercentageByTotalMarks() {
        System.out.println("Enter the total marks you got: ");
        totalMarks=sc.nextInt();
        percentage=totalMarks/3.0f;
        System.out.printf("You have attained %f %%",percentage);
    }
    void acceptGrade() {
        System.out.print("Enter the grade you have got: ");
        grade = sc.next().charAt(0);
    }
}