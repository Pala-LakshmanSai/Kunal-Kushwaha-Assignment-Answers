import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st diagonal length :");
        double d1 = scanner.nextDouble();
        System.out.println("Please enter the 2nd diagonal length :");
        double d2 = scanner.nextDouble();
        double area = (d1*d2)/2;
        System.out.println("area of rhombus :"+area);
    }
}