import java.util.Scanner;

public class Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of circle :");
        double radius = scanner.nextDouble();
        double perimeter = 2*(Math.PI)*radius;
        System.out.println("Perimeter of the circle is :"+ perimeter);
    }
}