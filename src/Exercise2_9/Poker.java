package Exercise2_9;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static final int maxNumPlayers = 10;
    public static final ArrayList<Card> deck = initDeck();
    private static ArrayList<Card> initDeck() {
        ArrayList<Card> deck = new ArrayList<Card>();
        for(Suits suit : Suits.values()) {
            for (Elderness eld : Elderness.values()) {
                deck.add(new Card(suit, eld));
            }
        }
        Collections.shuffle(deck);
        return deck;
    }
    public static void test(int numPlayers) {
        if (numPlayers < 0)
            throw new RuntimeException("number of players can't be less than zero");
        if (numPlayers > maxNumPlayers)
            throw new RuntimeException("maximum number of players is exceeded");
        int cardCount = 0;
        int player    = 0;
        for(Card card : deck) {
                if (cardCount == 5) {
                    System.out.print('\n');
                    cardCount = 0;
                    player++;
                }
                if (player == numPlayers)
                    return;
                System.out.print(card);
                cardCount++;
        }
    }
}
