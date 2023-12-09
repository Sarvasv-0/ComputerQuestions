import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of marks: ");
        int total=sc.nextInt();
        System.out.print("Enter obtained marks: ");
        float marks=sc.nextFloat();
        float percentage=(marks/total)*100;
        String grade="D";
        if(percentage>90) {
            grade="A++";
        }
        else if(percentage>75 && percentage<90) {
            grade="A+";
        }
        else if(percentage<75&&percentage>60) {
            grade="A";            
        }
        else if(percentage<60 && percentage>50) {
            grade="B+";
        }
        else if(percentage>45&&percentage<50) {
            grade="B";
        }
        else if(percentage<45&&percentage>35) {
            grade="C";
        }
        else {
            grade="D";
        }
        System.out.print("Your grade is: "+grade);
    }
}