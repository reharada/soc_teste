#Author: regiane.ha@gmail.com
#Scenario: Fill form FAP and see the report.
@CookiesButtonFAPPAGE
Feature: Fill form FAP page and see the report

	Scenario: Fill form FAP page
	Given I am FAP Page
	Given I accepted FAP cookies
	


 	@scenarioFindFAP  
 	Scenario: Fill form FAP page  
 	Given I fill the getCalc
   When I click to Estimular
   Then I see the report