package model.board;

public class main {

	public static void main(String[] args) {
		Board board = new Board(10,10);
		
		board.generateMap();
		board.printMap();

	}

}
