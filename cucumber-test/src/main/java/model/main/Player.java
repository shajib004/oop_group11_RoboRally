package model.main;
 
import java.util.ArrayList;

import model.card.*;
import model.tile.Robot;
import utilities.GameSettings;
import utilities.Position;
import utilities.GameSettings.PlayerStatus;
import utilities.IllegalActionException;

/*
 * Player mimics the status of what a real-world player would have
*/
public class Player {
	
	private boolean isYourTurn = false;
	Player player;

	private int life = 3;
	
	private GameSettings.PlayerStatus playerStatus = GameSettings.PlayerStatus.ALIVE;	
	
	private final int playerID;
	private static int countPlayerId = 1;
	private Robot robot;
	boolean handFull;

	
	 
	private ArrayList<Card> subdeck = new ArrayList<Card>(); //  Each round
	private ArrayList<Card> hand = new ArrayList<Card>(); // Each turn
	private boolean subdeckFull;

	
	public Player(){
		this.playerID = countPlayerId;
		countPlayerId++;
		this.setHand(generateEmptyHand());
	}
	
	public ArrayList<Card> generateEmptyHand(){
		ArrayList<Card> emptyHand = new ArrayList<Card>();
		
		emptyHand.add(new EmptyCard(0));
		emptyHand.add(new EmptyCard(0));
		emptyHand.add(new EmptyCard(0));
		emptyHand.add(new EmptyCard(0));
		emptyHand.add(new EmptyCard(0));
		
		return emptyHand;
		
	}
	
	
    /**
     * Decreases life by one.
     * Tests if the player will die after loosing the life.
     */
    public void looseLife() {
        this.life --;
        if (this.life <= 0) {
        	setPlayerStatus(GameSettings.PlayerStatus.DEAD);
            System.out.println(this.robot.getName() + " is now Kaput and lost");
        }
    }
    
    public int getLife() {
		return this.life;
	}
    
    // Increase the player's life by one, with below than 3.
    public void increaseLife() {
    	if (this.getLife() < 3 ) {
    		this.life++;
		}
    }


	public void setLife(int life) {
		this.life = life;
	}

    
	/*
	 * Player Card Handling. 
	*/
	public void checkFullHand() {
		for (Card card : this.getHand()) {
			if (card instanceof EmptyCard) {
				this.handFull = false;
				break;
			}
			else {
				this.handFull = true;
				break;
			}
		}
	
	}
	public void checkFullSubdeck() {
		for (Card card : this.getSubdeck()) {
			if (card instanceof EmptyCard) {
				this.subdeckFull = false;
				break;
			}
			else {
				this.subdeckFull = true;
				break;
			}
		}
	
	}
    
    //Restrict that no more than 5 cards can be in your hand
    public void fiveToHand(Card card) throws IllegalActionException {   
    	this.checkFullHand();
    	if (card instanceof EmptyCard) {
    		
    	}
    	else {
    		if (this.isHandFull() == false) {
    			int removedCardSubdeck;
    			Card removedHand;
    			removedCardSubdeck = this.subdeck.indexOf(card);
    			removedHand = this.getHand().get(0);
    			
    			this.subdeck.remove(card);
    			this.subdeck.add(removedCardSubdeck,removedHand);
    			
    			this.hand.remove(removedHand);
    			this.hand.add(card);
    		}
    		
    	}
	
	}
    
    
    
    
    public boolean isHandFull() {
		return handFull;
	}

	// Put back the card from HAND to SUBDECK
	public void replayCard(Card card) {
	
		this.checkFullSubdeck();
		
		if (card instanceof EmptyCard) {
			
		}
		else {
			if (this.isSubdeckFull() == false) {
				int removedCardHand;
				Card removedSubdeck;
				removedCardHand = this.hand.indexOf(card);
				removedSubdeck = this.getSubdeck().get(0);
				
				this.hand.remove(card);
				this.hand.add(removedCardHand,new EmptyCard(0));
				
				this.subdeck.remove(removedSubdeck);
				this.subdeck.add(card);
			}
			
		}
	
		
		//add to a subdeck
	}
	
	
	
    
	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	public boolean canPlay() {
		if(this.getPlayerStatus() == GameSettings.PlayerStatus.ALIVE) {
			return true;
		}
		return false;
	}
    
    public GameSettings.PlayerStatus getPlayerStatus() {
		return playerStatus;
	}

	public void setPlayerStatus(GameSettings.PlayerStatus playerStatus) {
    	this.playerStatus = playerStatus;
    }
    
    public boolean isYourTurn() {
		return isYourTurn;
	}

	public void setYourTurn(boolean isYourTurn) {
		this.isYourTurn = isYourTurn;
	}

	public ArrayList<Card> getSubdeck() {
		return subdeck;
	}

	public void setSubdeck(ArrayList<Card> subdeck) {
		this.subdeck = subdeck;
	}

	public ArrayList<Card> getHand() {
		return this.hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public void doObstacleAction(String obstacleAction) {
		switch(obstacleAction) {
		
		case "Pit":
			this.player.looseLife();
		}
		
	}

	public boolean isSubdeckFull() {
		return subdeckFull;
	}

	public int getPlayerID() {
		return playerID;
	}
    
}
