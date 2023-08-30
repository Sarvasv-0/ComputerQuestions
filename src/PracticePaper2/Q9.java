package PracticePaper2;

class CalculateVolume {
    static float Volume(float r){
        return (4/3f)*3.14f*r*r*r;
    }
    static float Volume(float l,float b,float h) {
        return l * b * h;
    }

}
public class Q9 {
    public static void main(String[] args) {
        CalculateVolume.Volume(5); // For Sphere
        CalculateVolume.Volume(2,2,2); // for Cuboid and cube
    }
}
