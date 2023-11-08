import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = scanner.nextInt();
        System.out.print("Enter the second number :");
        int b = scanner.nextInt();
        System.out.print("Enter the third number :");
        int c = scanner.nextInt();
        System.out.println("maximum number = "+max(a,b,c));
        System.out.println("minimum number = "+min(a,b,c));
        scanner.close();
        
    }
    static int max(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }
    static int min(int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
