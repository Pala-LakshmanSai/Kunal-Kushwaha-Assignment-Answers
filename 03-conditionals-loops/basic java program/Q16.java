import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the height of cylinder :");
        double h = scanner.nextDouble();
        System.out.print("Please enter the radius of base of the cylinder :");
        double r = scanner.nextDouble();
        double volume = Math.PI*Math.pow(r, 2)*h;
        System.out.println("volume of cone :"+  volume);
    }
}
