import java.util.HashSet;

public class PangramChecker {
    public static boolean isPangram(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        
        // Remove spaces and convert to lowercase for case insensitivity
        input = input.replaceAll(" ", "").toLowerCase();
        
        // Use a HashSet to store unique characters
        HashSet<Character> uniqueChars = new HashSet<>();
        
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                uniqueChars.add(c);
            }
        }
        
        return uniqueChars.size() == 26; // 26 letters in the English alphabet
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        System.out.println("Is the input a pangram? " + isPangram);
    }
}