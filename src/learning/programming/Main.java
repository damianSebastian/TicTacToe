package learning.programming;

public class Main {

    public static void main(String[] args) {

        Output output = new ConsoleOutput();
        Board board = new Board();

        Game game = new Game(board,output);
        game.start();
    }
}
