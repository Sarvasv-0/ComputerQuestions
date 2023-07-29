import java.util.Scanner;

public class Ch1Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 1
//        Write a program to check if a number input by the user is even or odd

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
/*

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("first number: "+num1+" and second number: "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("first number: "+num1+" and second number: "+num2);
*/

//        Question 4
//        Write a function in Java that accepts length, height and width of a cuboid and returns the surface area and volume
/*
        System.out.print("Enter the Length of Cuboid: ");
        int x = sc.nextInt();
        System.out.print("Enter the Height of Cuboid: ");
        int y = sc.nextInt();
        System.out.print("Enter the Width of Cuboid: ");
        int z = sc.nextInt();
//        for surface area
        System.out.println("The surface area of the cuboid is: "+q4_SurfaceArea(x,y,z));
//        for volume
        System.out.println("The volume of the cuboid is: "+q4_Volume(x,y,z));
*/

//        Question 5
//        Write a program that take principal amount, interest rate and duration from user and print the simple interest
/*

        int principal,rate,time;
        System.out.print("Enter the principal amount: "); principal = sc.nextInt();
        System.out.print("Enter the interest rate: "); rate = sc.nextInt();
        System.out.print("Enter the time (in years): "); time = sc.nextInt();

        System.out.println("The Simple Interest is: " + (principal*rate*time/100));

*/

//        Question 6
//        Write a program that takes total marks and obtained marks of a student and print the grade A++, A+, A, B+, B, C, D according to the following slab
//        A++ > 90
//        A+ > 75
//        A > 60
//        B+ > 50
//        B > 45
//        C > 35
//        D < 35

/*
        int totalMarks = sc.nextInt();
        float obtainedMarks = sc.nextInt();
        float percentage = (obtainedMarks/totalMarks)*100.0f;
        if (percentage>=90){
            System.out.println("Your grade is A++");
        } else if (percentage<90 && percentage>=75) {
            System.out.println("Your grade is A+");
        } else if (percentage<75 && percentage>=60) {
            System.out.println("Your grade is A");            
        } else if (percentage<60 && percentage>=50) {
            System.out.println("Your grade is B+");
        } else if (percentage<50 && percentage>=45) {
            System.out.println("Your grade is B");
        } else if (percentage<45 && percentage>=35) {
            System.out.println("Your grade is C");
        } else if (percentage<35) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Percentage invalid!");
        }
*/

//        Question 7
//        Write a calculator program that takes as input two numbers and one operator to perform mathematical operation and prints the calculated result

/*
        float x,y;
        System.out.print("Enter the first number: ");x = sc.nextFloat();
        System.out.print("Enter the second number: ");y = sc.nextFloat();
        System.out.print("Enter the operator (+,-,*,/) : ");char op = sc.next().charAt(0);
        if (op=='+'){
            System.out.println(x+y);
        }
        else if (op=='-'){
            System.out.println(x-y);
        }
        else if (op=='*'){
            System.out.println(x*y);
        }
        else if (op=='/'){
            System.out.println(x/y);
        } else if (op=='%') {
            System.out.println(x%y);
        } else {
            System.out.println("Invalid Input!");
        }
*/

//        Question 8
//        Write a program in Java to display fibonacci series up to 10 numbers

/*
        int a=0,b=1,c,term;
        System.out.print("Enter a term for fibonacci series: ");
        term = sc.nextInt();
        for (int i = 0; i < term; i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
*/

//        Question 9
//        Write a program to check if the given number is a palindrome number

/*
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse=0;

        for (;num != 0; num/=10){
            reverse=reverse*10 + num%10;
        }

         if (num == reverse) {
            System.out.println("The number you entered is a palindrome number.");
        } else {
            System.out.println("The number you entered is not a palindrome number.");
        }
*/

//        Question 10
//        Write a program to check if the given number is an armstrong number.

/*
        int num,rem,og,temp=0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        og=num;
        while(num>0){
            rem=num%10;
            temp= (int) (Math.pow(rem,3)+temp);
            num/=10;
        }
        if (og==temp){
            System.out.println("The Number you entered is an Armstrong Number");
        }
        else {
            System.out.println("The Number you entered is not an Armstrong Number");
        }*/

//        Question 11
//        Write a method which accepts three numbers and returns the average

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        System.out.println("The Average is: "+average(num1,num2,num3));

    }
    public static int q4_SurfaceArea(int l, int h, int w){
//        Calculating surface area
//        S = 2(ab+ac+bc)
        return 2*l*h + 2*h*w + 2*l*w;
    }
    public static int q4_Volume(int l, int h, int w){
//        Calculating Volume
//        V = a*b*c
        return l*h*w;
    }
    public static int average(int x,int y,int z){
        return (x+y+z)/3;
    }
}
