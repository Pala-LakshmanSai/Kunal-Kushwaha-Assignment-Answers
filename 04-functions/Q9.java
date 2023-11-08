import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number :");
    int a = scanner.nextInt();
    System.out.println(fac(a));
    scanner.close();
    }
    static int fac(int n){
        int fac = 1;
        if(n==0){
            return 1;
        }
        for(int i = 1; i<=n; i++){
            fac *= i;
        }
        return fac;
    }
}
