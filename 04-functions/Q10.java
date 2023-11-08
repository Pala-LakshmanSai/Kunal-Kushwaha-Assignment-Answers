import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number :");
    int n = scanner.nextInt();
    System.out.println(Palindrome(n));
    scanner.close();
    }
    static String Palindrome(int n){
        int rem;
        int temp = n;
        int revnum=0;
        while(n>0){
            rem = n%10;
            n = n/10; 
            revnum = revnum*10 + rem;
        }
        if(revnum == temp){
            return "yes";
        }
        else{
            return "No";
        }
    }
}
