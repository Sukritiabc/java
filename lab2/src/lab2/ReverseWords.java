package lab2;

import java.util.Scanner;
public class ReverseWords {
	public static void main(String[] args) {
        // Prompt the user for a sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Tokenize the sentence into words
        Scanner wordScanner = new Scanner(sentence);
        wordScanner.useDelimiter("\\s+");

        // Iterate through each word, reverse its characters, and append to the result
        StringBuilder reversedSentence = new StringBuilder();
        while (wordScanner.hasNext()) {
            String word = wordScanner.next();
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        // Output the modified sentence
        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());

        // Close scanners
        scanner.close();
        wordScanner.close();
    }

    // Method to reverse the characters in a word
    private static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }

}
