import java.util.Scanner;

public class Q18 {
    public static void main(String args[])
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter present value: ");
	double p=scanner.nextInt();
	System.out.print("Enter the interest rate: ");
	double r=scanner.nextInt();
	System.out.print("Enter the time period in years: ");
	double y=scanner.nextInt();
	double f=p*Math.pow((1+r/100),y);
	System.out.print("value is: "+f);
  }
}
