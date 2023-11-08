import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first point co ordinates :");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the second point co ordinates :");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double distance = (double)(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        System.out.println("distance = "+distance);
    }
}
