import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        // Replace the Roman number with the one you want to convert
        String romanNumber = "IX";

        // Call the romanToInteger function and print the result
        int result = romanToInteger(romanNumber);
        System.out.println("The integer value of " + romanNumber + " is: " + result);
    }

    public static int romanToInteger(String s) {
        // Create a map to store the values of Roman numbers
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0; // Initialize the result to zero
        int previousValue = 0; // Initialize the previous value to zero

        // Traverse the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i)); // Get the value of the current Roman numeral

            // Check if the current numeral is smaller than the previous one
            if (currentValue < previousValue) {
                result -= currentValue; // Subtract its value from the result
            } else {
                result += currentValue; // Add its value to the result
            }

            previousValue = currentValue; // Update the previous value for the next iteration
        }

        return result; // Return the final result
    }
}
