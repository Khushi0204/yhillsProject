import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

// Enum for card suits
enum Suit {
    SPADE, CLUB, HEART, DIAMOND
}

// Enum for card ranks
enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

// Class representing a playing card
class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Comparator class to compare cards based on color, suit, and value
class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        // Compare based on color
        int colorComparison = getColorValue(card1.getSuit()) - getColorValue(card2.getSuit());
        if (colorComparison != 0) {
            return colorComparison;
        }

        // If same color, compare based on suit
        int suitComparison = card1.getSuit().ordinal() - card2.getSuit().ordinal();
        if (suitComparison != 0) {
            return suitComparison;
        }

        // If same suit, compare based on rank
        return card1.getRank().ordinal() - card2.getRank().ordinal();
    }

    // Helper method to determine color value
    private int getColorValue(Suit suit) {
        return (suit == Suit.HEART || suit == Suit.DIAMOND) ? 0 : 1;
    }
}

// Class representing a deck of cards
class Deck {
    private List<Card> cards;

    // Initialize the deck with 52 cards
    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Shuffle the deck using Fisher-Yates algorithm
    public void shuffle() {
        Random rand = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            Card temp = cards.get(index);
            cards.set(index, cards.get(i));
            cards.set(i, temp);
        }
    }

    // Draw a specified number of cards from the deck
    public List<Card> draw(int numCards) {
        List<Card> drawnCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            if (!cards.isEmpty()) {
                drawnCards.add(cards.remove(cards.size() - 1));
            } else {
                System.out.println("No more cards in the deck!");
                break;
            }
        }
        return drawnCards;
    }

    // Get the size of the deck
    public int size() {
        return cards.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle(); // Optional: Shuffle the deck before drawing cards

        // Draw 20 cards from the deck
        List<Card> drawnCards = deck.draw(20);

        // Sort the drawn cards
        Collections.sort(drawnCards, new CardComparator());

        // Print the sorted cards
        System.out.println("Sorted Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }
    }
}


