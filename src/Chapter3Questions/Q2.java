package Chapter3Questions;

public class Q2 {
    public float vol(float side){
//        For cube
        return side*side*side;
    }
    public float vol(float radius,float height){
        return 3.14f*radius*radius*height;
    }
    public float vol(float length,float breadth, float height) {
        return length*breadth*height;
    }
    public static void main(String[] args) {
        Q2 obj=new Q2();
        System.out.println(obj.vol(5));
        System.out.println(obj.vol(5,12));
        System.out.println(obj.vol(5,42,11));
    }
}
