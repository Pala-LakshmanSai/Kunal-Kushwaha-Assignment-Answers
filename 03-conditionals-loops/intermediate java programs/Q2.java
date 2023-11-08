/*
   calculate electricity bill
    1 to 100 units – Rs. 10/unit
    100 to 200 units – Rs. 15/unit
    200 to 300 units – Rs. 20/unit
    above 300 units – Rs. 25/unit
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the units consumed :");
        int units = scanner.nextInt();
        int price = 0;
        if(units <= 100){
            price = units*10;
        }
        else if (units > 100 && units <= 200){
            price = 100*10 + (units - 100)*15;
        }
        else if (units > 200 && units <= 300 ){
            price = 100*10 + 100*15 + (units - 200)*20;
        }
        else {
            price = 100*10 + 100*15 + 100*25 + (units - 300)*25;
        }
        System.out.println(price);
    }
}
