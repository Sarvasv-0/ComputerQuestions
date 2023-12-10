package Chapter3Questions;

import java.util.Scanner;

class Temperature {
    public float convert(float temperature) {
        return 1.8f*temperature+32.0f;
    }
}
class Display {
    public static void main(String[] args) {
        Temperature temp=new Temperature();
        System.out.print("Enter the Temperature (in Celcius) : ");
        Scanner sc = new Scanner(System.in);
        float celsTemp=sc.nextFloat();
        System.out.println("The temperature in Farenheit is: "+temp.convert(celsTemp));
    }
}
