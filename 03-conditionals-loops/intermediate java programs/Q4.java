import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the original price :");
        double op = scanner.nextDouble();
        System.out.print("enter the discounted price :"); 
        double dp = scanner.nextDouble();
        double discount = op-dp;
        double discountpercent = (dp/op)*100;
        System.out.println("the discount is $ "+discount+" or discount percentage is "+discountpercent+" %");
    }
}
