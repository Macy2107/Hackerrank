import java.util.*;
import java.util.Scanner;

// Palindrome Number
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int n = scanner.nextInt();
        int m = n;
        int rev = 0, r;
        
        while (n > 0) {
             r = n % 10;
             rev = rev * 10 + r;
             n /= 10;
            
        }
        
        String isPalinDrome = (rev == m) ? "Is Palindrome number" : " Is not Palindrome number";
        System.out.println(isPalinDrome);
    }
}
