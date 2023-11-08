import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many first fibonacci numbers to be printed :");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i = 3; i <= n; i++) {
            int temp = b;
            b += a;
            a = temp;
            System.out.print(b+" ");
        }
    }
}
