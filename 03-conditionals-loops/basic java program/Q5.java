import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the base length :");
        double b = scanner.nextDouble();
        System.out.print("please enter the height :");
        double h = scanner.nextDouble();
        double area = b*h;
        System.out.println("Area of parallelogram :"+area);
    }
}
