import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number :");
        double a = scanner.nextDouble();
        System.out.print("Please enter the first number :");
        double b = scanner.nextDouble();
        if (a > b) {
            System.out.println(a+" is a the largest number");
        }
        else {
            System.out.println(b+" is the largest number");
        }
        scanner.close();
        
    }
}