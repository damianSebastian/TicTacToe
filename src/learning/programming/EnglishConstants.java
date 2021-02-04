package learning.programming;

public class EnglishConstants {

	public final static String ASK_FOR_INPUT = "Input command: ";
	public final static String LEVEL = "Making move level \"%s\"";
	public final static String ASK_FOR_COORDINATES = "Enter the coordinates: ";
	public final static String COORDINATES_ERROR = "Coordinates should be from 1 to 3!";
	public final static String CHOICE_ERROR = "This cell is occupied! Choose another one!";
	public final static String INPUT_TYPE_ERROR = "You should enter numbers!";
	public final static String WIN = " wins";
	public final static String DRAW = "Draw";
	public final static String MENU_ERROR = "Bad parameters!";
	public final static String START = "start";

	public final static char[][] VAR_FOR_WIN = {
			{1, 1, 1, 0, 0, 0, 0, 0, 0},
			{1, 0, 0, 1, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0, 1, 0},
			{0, 0, 1, 0, 0, 1, 0, 0, 1},
			{1, 0, 0, 0, 1, 0, 0, 0, 1},
			{0, 0, 1, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 1, 1, 1,}
	};



}
