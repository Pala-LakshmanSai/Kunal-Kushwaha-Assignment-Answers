import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of subjects :");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        for(int i=0; i<n; i++){
            marks[i]=scanner.nextInt();
        }
        int totalmarks = 0;
        for(int mark : marks){
            totalmarks = totalmarks + mark;
        }
        double CGPA = (double)totalmarks/10;
        System.out.println(CGPA);
    }
}
