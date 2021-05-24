import java.util.*;
public class Dealer extends Player {
	private static int numCardsDealt=0;
	public Dealer(ArrayList<Card> c) {
		super(c);
	}
	public static void dealCards(int num, Player person) {
		numCardsDealt+=num;
		if (numCardsDealt>=40) {
			Deck.initializeDeck();
		}
		for (int i=0;i<num;i++) {
            int xx=(int)(Math.random()*Deck.deck[0].length);
            int x=(int)(Math.random()*Deck.deck.length);
            if (Deck.deck[x][xx]==null)
                i--;
            if (Deck.deck[x][xx]!=null)
                person.Deal(Deck.deck[x][xx]);
            Deck.deck[x][xx]=null;
        }
	}
}
