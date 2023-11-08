import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}