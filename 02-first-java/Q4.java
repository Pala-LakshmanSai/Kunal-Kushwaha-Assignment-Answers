import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number :");
        double a = scanner.nextDouble();
        System.out.print("Please enter the second number :");
        double b = scanner.nextDouble();
        System.out.print("Please enter the operator :");
        char o = scanner.next().charAt(0);
        double result = 0;
        if (o == '+') {
            result = a + b;
        }
        else if (o == '-') {
            result = a - b;
        }
        else if (o == '*') {
            result = a * b;
        }
        else if (o == '/') {
            if (b != 0){
                result = a / b;
            }
            else{
                System.out.println("Division by zero is not allowed!");
            }
        }
        else {
            System.out.println("enter a valid operator!");
        }
        System.out.println("result =" + result);
        scanner.close();
    }
}

