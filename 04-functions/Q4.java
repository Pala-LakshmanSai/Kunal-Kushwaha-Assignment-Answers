import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number:");
    int a = scanner.nextInt();
    System.out.print("Enter the second number:");
    int b = scanner.nextInt();
    System.out.println("sum is "+add(a, b));
    scanner.close();
    }
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}