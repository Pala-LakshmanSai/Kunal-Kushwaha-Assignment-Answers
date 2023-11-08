import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 1;
        for(int i = 2; i<num; i++){
            if(num%i==0){
                sum = sum * i;
            }
        }
        if(sum == num){
            System.out.println("yes, it is a perfect number");
        }
        else{
            System.out.println("No");
        }
    }
}
