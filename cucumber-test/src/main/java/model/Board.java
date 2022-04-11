package model;

import model.tile.Robot;
import model.tile.Tile;

public class Board {
	
	private Tile[][] board;
	private Robot robot;
	private Position position;
	
	public Tile[][] getBoard() {
		return this.board;
	}

	public void placeRobot(Position position, Robot robot) {
		this.board[position.getX()][position.getY()] = robot;
		
	}

	public void moveRobot(Robot robot) {
	
		
	}
	

}
