package lab6;
import java.util.Random;
public class Card {
	private String suit;
    private String faceValue;
  
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }
    
    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public String toString() {
        return faceValue + " of " + suit;
    }

    public static Card generateRandomCard() {
        Random random = new Random();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int suitIndex = random.nextInt(suits.length);
        int faceValueIndex = random.nextInt(faceValues.length);
        return new Card(suits[suitIndex], faceValues[faceValueIndex]);
    }

}
