package learning.programming;

public interface Output {

	void showWinner(Symbol symbol);

	void showLevel(PlayerType playerType);

	void showError(ErrorType error, Player player);

	void showBoard(Board board);

	void showPlayer(Player currentPlayer);
}
