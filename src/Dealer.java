import java.util.*;

public class Dealer {
    private Deck deckSTD;
    private Queue<Card> deck = new LinkedList<>();

    public Dealer() {
        deckSTD = new Deck();
    }

    // Shuffles the deck of cards using the Fisher-Yates shuffle. These are then added to a queue for easy dealing.
    public void shuffleCards() {
        Card[] cards = deckSTD.getCards();
        Random rnd = new Random();
        for( int i = cards.length - 1; i > 0; i -= 1 ) {
            int index = rnd.nextInt( i + 1 );
            Card c = cards[index];
            cards[index] = cards[i];
            cards[i] = c;
        }
        Collections.addAll(deck, cards);
    }

    public Card dealCard() {
        if( deck.size() > 1 ) {
            return deck.remove();
        } else {
            System.out.println( "No cards left in deck" );
            return null;
        }
    }
}
