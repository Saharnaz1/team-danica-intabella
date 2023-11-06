Feature: Default

	Background:
		#@B30G15-219
		Given the user is on the login page
		

	#{color:#de350b}*User Story* :{color}  As a user, I want to see edit car info icons from the Vehicle page.
	#
	# 
	#
	#{color:#de350b}*AC #1:*  {color}users should see “{*}view, edit, delete{*}” when they hover the mouse over the 3 dots “…” 
	@B30G15-216
	Scenario: US06AC01TC01 Verify users should see “view, edit, delete” when they hover the mouse over the 3 dots “…” 
		Given the user logged in as "sales manager"
		    When the user hovers on Fleet module
		    And clicks on Vehicles in the dropdown
		    And the user hovers over three dots on vehicles line
		    Then the user sees the below options
		      | View   |
		      | Edit   |
		      | Delete |