@wip
Feature: Vehicle edit features

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: As a store manager, I want to see edit car info icons from the Vehicle page
    Given the user logged in as "sales manager"
    When the user hovers on Fleet module
    And clicks on Vehicles in the dropdown
    And the user hovers over three dots on vehicles line
    Then the user sees the below options
      | View   |
      | Edit   |
      | Delete |
