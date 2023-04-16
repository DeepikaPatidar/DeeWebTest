@Regression
Feature: Validate text box operations

Background: Open demoQA page and click on Web tables page
	Given user is on Home Page
    When user clicks on Elements
   	And user click on Text Box

Scenario Outline: Validate the form submission on text box page
	When user fill the form "<Fullname>" "<email>" "<currentadd>" "<permanentadd>"
    And click submit button
    Examples:
      | Fullname   	   | email        	 | currentadd	|permanentadd	|
      |	Deepika 	   |Deepika@gmail.com|abc			|xyz			|