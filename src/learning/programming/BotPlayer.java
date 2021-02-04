package learning.programming;

public class BotPlayer implements Player{
	private final PlayerType playerType;
	private final Symbol mySymbol;
	private final String[] moves;
	private int round = 0;

	public BotPlayer(Symbol mySymbol, String[] moves) {
		this.playerType = PlayerType.BOT;
		this.mySymbol = mySymbol;
		this.moves = moves;
	}

	@Override
	public String getCoordinates() {
		return moves[round++];
	}

	@Override
	public Symbol getSymbol() {
		return mySymbol;
	}

	@Override
	public PlayerType getPlayerType() {
		return playerType;
	}
}
