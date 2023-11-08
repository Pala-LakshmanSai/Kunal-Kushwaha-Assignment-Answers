import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        //npr = n!/(n-r)!
        //ncr = n!/((n-r)!r!)
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n :"); 
        int n = scanner.nextInt();
        System.out.println("enter r :");
        int r = scanner.nextInt();
        int num = fac(n);
        int den1 = fac(n-r);
        int den2 = fac(n-r)*fac(r);
        int npr = num/den1;
        int ncr = num/den2;
        System.out.println("npr = "+npr);
        System.out.println("ncr = "+ncr);
    }   
    static int fac(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }  
}
