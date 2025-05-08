public class Card {
    //private variables
    private boolean isFaceUp;
    private String value; //2-10 J Q K A
    private String suit; //Hearts Clubs Spades Diamonds

    // constructors
    Card(String suit, String value){
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    //getters

    public String getSuit() {
        return isFaceUp ? suit : "#";
    }

    public String getValue() {
        return isFaceUp ? value : "#";
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue(){
        //TODO aces high 14 or low 1?
        return 0;
    }

    //methods
    void flip(){
        this.isFaceUp = !this.isFaceUp; //invert using not
    }

    public String toString(){
        return getValue() + getSuit();
    }

    public static void main(String[] args) {
        Card c = new Card("H", "A");
        System.out.println(c);
        c.flip();
        System.out.println(c);
    }
}
