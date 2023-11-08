import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of base of cylinder :");
        double r = scanner.nextDouble();
        System.out.print("Please enter the height of cylinder :");
        double h = scanner.nextDouble();
        double volume = 2*Math.PI*r*h;
        System.out.println("curved surface area of cylinder :"+  volume);
    }
}
