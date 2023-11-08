import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the first limit :");
        int firstNum = scanner.nextInt();
        System.out.print("please enter the second limit :");
        int SecondNum = scanner.nextInt();
        for(int i = firstNum; i <= SecondNum; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
        scanner.close();
    }
    static boolean isArmstrong(int number) {
        int temp = number, last, result = 0, length = 0; 
        while (temp > 0){
            temp = temp / 10;
            length++;
        }
        temp =number;
        while (number > 0){
            last = number % 10;
            result += Math.pow(last, length);
            number = number / 10;
        } 
        return result == temp;
    }
}