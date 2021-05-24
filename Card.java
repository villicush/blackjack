public class Card {
	private String suit;
	private int value;
	private int arrayPos;
	public Card(String s, int v, int ap) {
		suit = s;
		value = v;
		arrayPos = ap;
	}
	public String toString() {
		if (arrayPos==1)
			return suit+"A"+" ";
		else if (arrayPos==11)
			return suit+"J"+" ";
		else if (arrayPos==12)
			return suit+"Q"+" ";
		else if (arrayPos==13)
			return suit+"K"+" ";
		else
			return suit+value+" ";
	}
	public int getValue() {
		return value;
	}
}
