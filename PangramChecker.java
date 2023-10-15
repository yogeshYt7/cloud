package Practice;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
        boolean isPangram = isPangram(input.toLowerCase()); // Convert to lowercase to handle both uppercase and lowercase letters
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        boolean[] alphabet = new boolean[26]; // Array to track if each letter is seen

        // Iterate through the input and mark each letter as seen
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                alphabet[c - 'a'] = true;
            }
        }

        // Check if all alphabet letters have been seen
        for (boolean letterSeen : alphabet) {
            if (!letterSeen) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters have been seen, it's a pangram
    }
}




