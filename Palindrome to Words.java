import java.util.*;
import java.util.Scanner;

// Palindrome Number
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int n = scanner.nextInt();
        int m = n;
        int r;
        // int rev = 0, r;
        String s = "";
        
        while (n > 0) {
             r = n % 10;
            //  rev = rev * 10 + r;
            //  n /= 10;
             n = n / 10;
             s = s + r;
        }
        
        /*String isPalinDrome = (rev == m) ? "Is Palindrome number" : " Is not Palindrome number";
        System.out.println(isPalinDrome);*/
        System.out.println(s);
        
        char check;
        for (int i = s.length() - 1; i >= 0; i--) {
            check = s.charAt(i);
            switch(check) {
                case '0': System.out.println("Zero");
                break;
                case '1': System.out.println("One");
                break;
                case '2': System.out.println("Two");
                break;
                case '3': System.out.println("Three");
                break;
                case '4': System.out.println("Four");
                break;
                case '5': System.out.println("Five");
                break;
                case '6': System.out.println("Six");
                break;
                case '7': System.out.println("Seven");
                break;
                case '8': System.out.println("Eight");
                break;
                case '9': System.out.println("Nine");
                
            }
        }
        
        
    }
}
