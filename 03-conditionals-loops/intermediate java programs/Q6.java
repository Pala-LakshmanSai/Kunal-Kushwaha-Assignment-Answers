import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        double commisionPercent;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the total sales value :");
        int totalSales = scanner.nextInt();
        System.out.println("enter the commision value :");
        int commision = scanner.nextInt();
        commisionPercent = ((commision*100)/totalSales);
        System.out.println("commision percentage = "+commisionPercent+"%");

    }
}
