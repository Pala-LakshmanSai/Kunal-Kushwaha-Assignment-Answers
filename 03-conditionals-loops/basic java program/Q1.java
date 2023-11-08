import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of circle :");
        double radius = scanner.nextDouble();
        double area = Math.PI*(Math.pow(radius,2));
        System.out.println("Area of the circle is :"+area);
    }
}