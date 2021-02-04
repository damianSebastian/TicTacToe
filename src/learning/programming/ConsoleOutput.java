package learning.programming;

public class ConsoleOutput implements Output{

	@Override
	public void showPlayer(Player currentPlayer) {
		System.out.println("Player moving: " + currentPlayer.getSymbol());
	}

	@Override
	public void showWinner(Symbol symbol) {

		if (symbol == Symbol.SPACE) {
			System.out.println(EnglishConstants.DRAW);
		//	System.out.println(constanta.getDrawMessage());
			//accesez constantele cu getteri
		}
		if (symbol == Symbol.O || symbol == Symbol.X){
			System.out.println(symbol + EnglishConstants.WIN);
		}
	}

	@Override
	public void showLevel(PlayerType playerType) {
		if (playerType == PlayerType.HUMAN_PLAYER) {
			System.out.println(EnglishConstants.ASK_FOR_COORDINATES);
		} else {
			System.out.printf(EnglishConstants.LEVEL, playerType);
			System.out.println();
		}
	}

	@Override
	public void showError(ErrorType error,Player player) {
		if (player == null || player.getPlayerType() == PlayerType.HUMAN_PLAYER) {
			System.out.println(error.toString());
		}
	}

	@Override
	public void showBoard(Board board) {
		System.out.println(board.toString());
	}
}
