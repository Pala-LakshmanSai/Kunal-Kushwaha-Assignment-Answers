import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = scanner.nextInt();
        double sum = 0;
        int temp = n;
        int temp2 = n;
        int count = 0;
        while (n>0){
            n=n/10;
            count = count + 1;
        }
        while (temp>0){
            int rem = temp % 10;
            sum = sum + Math.pow(rem,count);
            temp = temp/10;
        }
        
        if(sum == temp2){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
