package lab6;

public class Dealer {
	public static void main(String[] args) {
        System.out.println("Dealing five random cards:");
        for (int i = 0; i < 5; i++) {
            Card card = Card.generateRandomCard();
            System.out.println("Card " + (i + 1) + ": " + card);
        }
    }
}
