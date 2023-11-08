import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of numbers :");
        int N = scanner.nextInt();
        int[] lis = new int[N];
        for(int i=0; i<N; i++){
            lis[i] = scanner.nextInt();
        }
        int negsum = 0;
        int evenpos = 0;
        int oddpos = 0;
        for(int i=0; i<N; i++){
            if(lis[i]<0){
                negsum = negsum  + lis[i];
            }
            else{
                if(lis[i]%2==0){
                    evenpos += lis[i]; 
                }
                else{
                    oddpos += lis[i];
                }
            }
        }    
        System.out.println(negsum);        
        System.out.println(evenpos);
        System.out.println(oddpos);
        
    }
}
