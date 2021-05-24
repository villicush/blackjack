import java.util.*;
public class Player {
	private ArrayList<Card> cards;
	public Player(ArrayList<Card> c) {
		cards = c;
	}
	public void Deal(Card card) {
		cards.add(card);
	}
	public int getPoints() {
		int total=0;
		for (int i=0;i<cards.size();i++) {
			total+=cards.get(i).getValue();
		}
		return total;
	}
	public ArrayList<Card> getHand() {
		return cards;
	}

	public void resetHand() {
		cards.clear();
	}
}
