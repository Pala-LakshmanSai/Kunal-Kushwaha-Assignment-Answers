import java.util.Scanner;

public class Q8 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the marks :");
    int a = scanner.nextInt();
    System.out.println(grade(a));
    scanner.close();
    }   
    static String grade(int marks){
        if(marks>=91&&marks<=100){
            return "AA";
        }
        else if(marks>=81&&marks<=90){
            return "AB";
        }
        else if(marks>=71&&marks<=80){
            return "BB";
        }
        else if(marks>=61&&marks<=70){
            return "BC";
        }
        else if(marks>=51&&marks<=60){
            return "CD";
        }
        else if(marks>=41&&marks<=50){
            return "DD";
        }
        else {
            return "Fail";
        }
    }
}
