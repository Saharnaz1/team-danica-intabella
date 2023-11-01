@wip
Feature: Vehicle edit features

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: As a driver, I want to see edit car info icons from the Vehicle page
    Given the user is logged in as "driver"
    When the user is on the vehicle page
    And the user hovers over three dots on vehicles line
    Then the user sees view, edit, delete buttons

  Scenario: As a sales manager, I want to see edit car info icons from the Vehicle page
    Given the user is logged in as "sales manager"
    When the user is on the vehicle page
    And the user hovers over three dots on vehicles line
    Then the user sees view, edit, delete buttons

  Scenario: As a store manager, I want to see edit car info icons from the Vehicle page
    Given the user is logged in as "store manager"
    When the user is on the vehicle page
    And  the user hovers over three dots on vehicles line
    Then the user sees view, edit, delete buttons
      | View   |
      | Edit   |
      | Delete |