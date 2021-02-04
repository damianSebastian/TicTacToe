package learning.programming;

import java.util.HashMap;
import java.util.Map;

public class Board {
	private final Symbol[] board = {Symbol.SPACE, Symbol.SPACE, Symbol.SPACE,
			Symbol.SPACE, Symbol.SPACE, Symbol.SPACE,
			Symbol.SPACE, Symbol.SPACE, Symbol.SPACE,};
	public static final Map<Integer,Integer> cordTranslator = new HashMap<>();
	private ErrorType errorType;
	public static int movesMade;

	public Board() {
		this.errorType = ErrorType.NONE;
		cordTranslator.put(11,6);
		cordTranslator.put(12,3);
		cordTranslator.put(13,0);
		cordTranslator.put(21,7);
		cordTranslator.put(22,4);
		cordTranslator.put(23,1);
		cordTranslator.put(31,8);
		cordTranslator.put(32,5);
		cordTranslator.put(33,2);
		cordTranslator.put(6,11);
		cordTranslator.put(3,12);
		cordTranslator.put(0,13);
		cordTranslator.put(7,21);
		cordTranslator.put(4,22);
		cordTranslator.put(1,23);
		cordTranslator.put(8,31);
		cordTranslator.put(5,32);
		cordTranslator.put(2,33);
		movesMade = 0;
	}

	public void makeMove(int index,Symbol symbol) {
		board[index] = symbol;
		movesMade = movesMade + 1;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

	public ErrorType checkErrorAndMove(String coordinates, Player player) {
		int index;
		try {
			int number = Integer.parseInt(coordinates);
			index = cordTranslator.get(number);
		} catch (NumberFormatException e) {
			errorType = ErrorType.INPUT_TYPE_ERROR;
			return errorType;
		} catch (NullPointerException e) {
			errorType = ErrorType.COORDINATES_ERROR;
			return errorType;
		}

		if (board[index] != Symbol.SPACE) {
			errorType = ErrorType.CHOICE_ERROR;
		} else {
			makeMove(index,player.getSymbol());
			errorType = ErrorType.NONE;
		}

		return errorType;
	}

	@Override
	public String toString() {

		String[] vectorForPrint = new String[board.length];
		for (int i = 0; i < board.length; i++) {
			vectorForPrint[i] = board[i].toString();

		}

		return "---------" +
				"\n| " + vectorForPrint[0] + " " + vectorForPrint[1] + " " + vectorForPrint[2] + " |" +
				"\n| " + vectorForPrint[3] + " " + vectorForPrint[4] + " " + vectorForPrint[5] + " |" +
				"\n| " + vectorForPrint[6] + " " + vectorForPrint[7] + " " + vectorForPrint[8] + " |" +
				"\n---------";

	}

	public Symbol[] getCloneVector() {
		return board.clone();
	}

}
