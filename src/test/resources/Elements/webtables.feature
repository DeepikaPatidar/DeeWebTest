@Regression
Feature: test WEbTables 
Description: to test web tabes on demo QA site

Background: Open demoQA page and click on Web tables page
	Given user is on Home Page
    When user clicks on Elements
    And clicks on Web table card

Scenario: verify adding items in web table
	Given User is on web table page
	When User click Add button
	Then form should be open
	When User fill employee details
	And submit form
	Then Webtable should display employee details