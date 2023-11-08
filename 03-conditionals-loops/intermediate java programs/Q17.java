import java.util.Scanner;

public class Q17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = scanner.nextInt();
        int last;
        int revnum = 0;
        while (num>0){
            last = num % 10;
            num = num/10;
            revnum = revnum*10+last;
        }
        System.out.println(revnum);
    }
}