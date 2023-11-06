@B30G20-167
Feature: Default

	Background:
		 Given the user is on the login page

	@B30G15-218
		Scenario: User access to the Oroinc Documentation page
		Given the user logged in as "sales manager"
			Then User click on the question icon
			And User sees Oro Documentation page
				
