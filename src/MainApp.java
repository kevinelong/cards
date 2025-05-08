public class MainApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();

        //random - stochastic stats - gaussian visual - brownian moving
        deck.shuffle();

        int CARDS_PER_HAND = 5;
        for (int i = 0; i < CARDS_PER_HAND; i++) {
            hand1.pickUp(deck.dealCard());
        }

        int handValue = hand1.getValue();
        System.out.println("Worth: " + handValue);
    }
}
