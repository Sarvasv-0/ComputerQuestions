import java.util.Scanner;

public class Ch2Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question 1
//        Write a program to add two integers by using class variable.
/*
        Question1.add();
*/

//        Question 2
//        Write a program to subtract a float number from an integer number and get the result in integer by using local variable

/*
        System.out.print("Enter a floating point number: ");
        float x = sc.nextFloat();
        System.out.print("Enter an integer: ");
        int y = sc.nextInt();
        int z = (int) (y-x);
        System.out.println("The Subtraction of x from y is "+z);
*/

//        Question 3
//        Write a program to print your name by creating an object
        Student rollNo39 = new Student();
        rollNo39.setName("Sarvasv");
        System.out.println("My name is: "+rollNo39.getName());


    }
}
class Question1 {
    static int num1 = 100;
    static int num2 = 600;
    public static void add(){
        System.out.println("The Sum of 100 and 600 is: "+ (num1+num2));
    }
}
class Student{
    String name;
    public void setName(String x){
        name = x;
    }
    public String getName(){
        return name;
    }
}