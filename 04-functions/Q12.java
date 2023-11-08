import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
    int[] arr = new int[3];
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i<3; i++){
        arr[i] = scanner.nextInt();
    }
    if(pyt(arr)){
    System.out.println("yes");
    }
    else{
    System.out.println("no");
    }
    scanner.close();

    }   
    static boolean pyt(int[] arr){
        int x = arr[0]*arr[0];
        int y = arr[1]*arr[1];
        int z = arr[2]*arr[2];
        if(x == y + z || y == x + z || z == y + x){
        return true;
        }
        else{ 
        return false;
        }
    }
}
