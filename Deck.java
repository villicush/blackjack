import java.util.*;
public class Deck {
	protected static Card[][] deck = new Card[4][13];
	/**public Deck(Card[][] d) {
		deck=d;
	}*/
	public static void initializeDeck() {
		String suit="";
		for (int i=0;i<deck.length;i++) {
			if (i==0) {
				suit="♦️";
			}
			else if (i==1) {
				suit="♣️";
			}
			else if (i==2) {
				suit="♥️";
			}
			else if (i==3) {
				suit="♠️";
			}
			for (int ii=0;ii<deck[0].length;ii++) {
				deck[i][ii]= new Card(suit,ii+1,ii+1);
				if (deck[i][ii].getValue()==11) {
					deck[i][ii] = new Card(suit,10,ii+1);
				}
				else if (deck[i][ii].getValue()==12) {
					deck[i][ii] = new Card(suit,10,ii+1);
				}
				else if (deck[i][ii].getValue()==13) {
					deck[i][ii] = new Card(suit,10,ii+1);
				}
				else if (deck[i][ii].getValue()==1) {
					deck[i][ii] = new Card(suit,10,ii+1);
				}
			}
		}
	}
	public static void printDeck() {
		for (int i=0;i<deck.length;i++) {
			for (int ii=0;ii<deck[0].length;ii++) {
				System.out.print(deck[i][ii]+" ");
			}
			System.out.println();
		}
	}
	
}
