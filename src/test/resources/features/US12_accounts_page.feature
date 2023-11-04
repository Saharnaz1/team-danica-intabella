@wip
Feature: Account page
  As a user, I want to filter customers’ info on the Account page

  Background: User is already on the log in page
    Given the user is on the login page

    #@Driver
#Scenario: Driver should see seven filter items on the Accounts page
      #Given the user logged in as "driver"
      #When the user hover over customer
      #And the user clicks on accounts
      #Then the user should see seven items on the account page.

  @saleManger
  Scenario: Sale manager should see seven filter items on the Accounts page
    Given the user logged in as "sales manager"
    When the user hover over customer
    And the user clicks on accounts
    Then the user should see seven items on the account page
      | ACCOUNT NAME  |
      | CONTACT NAME  |
      | CONTACT EMAIL |
      | CONTACT PHONE |
      | OWNER         |
      | CREATED AT    |
      | UPDATED AT    |

  @storeManger
  Scenario: Store manager should see seven filter items on the Accounts page
    Given the user logged in as "store manager"
    When the user hover over customer
    And the user clicks on accounts
    Then the user should see seven items on the account page
      | ACCOUNT NAME  |
      | CONTACT NAME  |
      | CONTACT EMAIL |
      | CONTACT PHONE |
      | OWNER         |
      | CREATED AT    |
      | UPDATED AT     |