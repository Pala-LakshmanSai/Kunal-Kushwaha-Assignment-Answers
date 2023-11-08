import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of sphere :");
        double r = scanner.nextDouble();
        double volume = (double)4/3*Math.PI*Math.pow(r, 3);
        System.out.println("volume of sphere :"+  volume);
    }
}
