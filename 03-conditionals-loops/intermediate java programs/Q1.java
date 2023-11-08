import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = scanner.nextInt();
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac = fac*i;
        }
        System.out.println("factorial of "+num+" is "+fac);
    }
}