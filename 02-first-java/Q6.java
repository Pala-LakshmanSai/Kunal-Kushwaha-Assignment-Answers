import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the currency value in INR :");
        double INR = scanner.nextDouble(); 
        double USD = 0.012 *  INR;
        System.out.println("USD value of "+INR+" INR is "+USD+"USD");
        scanner.close();
    }
}