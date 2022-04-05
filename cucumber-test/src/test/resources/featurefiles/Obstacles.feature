@tag
Feature: Interacting with Obstacles

  @tag1
  Scenario: Robot falling into a Pit and Loosing his lifes
    Given Robot facing "east"
    And robot is on the board on x_coordinate 1 and y_coordinate 1
    When move one tile
    Then robot is on x_coordinate 2 and y_coordinate 1
    And pit status is true
    And robot life status is reduced by one
    And robot is moved to checkpoint
    
    
    

