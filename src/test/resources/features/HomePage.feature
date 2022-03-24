#@Smoke
#Feature: Home page functionalities
#
#  Background:
#    Given user is on qa environment
#
#    Scenario: Verify compare quotes button is clickable
#      When user should click labor tab button
#      Then user should see "Enter your zip code" and "Move Date" texts
#
#
#    Scenario: Create new order My Apartment
#      And User should choose "My Apartment" value in What are You moving? field
#      #Then "My Apartment" should be selected
#      And User should choose "1 Bedroom (600-900 sq ft)" value in Move Size field
#      When User clicks on Compare Quotes button
#      Then User should see new pop-up window These are recommended rooms for a
#      And Following pop up window should have "These are recommended rooms for a" "1 Bedroom (600-900 sq ft)" Please add/remove and confirm: text
#      And User clicks on Continue
#      Then User should see recommended items list
#
