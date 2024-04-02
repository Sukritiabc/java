package lab2;

import java.util.HashMap;
import java.util.Map;

public class Punct {

	public static void main(String[] args) {
		String poem = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.\n"
                + "-that was a nice poem-\n"
                + "the end.";

    // Create a map to store punctuation marks and their counts
    Map<Character, Integer> punctuationCounts = new HashMap<>();

    // Loop through each character in the poem
    for (char c : poem.toCharArray()) {
        // Check if the character is a punctuation mark
        if (isPunctuation(c)) {
            // Increment the count for this punctuation mark
            punctuationCounts.put(c, punctuationCounts.getOrDefault(c, 0) + 1);
        }
    }

    // Print the table
    System.out.println("Punctuation Marks Counts:");
    for (Map.Entry<Character, Integer> entry : punctuationCounts.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}

// Method to check if a character is a punctuation mark
private static boolean isPunctuation(char c) {
    return c == '.' || c == ',' || c == '-' || c == '!' || c == '?' || c == ':' || c == ';';
}
}