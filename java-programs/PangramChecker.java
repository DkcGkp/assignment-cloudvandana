import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        // Replace the input string with the one you want to check
        String input = "The five boxing wizards jump quickly";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to ensure case-insensitivity
        input = input.toLowerCase();

        // Create a set to store unique letters
        Set<Character> letters = new HashSet<>();

        // Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch); // Add the letter to the set
            }
        }

        // Check if the set contains all 26 letters (a to z)
        return letters.size() == 26;
    }
}
