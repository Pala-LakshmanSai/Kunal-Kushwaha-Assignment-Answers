import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = scanner.nextInt();
        boolean isleap = false;
        if(num%4==0){
            if(num%100==0){
                if(num%400==0){
                    isleap = true;
                }
                else{
                    isleap = false;
                }
            }
            else{
                isleap = true;
            }
        }
        else{
            isleap = false;
        }
        if(isleap){
                System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
