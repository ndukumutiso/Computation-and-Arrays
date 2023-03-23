
import javax.swing.*;

    public class PalindromeChecker {
        public static void main(String[] args) {
            String input = JOptionPane.showInputDialog("Enter a number:");
            int num = Integer.parseInt(input);
            boolean isPalindrome = isPalindrome(num);
            String message = num + " is " + (isPalindrome ? "" : "not ") + "a palindrome.";
            JOptionPane.showMessageDialog(null, message);
        }

        public static boolean isPalindrome(int num) {
            String numStr = String.valueOf(num);
            String reverse = new StringBuilder(numStr).reverse().toString();
            return numStr.equals(reverse);
        }
    }