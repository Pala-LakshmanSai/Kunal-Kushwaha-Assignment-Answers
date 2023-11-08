import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter the name :");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", How do you do?");
        scanner.close();
    }
}