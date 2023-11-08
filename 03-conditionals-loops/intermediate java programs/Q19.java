import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number :");
        int num2 = scanner.nextInt();
        int HCF=0;
        for(int i=1; i<num1 || i<num2; i++){
            if(num1%i==0 && num2%i==0){
                HCF = i;    
            }
        }
        System.out.println(HCF);
    }
}
