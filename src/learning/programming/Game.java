package learning.programming;


public class Game {

	private final Output output;
	private final Player playerOne;
	private final Player playerTwo;
	private final Board board;
	private boolean gameOver = false;

	public Game(Board board, Output output) {
		this.output = output;
		this.board = board;

		this.playerOne = new HumanPlayer(Symbol.X);

		this.playerTwo = new HumanPlayer(Symbol.O);

	}

	public Game(Board board, Output output, String[] movesOne, String[] movesTwo) {
		this.output = output;
		this.playerOne = new BotPlayer(Symbol.X,movesOne);
		this.playerTwo = new BotPlayer(Symbol.O,movesTwo);
		this.board = board;
	}

	private void play(Player player) {

		output.showLevel(player.getPlayerType());
		String input = player.getCoordinates();
		while (board.checkErrorAndMove(input,player) != ErrorType.NONE) {

			output.showError(board.getErrorType(),player);
			input = player.getCoordinates();
		}
	}


	public Symbol start() {

		Player currentPlayer = playerTwo;

		output.showBoard(board);

		while (!gameOver) {

			if (currentPlayer == playerOne) {
				currentPlayer = playerTwo;
			} else {
				currentPlayer = playerOne;
			}
			output.showPlayer(currentPlayer);
			play(currentPlayer);
			output.showBoard(board);
			printStatus(currentPlayer);

		}
		return checkStatus(currentPlayer);
	}

	private Symbol checkStatus(Player player) {
		Symbol[] clone = board.getCloneVector();
		char[] temp = new char[9];
		boolean isDraw = true;
		for (int i = 0; i < clone.length; i++) {

			if (clone[i] == player.getSymbol() ) {
				temp[i] = 1;
			} else temp[i] = 0;
			if (clone[i] == Symbol.SPACE) {
				isDraw = false;
			}
		}

		int count;
		for (char[] var : EnglishConstants.VAR_FOR_WIN) {
			count = 0;
			for (int i = 0; i < var.length; i++) {
				if (temp[i] == var[i] && var[i] == 1) {
					count +=1;
				}
			}
			if (count == 3) {
				gameOver = true;
				return player.getSymbol();
			}
		}

		if (isDraw) {
			gameOver = true;
			return Symbol.SPACE;
		}
		return null;

	}

	private void printStatus(Player player) {
		output.showWinner(checkStatus(player));
	}

}

