public class Main {
    public static void main(String[] args) {

        for( Suit suit : Suit.values() ) {
            System.out.println( suit.getLetter() );
        }

        //Dealer dealer = new Dealer();
        //dealer.shuffleCards();
//
        //for( int i = 0; i < 52; i += 1 ) {
        //    Card tempCard = dealer.dealCard();
        //    if( tempCard != null ) {
        //        tempCard.printCard();
        //    }
        //}
    }
}
