package Test;

import learning.programming.Board;
import learning.programming.ConsoleOutput;
import learning.programming.Game;
import learning.programming.Symbol;
import org.junit.Assert;
import org.junit.Test;

public class GameShould {
	@Test
	public void winX() {
		String[] movesOne = {"11", "22", "33"};
		String[] moveTwo = {"13", "21"};
		Game game = new Game(new Board(),new ConsoleOutput(),movesOne,moveTwo );
		Assert.assertEquals(Symbol.X,game.start());
	}

	@Test
	public void notLetXOverO() {
		String[] movesOne = {"13", "23", "33"};
		String[] moveTwo = {"11", "33","22"};
		Game game = new Game(new Board(),new ConsoleOutput(), movesOne, moveTwo );

		Assert.assertEquals(Symbol.O,game.start());
	}

	@Test
	public void winXInLastMove() {
		String[] movesOne = {"12", "21", "33","32","31"};
		String[] moveTwo = {"11", "22","13","23"};
		Game game = new Game(new Board(),new ConsoleOutput(),movesOne,moveTwo );
		Assert.assertEquals(Symbol.X,game.start());
	}
	@Test
	public void draw() {
		String[] movesOne = {"12", "21", "33","31","23"};
		String[] moveTwo = {"11", "22","13","32"};
		Game game = new Game(new Board(),new ConsoleOutput(),movesOne,moveTwo );
		Assert.assertEquals(Symbol.SPACE,game.start());
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void invalidateInput() {
		String[] movesOne = {"12", "21", "3a"};
		String[] moveTwo = {"11", "22", "33"};
		Game game = new Game(new Board(),new ConsoleOutput(),movesOne,moveTwo );
		Assert.assertEquals(Symbol.O, game.start());

	}

}