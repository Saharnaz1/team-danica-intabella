@B30G20-167
Feature: Default

	Background:
		#@B30G15-217
		 Given the user is on the login page

	@B30G15-218
		Scenario Outline: User access to the Oroinc Documentation page
		    Given the user login with "<username>","<password>"
			Then User should be able to click on the question icon
			And User sees Oro Documentation page
				
			Examples:
				| username        | password    |
				| user11          | UserUser123 |
				| storemanager77  | UserUser123 |
				| salesmanager111 | UserUser123 |