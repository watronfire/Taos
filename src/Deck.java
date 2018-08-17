
// Deck class which can only be used by the dealer.
class Deck {
    private Card[] cards;

    // Generates a deck by iterating through suits and ranks.
    Deck() {
        cards = new Card[52];
        int count = 0;
        for( Suit suit : Suit.values() ) {
            for( Rank rank : Rank.values() ) {
                cards[count] = new Card( suit, rank );
                count += 1;
            }
        }
    }
    Card[] getCards() {
        return cards;
    }
}