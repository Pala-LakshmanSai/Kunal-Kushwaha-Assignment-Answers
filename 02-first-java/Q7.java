import java.util.Scanner;

public class Q7 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=2; i < n; i++){
            int c = a + b;
            System.out.println(c);
            a=b;
            b=c;
        }
        input.close();
    }   
}
