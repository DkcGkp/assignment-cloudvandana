import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(array); // Call the shuffleArray function

        System.out.print("Shuffled Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random(); // Create a random number generator

        // Start from the end of the array and shuffle each element
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // Generate a random index from 0 to i

            // Swap the elements at indices i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
