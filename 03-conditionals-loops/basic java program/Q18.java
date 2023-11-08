import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the base area of pyramid :");
        double basearea = scanner.nextDouble();
        System.out.print("Please enter the height of pyramid :");
        double height = scanner.nextDouble();
        double volume = (double)1/3*basearea*height;
        System.out.println("volume of pyramid :"+  volume);
    }
}
