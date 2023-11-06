
Feature: As a user I want to view columns on the Vehicle models page

  Background: User is already on the log in page
    Given the user is on the login page


    Scenario: User should be able to view web table columns
      Given the user logged in as "sales manager"
      When user hovers over fleet label
      And  user clicks vehicle model button
      Then user should be able to see ten main module columns
        | MODEL NAME               |
        | MAKE                     |
        | CAN BE REQUESTED         |
        | CVVI                     |
        | CO2 FEE (/MONTH)         |
        | COST (DEPRECIATED)       |
        | TOTAL COST (DEPRECIATED) |
        | CO2 EMISSIONS            |
        | FUEL TYPE                |
        | VENDORS                  |



     Scenario:Driver should see error message
       Given the user logged in as "Driver"
       When user hovers over fleet label
       And  user clicks vehicle model button
       Then user should see the error message

