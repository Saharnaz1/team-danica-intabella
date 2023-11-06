Feature:
  User Story : As a user, I should be accessing all the main modules of the app.


  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: login as store manager
    When the user logged in as "store manager"
    Then user should view eight following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: login as driver
    When  the user logged in as "driver"
    Then user should view four following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

