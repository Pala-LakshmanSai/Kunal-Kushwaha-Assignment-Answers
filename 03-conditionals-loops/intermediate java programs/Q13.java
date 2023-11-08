import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter hoe many numbers to be added :");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + scanner.nextInt();
        }
        System.out.println(sum);
    }
}
