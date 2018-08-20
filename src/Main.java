public class Main {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        dealer.shuffleCards();
        for( int i = 0; i < 52; i += 1 ) {
            Card tempCard = dealer.dealCard();
            if( tempCard != null ) {
                System.out.println( tempCard.toString() );
            }
        }
    }
}
