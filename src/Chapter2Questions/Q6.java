package Chapter2Questions;

public class Q6 {
    int num1=25;
    float num2=24.43f;
    double num3=71.02d;

    public int getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public double getNum3() {
        return num3;
    }
    public double calc(double x) {
        return x*num3;
    }

    public int sum(int a,int b){
        return a+b+num1;
    }

    public static void main(String[] args) {
        Q6 obj1 = new Q6();
        System.out.println(obj1.getNum1());
        System.out.println(obj1.getNum2());
        System.out.println(obj1.getNum3());
        System.out.println(obj1.calc(28.2f));
        System.out.println(obj1.sum(29,38));
    }
}
