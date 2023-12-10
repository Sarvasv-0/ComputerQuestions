package Chapter3Questions;

import java.util.Scanner;

class Distance {
    float feet,inch;
    double centi;
    private void input() {
        System.out.print("Enter the Feet part of the distance: ");
        Scanner sc=new Scanner(System.in);
        feet =sc.nextFloat();
        System.out.print("Enter the Inch part of the distance: ");
        inch=sc.nextFloat();
    }
    public static void main(String[] args) {
        Distance obj=new Distance();
        obj.input();
        obj.convert();
    }
    public void convert() {
        centi=inch*2.54f+feet*30.48f;
        System.out.println("The Length in Centimeters is: "+centi);
    }

}
