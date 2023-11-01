Feature: Vehicles odometer
  User Story:  As a user, I want to view car odometer info on the Vehicles Odometers page.

  Background: User is already in the log in page
    Given the user is on the login page

  @storeManager
  Scenario: Store manager should see an error message “You do not have permission to perform this action.”
    Given the user logged in as "store manager"
    When the user hover on fleet menu
    And the user clicks on Vehicle Odometer module
    Then the user should be able to see the error message

  @salesManager
  Scenario: Sales manager should see an error message “You do not have permission to perform this action.”
    Given the user logged in as "sales manager"
    When the user hover on fleet menu
    And the user clicks on Vehicle Odometer module
    Then the user should be able to see the error message

  @driver
  Scenario: Store and Sales managers should see an error message “You do not have permission to perform this action.”
    Given the user logged in as "driver"
    When the driver hover on fleet menu
    And the driver clicks on Vehicle Odometer module
    Then the driver should see the default page as "1" and view per page is "25" by default