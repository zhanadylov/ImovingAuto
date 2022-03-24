@Smoke
Feature: Full inventory

  Background:
    Given user is on qa environment


  Scenario: Create new order My House
    And User should choose "My House" value in What are You moving? field
    And User should choose "1 Bedroom (500-1000 sq ft)" value in Move Size field
    When User clicks on Compare Quotes button
    Then User should see new pop-up window "These are recommended rooms for a"
    When use clicks on Continue button in These are recommended rooms for a popup
    Then Boxes pop up should appear with text "Boxes" button
    When user clicks on "GOT IT" button in boxes pop up
    Then user should see hint in "Here you can see all your rooms and start moving!"
    When user clicks to next button in Here you can see all your rooms and start moving!
#    Then user should see hint "Here you can see inventory items for selected rooms!"
    Then user clicks to next button in Here you can see inventory items for selected rooms!
    When user should see hint "Press this button to save choosed items and move to the next room!"
    Then user should click OK button in Press this button to save choosed items and move to the next room!
    # Adding items
    And user should click add to inventory Sofa in living room
    And user should click add to inventory TV in living room
    Then user clicks on save and go to next button
    And user should click add to inventory Dresser in Bedroom room
    And user should click add to inventory Bed in Bedroom room
    Then user clicks on save and go to next button
    And user should click add to inventory Kitchen/Dining Chairs in Dining room
    And user should click add to inventory Kitchen/Dining Table in Dining room
    Then user clicks on save and go to next button
    And user should click add to inventory Kitchen/Dining Chairs in Kitchen room
    And user should click add to inventory Kitchen/Dining Table in Kitchen room
    Then user clicks on save and go to next button
    And user should click add to inventory Basket/Hamper in Bathroom room
    And user should click add to inventory Trash Can in Bathroom room
    Then user clicks on save and go to next button
    And user should click add to inventory Outdoor Chair in Patio room
    And user should click add to inventory Outdoors Table in Patio room
    Then user clicks on save and go to next button
    Then user should see new pop-up window boxes "Box Calculator"
    And user clicks on Add and Continue button