package model;

import java.util.ArrayList;

public class Player {
	
	private boolean turnStatus = false;
	ArrayList<Card> hand = new ArrayList<Card>(9);

	public void setTurnStatus(boolean turnStatus) {
		this.turnStatus = turnStatus;
		
	}
	
	public ConsoleMessage setHand(ArrayList<Card> hand) {
		
		ConsoleMessage response = new ConsoleMessage();
		
		this.hand = hand;
		response.setMessage("9 cards were dealt!");
		
		return response;
		
	}

}
