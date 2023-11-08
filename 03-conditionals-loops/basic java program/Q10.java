import java.util.Scanner;

public class Q10{
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the base length of parallelogram :");
        double b = scanner.nextDouble();
        System.out.print("Please enter the height of parallelogram :");
        double h = scanner.nextDouble();
        double perimeter = 2*(b+h);
        System.out.println("Perimeter of the parallelogram is :"+ perimeter);
    }
}