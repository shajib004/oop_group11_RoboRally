Feature: Interacting with Obstacles

	#Test
	Background:
		Given robot on the board in x 1 and y 1

  Scenario: Robot falling into a Pit and Loosing his lifes
    When move
    Then robot should be on coordinate x_coordinate 2 and y_coordinate 1
    And pit status is true
    And player life status is reduced by 1
    And robot is moved to checkpoint
    