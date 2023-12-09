import java.util.Scanner;
public class Q3 {
    char uselessMethod() {
        Scanner uselessObject=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char uselessVariable=uselessObject.next().charAt(0);
        return uselessVariable;
    }
    public static void main(String[] args) {
        Q3 uselessObjectV2=new Q3();
        System.out.println(uselessObjectV2.uselessMethod());
    }
}