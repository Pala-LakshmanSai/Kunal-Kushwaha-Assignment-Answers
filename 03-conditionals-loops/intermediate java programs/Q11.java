import java.util.Scanner;

public class Q11 {
    public static void main(String args[])
    {
        double principal = 10000, rate = 10.25, time = 5;
        double CI = principal *(Math.pow((1 + rate / 100), time));
        System.out.println("Compound Interest is "+ CI);
    }
}

