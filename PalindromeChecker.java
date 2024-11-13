import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String userInput = scanner.nextLine();

        // Transform the userInput string
        String transformed = transformInput(userInput);


        // Check if the transformed string is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    /**
     * Transforms the input string by converting it to lowercase and removing
     * specific punctuation marks.
     *
     * @param input the original input string
     * @return the transformed string
     */
    public static String transformInput(String userInput) {
        userInput = userInput.toLowerCase();
        userInput = userInput.replace(",", "");
        userInput = userInput.replace(" ", "");
        return userInput;
    }

    /**
     * Checks if the given string is a palindrome.
     *
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    /**
     * Reverses the given string.
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
