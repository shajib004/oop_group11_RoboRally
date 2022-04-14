package stepsDefinitionGiovanni;

import static org.junit.Assert.*;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.*;
import model.tile.Robot;

public class U2Steps {
		Player player;
		Robot robot = new Robot();
		Board board = new Board();
	
	@Given("robot on the board in x {int} and y {int}")
	public void robot_on_the_board_in_x_and_y(Integer int1, Integer int2) {
//		board.placeRobot(new Position(int1, int2), robot);
	}

	@When("move")
	public void move() {
//	    board.moveRobot(robot);
	}

	@Then("robot should be on coordinate x_coordinate {int} and y_coordinate {int}")
	public void robot_should_be_on_coordinate_x_coordinate_and_y_coordinate(Integer int1, Integer int2) {
//	    assertEquals(10, 10);
	}

	@Then("pit status is true")
	public void pit_status_is_true() {
	}

	@Then("player life status is reduced by {int}")
	public void player_life_status_is_reduced_by(Integer int1) {
	
	}

	@Then("robot is moved to checkpoint")
	public void robot_is_moved_to_checkpoint() {
	    
	}
	

}
