import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        double num = scanner.nextDouble();
        System.out.println("enter the power value :");
        double b = scanner.nextDouble();
        double p = Math.pow(num, b);
        System.out.println(p);
    }
}
