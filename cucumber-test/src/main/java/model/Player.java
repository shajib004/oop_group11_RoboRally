package model;

import java.util.ArrayList;

public class Player {
	
	private boolean turnStatus = false;
	private int playerID;
	ConsoleMessage response = new ConsoleMessage();
	ArrayList<Card> hand = new ArrayList<Card>(9);
	ArrayList<Card> turnHand = new ArrayList<Card>(5);

	
	public void setID(Integer playerID) {
		
		this.playerID = playerID;
	}

	public void setTurnStatus(boolean turnStatus) {
		this.turnStatus = turnStatus;
		
	}
	
	public ConsoleMessage setHand(ArrayList<Card> hand) {
		
		
		this.hand = hand;
		response.setMessage("9 cards were dealt!");
		
		return response;
		
	}

	public ConsoleMessage setTurnCards(ArrayList<Card> turnHand) {
		
		this.turnHand = turnHand;
		response.setMessage("5 cards were selected for the round!");
		return response;

		
	}



}
