import java.util.Scanner;

public class Q9{
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the side length of equilateral triangle :");
        double side = scanner.nextDouble();
        double perimeter = 3*side;
        System.out.println("Perimeter of the equilateral triangle is :"+ perimeter);
    }
}