enum Suit {
    SPADE,
    HEART,
    DIAMOND,
    CLUB;

    int size = Suit.values().length;

    private final char letter;

    Suit() {
        this.letter = Character.toLowerCase( this.name().charAt( 0 ) );
    }

    public char getLetter() {
        return this.letter;
    }

    static public Suit valueOf( char letter ) {
        for( Suit s : Suit.values() ) {
            if( s.letter == letter ) {
                return s;
            }
        }
        return null;
    }
}

enum Rank {
    ACE( 'A', 14 ),
    KING( 'K', 13 ),
    QUEEN( 'Q', 12 ),
    JACK( 'J', 11 ),
    TEN( 'T', 10 ),
    NINE( '9', 9 ),
    EIGHT( '8', 8 ),
    SEVEN( '7', 7 ),
    SIX( '6', 6 ),
    FIVE( '5', 5 ),
    FOUR( '4', 4 ),
    THREE( '3', 3 ),
    DUECE( '2', 2 );

    static public final int size = Rank.values().length;

    private final char letter;
    private final int value;

    Rank( char letter, int value ) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return this.letter;
    }

    public int getValue() {
        return this.value;
    }

    static public Rank valueOf( char letter ) {
        for( Rank r : Rank.values() ) {
            if( r.letter == letter ) {
                return r;
            }
        }
        return null;
    }

    static public Rank valueOf( int value ) {
        for( Rank r : Rank.values() ) {
            if( r.value == value ) {
                return r;
            }
        }
        return null;
    }
}

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card( Suit suit, Rank rank ){
        this.suit = suit;
        this.rank = rank;
    }

    public void printCard() {
        System.out.printf( "%s of %sS\n", rank.getLetter(), suit.getLetter() );
    }
}
