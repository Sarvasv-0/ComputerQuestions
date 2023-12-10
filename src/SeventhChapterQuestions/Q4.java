package SeventhChapterQuestions;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n=sc.nextInt();
        String[] names =new String[n];
        char[] genders=new char[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the gender of the person (B/G): ");
            genders[i]=sc.next().charAt(0);
            System.out.printf("Enter the name of person no. %d: ",i);
            names[i]=sc.nextLine();            
            genders[i]=Character.toUpperCase(genders[i]);
            if(genders[i]!='B' || genders[i]!='G') {
                System.out.println("No place for aliens");
                System.exit(0);
            }
        }
        
        for(int i =0;i<n;i++) {
            System.out.println("Printing names of THE BOYS!");
            if(genders[i]=='B') {
                System.out.println(names[i]);
            }
            else {
                continue;
            }
        }
        
        for(int i =0;i<n;i++) {
            System.out.println("I don't even know what to write here");
            if(genders[i]=='G') {
                System.out.println(names[i]);
            } 
            else {
                continue;
            }
        }
    }
}