@tag
Feature: Player getting cards

  @tag1
  Scenario: Player get 9 programming cards cards
    Given A player with is turn status true
    When GameMaster starts a new round
    Then player receives 9 programming cards 
    And console should display a sucessful message
