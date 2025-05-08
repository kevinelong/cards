public class MainApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        //random - stochastic stats - gaussian visual - brownian moving
        deck.shuffle();

        int CARDS_PER_HAND = 2;
        for (int i = 0; i < CARDS_PER_HAND; i++) {
            hand1.pickUp(deck.dealCard());
        }

        for (int i = 0; i < CARDS_PER_HAND; i++) {
            hand2.pickUp(deck.dealCard());
        }

        int handValue = hand1.getValue();
        System.out.println("Worth: " + handValue);

        int handValue2 = hand2.getValue();
        System.out.println("Worth2: " + handValue2);

        if(handValue > handValue2){
            System.out.println("Player 1 wins!!!");
        }else if(handValue < handValue2){
            System.out.println("Player 2 wins!!!");
        }else{
            System.out.println("Tie!!!");
        }
    }
}
