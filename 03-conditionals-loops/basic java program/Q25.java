import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (true){
            int n = scanner.nextInt();
            if(n == 0){
                break;
            }
            if(n > max){
                max = n;
            }
        }
        System.out.println(max);
    }
    
}
