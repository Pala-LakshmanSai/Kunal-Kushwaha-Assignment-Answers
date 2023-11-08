import java.util.Scanner;

public class Q13 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number :");
    int a = scanner.nextInt();
    System.out.print("Enter the second number :");
    int b = scanner.nextInt();
    prime(a,b);
    scanner.close();
    }
    static void prime(int a, int b){
        for(int i = a; i <= b; i++){
            boolean isPrime = true;
            if(i<=0)
            isPrime = false;
            for (int j = 2; j*j <= i; j++){
                if(i%j == 0)
                isPrime = false;
            }
            if(isPrime) 
            System.out.println(i);
        }

    }
}
