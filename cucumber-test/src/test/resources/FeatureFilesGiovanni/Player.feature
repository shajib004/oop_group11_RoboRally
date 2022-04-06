@tag
Feature: Player getting cards
	
	  Background:
    Given A player with ID of 203492 
    And player turn status true

  @tag1
  Scenario: Player get 9 programming cards cards
    When GameMaster starts a new round
    Then player receives nine programming cards 
    And console should display a sucessful message
    
    
  Scenario: Player selects 5 card for the his turn
    Given player receives nine programming cards 
    When Player selects 5 cards from his hand for hist turn
    Then console should display a sucessul message
    