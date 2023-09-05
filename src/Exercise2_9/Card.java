package Exercise2_9;

public class Card {
    public final Suits suit;
    public final Elderness elderness;
    public Card(Suits suit, Elderness elderness) {
        this.suit = suit;
        this.elderness = elderness;
    }
    @Override
    public String toString() {
        return "Card(suit = " + suit + ", elderness = "  + elderness + ")\n";
    }
}
