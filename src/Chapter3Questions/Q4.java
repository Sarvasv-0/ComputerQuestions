package Chapter3Questions;

import java.util.Scanner;

class Box {
    double len,br,hei, volume;
    public void input() {
        System.out.print("Enter the length: ");
        Scanner sc=new Scanner(System.in);
        len=sc.nextDouble();
        System.out.print("Enter the Breadth: ");
        br=sc.nextDouble();
        System.out.print("Enter the Height: ");
        hei=sc.nextDouble();
    }
    public double vol() {
        volume =len*br*hei;
        return volume;
    }
}
class Cylinder {
    Double radius,height,volume;
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Radius: ");
        radius=sc.nextDouble();
        System.out.print("Enter The height: ");
        height=sc.nextDouble();
    }
    public double vol() {
        volume=3.14*radius*radius*height;
        return volume;
    }
}
class ComputeVol {
    double vol;
    public void addVol(Box v1,Cylinder v2) {
        vol=v1.volume+v2.volume;
        System.out.println("The total Volume is: "+vol);
    }

    public static void main(String[] args) {
        ComputeVol obj1=new ComputeVol();
        Box obj2 =new Box();
        obj2.input();
        obj2.vol();
        Cylinder obj3 =new Cylinder();
        obj3.input();
        obj3.vol();
        obj1.addVol(obj2,obj3);
    }

}
