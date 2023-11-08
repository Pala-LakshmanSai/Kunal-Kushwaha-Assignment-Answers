import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rate of depreciation(per anum) :");
        int r = scanner.nextInt();
        System.out.println("enter the time period(in years) :" );
        int t = scanner.nextInt();
        System.out.println("enter the initial value :");
        int intialPrice = scanner.nextInt();
        double depreciation = intialPrice*Math.pow((1- (double) r/100),t); 
        System.out.println(depreciation);
    }
}
