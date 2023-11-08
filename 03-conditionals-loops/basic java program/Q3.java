import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter length of the rectangle :");
        double l = scanner.nextDouble();
        System.out.print("enter breadth of the rectangle :");
        double b = scanner.nextDouble();
        double area = l*b;
        System.out.println("area of the rectangle :"+area);
    }
}
