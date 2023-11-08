import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        char ch;
        String nstr = "";
        for(int i=0; i<str.length(); i++){
            nstr = str.charAt(i) + nstr;  
        } 
        System.out.println(nstr);
    }
}
