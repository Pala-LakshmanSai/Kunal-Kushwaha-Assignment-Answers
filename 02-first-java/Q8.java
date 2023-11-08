import java.util.Scanner;

public class Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toLowerCase().replaceAll(" ", "");
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) != word.charAt(word.length() - i -1)){
                isPalindrome = false;
                break;   
            }
        if (isPalindrome){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
        }
        scanner.close();
    } 
}

