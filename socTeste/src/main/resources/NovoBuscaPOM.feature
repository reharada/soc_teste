
Feature: Search in main page
 Scenario: Find word FAP in main page
 Given I see the aceitar cookies button
 When I click on it
 Then the button hidden
 Given I am in the main page
 And Solucoes e Recursos is visible
 When I put the cursor on it
 And I click on FAP
 Then I go to FAP page