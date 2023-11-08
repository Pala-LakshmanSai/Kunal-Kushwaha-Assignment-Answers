import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number:");
    int a = scanner.nextInt();
    System.out.print("Enter the second number:");
    int b = scanner.nextInt();
    System.out.println("product is "+product(a, b));
    scanner.close();
    }
    static int product(int a, int b){
        int product = a * b;
        return product;
    }
}