#Author: regiane.ha@gmail.com
#Scenario: Fill form FAP and see the report.
Feature: Fill form FAP page and see the report

 	@scenarioFindFAP  
 	Scenario: Fill form FAP page 
 	Given I am FAP Page
	Given I accepted FAP cookies 
 	Given I fill the getCalc
   When I click to Estimar
   Then I see the report