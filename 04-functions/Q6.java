import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius :");
    int r = scanner.nextInt();
    System.out.println(circle(r));
    scanner.close();
    }
    static double circle(int n){
        double area = Math.PI*Math.pow(n, 2);
        return area;
    }
}
