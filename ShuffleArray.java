import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            // Swap elements at index i and index
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        // Print the shuffled array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}