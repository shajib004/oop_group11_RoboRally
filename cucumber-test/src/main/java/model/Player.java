package model;

import java.util.ArrayList;
	
public class Player {
	
	private boolean turnStatus = false;
	private int playerID;
	private ConsoleMessage response = new ConsoleMessage();
	private ArrayList<Card> hand = new ArrayList<Card>(9);
	private ArrayList<Card> turnHand;

	
	public void setID(Integer playerID) {
		
		this.playerID = playerID;
	}

	public void setTurnStatus(boolean turnStatus) {
		this.turnStatus = turnStatus;
		
	}
	
	public ConsoleMessage setHand(ArrayList<Card> hand) {
		
		
		if (hand.size() == 9) {
			response.setMessage("9 cards were dealt!");
		}
		
		return response;
		
	}

	public ConsoleMessage setTurnCards(ArrayList<Card> turnHand) {
		
		this.turnHand = turnHand;
		response.setMessage("5 cards were selected for the round!");
		return response;

		
	}



}
