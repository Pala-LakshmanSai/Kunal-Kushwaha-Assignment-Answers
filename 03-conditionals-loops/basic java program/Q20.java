import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the side length of square :");
        double side = scanner.nextDouble();
        double volume = 6*Math.pow(side, 2);
        System.out.println("volume of sphere :"+  volume);
    }
}
