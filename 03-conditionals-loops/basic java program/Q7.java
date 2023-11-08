import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the side length");
        double side = scanner.nextDouble();
        double area = (Math.sqrt(3)/4)*Math.pow(side,2);
        System.out.println("Area of equilatleral triangle :"+area);
    }
}
