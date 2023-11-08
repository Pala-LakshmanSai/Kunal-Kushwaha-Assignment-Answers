import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the value of n :");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i<n ; i++ ){
            int num = scanner.nextInt();
            sum = sum + num;
        }
        int average = sum / n;
        System.out.println("the average of given "+n+" numbers is "+ average);
    }
}