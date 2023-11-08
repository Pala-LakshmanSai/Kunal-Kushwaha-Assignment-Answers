import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the base length :");
        double base = scanner.nextDouble();
        System.out.print("please enter the height :");
        double height = scanner.nextDouble();;
        double area = (base * height) / 2;
        System.out.println("The area of the isosceles triangle is " + area);
    }
}
