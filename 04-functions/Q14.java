import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number :");
    int a = scanner.nextInt();
    System.out.println(sum(a));
    scanner.close();
    }
    static int sum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        } 
        return sum;
    }
}
