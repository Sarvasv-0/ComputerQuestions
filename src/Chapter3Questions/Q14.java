import java.util.Random;
public class Q14 {
	public static void main(String[] args) {
		Random ran=new Random();
		int[] arr1=new int[20];
		for(int i =0;i<arr1.length;i++) {
			arr1[i]=ran.nextInt(100)+1;
		}
		System.out.println("Numbers generated!");
		System.out.println("Printing.");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}

