import java.util.Scanner;

public class Q22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num = scanner.nextInt();
        int temp =num;
        int sum = 0;
        while (num > 0) {
            sum = sum + (num%10);
            num /= 10;
        }
        int product = 1;
        while (temp > 0) {
            product = product * (temp%10);
            temp /= 10;
        }
        int result = product - sum;
        System.out.println("Result = "+result);
    }
}