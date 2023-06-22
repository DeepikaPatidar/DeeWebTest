Feature: to verify buttons on demoQA website

Background: Open demoQA page and click on Web tables page
	Given user is on Home Page
    When user clicks on Elements
    And clicks on Buttons menu item
@test
Scenario: verify double click button
	When user clicks on Double Click button
	Then double click message should be displayed
	
	
	Scenario: verify right click button
	When user clicks on Right Click button
	Then right click message should be displayed
	
	@test
	Scenario: verify simple click button
	When user clicks on Click button
	Then proper message should be displayed
	