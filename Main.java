import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
		Scanner Continue = new Scanner(System.in);
		String playerChoice;
		String continueGame = "y";
		ArrayList<Card> playerHand = new ArrayList<>();
		ArrayList<Card> dealerHand = new ArrayList<>();
		Player player = new Player(playerHand);
		Dealer dealer = new Dealer(dealerHand);
		
		Deck.initializeDeck();
		while (continueGame.equals("y")) {
			Deck.printDeck();

			Dealer.dealCards(2,player);
			Dealer.dealCards(2,dealer);
			
			System.out.println();

			System.out.println("Dealer:\tTotal Points: " + dealer.getPoints() + "\tHand: " + dealer.getHand());
			System.out.println("Player:\tTotal Points: " + player.getPoints() + "\tHand: " + player.getHand());

			System.out.print("Hit or stay?? ");
			playerChoice = s.nextLine();
			while (playerChoice.equals("hit")) {
				Dealer.dealCards(1,player);
				System.out.println();
				System.out.println("Player:\tTotal Points: " + player.getPoints() + "\tHand: " + player.getHand());
				if (player.getPoints()>21) {
					System.out.println("Bust! You LOSE!");
					System.out.print("Would you like to play again? (y/n) ");
					continueGame = Continue.nextLine();
					break;
				}
				else {
					System.out.print("Would you like hit or stay? ");
					playerChoice = x.nextLine();
				}
			}
			if (!playerChoice.equals("hit")) {
				while (dealer.getPoints()<16) {
					System.out.println();
					System.out.println("Dealer hits");
					Dealer.dealCards(1,dealer);
					System.out.println("Dealer:\tTotal Points: " + dealer.getPoints() + "\tHand: " + dealer.getHand());
					System.out.println();
				}
				if (dealer.getPoints()>=16) {

					if (dealer.getPoints()>21) {
						System.out.println("Dealer busts!!! You win!!! ");
						System.out.println("Would you like to play again? (y/n) ");
						continueGame = Continue.nextLine();
					}
					else {
						System.out.println();
						System.out.println("Dealer stays");
						System.out.println("Dealer:\tTotal Points: " + dealer.getPoints() + "\tHand: " + dealer.getHand());
						System.out.println("Player:\tTotal Points: " + player.getPoints() + "\tHand: " + player.getHand());
						System.out.println();
					}
				}
			}
			if (dealer.getPoints()>player.getPoints()&&dealer.getPoints()<=21) {
				System.out.println("Dealer wins!!! ");
				System.out.print("Would you like to play again? (y/n) ");
				continueGame = Continue.nextLine();

			}
			else if (dealer.getPoints()<player.getPoints()&&player.getPoints()<=21) {
				System.out.println("You win!!! ");
				System.out.print("Would you like to play again? (y/n) ");
				continueGame = Continue.nextLine();
			}
			else if (dealer.getPoints()<=21&&player.getPoints()<=21&&dealer.getPoints()==player.getPoints()) {
				System.out.println("Tie! ");
				System.out.print("Would you like to play again? (y/n) ");
				continueGame = Continue.nextLine();
			}
			player.resetHand();
			dealer.resetHand();
		}
	}
}
