import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the Base area :");
        double BaseArea = scanner.nextDouble();
        System.out.print("Please enter the height of Prism :");
        double height = scanner.nextDouble();
        double volume = BaseArea*height;
        System.out.println("volume of prism "+volume);
    }
}
