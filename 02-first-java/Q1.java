import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the number :");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
        scanner.close();
    }
}