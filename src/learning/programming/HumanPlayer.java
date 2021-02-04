package learning.programming;

import java.util.Scanner;

public class HumanPlayer implements Player {

	private final Symbol mySymbol;
	private final Scanner scanner = new Scanner(System.in);

	public HumanPlayer(Symbol symbol) {
		this.mySymbol = symbol;
	}


	@Override
	public String getCoordinates() {
		return scanner.nextLine().replace(" ","");

	}

	@Override
	public Symbol getSymbol() {
		return this.mySymbol;
	}
	@Override
	public PlayerType getPlayerType() {
		return PlayerType.HUMAN_PLAYER;
	}
}
