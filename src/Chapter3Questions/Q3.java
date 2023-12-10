package Chapter3Questions;

import java.util.Scanner;

class Time {
    int hr,min,hour,minute;
    Scanner x=new Scanner(System.in);
    public void input(int h,int m) {
        hr=h;
        min=m;
    }
    public void addTime(Time t1,Time t2) {
        hour=t1.hr+t2.hr;
        minute=t1.min+t2.min;
    }
    public void display() {
        System.out.printf("%d Hours and %d Minutes",hour,minute);
    }
}
