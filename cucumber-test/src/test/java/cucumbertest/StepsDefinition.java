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
	
	@Given("A player with is turn status true")
	public void a_player_with_is_turn_status_true() {
	    player.setTurnStatus(true);
	}
	@When("GameMaster starts a new round")
	public void game_master_stats_a_new_round() {
	    gameMaster.initializeRound();
	}
	
	@Then("player receives {int} programming cards")
	public void player_receives_programming_cards(Integer int1) {
		ArrayList<Card> cardsDealt = new ArrayList<Card>(int1);
		response = player.setHand(cardsDealt);
	}
	@Then("console should display a sucessful message")
	public void console_should_display_a_sucessful_message() {
	   assertEquals(response.getMessage(), "9 cards were dealt!");
	}
}
