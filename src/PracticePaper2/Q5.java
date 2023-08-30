package PracticePaper2;

import java.util.Scanner;
import java.lang.Math;

class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    float m1,m2,m3,maximum,average;

    void askDetails() {
        System.out.print("Enter your Name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter The Marks of first Subject: ");
        m1= sc.nextFloat();
        System.out.print("Enter The Marks of Second Subject: ");
        m2=sc.nextFloat();
        System.out.print("Enter The Marks of third Subject: ");
        m3=sc.nextFloat();
    }

    void compute(){
        average = (m1+m2+m3)/3;
        maximum = Math.max(m1,m2);
        maximum = Math.max(maximum,m3);
    }
    Student() {
        name="Default";
        age=15;
        m1=0;
        m2=0;
        m3=0;
    }

    void display(){
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.printf("The marks you got in first subject: %f%n",m1);
        System.out.printf("The marks you got in second subject: %f%n",m2);
        System.out.printf("The marks you got in third subject: %f%n",m3);
        System.out.printf("Your Average is: %f%n",average);
        System.out.printf("Yhe Maximum is: %f%n", maximum);

    }
}

public class Q5 {
    public static void main(String[] args) {
        Student codeName = new Student();
        codeName.askDetails();
        codeName.compute();
        codeName.display();
    }
}
