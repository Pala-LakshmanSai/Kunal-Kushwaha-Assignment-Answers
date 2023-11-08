import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the principle amount :");
        float P = scanner.nextInt();
        System.out.print("Please enter the rate of interest(per year) :");
        float R = scanner.nextFloat()/12;
        System.out.print("Please enter the time(in months) amount :");
        float T = scanner.nextFloat();
        float simpleInterest = (P * R * T)/100;
        System.out.print("simple interest = "+ simpleInterest);
        scanner.close();
    }
}



