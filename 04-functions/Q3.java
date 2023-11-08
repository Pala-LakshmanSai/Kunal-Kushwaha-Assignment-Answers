import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the age :");
    int age = scanner.nextInt();
    System.out.println(eligibility(age));
    scanner.close();
    
    }
    static String eligibility(int age){
        if(age >= 18){
            return "Yes, eligible to vote";
        }
        else{
            return "No, not eligible to vote";
        }
    }
}
