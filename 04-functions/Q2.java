import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number :");
    int a = scanner.nextInt();
    System.out.println(evenodd(a));
    scanner.close();
    }
    static String evenodd(int a){
        if(a%2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
