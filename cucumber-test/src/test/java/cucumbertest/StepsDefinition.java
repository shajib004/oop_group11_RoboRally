package cucumbertest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.*;

public class StepsDefinition {
	Player player = new Player();
	GameMaster gameMaster = new GameMaster();
	ConsoleMessage response = new ConsoleMessage();
	ArrayList<Card> cardsDealt;
	ArrayList<Card> turnCards;
	
	@Given("A player with ID of {int}")
	public void a_player_with_id_of(Integer int1) {
		player.setID(int1);
	}
	
	@Given("player turn status true")
	public void a_player_with_is_turn_status_true() {
	    player.setTurnStatus(true);
	}
	
	@When("GameMaster starts a new round")
	public void game_master_stats_a_new_round() {
	    gameMaster.initializeRound();
	}
	
	@Then("player receives nine programming cards")
	public void player_receives_programming_cards() {
		
		response = player.setHand(new ArrayList<Card>(8));
	}
	@Then("console should display a sucessful message")
	public void console_should_display_a_sucessful_message() {
	   assertEquals(response.getMessage(), "9 cards were dealt!");
	}
	
	@When("Player selects {int} cards from his hand for hist turn")
	public void player_selects_cards_from_his_hand_for_hist_turn(Integer int1) {
					
		turnCards = new ArrayList<Card>(int1);
		
	    response = player.setTurnCards(turnCards);
	}

	@Then("console should display a sucessul message")
	public void console_shiuld_display_a_sucessul_message() {
		assertEquals(response.getMessage(), "5 cards were selected for the round!");
	}

}
