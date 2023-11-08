import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number :");
    int n = scanner.nextInt();
    if(prime(n)){
        System.out.println("yes");
    }
    else{
        System.out.println("No");
    }
    scanner.close();
    }
    static boolean prime(int n){
        for(int i = 2; i<n; i++){
            if(n%i == 0)
            return false;
        }
        return true;
    }
}
