public class Hand {
    private Card[] cards = new Card[2];


    public Hand( Card a, Card b ) {
        if( a.rankValue() > b.rankValue() ) {
            cards[0] = a;
            cards[1] = b;
        } else {
            cards[0] = b;
            cards[1] = a;
        }

    }

    public Card[] getCards() { return cards; }
}
