import java.util.Scanner;

public class Q12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the side length of square :");
        double side = scanner.nextDouble();
        double perimeter = 4*side;
        System.out.println("Perimeter of square is :"+ perimeter);
    }
}